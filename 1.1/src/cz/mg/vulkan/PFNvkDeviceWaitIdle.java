package cz.mg.vulkan;

public class PFNvkDeviceWaitIdle extends VkFunctionPointer {
    public PFNvkDeviceWaitIdle() {
    }

    protected PFNvkDeviceWaitIdle(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDeviceWaitIdle(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDeviceWaitIdle(long value) {
        setValue(value);
    }

    public PFNvkDeviceWaitIdle(VkInstance instance) {
        super(instance, new VkString("vkDeviceWaitIdle"));
    }

    public int call(VkDevice device){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native int callNative(long vkaddress, long device);

}
