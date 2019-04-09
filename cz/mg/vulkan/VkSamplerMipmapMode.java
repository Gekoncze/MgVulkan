package cz.mg.vulkan;

public class VkSamplerMipmapMode extends VkEnum {
    public static final int VK_SAMPLER_MIPMAP_MODE_NEAREST = 0;
    public static final int VK_SAMPLER_MIPMAP_MODE_LINEAR = 1;

    public VkSamplerMipmapMode() {
    }

    public VkSamplerMipmapMode(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerMipmapMode(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSamplerMipmapMode(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SAMPLER_MIPMAP_MODE_NEAREST) return "VK_SAMPLER_MIPMAP_MODE_NEAREST";
        if(getValue() == VK_SAMPLER_MIPMAP_MODE_LINEAR) return "VK_SAMPLER_MIPMAP_MODE_LINEAR";
        return "UNKNOWN";
    }
}
