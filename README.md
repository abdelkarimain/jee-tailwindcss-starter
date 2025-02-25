# Java J2EE Web starter with TailwindCSS

A modern Java web application starter using J2EE, JSP, Servlets, and TailwindCSS.

## Requirements

- Java Development Kit (JDK) 17 or higher
- Apache Maven 3.8+
- Apache Tomcat 10.1+
- Node.js 18+ and npm (for TailwindCSS)
- Community Server Connector (for vscode)

## Project Structure

```
📁myapp
    └── 📁.vscode
        └── settings.json
    └── 📁src
        └── 📁main
            └── 📁java
                └── 📁me
                    └── 📁abdelkarimain
                        └── 📁controller
                            └── HelloServlet.java
                        └── 📁model
                            └── Message.java
            └── 📁webapp
                └── 📁assets
                    └── 📁css
                        └── input.css
                └── index.jsp
                └── 📁WEB-INF
                    └── 📁components
                        └── footer.jsp
                        └── header.jsp
                    └── 📁views
                        └── hello.jsp
                    └── web.xml
    └── .gitignore
    └── nodemon.json
    └── package-lock.json
    └── package.json
    └── pom.xml
    └── README.md
    └── tailwind.config.js
```

## Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/abdelkarimain/jee-tailwindcss-starter.git ./myapp
cd myapp
```

### 2. Install Java Dependencies
```bash
mvn clean install
```

### 3. Set up TailwindCSS

First, install Node.js dependencies:
```bash
npm install
```

Generate the TailwindCSS file:
```bash
npm run build:css
```

To watch for CSS changes during development:
```bash
npm run watch:css
```
### 5. Configure Nodemon

Install Nodemon globally
```bash
npm install -g nodemon
```

### 5. Configure Tomcat

1. Download and install Apache Tomcat 10.1
2. Configure Tomcat in your IDE
3. Add the Tomcat server to your IDE and deploy the project
4. Start the Tomcat server

### 5. Running the Application

#### Using Nodemon
1. CD into the project folder
  ```bash
  cd /path/myapp
  ```
1. Run the following command in your terminal to start the server
```bash
nodemon
```
1. Access the application at `http://localhost:8080/myapp`

## Development

### TailwindCSS Development

The project uses TailwindCSS for styling. The configuration is in `tailwind.config.js`.

To modify styles:
1. Edit the `src/main/webapp/assets/css/input.css` file
2. Run `npm run watch:css` to automatically compile changes
3. Changes will be reflected in `output.css`

### Java Development

The application follows MVC architecture:
- Models: `src/main/java/me/abdelkarimain/model/`
- Views: `src/main/webapp/WEB-INF/views/`
- Controllers: `src/main/java/me/abdelkarimain/controller/`

## Features

- Modern responsive design with TailwindCSS
- MVC architecture
- Reusable components (header, footer)
- Sample servlet implementation
- Clean project structure

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
