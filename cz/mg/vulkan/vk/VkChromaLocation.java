package cz.mg.vulkan.vk;

public class VkChromaLocation extends VkEnum {
    public static final int VK_CHROMA_LOCATION_COSITED_EVEN = 0;
    public static final int VK_CHROMA_LOCATION_MIDPOINT = 1;
    public static final int VK_CHROMA_LOCATION_COSITED_EVEN_KHR = VK_CHROMA_LOCATION_COSITED_EVEN;
    public static final int VK_CHROMA_LOCATION_MIDPOINT_KHR = VK_CHROMA_LOCATION_MIDPOINT;

    public VkChromaLocation() {
    }

    public VkChromaLocation(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkChromaLocation(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkChromaLocation(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_CHROMA_LOCATION_COSITED_EVEN) return "VK_CHROMA_LOCATION_COSITED_EVEN";
        if(getValue() == VK_CHROMA_LOCATION_MIDPOINT) return "VK_CHROMA_LOCATION_MIDPOINT";
        if(getValue() == VK_CHROMA_LOCATION_COSITED_EVEN_KHR) return "VK_CHROMA_LOCATION_COSITED_EVEN_KHR";
        if(getValue() == VK_CHROMA_LOCATION_MIDPOINT_KHR) return "VK_CHROMA_LOCATION_MIDPOINT_KHR";
        return "UNKNOWN";
    }
}
