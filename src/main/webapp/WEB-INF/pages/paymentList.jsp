<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: Leman
  Date: 20.10.2021
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="x-ua-compatible" content="ie=edge">

    <title>Students</title>

    <!-- Font Awesome Icons -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/all.min.css">
    <!-- DataTables -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/dataTables.bootstrap4.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/adminlte.css">
    <!-- Google Font: Source Sans Pro -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">
<jsp:include page="static/header.jsp"></jsp:include>
    <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <!-- Sidebar -->
        <div class="sidebar">
            <!-- Sidebar user panel (optional) -->
            <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                <div class="image">
                    <img src="${pageContext.request.contextPath}/resources/static/images/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
                </div>
                <div class="info">
                    <a href="#" class="d-block">Alexander Pierce</a>
                </div>
            </div>

            <!-- Sidebar Menu -->
            <nav class="mt-2">
                <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                    <!-- Add icons to the links using the .nav-icon class
                         with font-awesome or any other icon font library -->
                    <li class="nav-item has-treeview menu-open">
                        <a href="#" class="nav-link active">
                            <i class="nav-icon fas fa-tachometer-alt"></i>
                            <p>
                                Menu
                                <i class="right fas fa-angle-left"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="#" class="nav-link" >
                                    <button type="button" class="btn btn-block bg-gradient-info">New</button>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <button type="button" class="btn btn-block bg-gradient-info">Update</button>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link " >
                                    <button type="button" class="btn btn-block bg-gradient-info">Delete</button>
                                </a>
                            </li>

                        </ul>
                    </li>
                </ul>
            </nav>
            <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
    </aside>


    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">

        </section>

        <!-- Main content -->
        <section class="content">
            <div class="row">
                <div class="col-12">
                    <div class="card">
                        <div class="card-header">
                            <h3 class="card-title">Payment Data Table</h3>
                        </div>
                        <!-- /.card-header -->
                        <div class="card-body">
                            <table id="example2" class="table table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Student Full_Name</th>
                                    <th>Teacher Full_name</th>
                                    <th>Lesson name</th>
                                    <th>Lesson time</th>
                                    <th>Amount</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${paymentList}" var="pl">
                                    <tr>
                                        <td>${pl.id}</td>
                                        <td>${pl.student.name}${pl.student.surname}</td>
                                        <td>${pl.teacher.name}+" "+${pl.teacher.surname}</td>
                                        <td>${pl.lesson.lessonName}</td>
                                        <td>${pl.lesson.lessonTime}</td>
                                        <td>${pl.amount}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <!-- /.card-body -->
                    </div>
                    <!-- /.card -->
                </div>
                <!-- /.col -->
            </div>
            <!-- /.row -->
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <!-- Control Sidebar -->
    <aside class="control-sidebar control-sidebar-dark">
        <!-- Control sidebar content goes here -->
        <div class="p-3">
            <h5>Title</h5>
            <p>Sidebar content</p>
        </div>
    </aside>
    <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->
<jsp:include page="static/footer.jsp"></jsp:include>
<!-- REQUIRED SCRIPTS -->

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/resources/static/js/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/resources/static/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/resources/static/js/adminlte.min.js"></script>
<!-- DataTables -->
<script src="${pageContext.request.contextPath}/resources/static/js/jquery/jquery.dataTables.js"></script>
<script src="${pageContext.request.contextPath}/resources/static/js/dataTables.bootstrap4.js"></script>
</body>
</html>

