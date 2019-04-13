package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkSimplified extends Vk {
    private static class Resources implements AutoCloseable {
        private final ChainList<VkObject> resources = new ChainList<>();

        private synchronized VkObject add(VkObject resource){
            resources.addLast(resource);
            return resource;
        }

        public final ThreadLocal<VkResult> result = ThreadLocal.withInitial(new java.util.function.Supplier<VkResult>() {
            @Override
            public VkResult get() {
                return (VkResult) add(new VkResult());
            }
        });

        public final ThreadLocal<VkUInt32> count = ThreadLocal.withInitial(new java.util.function.Supplier<VkUInt32>() {
            @Override
            public VkUInt32 get() {
                return (VkUInt32) add(new VkUInt32());
            }
        });

        @Override
        public void close() {
            try {
                for(VkObject resource : resources) VkResourceManager.getInstance().forceFree(resource.getVkMemory());
                resources.clear();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private final Resources resources = new Resources();
    private VkAllocationCallbacks pAllocator = null;

    public VkSimplified() {
        VkResourceManager.getInstance().add(this, resources);
    }

    public VkAllocationCallbacks getAllocator() {
        return pAllocator;
    }

    public void setAllocator(VkAllocationCallbacks pAllocator) {
        this.pAllocator = pAllocator;
    }

    public VkInstance vkCreateInstance(VkInstanceCreateInfo pCreateInfo){
        VkInstance o = new VkInstance();
        super.vkCreateInstance(pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateInstance");
        return o;
    }


    public void vkDestroyInstance(VkInstance instance){
        super.vkDestroyInstance(instance, pAllocator);
    }


    public VkPhysicalDevice.Array vkEnumeratePhysicalDevices(VkInstance instance){
        super.vkEnumeratePhysicalDevices(instance, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumeratePhysicalDevices");

        VkPhysicalDevice.Array o = new VkPhysicalDevice.Array(resources.count.get().getValue());

        super.vkEnumeratePhysicalDevices(instance, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumeratePhysicalDevices");

        return o;
    }


    public VkPhysicalDeviceFeatures vkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice){
        VkPhysicalDeviceFeatures o = new VkPhysicalDeviceFeatures();
        super.vkGetPhysicalDeviceFeatures(physicalDevice, o);
        return o;
    }


    public VkFormatProperties vkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format){
        VkFormatProperties o = new VkFormatProperties();
        super.vkGetPhysicalDeviceFormatProperties(physicalDevice, format, o);
        return o;
    }


    public VkImageFormatProperties vkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags){
        VkImageFormatProperties o = new VkImageFormatProperties();
        super.vkGetPhysicalDeviceImageFormatProperties(physicalDevice, format, type, tiling, usage, flags, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceImageFormatProperties");
        return o;
    }


    public VkPhysicalDeviceProperties vkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice){
        VkPhysicalDeviceProperties o = new VkPhysicalDeviceProperties();
        super.vkGetPhysicalDeviceProperties(physicalDevice, o);
        return o;
    }


    public VkQueueFamilyProperties.Array vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice){
        super.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, resources.count.get(), null);
        VkQueueFamilyProperties.Array o = new VkQueueFamilyProperties.Array(resources.count.get().getValue());
        super.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, resources.count.get(), o);
        return o;
    }


    public VkPhysicalDeviceMemoryProperties vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice){
        VkPhysicalDeviceMemoryProperties o = new VkPhysicalDeviceMemoryProperties();
        super.vkGetPhysicalDeviceMemoryProperties(physicalDevice, o);
        return o;
    }


    public VkDevice vkCreateDevice(VkPhysicalDevice physicalDevice, VkDeviceCreateInfo pCreateInfo){
        VkDevice o = new VkDevice();
        super.vkCreateDevice(physicalDevice, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDevice");
        return o;
    }


    public void vkDestroyDevice(VkDevice device){
        super.vkDestroyDevice(device, pAllocator);
    }


    public VkExtensionProperties.Array vkEnumerateInstanceExtensionProperties(VkChar pLayerName){
        super.vkEnumerateInstanceExtensionProperties(pLayerName, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumerateInstanceExtensionProperties");

        VkExtensionProperties.Array o = new VkExtensionProperties.Array(resources.count.get().getValue());

        super.vkEnumerateInstanceExtensionProperties(pLayerName, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumerateInstanceExtensionProperties");

        return o;
    }


    public VkExtensionProperties.Array vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, VkChar pLayerName){
        super.vkEnumerateDeviceExtensionProperties(physicalDevice, pLayerName, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumerateDeviceExtensionProperties");

        VkExtensionProperties.Array o = new VkExtensionProperties.Array(resources.count.get().getValue());

        super.vkEnumerateDeviceExtensionProperties(physicalDevice, pLayerName, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumerateDeviceExtensionProperties");

        return o;
    }


    public VkLayerProperties.Array vkEnumerateInstanceLayerProperties(){
        super.vkEnumerateInstanceLayerProperties(resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumerateInstanceLayerProperties");

        VkLayerProperties.Array o = new VkLayerProperties.Array(resources.count.get().getValue());

        super.vkEnumerateInstanceLayerProperties(resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumerateInstanceLayerProperties");

        return o;
    }


    public VkLayerProperties.Array vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice){
        super.vkEnumerateDeviceLayerProperties(physicalDevice, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumerateDeviceLayerProperties");

        VkLayerProperties.Array o = new VkLayerProperties.Array(resources.count.get().getValue());

        super.vkEnumerateDeviceLayerProperties(physicalDevice, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumerateDeviceLayerProperties");

        return o;
    }


    public VkQueue vkGetDeviceQueue(VkDevice device, VkUInt32 queueFamilyIndex, VkUInt32 queueIndex){
        VkQueue o = new VkQueue();
        super.vkGetDeviceQueue(device, queueFamilyIndex, queueIndex, o);
        return o;
    }


    public void vkQueueSubmit(VkQueue queue, VkUInt32 submitCount, VkSubmitInfo pSubmits, VkFence fence){
        super.vkQueueSubmit(queue, submitCount, pSubmits, fence, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkQueueSubmit");
    }


    public void vkQueueWaitIdle(VkQueue queue){
        super.vkQueueWaitIdle(queue, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkQueueWaitIdle");
    }


    public void vkDeviceWaitIdle(VkDevice device){
        super.vkDeviceWaitIdle(device, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkDeviceWaitIdle");
    }


    public void vkAllocateMemory(VkDevice device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, VkDeviceMemory pMemory){
        super.vkAllocateMemory(device, pAllocateInfo, pAllocator, pMemory, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkAllocateMemory");
    }


    public void vkMapMemory(VkDevice device, VkDeviceMemory memory, VkDeviceSize offset, VkDeviceSize size, VkMemoryMapFlags flags, VkObject.Pointer ppData){
        super.vkMapMemory(device, memory, offset, size, flags, ppData, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkMapMemory");
    }


    public void vkFlushMappedMemoryRanges(VkDevice device, VkUInt32 memoryRangeCount, VkMappedMemoryRange pMemoryRanges){
        super.vkFlushMappedMemoryRanges(device, memoryRangeCount, pMemoryRanges, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkFlushMappedMemoryRanges");
    }


    public void vkInvalidateMappedMemoryRanges(VkDevice device, VkUInt32 memoryRangeCount, VkMappedMemoryRange pMemoryRanges){
        super.vkInvalidateMappedMemoryRanges(device, memoryRangeCount, pMemoryRanges, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkInvalidateMappedMemoryRanges");
    }


    public VkDeviceSize vkGetDeviceMemoryCommitment(VkDevice device, VkDeviceMemory memory){
        VkDeviceSize o = new VkDeviceSize();
        super.vkGetDeviceMemoryCommitment(device, memory, o);
        return o;
    }


    public void vkBindBufferMemory(VkDevice device, VkBuffer buffer, VkDeviceMemory memory, VkDeviceSize memoryOffset){
        super.vkBindBufferMemory(device, buffer, memory, memoryOffset, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkBindBufferMemory");
    }


    public void vkBindImageMemory(VkDevice device, VkImage image, VkDeviceMemory memory, VkDeviceSize memoryOffset){
        super.vkBindImageMemory(device, image, memory, memoryOffset, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkBindImageMemory");
    }


    public VkMemoryRequirements vkGetBufferMemoryRequirements(VkDevice device, VkBuffer buffer){
        VkMemoryRequirements o = new VkMemoryRequirements();
        super.vkGetBufferMemoryRequirements(device, buffer, o);
        return o;
    }


    public VkMemoryRequirements vkGetImageMemoryRequirements(VkDevice device, VkImage image){
        VkMemoryRequirements o = new VkMemoryRequirements();
        super.vkGetImageMemoryRequirements(device, image, o);
        return o;
    }


    public VkSparseImageMemoryRequirements.Array vkGetImageSparseMemoryRequirements(VkDevice device, VkImage image){
        super.vkGetImageSparseMemoryRequirements(device, image, resources.count.get(), null);
        VkSparseImageMemoryRequirements.Array o = new VkSparseImageMemoryRequirements.Array(resources.count.get().getValue());
        super.vkGetImageSparseMemoryRequirements(device, image, resources.count.get(), o);
        return o;
    }


    public VkSparseImageFormatProperties.Array vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkSampleCountFlagBits samples, VkImageUsageFlags usage, VkImageTiling tiling){
        super.vkGetPhysicalDeviceSparseImageFormatProperties(physicalDevice, format, type, samples, usage, tiling, resources.count.get(), null);
        VkSparseImageFormatProperties.Array o = new VkSparseImageFormatProperties.Array(resources.count.get().getValue());
        super.vkGetPhysicalDeviceSparseImageFormatProperties(physicalDevice, format, type, samples, usage, tiling, resources.count.get(), o);
        return o;
    }


    public void vkQueueBindSparse(VkQueue queue, VkUInt32 bindInfoCount, VkBindSparseInfo pBindInfo, VkFence fence){
        super.vkQueueBindSparse(queue, bindInfoCount, pBindInfo, fence, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkQueueBindSparse");
    }


    public VkFence vkCreateFence(VkDevice device, VkFenceCreateInfo pCreateInfo){
        VkFence o = new VkFence();
        super.vkCreateFence(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateFence");
        return o;
    }


    public void vkDestroyFence(VkDevice device, VkFence fence){
        super.vkDestroyFence(device, fence, pAllocator);
    }


    public void vkResetFences(VkDevice device, VkUInt32 fenceCount, VkFence pFences){
        super.vkResetFences(device, fenceCount, pFences, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkResetFences");
    }


    public VkResult vkGetFenceStatus(VkDevice device, VkFence fence){
        VkResult o = new VkResult();
        super.vkGetFenceStatus(device, fence, o);
        return o;
    }


    public void vkWaitForFences(VkDevice device, VkUInt32 fenceCount, VkFence pFences, VkBool32 waitAll, VkUInt64 timeout){
        super.vkWaitForFences(device, fenceCount, pFences, waitAll, timeout, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkWaitForFences");
    }


    public VkSemaphore vkCreateSemaphore(VkDevice device, VkSemaphoreCreateInfo pCreateInfo){
        VkSemaphore o = new VkSemaphore();
        super.vkCreateSemaphore(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateSemaphore");
        return o;
    }


    public void vkDestroySemaphore(VkDevice device, VkSemaphore semaphore){
        super.vkDestroySemaphore(device, semaphore, pAllocator);
    }


    public VkEvent vkCreateEvent(VkDevice device, VkEventCreateInfo pCreateInfo){
        VkEvent o = new VkEvent();
        super.vkCreateEvent(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateEvent");
        return o;
    }


    public void vkDestroyEvent(VkDevice device, VkEvent event){
        super.vkDestroyEvent(device, event, pAllocator);
    }


    public VkResult vkGetEventStatus(VkDevice device, VkEvent event){
        VkResult o = new VkResult();
        super.vkGetEventStatus(device, event, o);
        return o;
    }


    public void vkSetEvent(VkDevice device, VkEvent event){
        super.vkSetEvent(device, event, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkSetEvent");
    }


    public void vkResetEvent(VkDevice device, VkEvent event){
        super.vkResetEvent(device, event, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkResetEvent");
    }


    public VkQueryPool vkCreateQueryPool(VkDevice device, VkQueryPoolCreateInfo pCreateInfo){
        VkQueryPool o = new VkQueryPool();
        super.vkCreateQueryPool(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateQueryPool");
        return o;
    }


    public void vkDestroyQueryPool(VkDevice device, VkQueryPool queryPool){
        super.vkDestroyQueryPool(device, queryPool, pAllocator);
    }


    public VkQueryResultFlags vkGetQueryPoolResults(VkDevice device, VkQueryPool queryPool, VkUInt32 firstQuery, VkUInt32 queryCount, VkSize dataSize, VkObject pData, VkDeviceSize stride){
        VkQueryResultFlags o = new VkQueryResultFlags();
        super.vkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, dataSize, pData, stride, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetQueryPoolResults");
        return o;
    }


    public VkBuffer vkCreateBuffer(VkDevice device, VkBufferCreateInfo pCreateInfo){
        VkBuffer o = new VkBuffer();
        super.vkCreateBuffer(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateBuffer");
        return o;
    }


    public void vkDestroyBuffer(VkDevice device, VkBuffer buffer){
        super.vkDestroyBuffer(device, buffer, pAllocator);
    }


    public VkBufferView vkCreateBufferView(VkDevice device, VkBufferViewCreateInfo pCreateInfo){
        VkBufferView o = new VkBufferView();
        super.vkCreateBufferView(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateBufferView");
        return o;
    }


    public void vkDestroyBufferView(VkDevice device, VkBufferView bufferView){
        super.vkDestroyBufferView(device, bufferView, pAllocator);
    }


    public VkImage vkCreateImage(VkDevice device, VkImageCreateInfo pCreateInfo){
        VkImage o = new VkImage();
        super.vkCreateImage(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateImage");
        return o;
    }


    public void vkDestroyImage(VkDevice device, VkImage image){
        super.vkDestroyImage(device, image, pAllocator);
    }


    public VkSubresourceLayout vkGetImageSubresourceLayout(VkDevice device, VkImage image, VkImageSubresource pSubresource){
        VkSubresourceLayout o = new VkSubresourceLayout();
        super.vkGetImageSubresourceLayout(device, image, pSubresource, o);
        return o;
    }


    public VkImageView vkCreateImageView(VkDevice device, VkImageViewCreateInfo pCreateInfo){
        VkImageView o = new VkImageView();
        super.vkCreateImageView(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateImageView");
        return o;
    }


    public void vkDestroyImageView(VkDevice device, VkImageView imageView){
        super.vkDestroyImageView(device, imageView, pAllocator);
    }


    public VkShaderModule vkCreateShaderModule(VkDevice device, VkShaderModuleCreateInfo pCreateInfo){
        VkShaderModule o = new VkShaderModule();
        super.vkCreateShaderModule(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateShaderModule");
        return o;
    }


    public void vkDestroyShaderModule(VkDevice device, VkShaderModule shaderModule){
        super.vkDestroyShaderModule(device, shaderModule, pAllocator);
    }


    public VkPipelineCache vkCreatePipelineCache(VkDevice device, VkPipelineCacheCreateInfo pCreateInfo){
        VkPipelineCache o = new VkPipelineCache();
        super.vkCreatePipelineCache(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreatePipelineCache");
        return o;
    }


    public void vkDestroyPipelineCache(VkDevice device, VkPipelineCache pipelineCache){
        super.vkDestroyPipelineCache(device, pipelineCache, pAllocator);
    }


    public void vkGetPipelineCacheData(VkDevice device, VkPipelineCache pipelineCache, VkSize pDataSize, VkObject pData){
        super.vkGetPipelineCacheData(device, pipelineCache, pDataSize, pData, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPipelineCacheData");
    }


    public void vkMergePipelineCaches(VkDevice device, VkPipelineCache dstCache, VkUInt32 srcCacheCount, VkPipelineCache pSrcCaches){
        super.vkMergePipelineCaches(device, dstCache, srcCacheCount, pSrcCaches, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkMergePipelineCaches");
    }


    public VkPipeline vkCreateGraphicsPipelines(VkDevice device, VkPipelineCache pipelineCache, VkUInt32 createInfoCount, VkGraphicsPipelineCreateInfo pCreateInfos){
        VkPipeline o = new VkPipeline();
        super.vkCreateGraphicsPipelines(device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateGraphicsPipelines");
        return o;
    }


    public VkPipeline vkCreateComputePipelines(VkDevice device, VkPipelineCache pipelineCache, VkUInt32 createInfoCount, VkComputePipelineCreateInfo pCreateInfos){
        VkPipeline o = new VkPipeline();
        super.vkCreateComputePipelines(device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateComputePipelines");
        return o;
    }


    public void vkDestroyPipeline(VkDevice device, VkPipeline pipeline){
        super.vkDestroyPipeline(device, pipeline, pAllocator);
    }


    public VkPipelineLayout vkCreatePipelineLayout(VkDevice device, VkPipelineLayoutCreateInfo pCreateInfo){
        VkPipelineLayout o = new VkPipelineLayout();
        super.vkCreatePipelineLayout(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreatePipelineLayout");
        return o;
    }


    public void vkDestroyPipelineLayout(VkDevice device, VkPipelineLayout pipelineLayout){
        super.vkDestroyPipelineLayout(device, pipelineLayout, pAllocator);
    }


    public VkSampler vkCreateSampler(VkDevice device, VkSamplerCreateInfo pCreateInfo){
        VkSampler o = new VkSampler();
        super.vkCreateSampler(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateSampler");
        return o;
    }


    public void vkDestroySampler(VkDevice device, VkSampler sampler){
        super.vkDestroySampler(device, sampler, pAllocator);
    }


    public VkDescriptorSetLayout vkCreateDescriptorSetLayout(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo){
        VkDescriptorSetLayout o = new VkDescriptorSetLayout();
        super.vkCreateDescriptorSetLayout(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDescriptorSetLayout");
        return o;
    }


    public void vkDestroyDescriptorSetLayout(VkDevice device, VkDescriptorSetLayout descriptorSetLayout){
        super.vkDestroyDescriptorSetLayout(device, descriptorSetLayout, pAllocator);
    }


    public VkDescriptorPool vkCreateDescriptorPool(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo){
        VkDescriptorPool o = new VkDescriptorPool();
        super.vkCreateDescriptorPool(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDescriptorPool");
        return o;
    }


    public void vkDestroyDescriptorPool(VkDevice device, VkDescriptorPool descriptorPool){
        super.vkDestroyDescriptorPool(device, descriptorPool, pAllocator);
    }


    public void vkResetDescriptorPool(VkDevice device, VkDescriptorPool descriptorPool, VkDescriptorPoolResetFlags flags){
        super.vkResetDescriptorPool(device, descriptorPool, flags, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkResetDescriptorPool");
    }


    public void vkAllocateDescriptorSets(VkDevice device, VkDescriptorSetAllocateInfo pAllocateInfo, VkDescriptorSet pDescriptorSets){
        super.vkAllocateDescriptorSets(device, pAllocateInfo, pDescriptorSets, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkAllocateDescriptorSets");
    }


    public void vkFreeDescriptorSets(VkDevice device, VkDescriptorPool descriptorPool, VkUInt32 descriptorSetCount, VkDescriptorSet pDescriptorSets){
        super.vkFreeDescriptorSets(device, descriptorPool, descriptorSetCount, pDescriptorSets, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkFreeDescriptorSets");
    }


    public VkFramebuffer vkCreateFramebuffer(VkDevice device, VkFramebufferCreateInfo pCreateInfo){
        VkFramebuffer o = new VkFramebuffer();
        super.vkCreateFramebuffer(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateFramebuffer");
        return o;
    }


    public void vkDestroyFramebuffer(VkDevice device, VkFramebuffer framebuffer){
        super.vkDestroyFramebuffer(device, framebuffer, pAllocator);
    }


    public VkRenderPass vkCreateRenderPass(VkDevice device, VkRenderPassCreateInfo pCreateInfo){
        VkRenderPass o = new VkRenderPass();
        super.vkCreateRenderPass(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateRenderPass");
        return o;
    }


    public void vkDestroyRenderPass(VkDevice device, VkRenderPass renderPass){
        super.vkDestroyRenderPass(device, renderPass, pAllocator);
    }


    public VkExtent2D vkGetRenderAreaGranularity(VkDevice device, VkRenderPass renderPass){
        VkExtent2D o = new VkExtent2D();
        super.vkGetRenderAreaGranularity(device, renderPass, o);
        return o;
    }


    public VkCommandPool vkCreateCommandPool(VkDevice device, VkCommandPoolCreateInfo pCreateInfo){
        VkCommandPool o = new VkCommandPool();
        super.vkCreateCommandPool(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateCommandPool");
        return o;
    }


    public void vkDestroyCommandPool(VkDevice device, VkCommandPool commandPool){
        super.vkDestroyCommandPool(device, commandPool, pAllocator);
    }


    public void vkResetCommandPool(VkDevice device, VkCommandPool commandPool, VkCommandPoolResetFlags flags){
        super.vkResetCommandPool(device, commandPool, flags, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkResetCommandPool");
    }


    public void vkAllocateCommandBuffers(VkDevice device, VkCommandBufferAllocateInfo pAllocateInfo, VkCommandBuffer pCommandBuffers){
        super.vkAllocateCommandBuffers(device, pAllocateInfo, pCommandBuffers, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkAllocateCommandBuffers");
    }


    public void vkBeginCommandBuffer(VkCommandBuffer commandBuffer, VkCommandBufferBeginInfo pBeginInfo){
        super.vkBeginCommandBuffer(commandBuffer, pBeginInfo, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkBeginCommandBuffer");
    }


    public void vkEndCommandBuffer(VkCommandBuffer commandBuffer){
        super.vkEndCommandBuffer(commandBuffer, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEndCommandBuffer");
    }


    public void vkResetCommandBuffer(VkCommandBuffer commandBuffer, VkCommandBufferResetFlags flags){
        super.vkResetCommandBuffer(commandBuffer, flags, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkResetCommandBuffer");
    }


    public void vkEnumerateInstanceVersion(VkUInt32 pApiVersion){
        super.vkEnumerateInstanceVersion(pApiVersion, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumerateInstanceVersion");
    }


    public void vkBindBufferMemory2(VkDevice device, VkUInt32 bindInfoCount, VkBindBufferMemoryInfo pBindInfos){
        super.vkBindBufferMemory2(device, bindInfoCount, pBindInfos, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkBindBufferMemory2");
    }


    public void vkBindImageMemory2(VkDevice device, VkUInt32 bindInfoCount, VkBindImageMemoryInfo pBindInfos){
        super.vkBindImageMemory2(device, bindInfoCount, pBindInfos, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkBindImageMemory2");
    }


    public VkPeerMemoryFeatureFlags vkGetDeviceGroupPeerMemoryFeatures(VkDevice device, VkUInt32 heapIndex, VkUInt32 localDeviceIndex, VkUInt32 remoteDeviceIndex){
        VkPeerMemoryFeatureFlags o = new VkPeerMemoryFeatureFlags();
        super.vkGetDeviceGroupPeerMemoryFeatures(device, heapIndex, localDeviceIndex, remoteDeviceIndex, o);
        return o;
    }


    public VkPhysicalDeviceGroupProperties.Array vkEnumeratePhysicalDeviceGroups(VkInstance instance){
        super.vkEnumeratePhysicalDeviceGroups(instance, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumeratePhysicalDeviceGroups");

        VkPhysicalDeviceGroupProperties.Array o = new VkPhysicalDeviceGroupProperties.Array(resources.count.get().getValue());

        super.vkEnumeratePhysicalDeviceGroups(instance, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumeratePhysicalDeviceGroups");

        return o;
    }


    public VkMemoryRequirements2 vkGetImageMemoryRequirements2(VkDevice device, VkImageMemoryRequirementsInfo2 pInfo){
        VkMemoryRequirements2 o = new VkMemoryRequirements2();
        super.vkGetImageMemoryRequirements2(device, pInfo, o);
        return o;
    }


    public VkMemoryRequirements2 vkGetBufferMemoryRequirements2(VkDevice device, VkBufferMemoryRequirementsInfo2 pInfo){
        VkMemoryRequirements2 o = new VkMemoryRequirements2();
        super.vkGetBufferMemoryRequirements2(device, pInfo, o);
        return o;
    }


    public VkSparseImageMemoryRequirements2.Array vkGetImageSparseMemoryRequirements2(VkDevice device, VkImageSparseMemoryRequirementsInfo2 pInfo){
        super.vkGetImageSparseMemoryRequirements2(device, pInfo, resources.count.get(), null);
        VkSparseImageMemoryRequirements2.Array o = new VkSparseImageMemoryRequirements2.Array(resources.count.get().getValue());
        super.vkGetImageSparseMemoryRequirements2(device, pInfo, resources.count.get(), o);
        return o;
    }


    public VkPhysicalDeviceFeatures2 vkGetPhysicalDeviceFeatures2(VkPhysicalDevice physicalDevice){
        VkPhysicalDeviceFeatures2 o = new VkPhysicalDeviceFeatures2();
        super.vkGetPhysicalDeviceFeatures2(physicalDevice, o);
        return o;
    }


    public VkPhysicalDeviceProperties2 vkGetPhysicalDeviceProperties2(VkPhysicalDevice physicalDevice){
        VkPhysicalDeviceProperties2 o = new VkPhysicalDeviceProperties2();
        super.vkGetPhysicalDeviceProperties2(physicalDevice, o);
        return o;
    }


    public VkFormatProperties2 vkGetPhysicalDeviceFormatProperties2(VkPhysicalDevice physicalDevice, VkFormat format){
        VkFormatProperties2 o = new VkFormatProperties2();
        super.vkGetPhysicalDeviceFormatProperties2(physicalDevice, format, o);
        return o;
    }


    public VkImageFormatProperties2 vkGetPhysicalDeviceImageFormatProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo){
        VkImageFormatProperties2 o = new VkImageFormatProperties2();
        super.vkGetPhysicalDeviceImageFormatProperties2(physicalDevice, pImageFormatInfo, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceImageFormatProperties2");
        return o;
    }


    public VkQueueFamilyProperties2.Array vkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice){
        super.vkGetPhysicalDeviceQueueFamilyProperties2(physicalDevice, resources.count.get(), null);
        VkQueueFamilyProperties2.Array o = new VkQueueFamilyProperties2.Array(resources.count.get().getValue());
        super.vkGetPhysicalDeviceQueueFamilyProperties2(physicalDevice, resources.count.get(), o);
        return o;
    }


    public VkPhysicalDeviceMemoryProperties2 vkGetPhysicalDeviceMemoryProperties2(VkPhysicalDevice physicalDevice){
        VkPhysicalDeviceMemoryProperties2 o = new VkPhysicalDeviceMemoryProperties2();
        super.vkGetPhysicalDeviceMemoryProperties2(physicalDevice, o);
        return o;
    }


    public VkSparseImageFormatProperties2.Array vkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo){
        super.vkGetPhysicalDeviceSparseImageFormatProperties2(physicalDevice, pFormatInfo, resources.count.get(), null);
        VkSparseImageFormatProperties2.Array o = new VkSparseImageFormatProperties2.Array(resources.count.get().getValue());
        super.vkGetPhysicalDeviceSparseImageFormatProperties2(physicalDevice, pFormatInfo, resources.count.get(), o);
        return o;
    }


    public VkQueue vkGetDeviceQueue2(VkDevice device, VkDeviceQueueInfo2 pQueueInfo){
        VkQueue o = new VkQueue();
        super.vkGetDeviceQueue2(device, pQueueInfo, o);
        return o;
    }


    public VkSamplerYcbcrConversion vkCreateSamplerYcbcrConversion(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo){
        VkSamplerYcbcrConversion o = new VkSamplerYcbcrConversion();
        super.vkCreateSamplerYcbcrConversion(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateSamplerYcbcrConversion");
        return o;
    }


    public void vkDestroySamplerYcbcrConversion(VkDevice device, VkSamplerYcbcrConversion ycbcrConversion){
        super.vkDestroySamplerYcbcrConversion(device, ycbcrConversion, pAllocator);
    }


    public VkDescriptorUpdateTemplate vkCreateDescriptorUpdateTemplate(VkDevice device, VkDescriptorUpdateTemplateCreateInfo pCreateInfo){
        VkDescriptorUpdateTemplate o = new VkDescriptorUpdateTemplate();
        super.vkCreateDescriptorUpdateTemplate(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDescriptorUpdateTemplate");
        return o;
    }


    public void vkDestroyDescriptorUpdateTemplate(VkDevice device, VkDescriptorUpdateTemplate descriptorUpdateTemplate){
        super.vkDestroyDescriptorUpdateTemplate(device, descriptorUpdateTemplate, pAllocator);
    }


    public VkExternalBufferProperties vkGetPhysicalDeviceExternalBufferProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo){
        VkExternalBufferProperties o = new VkExternalBufferProperties();
        super.vkGetPhysicalDeviceExternalBufferProperties(physicalDevice, pExternalBufferInfo, o);
        return o;
    }


    public VkExternalFenceProperties vkGetPhysicalDeviceExternalFenceProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo){
        VkExternalFenceProperties o = new VkExternalFenceProperties();
        super.vkGetPhysicalDeviceExternalFenceProperties(physicalDevice, pExternalFenceInfo, o);
        return o;
    }


    public VkExternalSemaphoreProperties vkGetPhysicalDeviceExternalSemaphoreProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo){
        VkExternalSemaphoreProperties o = new VkExternalSemaphoreProperties();
        super.vkGetPhysicalDeviceExternalSemaphoreProperties(physicalDevice, pExternalSemaphoreInfo, o);
        return o;
    }


    public VkDescriptorSetLayoutSupport vkGetDescriptorSetLayoutSupport(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo){
        VkDescriptorSetLayoutSupport o = new VkDescriptorSetLayoutSupport();
        super.vkGetDescriptorSetLayoutSupport(device, pCreateInfo, o);
        return o;
    }


    public void vkDestroySurfaceKHR(VkInstance instance, VkSurfaceKHR surface){
        super.vkDestroySurfaceKHR(instance, surface, pAllocator);
    }


    public VkBool32 vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, VkUInt32 queueFamilyIndex, VkSurfaceKHR surface){
        VkBool32 o = new VkBool32();
        super.vkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, queueFamilyIndex, surface, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfaceSupportKHR");
        return o;
    }


    public VkSurfaceCapabilitiesKHR vkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface){
        VkSurfaceCapabilitiesKHR o = new VkSurfaceCapabilitiesKHR();
        super.vkGetPhysicalDeviceSurfaceCapabilitiesKHR(physicalDevice, surface, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfaceCapabilitiesKHR");
        return o;
    }


    public VkSurfaceFormatKHR.Array vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface){
        super.vkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfaceFormatsKHR");

        VkSurfaceFormatKHR.Array o = new VkSurfaceFormatKHR.Array(resources.count.get().getValue());

        super.vkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfaceFormatsKHR");

        return o;
    }


    public VkPresentModeKHR.Array vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface){
        super.vkGetPhysicalDeviceSurfacePresentModesKHR(physicalDevice, surface, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfacePresentModesKHR");

        VkPresentModeKHR.Array o = new VkPresentModeKHR.Array(resources.count.get().getValue());

        super.vkGetPhysicalDeviceSurfacePresentModesKHR(physicalDevice, surface, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfacePresentModesKHR");

        return o;
    }


    public VkSwapchainKHR vkCreateSwapchainKHR(VkDevice device, VkSwapchainCreateInfoKHR pCreateInfo){
        VkSwapchainKHR o = new VkSwapchainKHR();
        super.vkCreateSwapchainKHR(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateSwapchainKHR");
        return o;
    }


    public void vkDestroySwapchainKHR(VkDevice device, VkSwapchainKHR swapchain){
        super.vkDestroySwapchainKHR(device, swapchain, pAllocator);
    }


    public VkImage.Array vkGetSwapchainImagesKHR(VkDevice device, VkSwapchainKHR swapchain){
        super.vkGetSwapchainImagesKHR(device, swapchain, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetSwapchainImagesKHR");

        VkImage.Array o = new VkImage.Array(resources.count.get().getValue());

        super.vkGetSwapchainImagesKHR(device, swapchain, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetSwapchainImagesKHR");

        return o;
    }


    public void vkAcquireNextImageKHR(VkDevice device, VkSwapchainKHR swapchain, VkUInt64 timeout, VkSemaphore semaphore, VkFence fence, VkUInt32 pImageIndex){
        super.vkAcquireNextImageKHR(device, swapchain, timeout, semaphore, fence, pImageIndex, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkAcquireNextImageKHR");
    }


    public void vkQueuePresentKHR(VkQueue queue, VkPresentInfoKHR pPresentInfo){
        super.vkQueuePresentKHR(queue, pPresentInfo, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkQueuePresentKHR");
    }


    public VkDeviceGroupPresentCapabilitiesKHR vkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device){
        VkDeviceGroupPresentCapabilitiesKHR o = new VkDeviceGroupPresentCapabilitiesKHR();
        super.vkGetDeviceGroupPresentCapabilitiesKHR(device, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetDeviceGroupPresentCapabilitiesKHR");
        return o;
    }


    public VkDeviceGroupPresentModeFlagsKHR vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, VkSurfaceKHR surface){
        VkDeviceGroupPresentModeFlagsKHR o = new VkDeviceGroupPresentModeFlagsKHR();
        super.vkGetDeviceGroupSurfacePresentModesKHR(device, surface, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetDeviceGroupSurfacePresentModesKHR");
        return o;
    }


    public VkRect2D.Array vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface){
        super.vkGetPhysicalDevicePresentRectanglesKHR(physicalDevice, surface, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDevicePresentRectanglesKHR");

        VkRect2D.Array o = new VkRect2D.Array(resources.count.get().getValue());

        super.vkGetPhysicalDevicePresentRectanglesKHR(physicalDevice, surface, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDevicePresentRectanglesKHR");

        return o;
    }


    public void vkAcquireNextImage2KHR(VkDevice device, VkAcquireNextImageInfoKHR pAcquireInfo, VkUInt32 pImageIndex){
        super.vkAcquireNextImage2KHR(device, pAcquireInfo, pImageIndex, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkAcquireNextImage2KHR");
    }


    public VkDisplayPropertiesKHR.Array vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice){
        super.vkGetPhysicalDeviceDisplayPropertiesKHR(physicalDevice, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceDisplayPropertiesKHR");

        VkDisplayPropertiesKHR.Array o = new VkDisplayPropertiesKHR.Array(resources.count.get().getValue());

        super.vkGetPhysicalDeviceDisplayPropertiesKHR(physicalDevice, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceDisplayPropertiesKHR");

        return o;
    }


    public VkDisplayPlanePropertiesKHR.Array vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice){
        super.vkGetPhysicalDeviceDisplayPlanePropertiesKHR(physicalDevice, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceDisplayPlanePropertiesKHR");

        VkDisplayPlanePropertiesKHR.Array o = new VkDisplayPlanePropertiesKHR.Array(resources.count.get().getValue());

        super.vkGetPhysicalDeviceDisplayPlanePropertiesKHR(physicalDevice, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceDisplayPlanePropertiesKHR");

        return o;
    }


    public VkDisplayKHR.Array vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, VkUInt32 planeIndex){
        super.vkGetDisplayPlaneSupportedDisplaysKHR(physicalDevice, planeIndex, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetDisplayPlaneSupportedDisplaysKHR");

        VkDisplayKHR.Array o = new VkDisplayKHR.Array(resources.count.get().getValue());

        super.vkGetDisplayPlaneSupportedDisplaysKHR(physicalDevice, planeIndex, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetDisplayPlaneSupportedDisplaysKHR");

        return o;
    }


    public VkDisplayModePropertiesKHR.Array vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display){
        super.vkGetDisplayModePropertiesKHR(physicalDevice, display, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetDisplayModePropertiesKHR");

        VkDisplayModePropertiesKHR.Array o = new VkDisplayModePropertiesKHR.Array(resources.count.get().getValue());

        super.vkGetDisplayModePropertiesKHR(physicalDevice, display, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetDisplayModePropertiesKHR");

        return o;
    }


    public VkDisplayModeKHR vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkDisplayModeCreateInfoKHR pCreateInfo){
        VkDisplayModeKHR o = new VkDisplayModeKHR();
        super.vkCreateDisplayModeKHR(physicalDevice, display, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDisplayModeKHR");
        return o;
    }


    public VkDisplayPlaneCapabilitiesKHR vkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkDisplayModeKHR mode, VkUInt32 planeIndex){
        VkDisplayPlaneCapabilitiesKHR o = new VkDisplayPlaneCapabilitiesKHR();
        super.vkGetDisplayPlaneCapabilitiesKHR(physicalDevice, mode, planeIndex, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetDisplayPlaneCapabilitiesKHR");
        return o;
    }


    public VkSurfaceKHR vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, VkDisplaySurfaceCreateInfoKHR pCreateInfo){
        VkSurfaceKHR o = new VkSurfaceKHR();
        super.vkCreateDisplayPlaneSurfaceKHR(instance, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDisplayPlaneSurfaceKHR");
        return o;
    }


    public VkSwapchainKHR vkCreateSharedSwapchainsKHR(VkDevice device, VkUInt32 swapchainCount, VkSwapchainCreateInfoKHR pCreateInfos){
        VkSwapchainKHR o = new VkSwapchainKHR();
        super.vkCreateSharedSwapchainsKHR(device, swapchainCount, pCreateInfos, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateSharedSwapchainsKHR");
        return o;
    }


    public VkPhysicalDeviceFeatures2 vkGetPhysicalDeviceFeatures2KHR(VkPhysicalDevice physicalDevice){
        VkPhysicalDeviceFeatures2 o = new VkPhysicalDeviceFeatures2();
        super.vkGetPhysicalDeviceFeatures2KHR(physicalDevice, o);
        return o;
    }


    public VkPhysicalDeviceProperties2 vkGetPhysicalDeviceProperties2KHR(VkPhysicalDevice physicalDevice){
        VkPhysicalDeviceProperties2 o = new VkPhysicalDeviceProperties2();
        super.vkGetPhysicalDeviceProperties2KHR(physicalDevice, o);
        return o;
    }


    public VkFormatProperties2 vkGetPhysicalDeviceFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkFormat format){
        VkFormatProperties2 o = new VkFormatProperties2();
        super.vkGetPhysicalDeviceFormatProperties2KHR(physicalDevice, format, o);
        return o;
    }


    public VkImageFormatProperties2 vkGetPhysicalDeviceImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo){
        VkImageFormatProperties2 o = new VkImageFormatProperties2();
        super.vkGetPhysicalDeviceImageFormatProperties2KHR(physicalDevice, pImageFormatInfo, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceImageFormatProperties2KHR");
        return o;
    }


    public VkQueueFamilyProperties2.Array vkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice){
        super.vkGetPhysicalDeviceQueueFamilyProperties2KHR(physicalDevice, resources.count.get(), null);
        VkQueueFamilyProperties2.Array o = new VkQueueFamilyProperties2.Array(resources.count.get().getValue());
        super.vkGetPhysicalDeviceQueueFamilyProperties2KHR(physicalDevice, resources.count.get(), o);
        return o;
    }


    public VkPhysicalDeviceMemoryProperties2 vkGetPhysicalDeviceMemoryProperties2KHR(VkPhysicalDevice physicalDevice){
        VkPhysicalDeviceMemoryProperties2 o = new VkPhysicalDeviceMemoryProperties2();
        super.vkGetPhysicalDeviceMemoryProperties2KHR(physicalDevice, o);
        return o;
    }


    public VkSparseImageFormatProperties2.Array vkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo){
        super.vkGetPhysicalDeviceSparseImageFormatProperties2KHR(physicalDevice, pFormatInfo, resources.count.get(), null);
        VkSparseImageFormatProperties2.Array o = new VkSparseImageFormatProperties2.Array(resources.count.get().getValue());
        super.vkGetPhysicalDeviceSparseImageFormatProperties2KHR(physicalDevice, pFormatInfo, resources.count.get(), o);
        return o;
    }


    public VkPeerMemoryFeatureFlags vkGetDeviceGroupPeerMemoryFeaturesKHR(VkDevice device, VkUInt32 heapIndex, VkUInt32 localDeviceIndex, VkUInt32 remoteDeviceIndex){
        VkPeerMemoryFeatureFlags o = new VkPeerMemoryFeatureFlags();
        super.vkGetDeviceGroupPeerMemoryFeaturesKHR(device, heapIndex, localDeviceIndex, remoteDeviceIndex, o);
        return o;
    }


    public VkPhysicalDeviceGroupProperties.Array vkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance){
        super.vkEnumeratePhysicalDeviceGroupsKHR(instance, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumeratePhysicalDeviceGroupsKHR");

        VkPhysicalDeviceGroupProperties.Array o = new VkPhysicalDeviceGroupProperties.Array(resources.count.get().getValue());

        super.vkEnumeratePhysicalDeviceGroupsKHR(instance, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumeratePhysicalDeviceGroupsKHR");

        return o;
    }


    public VkExternalBufferProperties vkGetPhysicalDeviceExternalBufferPropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo){
        VkExternalBufferProperties o = new VkExternalBufferProperties();
        super.vkGetPhysicalDeviceExternalBufferPropertiesKHR(physicalDevice, pExternalBufferInfo, o);
        return o;
    }


    public VkInt vkGetMemoryFdKHR(VkDevice device, VkMemoryGetFdInfoKHR pGetFdInfo){
        VkInt o = new VkInt();
        super.vkGetMemoryFdKHR(device, pGetFdInfo, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetMemoryFdKHR");
        return o;
    }


    public VkMemoryFdPropertiesKHR vkGetMemoryFdPropertiesKHR(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, VkInt fd){
        VkMemoryFdPropertiesKHR o = new VkMemoryFdPropertiesKHR();
        super.vkGetMemoryFdPropertiesKHR(device, handleType, fd, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetMemoryFdPropertiesKHR");
        return o;
    }


    public VkExternalSemaphoreProperties vkGetPhysicalDeviceExternalSemaphorePropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo){
        VkExternalSemaphoreProperties o = new VkExternalSemaphoreProperties();
        super.vkGetPhysicalDeviceExternalSemaphorePropertiesKHR(physicalDevice, pExternalSemaphoreInfo, o);
        return o;
    }


    public void vkImportSemaphoreFdKHR(VkDevice device, VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo){
        super.vkImportSemaphoreFdKHR(device, pImportSemaphoreFdInfo, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkImportSemaphoreFdKHR");
    }


    public VkInt vkGetSemaphoreFdKHR(VkDevice device, VkSemaphoreGetFdInfoKHR pGetFdInfo){
        VkInt o = new VkInt();
        super.vkGetSemaphoreFdKHR(device, pGetFdInfo, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetSemaphoreFdKHR");
        return o;
    }


    public VkDescriptorUpdateTemplate vkCreateDescriptorUpdateTemplateKHR(VkDevice device, VkDescriptorUpdateTemplateCreateInfo pCreateInfo){
        VkDescriptorUpdateTemplate o = new VkDescriptorUpdateTemplate();
        super.vkCreateDescriptorUpdateTemplateKHR(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDescriptorUpdateTemplateKHR");
        return o;
    }


    public void vkDestroyDescriptorUpdateTemplateKHR(VkDevice device, VkDescriptorUpdateTemplate descriptorUpdateTemplate){
        super.vkDestroyDescriptorUpdateTemplateKHR(device, descriptorUpdateTemplate, pAllocator);
    }


    public VkResult vkGetSwapchainStatusKHR(VkDevice device, VkSwapchainKHR swapchain){
        VkResult o = new VkResult();
        super.vkGetSwapchainStatusKHR(device, swapchain, o);
        return o;
    }


    public VkExternalFenceProperties vkGetPhysicalDeviceExternalFencePropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo){
        VkExternalFenceProperties o = new VkExternalFenceProperties();
        super.vkGetPhysicalDeviceExternalFencePropertiesKHR(physicalDevice, pExternalFenceInfo, o);
        return o;
    }


    public void vkImportFenceFdKHR(VkDevice device, VkImportFenceFdInfoKHR pImportFenceFdInfo){
        super.vkImportFenceFdKHR(device, pImportFenceFdInfo, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkImportFenceFdKHR");
    }


    public VkInt vkGetFenceFdKHR(VkDevice device, VkFenceGetFdInfoKHR pGetFdInfo){
        VkInt o = new VkInt();
        super.vkGetFenceFdKHR(device, pGetFdInfo, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetFenceFdKHR");
        return o;
    }


    public VkSurfaceCapabilities2KHR vkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo){
        VkSurfaceCapabilities2KHR o = new VkSurfaceCapabilities2KHR();
        super.vkGetPhysicalDeviceSurfaceCapabilities2KHR(physicalDevice, pSurfaceInfo, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfaceCapabilities2KHR");
        return o;
    }


    public VkSurfaceFormat2KHR.Array vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo){
        super.vkGetPhysicalDeviceSurfaceFormats2KHR(physicalDevice, pSurfaceInfo, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfaceFormats2KHR");

        VkSurfaceFormat2KHR.Array o = new VkSurfaceFormat2KHR.Array(resources.count.get().getValue());

        super.vkGetPhysicalDeviceSurfaceFormats2KHR(physicalDevice, pSurfaceInfo, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfaceFormats2KHR");

        return o;
    }


    public VkMemoryRequirements2 vkGetImageMemoryRequirements2KHR(VkDevice device, VkImageMemoryRequirementsInfo2 pInfo){
        VkMemoryRequirements2 o = new VkMemoryRequirements2();
        super.vkGetImageMemoryRequirements2KHR(device, pInfo, o);
        return o;
    }


    public VkMemoryRequirements2 vkGetBufferMemoryRequirements2KHR(VkDevice device, VkBufferMemoryRequirementsInfo2 pInfo){
        VkMemoryRequirements2 o = new VkMemoryRequirements2();
        super.vkGetBufferMemoryRequirements2KHR(device, pInfo, o);
        return o;
    }


    public VkSparseImageMemoryRequirements2.Array vkGetImageSparseMemoryRequirements2KHR(VkDevice device, VkImageSparseMemoryRequirementsInfo2 pInfo){
        super.vkGetImageSparseMemoryRequirements2KHR(device, pInfo, resources.count.get(), null);
        VkSparseImageMemoryRequirements2.Array o = new VkSparseImageMemoryRequirements2.Array(resources.count.get().getValue());
        super.vkGetImageSparseMemoryRequirements2KHR(device, pInfo, resources.count.get(), o);
        return o;
    }


    public VkSamplerYcbcrConversion vkCreateSamplerYcbcrConversionKHR(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo){
        VkSamplerYcbcrConversion o = new VkSamplerYcbcrConversion();
        super.vkCreateSamplerYcbcrConversionKHR(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateSamplerYcbcrConversionKHR");
        return o;
    }


    public void vkDestroySamplerYcbcrConversionKHR(VkDevice device, VkSamplerYcbcrConversion ycbcrConversion){
        super.vkDestroySamplerYcbcrConversionKHR(device, ycbcrConversion, pAllocator);
    }


    public void vkBindBufferMemory2KHR(VkDevice device, VkUInt32 bindInfoCount, VkBindBufferMemoryInfo pBindInfos){
        super.vkBindBufferMemory2KHR(device, bindInfoCount, pBindInfos, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkBindBufferMemory2KHR");
    }


    public void vkBindImageMemory2KHR(VkDevice device, VkUInt32 bindInfoCount, VkBindImageMemoryInfo pBindInfos){
        super.vkBindImageMemory2KHR(device, bindInfoCount, pBindInfos, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkBindImageMemory2KHR");
    }


    public VkDescriptorSetLayoutSupport vkGetDescriptorSetLayoutSupportKHR(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo){
        VkDescriptorSetLayoutSupport o = new VkDescriptorSetLayoutSupport();
        super.vkGetDescriptorSetLayoutSupportKHR(device, pCreateInfo, o);
        return o;
    }


    public VkDebugReportCallbackEXT vkCreateDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackCreateInfoEXT pCreateInfo){
        VkDebugReportCallbackEXT o = new VkDebugReportCallbackEXT();
        super.vkCreateDebugReportCallbackEXT(instance, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDebugReportCallbackEXT");
        return o;
    }


    public void vkDestroyDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackEXT callback){
        super.vkDestroyDebugReportCallbackEXT(instance, callback, pAllocator);
    }


    public void vkDebugMarkerSetObjectTagEXT(VkDevice device, VkDebugMarkerObjectTagInfoEXT pTagInfo){
        super.vkDebugMarkerSetObjectTagEXT(device, pTagInfo, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkDebugMarkerSetObjectTagEXT");
    }


    public void vkDebugMarkerSetObjectNameEXT(VkDevice device, VkDebugMarkerObjectNameInfoEXT pNameInfo){
        super.vkDebugMarkerSetObjectNameEXT(device, pNameInfo, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkDebugMarkerSetObjectNameEXT");
    }


    public void vkGetShaderInfoAMD(VkDevice device, VkPipeline pipeline, VkShaderStageFlagBits shaderStage, VkShaderInfoTypeAMD infoType, VkSize pInfoSize, VkObject pInfo){
        super.vkGetShaderInfoAMD(device, pipeline, shaderStage, infoType, pInfoSize, pInfo, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetShaderInfoAMD");
    }


    public VkExternalImageFormatPropertiesNV vkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags, VkExternalMemoryHandleTypeFlagsNV externalHandleType){
        VkExternalImageFormatPropertiesNV o = new VkExternalImageFormatPropertiesNV();
        super.vkGetPhysicalDeviceExternalImageFormatPropertiesNV(physicalDevice, format, type, tiling, usage, flags, externalHandleType, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceExternalImageFormatPropertiesNV");
        return o;
    }


    public VkIndirectCommandsLayoutNVX vkCreateIndirectCommandsLayoutNVX(VkDevice device, VkIndirectCommandsLayoutCreateInfoNVX pCreateInfo){
        VkIndirectCommandsLayoutNVX o = new VkIndirectCommandsLayoutNVX();
        super.vkCreateIndirectCommandsLayoutNVX(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateIndirectCommandsLayoutNVX");
        return o;
    }


    public void vkDestroyIndirectCommandsLayoutNVX(VkDevice device, VkIndirectCommandsLayoutNVX indirectCommandsLayout){
        super.vkDestroyIndirectCommandsLayoutNVX(device, indirectCommandsLayout, pAllocator);
    }


    public VkObjectTableNVX vkCreateObjectTableNVX(VkDevice device, VkObjectTableCreateInfoNVX pCreateInfo){
        VkObjectTableNVX o = new VkObjectTableNVX();
        super.vkCreateObjectTableNVX(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateObjectTableNVX");
        return o;
    }


    public void vkDestroyObjectTableNVX(VkDevice device, VkObjectTableNVX objectTable){
        super.vkDestroyObjectTableNVX(device, objectTable, pAllocator);
    }


    public void vkRegisterObjectsNVX(VkDevice device, VkObjectTableNVX objectTable, VkUInt32 objectCount, VkObjectTableEntryNVX.Pointer ppObjectTableEntries, VkUInt32 pObjectIndices){
        super.vkRegisterObjectsNVX(device, objectTable, objectCount, ppObjectTableEntries, pObjectIndices, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkRegisterObjectsNVX");
    }


    public void vkUnregisterObjectsNVX(VkDevice device, VkObjectTableNVX objectTable, VkUInt32 objectCount, VkObjectEntryTypeNVX pObjectEntryTypes, VkUInt32 pObjectIndices){
        super.vkUnregisterObjectsNVX(device, objectTable, objectCount, pObjectEntryTypes, pObjectIndices, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkUnregisterObjectsNVX");
    }


    public VkDeviceGeneratedCommandsLimitsNVX vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(VkPhysicalDevice physicalDevice, VkDeviceGeneratedCommandsFeaturesNVX pFeatures){
        VkDeviceGeneratedCommandsLimitsNVX o = new VkDeviceGeneratedCommandsLimitsNVX();
        super.vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(physicalDevice, pFeatures, o);
        return o;
    }


    public void vkReleaseDisplayEXT(VkPhysicalDevice physicalDevice, VkDisplayKHR display){
        super.vkReleaseDisplayEXT(physicalDevice, display, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkReleaseDisplayEXT");
    }


    public VkSurfaceCapabilities2EXT vkGetPhysicalDeviceSurfaceCapabilities2EXT(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface){
        VkSurfaceCapabilities2EXT o = new VkSurfaceCapabilities2EXT();
        super.vkGetPhysicalDeviceSurfaceCapabilities2EXT(physicalDevice, surface, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfaceCapabilities2EXT");
        return o;
    }


    public void vkDisplayPowerControlEXT(VkDevice device, VkDisplayKHR display, VkDisplayPowerInfoEXT pDisplayPowerInfo){
        super.vkDisplayPowerControlEXT(device, display, pDisplayPowerInfo, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkDisplayPowerControlEXT");
    }


    public void vkRegisterDeviceEventEXT(VkDevice device, VkDeviceEventInfoEXT pDeviceEventInfo, VkAllocationCallbacks pAllocator, VkFence pFence){
        super.vkRegisterDeviceEventEXT(device, pDeviceEventInfo, pAllocator, pFence, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkRegisterDeviceEventEXT");
    }


    public void vkRegisterDisplayEventEXT(VkDevice device, VkDisplayKHR display, VkDisplayEventInfoEXT pDisplayEventInfo, VkAllocationCallbacks pAllocator, VkFence pFence){
        super.vkRegisterDisplayEventEXT(device, display, pDisplayEventInfo, pAllocator, pFence, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkRegisterDisplayEventEXT");
    }


    public VkUInt64 vkGetSwapchainCounterEXT(VkDevice device, VkSwapchainKHR swapchain, VkSurfaceCounterFlagBitsEXT counter){
        VkUInt64 o = new VkUInt64();
        super.vkGetSwapchainCounterEXT(device, swapchain, counter, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetSwapchainCounterEXT");
        return o;
    }


    public VkRefreshCycleDurationGOOGLE vkGetRefreshCycleDurationGOOGLE(VkDevice device, VkSwapchainKHR swapchain){
        VkRefreshCycleDurationGOOGLE o = new VkRefreshCycleDurationGOOGLE();
        super.vkGetRefreshCycleDurationGOOGLE(device, swapchain, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetRefreshCycleDurationGOOGLE");
        return o;
    }


    public VkPastPresentationTimingGOOGLE.Array vkGetPastPresentationTimingGOOGLE(VkDevice device, VkSwapchainKHR swapchain){
        super.vkGetPastPresentationTimingGOOGLE(device, swapchain, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPastPresentationTimingGOOGLE");

        VkPastPresentationTimingGOOGLE.Array o = new VkPastPresentationTimingGOOGLE.Array(resources.count.get().getValue());

        super.vkGetPastPresentationTimingGOOGLE(device, swapchain, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPastPresentationTimingGOOGLE");

        return o;
    }


    public void vkSetDebugUtilsObjectNameEXT(VkDevice device, VkDebugUtilsObjectNameInfoEXT pNameInfo){
        super.vkSetDebugUtilsObjectNameEXT(device, pNameInfo, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkSetDebugUtilsObjectNameEXT");
    }


    public void vkSetDebugUtilsObjectTagEXT(VkDevice device, VkDebugUtilsObjectTagInfoEXT pTagInfo){
        super.vkSetDebugUtilsObjectTagEXT(device, pTagInfo, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkSetDebugUtilsObjectTagEXT");
    }


    public VkDebugUtilsMessengerEXT vkCreateDebugUtilsMessengerEXT(VkInstance instance, VkDebugUtilsMessengerCreateInfoEXT pCreateInfo){
        VkDebugUtilsMessengerEXT o = new VkDebugUtilsMessengerEXT();
        super.vkCreateDebugUtilsMessengerEXT(instance, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDebugUtilsMessengerEXT");
        return o;
    }


    public void vkDestroyDebugUtilsMessengerEXT(VkInstance instance, VkDebugUtilsMessengerEXT messenger){
        super.vkDestroyDebugUtilsMessengerEXT(instance, messenger, pAllocator);
    }


    public VkMultisamplePropertiesEXT vkGetPhysicalDeviceMultisamplePropertiesEXT(VkPhysicalDevice physicalDevice, VkSampleCountFlagBits samples){
        VkMultisamplePropertiesEXT o = new VkMultisamplePropertiesEXT();
        super.vkGetPhysicalDeviceMultisamplePropertiesEXT(physicalDevice, samples, o);
        return o;
    }


    public VkValidationCacheEXT vkCreateValidationCacheEXT(VkDevice device, VkValidationCacheCreateInfoEXT pCreateInfo){
        VkValidationCacheEXT o = new VkValidationCacheEXT();
        super.vkCreateValidationCacheEXT(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateValidationCacheEXT");
        return o;
    }


    public void vkDestroyValidationCacheEXT(VkDevice device, VkValidationCacheEXT validationCache){
        super.vkDestroyValidationCacheEXT(device, validationCache, pAllocator);
    }


    public void vkMergeValidationCachesEXT(VkDevice device, VkValidationCacheEXT dstCache, VkUInt32 srcCacheCount, VkValidationCacheEXT pSrcCaches){
        super.vkMergeValidationCachesEXT(device, dstCache, srcCacheCount, pSrcCaches, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkMergeValidationCachesEXT");
    }


    public void vkGetValidationCacheDataEXT(VkDevice device, VkValidationCacheEXT validationCache, VkSize pDataSize, VkObject pData){
        super.vkGetValidationCacheDataEXT(device, validationCache, pDataSize, pData, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetValidationCacheDataEXT");
    }


    public VkMemoryHostPointerPropertiesEXT vkGetMemoryHostPointerPropertiesEXT(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, VkObject pHostPointer){
        VkMemoryHostPointerPropertiesEXT o = new VkMemoryHostPointerPropertiesEXT();
        super.vkGetMemoryHostPointerPropertiesEXT(device, handleType, pHostPointer, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetMemoryHostPointerPropertiesEXT");
        return o;
    }

}
