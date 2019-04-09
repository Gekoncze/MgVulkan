package cz.mg.vulkan;

public class VkSamplerAddressMode extends VkEnum {
    public static final int VK_SAMPLER_ADDRESS_MODE_REPEAT = 0;
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = 1;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = 2;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = 3;
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE = 4;

    public VkSamplerAddressMode() {
    }

    public VkSamplerAddressMode(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerAddressMode(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSamplerAddressMode(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SAMPLER_ADDRESS_MODE_REPEAT) return "VK_SAMPLER_ADDRESS_MODE_REPEAT";
        if(getValue() == VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT) return "VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT";
        if(getValue() == VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE) return "VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE";
        if(getValue() == VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER) return "VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER";
        if(getValue() == VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE) return "VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE";
        return "UNKNOWN";
    }
}
