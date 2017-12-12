<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath }"></c:set>
<div class="container">
<div class="row">
<!-- would to display sidebar -->
<div class="col-md-3">
<%@include file="./shared/sidebar.jsp" %>
</div>
<!-- would to display main page -->
<div class="col-md-9">
<!-- Adding bread crumb -->
<div class="row">
<c:if test="${onClickAllProducts==true }">
<ol class="breadcrumb">
<li><a href="${contextRoot}/home">Home -></a></li>
<li class="active">All Products</a> </li>
</ol>
</c:if>
<c:if test="${onClickCategoryProducts==true }">
<ol class="breadcrumb">
<li><a href="${contextRoot}/home">Home -></a></li>
<li class="active">All Products</a> </li>
</ol>
</c:if>
</div>

</div>
</div>
</div>