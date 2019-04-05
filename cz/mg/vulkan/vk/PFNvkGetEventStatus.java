package cz.mg.vulkan.vk;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, event != null ? event.getVkAddress() : VkPointer.NULL_ADDRESS, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long event, long rval);
}
