package cz.mg.vulkan;

public class PFNvkSetEvent extends VkFunctionPointer {
    public PFNvkSetEvent() {
    }

    public PFNvkSetEvent(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkSetEvent(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkSetEvent(long value) {
        setValue(value);
    }

    public PFNvkSetEvent(VkInstance instance) {
        super(instance, new VkString("vkSetEvent"));
    }

    public void call(VkDevice device, VkEvent event, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), event != null ? event.getVkAddress() : VkPointer.getNullAddress(), rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long device, long event, long rval);
}
