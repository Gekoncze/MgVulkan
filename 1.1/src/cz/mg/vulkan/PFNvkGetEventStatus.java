package cz.mg.vulkan;

public class PFNvkGetEventStatus extends VkFunctionPointer {
    public PFNvkGetEventStatus() {
    }

    public PFNvkGetEventStatus(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetEventStatus(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetEventStatus(long value) {
        setValue(value);
    }

    public PFNvkGetEventStatus(VkInstance instance) {
        super(instance, new VkString("vkGetEventStatus"));
    }

    public void call(VkDevice device, VkEvent event, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), event != null ? event.getVkAddress() : VkPointer.getNullAddress(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long event, long rval);
}
