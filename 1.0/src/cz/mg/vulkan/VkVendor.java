package cz.mg.vulkan;

public class VkVendor extends VkUInt32 {
    public static final int NVIDIA = 0x10DE;
    public static final int INTEL = 0x8086;
    public static final int AMD = 0x1002;
    public static final int ARM = 0x13B5;
    public static final int QUALCOMM = 0x5143;
    public static final int IMGTEC = 0x1010;

    public VkVendor(){
    }
    
    public VkVendor(int value){
        super(value);
    }
    
    public VkVendor(VkUInt32 value){
        this(value.getValue());
    }

    public String getName(){
        switch(getValue()){
            case AMD: return "AMD";
            case NVIDIA: return "NVIDIA";
            case INTEL: return "INTEL";
            case ARM: return "ARM";
            case QUALCOMM: return "QUALCOMM";
            case IMGTEC: return "IMGTEC";
            default: return "Unknown";
        }
    }
    
    @Override
    public String toString(){
        return getName() + " (0x" + Integer.toHexString(getValue()) + ")";
    }
}
