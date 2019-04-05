package cz.mg.vulkan.vk;

public class VkSurfaceCounterFlagsEXT extends VkFlags {
    public VkSurfaceCounterFlagsEXT() {
    }

    public VkSurfaceCounterFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSurfaceCounterFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSurfaceCounterFlagsEXT(int value) {
        setValue(value);
    }
}
