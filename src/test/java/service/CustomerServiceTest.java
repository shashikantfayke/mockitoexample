package service;

import dao.CustomerDAO;
import domain.Customer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {


    public static final String FULL_NAME = "Mika Kumar";
    @Mock
    private CustomerDAO customerDao;
    @InjectMocks
    private CustomerService customerService;

    @Before
    public void setUp() throws Exception {
        customerService = new CustomerService(customerDao);

    }

    @Test
    public void shouldReturnFullName() {

        when(customerDao.getCustmerInfo()).thenReturn(getCustomer());
        String fullName = customerService.getCustomersFullName();
        assertThat(fullName, is(FULL_NAME));

    }

    private Customer getCustomer() {

        Customer customer = new Customer();
        customer.setCustomerId(100);
        customer.setFirstName("Mika");
        customer.setLastName("Kumar");
        return customer;
    }

}