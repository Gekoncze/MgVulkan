package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkQueueSubmit.html">khronos documentation</a>
 **/
public class PFNvkQueueSubmit extends VkFunctionPointer {
    public PFNvkQueueSubmit() {
    }

    public PFNvkQueueSubmit(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkQueueSubmit(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkQueueSubmit(long value) {
        setValue(value);
    }

    public PFNvkQueueSubmit(VkInstance instance) {
        super(instance, new VkString("vkQueueSubmit"));
    }

    public void call(VkQueue queue, VkUInt32 submitCount, VkSubmitInfo pSubmits, VkFence fence, VkResult rval){
        call(getValue(), queue != null ? queue.getVkAddress() : VkPointer.NULL_ADDRESS, submitCount != null ? submitCount.getVkAddress() : VkPointer.NULL_ADDRESS, pSubmits != null ? pSubmits.getVkAddress() : VkPointer.NULL, fence != null ? fence.getVkAddress() : VkPointer.NULL_ADDRESS, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long queue, long submitCount, long pSubmits, long fence, long rval);
}
