package cz.mg.vulkan;

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
        call(getValue(), queue != null ? queue.getVkAddress() : VkPointer.getNullAddress(), pLabelInfo != null ? pLabelInfo.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long queue, long pLabelInfo);
}
