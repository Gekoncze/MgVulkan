package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkResetEvent.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, event != null ? event.getVkAddress() : VkPointer.NULL_ADDRESS, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long event, long rval);
}
