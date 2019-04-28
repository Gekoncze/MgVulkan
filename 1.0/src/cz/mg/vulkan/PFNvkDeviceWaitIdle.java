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

    public void call(VkDevice device, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long rval);


    public int call(VkDevice device){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native int callSimplifiedNative(long vkaddress, long device);

}
