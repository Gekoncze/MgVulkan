package cz.mg.vulkan;

public class PFNvkUnmapMemory extends VkFunctionPointer {
    public PFNvkUnmapMemory() {
    }

    protected PFNvkUnmapMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkUnmapMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkUnmapMemory(long value) {
        setValue(value);
    }

    public PFNvkUnmapMemory(VkInstance instance) {
        super(instance, new VkString("vkUnmapMemory"));
    }

    public void call(VkDevice device, VkDeviceMemory memory){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long device, long memory);
}
