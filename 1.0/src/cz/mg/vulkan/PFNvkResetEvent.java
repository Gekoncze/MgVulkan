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

    public int call(VkDevice device, VkEvent event){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), event != null ? event.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native int callNative(long vkaddress, long device, long event);

}
