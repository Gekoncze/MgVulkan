package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkQueuePresentKHR.html">khronos documentation</a>
 **/
public class PFNvkQueuePresentKHR extends VkFunctionPointer {
    public PFNvkQueuePresentKHR() {
    }

    public PFNvkQueuePresentKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkQueuePresentKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkQueuePresentKHR(long value) {
        setValue(value);
    }

    public PFNvkQueuePresentKHR(VkInstance instance) {
        super(instance, new VkString("vkQueuePresentKHR"));
    }

    public void call(VkQueue queue, VkPresentInfoKHR pPresentInfo, VkResult rval){
        call(getValue(), queue != null ? queue.getVkAddress() : VkPointer.NULL_ADDRESS, pPresentInfo != null ? pPresentInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long queue, long pPresentInfo, long rval);
}
