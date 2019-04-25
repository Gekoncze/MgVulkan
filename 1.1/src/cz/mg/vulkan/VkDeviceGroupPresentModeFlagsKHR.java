package cz.mg.vulkan;

public class VkDeviceGroupPresentModeFlagsKHR extends VkFlags {
    public VkDeviceGroupPresentModeFlagsKHR() {
    }

    protected VkDeviceGroupPresentModeFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDeviceGroupPresentModeFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceGroupPresentModeFlagsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkDeviceGroupPresentModeFlagsKHR(int value) {
        setValue(value);
    }
}
