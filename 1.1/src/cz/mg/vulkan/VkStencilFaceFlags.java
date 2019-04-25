package cz.mg.vulkan;

public class VkStencilFaceFlags extends VkFlags {
    public VkStencilFaceFlags() {
    }

    protected VkStencilFaceFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkStencilFaceFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkStencilFaceFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkStencilFaceFlags(int value) {
        setValue(value);
    }
}
