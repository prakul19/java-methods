import java.util.Random;

public class OtpGenerator {

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.print("Generated OTPs: ");
        for (int otp : otpArray) {
            System.out.print(otp + " ");
        }
        System.out.println();

        // Check if all OTP numbers are unique
        boolean allUnique = areOTPsUnique(otpArray);
        System.out.println("Are all OTPs unique : " + allUnique);
    }

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        Random random = new Random();
        return 100000 + random.nextInt(900000); 
    }

    // Method to check if all OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; 
                }
            }
        }
        return true;
    }
}

