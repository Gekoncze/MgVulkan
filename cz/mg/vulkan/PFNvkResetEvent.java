package cz.mg.vulkan;

public class PFNvkResetEvent extends VkFunctionPointer {
    public PFNvkResetEvent() {
    }

    public PFNvkResetEvent(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkResetEvent(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkResetEvent(long value) {
        setValue(value);
    }

    public PFNvkResetEvent(VkInstance instance) {
        super(instance, new VkString("vkResetEvent"));
    }

    public void call(VkDevice device, VkEvent event, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), event != null ? event.getVkAddress() : VkPointer.getSinkAddress(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long event, long rval);
}
