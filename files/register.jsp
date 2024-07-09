<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Register User</title>
  <link rel="shortcut icon" type="image/png" href="assets/images/logos/favicon.png" />
  <link rel="stylesheet" href="assets/css/styles.min.css" />
</head>

<body>
  <!--  Body Wrapper -->
  <div class="page-wrapper" id="main-wrapper" data-layout="vertical" data-navbarbg="skin6" data-sidebartype="full"
    data-sidebar-position="fixed" data-header-position="fixed">
    <div
      class="position-relative overflow-hidden radial-gradient min-vh-100 d-flex align-items-center justify-content-center">
      <div class="d-flex align-items-center justify-content-center w-100">
        <div class="row justify-content-center w-100">
          <div class="col-md-8 col-lg-6 col-xxl-3">
          <br><br><br><br>
            <div class="card mb-0">
              <div class="card-body">
                <a href="login.jsp" class="text-nowrap logo-img text-center d-block py-3 w-100">
                  <img src="assets/images/logos/dark-logo.svg" width="180" alt="">
                </a>
                <p class="text-center">Online Stock Manegement System Registration</p>
                <form action="RegisterServlet" method="post">
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">UserName</label>
                      <input type="text" class="form-control" id="username" name="username" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter System User Default UserName</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Password</label>
                      <input type="password" class="form-control" id="password" name="password" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter System User By Default Password </div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">First Name</label>
                      <input type="text" class="form-control" id="firstname" name="firstname" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter User First Name</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Last Name</label>
                      <input type="text" class="form-control" id="lastname" name="lastname" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter User Last Name</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Address </label>
                      <input type="text" class="form-control" id="address" name="address" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter User Address</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Telephone </label>
                      <input type="number" class="form-control" id="telephone"  name="telephone" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter User Contact Number</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Email </label>
                      <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter User Email Address</div>
                    </div>
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">NIC </label>
                      <input type="text" class="form-control" id="nic" name="nic" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text">Enter User National Identity Card Number</div>
                    </div>
                    <div class="mb-3">
                        <label for="disabledSelect" class="form-label">Select User Type</label>
                        <select id="userType" name="userType" class="form-select">
            				<option value="supplier">Supplier</option>
            				<option value="manager">Manager</option>
            				<option value="warehousemanager">Warehouse Manager</option>
            				<option value="cashier">Cashier</option>
        				</select>
                      </div>
                    <button type="submit" class="btn btn-secondary m-1">Create Now</button>
                  </form>
                  <div class="d-flex align-items-center justify-content-center">
                    <p class="fs-4 mb-0 fw-bold">All Ready In Check Kwick</p>
                    <a class="text-primary fw-bold ms-2" href="login.jsp">Login Now</a>
                  </div>
              </div>
            </div><br><br><br><br>
          </div>
        </div>
      </div><br><br><br><br>
    </div>
  </div>
  <script src="assets/libs/jquery/dist/jquery.min.js"></script>
  <script src="assets/libs/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>