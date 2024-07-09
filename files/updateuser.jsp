<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Edit Profile</title>
  <link rel="shortcut icon" type="image/png" href="assets/images/logos/favicon.png" />
  <link rel="stylesheet" href="assets/css/styles.min.css" />
</head>

<body>


  <div class="page-wrapper" id="main-wrapper" data-layout="vertical" data-navbarbg="skin6" data-sidebartype="full"
    data-sidebar-position="fixed" data-header-position="fixed">
    <!-- Sidebar Start -->
    <aside class="left-sidebar">
      <!-- Sidebar scroll-->
      <div>
        <div class="brand-logo d-flex align-items-center justify-content-between">
          <a href="index.html" class="text-nowrap logo-img">
            <img src="assets/images/logos/dark-logo.svg" width="180" alt="" />
          </a>
          <div class="close-btn d-xl-none d-block sidebartoggler cursor-pointer" id="sidebarCollapse">
            <i class="ti ti-x fs-8"></i>
          </div>
        </div>
        <!-- Sidebar navigation-->
        <nav class="sidebar-nav scroll-sidebar" data-simplebar="">
          <ul id="sidebarnav">
            <li class="nav-small-cap">
              <i class="ti ti-dots nav-small-cap-icon fs-4"></i>
              <span class="hide-menu">Items</span>
            </li>
             <li class="sidebar-item">
              <a class="sidebar-link" href="AddItemsVewServlet" aria-expanded="false">
                <span>
                  <i class="ti ti-layout-dashboard"></i>
                </span>
                <span class="hide-menu">Add Items</span>
              </a>
            </li>
            <li class="sidebar-item">
              <a class="sidebar-link" href="DisplayAllItemsServlet" aria-expanded="false">
                <span>
                  <i class="ti ti-layout-dashboard"></i>
                </span>
                <span class="hide-menu">Manege Items</span>
              </a>
            </li>
             <li class="sidebar-item">
              <a class="sidebar-link" href="DisplayAllItemsServletdelete" aria-expanded="false">
                <span>
                  <i class="ti ti-layout-dashboard"></i>
                </span>
                <span class="hide-menu">Delete Items</span>
              </a>
            </li>
            
            
            <li class="nav-small-cap">
              <i class="ti ti-dots nav-small-cap-icon fs-4"></i>
              <span class="hide-menu">Suplier</span>
            </li>
            <li class="sidebar-item">
              <a class="sidebar-link" href="adminaddusr.jsp" aria-expanded="false">
                <span>
                  <i class="ti ti-user-plus"></i>
                </span>
                <span class="hide-menu">Add Suplier</span>
              </a>
            </li>
            <li class="sidebar-item">
              <a class="sidebar-link" href="DisplayAllUserServlet" aria-expanded="false">
                <span>
                  <i class="ti ti-user-plus"></i>
                </span>
                <span class="hide-menu">Manege Suplier</span>
              </a>
            </li>
            <li class="sidebar-item">
              <a class="sidebar-link" href="DisplayDeleteAllUserServlet" aria-expanded="false">
                <span>
                  <i class="ti ti-user-plus"></i>
                </span>
                <span class="hide-menu">Delete Suplier</span>
              </a>
            </li>
            <li class="nav-small-cap">
              <i class="ti ti-dots nav-small-cap-icon fs-4"></i>
              <span class="hide-menu">Orders</span>
            </li>
            <li class="sidebar-item">
              <a class="sidebar-link" href="DisplayAllSupliersServlet" aria-expanded="false">
                <span>
                  <i class="ti ti-user-plus"></i>
                </span>
                <span class="hide-menu">View Suppliers</span>
              </a>
            </li>
            <li class="sidebar-item">
              <a class="sidebar-link" href="ViewAllItemsServlet" aria-expanded="false">
                <span>
                  <i class="ti ti-layout-dashboard"></i>
                </span>
                <span class="hide-menu">View Items</span>
              </a>
            </li>
             <li class="sidebar-item">
              <a class="sidebar-link" href="AddItemdataviewServlet" aria-expanded="false">
                <span>
                  <i class="ti ti-file-description"></i>
                </span>
                <span class="hide-menu">Add Orders</span>
              </a>
            </li>
            <li class="sidebar-item">
              <a class="sidebar-link" href="DisplayAllOdersServlet" aria-expanded="false">
                <span>
                  <i class="ti ti-file-description"></i>
                </span>
                <span class="hide-menu">Manege Orders</span>
              </a>
            </li>
            <li class="sidebar-item">
              <a class="sidebar-link" href="DisplayAllOdersDeleteServlet" aria-expanded="false">
                <span>
                  <i class="ti ti-file-description"></i>
                </span>
                <span class="hide-menu">Delete Orders</span>
              </a>
            </li>
            
            
           
          </ul>
          
        </nav>
        <!-- End Sidebar navigation -->
      </div>
      <!-- End Sidebar scroll-->
    </aside>
    <!--  Sidebar End -->
    <!--  Main wrapper -->
    <div class="body-wrapper">
      <!--  Header Start -->
      <header class="app-header">
        <nav class="navbar navbar-expand-lg navbar-light">
          <ul class="navbar-nav">
            <li class="nav-item d-block d-xl-none">
              <a class="nav-link sidebartoggler nav-icon-hover" id="headerCollapse" href="javascript:void(0)">
                <i class="ti ti-menu-2"></i>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link nav-icon-hover" href="javascript:void(0)">
                <i class="ti ti-bell-ringing"></i>
                <div class="notification bg-primary rounded-circle"></div>
              </a>
            </li>
          </ul>
          <div class="navbar-collapse justify-content-end px-0" id="navbarNav">
            <ul class="navbar-nav flex-row ms-auto align-items-center justify-content-end">
             
              <li class="nav-item dropdown">
                <a class="nav-link nav-icon-hover" href="javascript:void(0)" id="drop2" data-bs-toggle="dropdown"
                  aria-expanded="false">
                  <img src="assets/images/profile/user-1.jpg" alt="" width="35" height="35" class="rounded-circle">
                </a>
                <div class="dropdown-menu dropdown-menu-end dropdown-menu-animate-up" aria-labelledby="drop2">
                  <div class="message-body">
                    <a href="manegeuser.jsp" class="d-flex align-items-center gap-2 dropdown-item">
                      <i class="ti ti-user fs-6"></i>
                      <p class="mb-0 fs-3">My Profile</p>
                    </a>
                    
        
                    <a href="login.jsp" class="btn btn-outline-primary mx-3 mt-2 d-block">Logout</a>
                  </div>
                </div>
              </li>
            </ul>
          </div>
        </nav>
      </header>
      <!--  Header End -->
      <div class="container-fluid">
        <!--  Row 1 -->
        
        
 <c:forEach var="usr1" items="${userData}">
 

        
        <div class="container-fluid">
        <div class="container-fluid">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title fw-semibold mb-4">Edit Profile</h5>
              <div class="card">
                <div class="card-body">
                  <form id="updateForm" method="post">
                  <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Suplier Id</label>
                      <input type="number" class="form-control" id="user_id" name="user_id" value="${usr1.user_id}" aria-describedby="emailHelp" readonly>
                      <div id="emailHelp" class="form-text">Default User ID</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">User Name</label>
                      <input type="text" class="form-control" id="username" name="username" value="${usr1.username}" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter System User Default UserName</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Password</label>
                      <input type="password" class="form-control" id="password" name="password"  value="${usr1.password}"  aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter System User By Default Password </div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">First Name</label>
                      <input type="text" class="form-control" id="first_name" name="first_name" value="${usr1.first_name}" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter User First Name</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Last Name</label>
                      <input type="text" class="form-control" id="last_name" name="last_name" value="${usr1.last_name}" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter User Last Name</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Address </label>
                      <input type="text" class="form-control" id="address" name="address" value="${usr1.address}" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter User Address</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Telephone </label>
                      <input type="number" class="form-control" id="telephone_no"  name="telephone_no" value="${usr1.telephone_no}" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter User Contact Number</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Email </label>
                      <input type="email" class="form-control" id="exampleInputEmail1" name="email" value="${usr1.email}" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter User Email Address</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">NIC </label>
                      <input type="text" class="form-control" id="nic" name="nic" value="${usr1.nic}" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter User National Identity Card Number</div>
                    </div>
                    <div class="mb-3">
    <label for="Select" class="form-label">Select User Type</label>
    <select id="userType" name="type" class="form-select" required>
        <c:choose>
            <c:when test="${usr1.type eq 'supplier'}">
                <option value="supplier" selected="selected">Supplier  "Current Role"</option>
            </c:when>
            
        </c:choose>
    </select>
