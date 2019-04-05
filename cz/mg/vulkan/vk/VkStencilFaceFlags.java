package cz.mg.vulkan.vk;

public class VkStencilFaceFlags extends VkFlags {
    public VkStencilFaceFlags() {
    }

    public VkStencilFaceFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkStencilFaceFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkStencilFaceFlags(int value) {
        setValue(value);
    }
}
