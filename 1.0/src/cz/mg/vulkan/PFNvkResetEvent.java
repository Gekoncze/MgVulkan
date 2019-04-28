package cz.mg.vulkan;

public class PFNvkResetEvent extends VkFunctionPointer {
    public PFNvkResetEvent() {
    }

    protected PFNvkResetEvent(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkResetEvent(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkResetEvent(long value) {
        setValue(value);
    }

    public PFNvkResetEvent(VkInstance instance) {
        super(instance, new VkString("vkResetEvent"));
    }

    public void call(VkDevice device, VkEvent event, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), event != null ? event.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long event, long rval);


    public int call(VkDevice device, VkEvent event){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), event != null ? event.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long event);

}
