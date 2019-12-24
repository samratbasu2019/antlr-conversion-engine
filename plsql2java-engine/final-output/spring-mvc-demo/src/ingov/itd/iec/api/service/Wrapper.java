import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

public class ACCOUNTING_PKG {

private final static Logger log = Logger.getLogger(ACCOUNTING_PKG.class);
private SessionFactory sessionFactory;
@Autowired
public void setSessionFactory(SessionFactory sessionFactory){
	this.sessionFactory = sessionFactory;
}
BigDecimal g_num_request_id;
BigDecimal g_num_user_id;
BigDecimal g_num_login_id;
BigDecimal g_num_program_id;
Object g_num_batch_source_id;
Object g_batch_source_name;
Object g_term_name;
Object g_term_id;
Object g_cust_account_id;
Object g_cust_acc_site_id;
Object g_receivables_trx_id;
Object g_recv_ccid;
Object g_payment_schedule_id;
BigDecimal g_num_org_id;
BigDecimal g_Legal_Entity_Id;
BigDecimal g_vendor_id;
BigDecimal g_vendor_site_id;
BigDecimal g_adjustment_ccid;
BigDecimal g_refd_ccid;
BigDecimal g_pay_resp_id;
BigDecimal g_pay_application_id;
BigDecimal g_rcpt_cnt;
String V_RELAX_FLAG;
BigDecimal g_relax_flag;
String g_id_number;
	Session session = sessionFactory.openSession();
	Query query = null;
	List resultSet = null;
	query = session.getNamedQuery('GET_Person');
	query.setString('XXXX', val);
	query.setString('YYYYY', stringVal);
	Transaction transaction = session.beginTransaction();	 
	try {
		resultSet = query.list();
		}
	catch(Exception ex) {
		e.printStackTrace();	
	}
	finally {
		 transaction.commit();
		 session.close();
	}

if (var_float>3) {
    log.debug (var_salary);
}
else
{
    log.debug (var_string);

}

var_salary = 100;

do {
    x=x + 10;
    log.debug (x);
}   while (x > 50);


while (a < 20) {
    a=a + 1;
}


for(a < 20 && a > 10 ; a++) {
    log.debug (a);
    log.debug (y);
  
}

    
        public static void write (
      p_debug_flag IN VARCHAR2 ,
      p_message    IN VARCHAR2 ) {
           String l_err_procedure;   

         if (p_debug_flag = "Y") {
             log.debug (FND_FILE.LOG, SYSTIMESTAMP|| "-" || p_message);
         }
         else
         {

         }

         
         
    } 

    
    BigDecimal is_numeric ( in_chr_char IN VARCHAR2 ) {
    BigDecimal l_num_number;
         l_num_first_val = SUBSTR(in_chr_char, 1, 19);
         l_num_number = TO_NUMBER(l_num_first_val);
         l_chr_second_val = SUBSTR(in_chr_char, 21, 25);
                 
        return  l_num_number;
    } 

    
        public static void write_test (p_debug_flag IN VARCHAR2 , p_message    IN VARCHAR2 ) {
   
         log.debug (k);
         l_num_checksum = MOD (l_num_checksum, 7);
         l_chr_din = NULL;

         if (v_return_status    <> 'S') {
             p_out_chr_errbuff = cash_receipt_id;

             if (v_msg_count       > 1) {
                 p_out_chr_errbuff = cash_receipt_id;
                 x=x + 10;
                 else if (v_msg_count > 2) {

                     do {
                         l_stmt_processing = " Entering Routine crosssched_adjust";
                         log.debug (" Entering Routine crosssched_adjust");
                         log.debug ( g_debug_flag ,l_chr_exe_location ||'-'||l_stmt_processing );
                         l_start_month = "01-APR- || p_irt_assmt_year";
                         l_stmt_processing = " Calling the Inv Cursor with ID and Assmt year Param ";
                         l_chr_exe_location = cur_crossmajor_recpt_rec.cash_receipt_id;
                         p_count=p_count + 1;
                         v_msg_data = cur_crossmajor_inv_rec.customer_trx_id;
                         p_out_chr_errbuff = p_out_chr_errbuff;
                     }   while (v_msg_data IS NULL);

                 }
             }
             else
             {

             }

         }
         else
         {

         }

         log.debug ( g_debug_flag ,l_chr_exe_location ||'-'||l_stmt_processing || '-' || in_num_customer_trx_id);
         	Session session = sessionFactory.openSession();
         	Query query = null;
         	List resultSet = null;
         	query = session.getNamedQuery('GET_employee');
         	query.setString('XXXX', val);
         	query.setString('YYYYY', stringVal);
         	Transaction transaction = session.beginTransaction();	 
         	try {
         		resultSet = query.list();
         		}
         	catch(Exception ex) {
         		e.printStackTrace();	
         	}
         	finally {
         		 transaction.commit();
         		 session.close();
         	}
         		
         		SessionFactory sessionFactory;
         		Session session = sessionFactory.openSession();
         		Transaction transaction = session.beginTransaction();	
         		try {	
         			session.save(xx_IRT_ACCT_PROCESS_LOG);
         			}
         			catch(Exception ex) {
         			e.printStackTrace();	
         		}  finally {		
         		transaction.commit();
         			session.close();
         			}
         log.debug (y);

         if (var_float>3) {
             log.debug (var_salary);
         }
         else
         {
             log.debug (var_string);

         }


         while (a < 20) {
             a=a + 1;
         }

         
         
    } 

    
    String employer_details_func ( var3 IN varchar ) {
    String var_salary;
         		
         		SessionFactory sessionFactory;
         		Session session = sessionFactory.openSession();
         		Transaction transaction = session.beginTransaction();	
         		try{	
         			session.save(xx_REFD_HEADERS);	
         		}
         			catch(Exception ex) {
         			e.printStackTrace();	
         		}  finally {
         			transaction.commit();
         			session.close();
         			}
         	Session session = sessionFactory.openSession();
         	Query query = null;
         	List resultSet = null;
         	query = session.getNamedQuery('GET_Address');
         	query.setString('XXXX', val);
         	query.setString('YYYYY', stringVal);
         	Transaction transaction = session.beginTransaction();	 
         	try {
         		resultSet = query.list();
         		}
         	catch(Exception ex) {
         		e.printStackTrace();	
         	}
         	finally {
         		 transaction.commit();
         		 session.close();
         	}
                 
        return  var_salary;
    } 

log.debug (var_float);

}
