package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkQueueBeginDebugUtilsLabelEXT.html">khronos documentation</a>
 **/
public class PFNvkQueueBeginDebugUtilsLabelEXT extends VkFunctionPointer {
    public PFNvkQueueBeginDebugUtilsLabelEXT() {
    }

    public PFNvkQueueBeginDebugUtilsLabelEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkQueueBeginDebugUtilsLabelEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkQueueBeginDebugUtilsLabelEXT(long value) {
        setValue(value);
    }

    public PFNvkQueueBeginDebugUtilsLabelEXT(VkInstance instance) {
        super(instance, new VkString("vkQueueBeginDebugUtilsLabelEXT"));
    }

    public void call(VkQueue queue, VkDebugUtilsLabelEXT pLabelInfo){
        call(getValue(), queue != null ? queue.getVkAddress() : VkPointer.NULL_ADDRESS, pLabelInfo != null ? pLabelInfo.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long queue, long pLabelInfo);
}
