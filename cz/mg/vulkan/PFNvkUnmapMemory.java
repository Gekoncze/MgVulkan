package cz.mg.vulkan;

public class PFNvkUnmapMemory extends VkFunctionPointer {
    public PFNvkUnmapMemory() {
    }

    public PFNvkUnmapMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkUnmapMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkUnmapMemory(long value) {
        setValue(value);
    }

    public PFNvkUnmapMemory(VkInstance instance) {
        super(instance, new VkString("vkUnmapMemory"));
    }

    public void call(VkDevice device, VkDeviceMemory memory){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), memory != null ? memory.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long memory);
}
