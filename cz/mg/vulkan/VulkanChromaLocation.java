package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanChromaLocation extends VulkanEnum {
    public static final int COSITED_EVEN = VkChromaLocation.VK_CHROMA_LOCATION_COSITED_EVEN;
    public static final int MIDPOINT = VkChromaLocation.VK_CHROMA_LOCATION_MIDPOINT;
    public static final int COSITED_EVEN_KHR = VkChromaLocation.VK_CHROMA_LOCATION_COSITED_EVEN_KHR;
    public static final int MIDPOINT_KHR = VkChromaLocation.VK_CHROMA_LOCATION_MIDPOINT_KHR;

    public VulkanChromaLocation(){
        super(new VkChromaLocation());
    }

    public VulkanChromaLocation(VkChromaLocation vk){
        super(vk);
    }

    @Override
    public VkChromaLocation getVk(){
        return (VkChromaLocation) super.getVk();
    }

    public VulkanChromaLocation(int value){
        super(new VkChromaLocation(value));
    }

    @Override
    public String toString() {
        if(getValue() == COSITED_EVEN) return "COSITED_EVEN";
        if(getValue() == MIDPOINT) return "MIDPOINT";
        if(getValue() == COSITED_EVEN_KHR) return "COSITED_EVEN_KHR";
        if(getValue() == MIDPOINT_KHR) return "MIDPOINT_KHR";
        return "UNKNOWN";
    }
}
