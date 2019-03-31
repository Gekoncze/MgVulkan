package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetEventStatus.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), event != null ? event.getVkAddress() : VkEvent.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long event, long rval);
}
