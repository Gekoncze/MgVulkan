package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetMemoryFdKHR.html">khronos documentation</a>
 **/
public class PFNvkGetMemoryFdKHR extends VkFunctionPointer {
    public PFNvkGetMemoryFdKHR() {
    }

    public PFNvkGetMemoryFdKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetMemoryFdKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetMemoryFdKHR(long value) {
        setValue(value);
    }

    public PFNvkGetMemoryFdKHR(VkInstance instance) {
        super(instance, new VkString("vkGetMemoryFdKHR"));
    }

    public void call(VkDevice device, VkMemoryGetFdInfoKHR pGetFdInfo, VkInt pFd, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pGetFdInfo != null ? pGetFdInfo.getVkAddress() : VkPointer.NULL, pFd != null ? pFd.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pGetFdInfo, long pFd, long rval);
}
