package cz.mg.vulkan;

public class VkSurfaceCounterFlagsEXT extends VkFlags {
    public VkSurfaceCounterFlagsEXT() {
    }

    protected VkSurfaceCounterFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSurfaceCounterFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSurfaceCounterFlagsEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkSurfaceCounterFlagsEXT(int value) {
        setValue(value);
    }
}
