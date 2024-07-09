
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Update Items</title>
  <link rel="shortcut icon" type="image/png" href="assets/images/logos/favicon.png" />
  <link rel="stylesheet" href="assets/css/styles.min.css" />
</head>

<body>
  <!--  Body Wrapper -->
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
        <div class="container-fluid">
        <div class="container-fluid">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title fw-semibold mb-4">Update Item</h5>
              <div class="card">
                <div class="card-body">
                
             
               
                  <form action="ItemUpdateServlet" method="post">
                  <c:forEach var="items" items="${itemDetails}">
                  <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Item ID</label>
                      <input type="text" class="form-control" id="item_name" name="item_id" value="${items.itemId}" aria-describedby="emailHelp" required readonly>
                      <div id="emailHelp" class="form-text">Enter Item Id Hear</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Item Name</label>
                      <input type="text" class="form-control" id="item_name" name="item_name" value="${items.itemName}" aria-describedby="emailHelp" required>
                      <div id="emailHelp" class="form-text">Enter Item Name Hear</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Item Brand </label>
                      <input type="text" class="form-control" id="item_brand" name="item_brand" value="${items.itemBrand}" aria-describedby="emailHelp" required>
                      <div id="emailHelp" class="form-text">Enter Item Brand Details </div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Item Quantity </label>
                      <input type="number" class="form-control" id="item_qty" name="item_qty" value="${items.itemQty}" aria-describedby="emailHelp" required>
                      <div id="emailHelp" class="form-text">Enter Handling Item Quantity</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Item Price </label>
                      <input type="number" class="form-control" id="item_price" name="item_price" value="${items.itemPrice}" aria-describedby="emailHelp" required>
                      <div id="emailHelp" class="form-text">Enter Current Item Price</div>
                    </div>
                    
                
                      
                      <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Item Discription</label>
                 
             		  <input type="text" class="form-control" id="item_brand" name="item_brand" value="${items.itemDescription}" aria-describedby="emailHelp" >
                      <div id="emailHelp" class="form-text">Enter Item Discription Details </div>
                    </div>
                    </c:forEach>
                    <div class="mb-3">
                        <label for="disabledSelect" class="form-label">Select Supplier</label>
                        <select id="item_supplier" name="item_supplier" class="form-select">
                        <c:forEach items="${users}" var="users">
                        <option value="${users.username}">Supplier ID = ${users.user_id} ..|.. Supplier User Name = ${users.username}  ..|..  Supplier Name = ${users.first_name} ${users.last_name} </option>
                          </c:forEach>
                          
                          
                        </select>
                      </div>
                    <input type="submit" class="btn btn-primary" value="Update Item Details">
                  </form>
                   
                </div>
              </div>
             
            </div>
          </div>
        </div>
      </div>
        
        
        
        
        
      </div>
    </div>
  </div>
  <script src="assets/libs/jquery/dist/jquery.min.js"></script>
  <script src="assets/libs/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
  <script src="assets/js/sidebarmenu.js"></script>
  <script src="assets/js/app.min.js"></script>
  <script src="assets/libs/apexcharts/dist/apexcharts.min.js"></script>
  <script src="assets/libs/simplebar/dist/simplebar.js"></script>
  <script src="assets/js/dashboard.js"></script>
</body>

</html>