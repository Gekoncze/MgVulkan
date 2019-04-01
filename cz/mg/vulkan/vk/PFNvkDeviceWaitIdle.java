package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDeviceWaitIdle.html">khronos documentation</a>
 **/
public class PFNvkDeviceWaitIdle extends VkFunctionPointer {
    public PFNvkDeviceWaitIdle() {
    }

    public PFNvkDeviceWaitIdle(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDeviceWaitIdle(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDeviceWaitIdle(long value) {
        setValue(value);
    }

    public PFNvkDeviceWaitIdle(VkInstance instance) {
        super(instance, new VkString("vkDeviceWaitIdle"));
    }

    public void call(VkDevice device, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long rval);
}
