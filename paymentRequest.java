import java.util.Map;
import java.util.HashMap;


    public class paymentRequest {

        public final long amount;
        public final String currency;
        public final String paymentMethodId;
        public final String customerId;
        public final String description;
        public final String statementDescriptor;
        public final Map<String,String> metadata;
        public final captureMethod captureMethod;
        public final boolean isOffSession;

        private paymentRequest(builder b)
        {
            this.amount=b.amount;
            this.currency=b.currency;
            this.paymentMethodId=b.paymentMethodId;
            this.customerId=b.customerId;
            this.description=b.description;
            this.statementDescriptor=b.statementDescriptor;
            this.metadata=b.metadata;
            this.captureMethod=b.captureMethod;
            this.isOffSession=b.isOffSession;
        }

        public static class builder{
            private long amount;
            private String currency;
            private String paymentMethodId;
            private String customerId;
            private String description;
            private String statementDescriptor;
            private Map<String,String> metadata;
            private captureMethod captureMethod;
            private boolean isOffSession;

            public builder  amount(long amount)
            {
                this.amount=amount; return this;
            }

            public builder currency(String currency)
            {
                this.currency = currency; return this;
            }
            public builder paymentMethodId(String paymentMethodId)
            {
                this.paymentMethodId = paymentMethodId; return this;
            }
            public builder customerId(String customerId)
            {
                this.customerId = customerId; return this;
            }
            public builder description(String description)
            {
                this.description = description; return this;
            }
            public builder  statementDescriptor(String statementDescriptor)
            {
                this.statementDescriptor = statementDescriptor; return this;
            }
            public builder metadata(Map<String,String> metadata)
            {
                this.metadata = metadata; return this;
            }
            public builder captureMethod(captureMethod CaptureMethod)
            {
                this.captureMethod=CaptureMethod; return this;
            }
            public builder isOffSession(boolean isOffSession)
            {
                this.isOffSession = isOffSession; return this;
            }
            public paymentRequest Build()
            {
                return new paymentRequest(this);
            }

        }

        void show()
        {
            System.out.println("amount:"+amount);
            System.out.println("currency:"+currency);
            System.out.println("paymentMethodId:"+paymentMethodId);
            System.out.println("customerId:"+customerId);
            System.out.println("description:"+description);
            System.out.println("statementDescriptor:"+statementDescriptor);
            System.out.println("metadata:"+metadata);
            System.out.println("captureMethod:"+captureMethod);
            System.out.println("isOffSession:"+isOffSession);

        }

    }



