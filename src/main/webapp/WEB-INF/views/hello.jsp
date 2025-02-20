<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

  <jsp:include page="../components/header.jsp" />

  <section class="bg-gradient-to-b from-teal-600 via-blue-500 to-green-500 flex items-center justify-center h-[90vh]">
    <div class="text-center">
      <div class="text-8xl text-gray-50 mb-4">
        ${message}
      </div>
      <div class="text-3xl text-gray-50">
        This is a simple JSP Hello page with Tailwind CSS
      </div>
    </div>
  </section>

  <jsp:include page="../components/footer.jsp" />