</div>
                    <button type="submit" class="btn btn-secondary m-1" onclick="setAction('UserUpdateServlet')">Update User Profile</button>
    				 <!-- <button type="button" class="btn btn-danger m-1" onclick="setAction('DeleteUserServlet')">Delete Your Profile</button>-->
                  </form>
                </div>
              </div>
             
            </div>
          </div>
        </div>
      </div>
        
        </c:forEach>
        <!--  Form End -->
        
        
        
      </div>
    </div>
  </div>
  <script>
    function setAction(action) {
        document.getElementById('updateForm').action = action;
        document.getElementById('updateForm').submit();
    }
</script>
  <% 
  String type = request.getParameter("${usr1.type}");
%>
<script>
  // Retrieve the "type" parameter from the request
  var type = "<%= type %>"; // Assuming "type" contains the value received from the request

  // Set the default selected option based on the "type" value
  document.getElementById("userType").value = type;
</script>



  <script src="assets/libs/jquery/dist/jquery.min.js"></script>
  <script src="assets/libs/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
  <script src="assets/js/sidebarmenu.js"></script>
  <script src="assets/js/app.min.js"></script>
  <script src="assets/libs/apexcharts/dist/apexcharts.min.js"></script>
  <script src="assets/libs/simplebar/dist/simplebar.js"></script>
  <script src="assets/js/dashboard.js"></script>
</body>

</html>