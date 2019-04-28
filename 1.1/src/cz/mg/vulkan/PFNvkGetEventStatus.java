package cz.mg.vulkan;

public class PFNvkGetEventStatus extends VkFunctionPointer {
    public PFNvkGetEventStatus() {
    }

    protected PFNvkGetEventStatus(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetEventStatus(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetEventStatus(long value) {
        setValue(value);
    }

    public PFNvkGetEventStatus(VkInstance instance) {
        super(instance, new VkString("vkGetEventStatus"));
    }

    public int call(VkDevice device, VkEvent event){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), event != null ? event.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native int callNative(long vkaddress, long device, long event);

}
