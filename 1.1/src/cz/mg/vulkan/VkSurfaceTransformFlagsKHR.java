package cz.mg.vulkan;

public class VkSurfaceTransformFlagsKHR extends VkFlags {
    public VkSurfaceTransformFlagsKHR() {
    }

    protected VkSurfaceTransformFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSurfaceTransformFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSurfaceTransformFlagsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkSurfaceTransformFlagsKHR(int value) {
        setValue(value);
    }
}
