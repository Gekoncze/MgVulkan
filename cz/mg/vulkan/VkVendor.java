package cz.mg.vulkan;

public class VkVendor extends VkUInt32 {
    public VkVendor(){
    }
    
    public VkVendor(int value){
        super(value);
    }
    
    public VkVendor(VkUInt32 value){
        this(value.getValue());
    }
    
    @Override
    public String toString(){
        String s = "0x" + Integer.toHexString(getValue());
        switch(getValue()){
            case 0x1002: s += " (AMD)"; break;
            case 0x10DE: s += " (NVIDIA)"; break;
            case 0x8086: s += " (INTEL)"; break;
            case 0x13B5: s += " (ARM)"; break;
            case 0x5143: s += " (Qualcomm)"; break;
            case 0x1010: s += " (ImgTec)"; break;
        }
        return s;
    }
}
