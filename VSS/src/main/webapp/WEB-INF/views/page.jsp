<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="jquery" value="/resources/jquery" />
<spring:url var="images" value="/resources/images" />
<spring:url var="fonts" value="/resources/fonts" />

<c:set var="contextRoot" value="${pageContext.request.contextPath }"></c:set>


<!DOCTYPE html>
<html lang="en" class="container">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>${Title}</title>
<script>
	window.menu = '${Title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/shop-homepage.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/dataTables.bootstrap4.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${css}/bootstrap.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${js}/dataTables.bootstrap.min.js" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${js}/jquery.dataTables.min.js" rel="stylesheet">


</head>

<body>
	<!-- Wrapper code here -->

	<div class="wrapper">
		<!-- Navigation -->
		<!-- import  -->
		<%@ include file="./shared/nav.jsp"%>
		<!-- Page Content -->
		<div class="container content">

			<c:if test="${onClickissue == true}">
				<%@ include file="table.jsp"%>
			</c:if>

			<!-- Table include -->
			<c:if test="${onClickhome == true}">
				<%@ include file="home.jsp"%>
			</c:if>

			<c:if test="${onClickabout == true}">
				<%@ include file="about.jsp"%>
			</c:if>
			<c:if test="${onClickcontact == true}">
				<%@ include file="contact.jsp"%>
			</c:if>
			<c:if test="${onClickservice == true}">
				<%@ include file="services.jsp"%>
			</c:if>
			<c:if test="${onClickCategoryProducts == true or onClickAllProducts == true }">
				<%@ include file="listProduct.jsp"%>
			</c:if>

			<%-- <c:if test="${onClickAllProducts == true}">
				<%@ include file="./shared/table.jsp"%>
			</c:if> --%>

		</div>
		<!-- /.container -->


		<!-- Footer -->

		<%@ include file="./shared/footer.jsp"%>



		<!-- Bootstrap core JavaScript -->
		<script src="${jquery}/jquery.min.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>
		<script src="${js}/dataTables.bootstrap.min.js"></script>
		<script src="${js}/jquery.dataTables.min.js"></script>
		<script src="${js}/jquery.dataTables.min.js"></script>

		<script src="${js}/myapp.js"></script>

		<script>
			$(document).ready(function() {
				$('#example').DataTable();
			});
		</script>
	</div>
</body>

</html>
