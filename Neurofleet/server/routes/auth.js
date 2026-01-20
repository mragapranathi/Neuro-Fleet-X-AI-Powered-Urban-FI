const express = require('express');
const router = express.Router();
const authController = require('../controllers/authController');
const { protect } = require('../middleware/authMiddleware');
const { authorize } = require('../middleware/roleMiddleware');

router.post('/register', authController.register);
router.post('/login', authController.login);
router.get('/me', protect, authController.getMe);

router.get('/dashboard/admin', protect, authorize('admin'), authController.adminDashboard);
router.get('/dashboard/fleetmanager', protect, authorize('fleetmanager'), authController.managerDashboard);
router.get('/dashboard/driver', protect, authorize('driver'), authController.driverDashboard);
router.get('/dashboard/customer', protect, authorize('customer'), authController.customerDashboard);

module.exports = router;
