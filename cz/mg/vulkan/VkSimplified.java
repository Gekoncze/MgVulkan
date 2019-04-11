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


    public VkPhysicalDevice.Array vkEnumeratePhysicalDevices(VkInstance instance){
        super.vkEnumeratePhysicalDevices(instance, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumeratePhysicalDevices");

        VkPhysicalDevice.Array o = new VkPhysicalDevice.Array(resources.count.get().getValue());

        super.vkEnumeratePhysicalDevices(instance, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumeratePhysicalDevices");

        return o;
    }


    public void vkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags, VkImageFormatProperties pImageFormatProperties){
        super.vkGetPhysicalDeviceImageFormatProperties(physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceImageFormatProperties");
    }


    public VkDevice vkCreateDevice(VkPhysicalDevice physicalDevice, VkDeviceCreateInfo pCreateInfo){
        VkDevice o = new VkDevice();
        super.vkCreateDevice(physicalDevice, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDevice");
        return o;
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


    public void vkBindBufferMemory(VkDevice device, VkBuffer buffer, VkDeviceMemory memory, VkDeviceSize memoryOffset){
        super.vkBindBufferMemory(device, buffer, memory, memoryOffset, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkBindBufferMemory");
    }


    public void vkBindImageMemory(VkDevice device, VkImage image, VkDeviceMemory memory, VkDeviceSize memoryOffset){
        super.vkBindImageMemory(device, image, memory, memoryOffset, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkBindImageMemory");
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


    public void vkResetFences(VkDevice device, VkUInt32 fenceCount, VkFence pFences){
        super.vkResetFences(device, fenceCount, pFences, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkResetFences");
    }


    public void vkGetFenceStatus(VkDevice device, VkFence fence){
        super.vkGetFenceStatus(device, fence, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetFenceStatus");
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


    public VkEvent vkCreateEvent(VkDevice device, VkEventCreateInfo pCreateInfo){
        VkEvent o = new VkEvent();
        super.vkCreateEvent(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateEvent");
        return o;
    }


    public void vkGetEventStatus(VkDevice device, VkEvent event){
        super.vkGetEventStatus(device, event, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetEventStatus");
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


    public void vkGetQueryPoolResults(VkDevice device, VkQueryPool queryPool, VkUInt32 firstQuery, VkUInt32 queryCount, VkSize dataSize, VkObject pData, VkDeviceSize stride, VkQueryResultFlags flags){
        super.vkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, dataSize, pData, stride, flags, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetQueryPoolResults");
    }


    public VkBuffer vkCreateBuffer(VkDevice device, VkBufferCreateInfo pCreateInfo){
        VkBuffer o = new VkBuffer();
        super.vkCreateBuffer(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateBuffer");
        return o;
    }


    public VkBufferView vkCreateBufferView(VkDevice device, VkBufferViewCreateInfo pCreateInfo){
        VkBufferView o = new VkBufferView();
        super.vkCreateBufferView(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateBufferView");
        return o;
    }


    public VkImage vkCreateImage(VkDevice device, VkImageCreateInfo pCreateInfo){
        VkImage o = new VkImage();
        super.vkCreateImage(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateImage");
        return o;
    }


    public VkImageView vkCreateImageView(VkDevice device, VkImageViewCreateInfo pCreateInfo){
        VkImageView o = new VkImageView();
        super.vkCreateImageView(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateImageView");
        return o;
    }


    public VkShaderModule vkCreateShaderModule(VkDevice device, VkShaderModuleCreateInfo pCreateInfo){
        VkShaderModule o = new VkShaderModule();
        super.vkCreateShaderModule(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateShaderModule");
        return o;
    }


    public VkPipelineCache vkCreatePipelineCache(VkDevice device, VkPipelineCacheCreateInfo pCreateInfo){
        VkPipelineCache o = new VkPipelineCache();
        super.vkCreatePipelineCache(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreatePipelineCache");
        return o;
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


    public VkPipelineLayout vkCreatePipelineLayout(VkDevice device, VkPipelineLayoutCreateInfo pCreateInfo){
        VkPipelineLayout o = new VkPipelineLayout();
        super.vkCreatePipelineLayout(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreatePipelineLayout");
        return o;
    }


    public VkSampler vkCreateSampler(VkDevice device, VkSamplerCreateInfo pCreateInfo){
        VkSampler o = new VkSampler();
        super.vkCreateSampler(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateSampler");
        return o;
    }


    public VkDescriptorSetLayout vkCreateDescriptorSetLayout(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo){
        VkDescriptorSetLayout o = new VkDescriptorSetLayout();
        super.vkCreateDescriptorSetLayout(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDescriptorSetLayout");
        return o;
    }


    public VkDescriptorPool vkCreateDescriptorPool(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo){
        VkDescriptorPool o = new VkDescriptorPool();
        super.vkCreateDescriptorPool(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDescriptorPool");
        return o;
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


    public VkRenderPass vkCreateRenderPass(VkDevice device, VkRenderPassCreateInfo pCreateInfo){
        VkRenderPass o = new VkRenderPass();
        super.vkCreateRenderPass(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateRenderPass");
        return o;
    }


    public VkCommandPool vkCreateCommandPool(VkDevice device, VkCommandPoolCreateInfo pCreateInfo){
        VkCommandPool o = new VkCommandPool();
        super.vkCreateCommandPool(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateCommandPool");
        return o;
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


    public VkPhysicalDeviceGroupProperties.Array vkEnumeratePhysicalDeviceGroups(VkInstance instance){
        super.vkEnumeratePhysicalDeviceGroups(instance, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumeratePhysicalDeviceGroups");

        VkPhysicalDeviceGroupProperties.Array o = new VkPhysicalDeviceGroupProperties.Array(resources.count.get().getValue());

        super.vkEnumeratePhysicalDeviceGroups(instance, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumeratePhysicalDeviceGroups");

        return o;
    }


    public void vkGetPhysicalDeviceImageFormatProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties){
        super.vkGetPhysicalDeviceImageFormatProperties2(physicalDevice, pImageFormatInfo, pImageFormatProperties, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceImageFormatProperties2");
    }


    public VkSamplerYcbcrConversion vkCreateSamplerYcbcrConversion(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo){
        VkSamplerYcbcrConversion o = new VkSamplerYcbcrConversion();
        super.vkCreateSamplerYcbcrConversion(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateSamplerYcbcrConversion");
        return o;
    }


    public VkDescriptorUpdateTemplate vkCreateDescriptorUpdateTemplate(VkDevice device, VkDescriptorUpdateTemplateCreateInfo pCreateInfo){
        VkDescriptorUpdateTemplate o = new VkDescriptorUpdateTemplate();
        super.vkCreateDescriptorUpdateTemplate(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDescriptorUpdateTemplate");
        return o;
    }


    public void vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, VkUInt32 queueFamilyIndex, VkSurfaceKHR surface, VkBool32 pSupported){
        super.vkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, queueFamilyIndex, surface, pSupported, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfaceSupportKHR");
    }


    public void vkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilitiesKHR pSurfaceCapabilities){
        super.vkGetPhysicalDeviceSurfaceCapabilitiesKHR(physicalDevice, surface, pSurfaceCapabilities, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfaceCapabilitiesKHR");
    }


    public void vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pSurfaceFormatCount, VkSurfaceFormatKHR pSurfaceFormats){
        super.vkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, pSurfaceFormatCount, pSurfaceFormats, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfaceFormatsKHR");
    }


    public void vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pPresentModeCount, VkPresentModeKHR pPresentModes){
        super.vkGetPhysicalDeviceSurfacePresentModesKHR(physicalDevice, surface, pPresentModeCount, pPresentModes, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfacePresentModesKHR");
    }


    public VkSwapchainKHR vkCreateSwapchainKHR(VkDevice device, VkSwapchainCreateInfoKHR pCreateInfo){
        VkSwapchainKHR o = new VkSwapchainKHR();
        super.vkCreateSwapchainKHR(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateSwapchainKHR");
        return o;
    }


    public void vkGetSwapchainImagesKHR(VkDevice device, VkSwapchainKHR swapchain, VkUInt32 pSwapchainImageCount, VkImage pSwapchainImages){
        super.vkGetSwapchainImagesKHR(device, swapchain, pSwapchainImageCount, pSwapchainImages, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetSwapchainImagesKHR");
    }


    public void vkAcquireNextImageKHR(VkDevice device, VkSwapchainKHR swapchain, VkUInt64 timeout, VkSemaphore semaphore, VkFence fence, VkUInt32 pImageIndex){
        super.vkAcquireNextImageKHR(device, swapchain, timeout, semaphore, fence, pImageIndex, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkAcquireNextImageKHR");
    }


    public void vkQueuePresentKHR(VkQueue queue, VkPresentInfoKHR pPresentInfo){
        super.vkQueuePresentKHR(queue, pPresentInfo, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkQueuePresentKHR");
    }


    public void vkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities){
        super.vkGetDeviceGroupPresentCapabilitiesKHR(device, pDeviceGroupPresentCapabilities, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetDeviceGroupPresentCapabilitiesKHR");
    }


    public void vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHR pModes){
        super.vkGetDeviceGroupSurfacePresentModesKHR(device, surface, pModes, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetDeviceGroupSurfacePresentModesKHR");
    }


    public void vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pRectCount, VkRect2D pRects){
        super.vkGetPhysicalDevicePresentRectanglesKHR(physicalDevice, surface, pRectCount, pRects, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDevicePresentRectanglesKHR");
    }


    public void vkAcquireNextImage2KHR(VkDevice device, VkAcquireNextImageInfoKHR pAcquireInfo, VkUInt32 pImageIndex){
        super.vkAcquireNextImage2KHR(device, pAcquireInfo, pImageIndex, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkAcquireNextImage2KHR");
    }


    public void vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkDisplayPropertiesKHR pProperties){
        super.vkGetPhysicalDeviceDisplayPropertiesKHR(physicalDevice, pPropertyCount, pProperties, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceDisplayPropertiesKHR");
    }


    public void vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkDisplayPlanePropertiesKHR pProperties){
        super.vkGetPhysicalDeviceDisplayPlanePropertiesKHR(physicalDevice, pPropertyCount, pProperties, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceDisplayPlanePropertiesKHR");
    }


    public void vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, VkUInt32 planeIndex, VkUInt32 pDisplayCount, VkDisplayKHR pDisplays){
        super.vkGetDisplayPlaneSupportedDisplaysKHR(physicalDevice, planeIndex, pDisplayCount, pDisplays, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetDisplayPlaneSupportedDisplaysKHR");
    }


    public void vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkUInt32 pPropertyCount, VkDisplayModePropertiesKHR pProperties){
        super.vkGetDisplayModePropertiesKHR(physicalDevice, display, pPropertyCount, pProperties, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetDisplayModePropertiesKHR");
    }


    public VkDisplayModeKHR vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkDisplayModeCreateInfoKHR pCreateInfo){
        VkDisplayModeKHR o = new VkDisplayModeKHR();
        super.vkCreateDisplayModeKHR(physicalDevice, display, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDisplayModeKHR");
        return o;
    }


    public void vkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkDisplayModeKHR mode, VkUInt32 planeIndex, VkDisplayPlaneCapabilitiesKHR pCapabilities){
        super.vkGetDisplayPlaneCapabilitiesKHR(physicalDevice, mode, planeIndex, pCapabilities, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetDisplayPlaneCapabilitiesKHR");
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


    public void vkGetPhysicalDeviceImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties){
        super.vkGetPhysicalDeviceImageFormatProperties2KHR(physicalDevice, pImageFormatInfo, pImageFormatProperties, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceImageFormatProperties2KHR");
    }


    public VkPhysicalDeviceGroupProperties.Array vkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance){
        super.vkEnumeratePhysicalDeviceGroupsKHR(instance, resources.count.get(), null, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumeratePhysicalDeviceGroupsKHR");

        VkPhysicalDeviceGroupProperties.Array o = new VkPhysicalDeviceGroupProperties.Array(resources.count.get().getValue());

        super.vkEnumeratePhysicalDeviceGroupsKHR(instance, resources.count.get(), o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkEnumeratePhysicalDeviceGroupsKHR");

        return o;
    }


    public void vkGetMemoryFdKHR(VkDevice device, VkMemoryGetFdInfoKHR pGetFdInfo, VkInt pFd){
        super.vkGetMemoryFdKHR(device, pGetFdInfo, pFd, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetMemoryFdKHR");
    }


    public void vkGetMemoryFdPropertiesKHR(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, VkInt fd, VkMemoryFdPropertiesKHR pMemoryFdProperties){
        super.vkGetMemoryFdPropertiesKHR(device, handleType, fd, pMemoryFdProperties, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetMemoryFdPropertiesKHR");
    }


    public void vkImportSemaphoreFdKHR(VkDevice device, VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo){
        super.vkImportSemaphoreFdKHR(device, pImportSemaphoreFdInfo, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkImportSemaphoreFdKHR");
    }


    public void vkGetSemaphoreFdKHR(VkDevice device, VkSemaphoreGetFdInfoKHR pGetFdInfo, VkInt pFd){
        super.vkGetSemaphoreFdKHR(device, pGetFdInfo, pFd, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetSemaphoreFdKHR");
    }


    public VkDescriptorUpdateTemplate vkCreateDescriptorUpdateTemplateKHR(VkDevice device, VkDescriptorUpdateTemplateCreateInfo pCreateInfo){
        VkDescriptorUpdateTemplate o = new VkDescriptorUpdateTemplate();
        super.vkCreateDescriptorUpdateTemplateKHR(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDescriptorUpdateTemplateKHR");
        return o;
    }


    public void vkGetSwapchainStatusKHR(VkDevice device, VkSwapchainKHR swapchain){
        super.vkGetSwapchainStatusKHR(device, swapchain, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetSwapchainStatusKHR");
    }


    public void vkImportFenceFdKHR(VkDevice device, VkImportFenceFdInfoKHR pImportFenceFdInfo){
        super.vkImportFenceFdKHR(device, pImportFenceFdInfo, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkImportFenceFdKHR");
    }


    public void vkGetFenceFdKHR(VkDevice device, VkFenceGetFdInfoKHR pGetFdInfo, VkInt pFd){
        super.vkGetFenceFdKHR(device, pGetFdInfo, pFd, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetFenceFdKHR");
    }


    public void vkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VkSurfaceCapabilities2KHR pSurfaceCapabilities){
        super.vkGetPhysicalDeviceSurfaceCapabilities2KHR(physicalDevice, pSurfaceInfo, pSurfaceCapabilities, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfaceCapabilities2KHR");
    }


    public void vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VkUInt32 pSurfaceFormatCount, VkSurfaceFormat2KHR pSurfaceFormats){
        super.vkGetPhysicalDeviceSurfaceFormats2KHR(physicalDevice, pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfaceFormats2KHR");
    }


    public VkSamplerYcbcrConversion vkCreateSamplerYcbcrConversionKHR(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo){
        VkSamplerYcbcrConversion o = new VkSamplerYcbcrConversion();
        super.vkCreateSamplerYcbcrConversionKHR(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateSamplerYcbcrConversionKHR");
        return o;
    }


    public void vkBindBufferMemory2KHR(VkDevice device, VkUInt32 bindInfoCount, VkBindBufferMemoryInfo pBindInfos){
        super.vkBindBufferMemory2KHR(device, bindInfoCount, pBindInfos, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkBindBufferMemory2KHR");
    }


    public void vkBindImageMemory2KHR(VkDevice device, VkUInt32 bindInfoCount, VkBindImageMemoryInfo pBindInfos){
        super.vkBindImageMemory2KHR(device, bindInfoCount, pBindInfos, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkBindImageMemory2KHR");
    }


    public VkDebugReportCallbackEXT vkCreateDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackCreateInfoEXT pCreateInfo){
        VkDebugReportCallbackEXT o = new VkDebugReportCallbackEXT();
        super.vkCreateDebugReportCallbackEXT(instance, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateDebugReportCallbackEXT");
        return o;
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


    public void vkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags, VkExternalMemoryHandleTypeFlagsNV externalHandleType, VkExternalImageFormatPropertiesNV pExternalImageFormatProperties){
        super.vkGetPhysicalDeviceExternalImageFormatPropertiesNV(physicalDevice, format, type, tiling, usage, flags, externalHandleType, pExternalImageFormatProperties, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceExternalImageFormatPropertiesNV");
    }


    public VkIndirectCommandsLayoutNVX vkCreateIndirectCommandsLayoutNVX(VkDevice device, VkIndirectCommandsLayoutCreateInfoNVX pCreateInfo){
        VkIndirectCommandsLayoutNVX o = new VkIndirectCommandsLayoutNVX();
        super.vkCreateIndirectCommandsLayoutNVX(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateIndirectCommandsLayoutNVX");
        return o;
    }


    public VkObjectTableNVX vkCreateObjectTableNVX(VkDevice device, VkObjectTableCreateInfoNVX pCreateInfo){
        VkObjectTableNVX o = new VkObjectTableNVX();
        super.vkCreateObjectTableNVX(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateObjectTableNVX");
        return o;
    }


    public void vkRegisterObjectsNVX(VkDevice device, VkObjectTableNVX objectTable, VkUInt32 objectCount, VkObjectTableEntryNVX.Pointer ppObjectTableEntries, VkUInt32 pObjectIndices){
        super.vkRegisterObjectsNVX(device, objectTable, objectCount, ppObjectTableEntries, pObjectIndices, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkRegisterObjectsNVX");
    }


    public void vkUnregisterObjectsNVX(VkDevice device, VkObjectTableNVX objectTable, VkUInt32 objectCount, VkObjectEntryTypeNVX pObjectEntryTypes, VkUInt32 pObjectIndices){
        super.vkUnregisterObjectsNVX(device, objectTable, objectCount, pObjectEntryTypes, pObjectIndices, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkUnregisterObjectsNVX");
    }


    public void vkReleaseDisplayEXT(VkPhysicalDevice physicalDevice, VkDisplayKHR display){
        super.vkReleaseDisplayEXT(physicalDevice, display, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkReleaseDisplayEXT");
    }


    public void vkGetPhysicalDeviceSurfaceCapabilities2EXT(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilities2EXT pSurfaceCapabilities){
        super.vkGetPhysicalDeviceSurfaceCapabilities2EXT(physicalDevice, surface, pSurfaceCapabilities, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPhysicalDeviceSurfaceCapabilities2EXT");
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


    public void vkGetSwapchainCounterEXT(VkDevice device, VkSwapchainKHR swapchain, VkSurfaceCounterFlagBitsEXT counter, VkUInt64 pCounterValue){
        super.vkGetSwapchainCounterEXT(device, swapchain, counter, pCounterValue, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetSwapchainCounterEXT");
    }


    public void vkGetRefreshCycleDurationGOOGLE(VkDevice device, VkSwapchainKHR swapchain, VkRefreshCycleDurationGOOGLE pDisplayTimingProperties){
        super.vkGetRefreshCycleDurationGOOGLE(device, swapchain, pDisplayTimingProperties, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetRefreshCycleDurationGOOGLE");
    }


    public void vkGetPastPresentationTimingGOOGLE(VkDevice device, VkSwapchainKHR swapchain, VkUInt32 pPresentationTimingCount, VkPastPresentationTimingGOOGLE pPresentationTimings){
        super.vkGetPastPresentationTimingGOOGLE(device, swapchain, pPresentationTimingCount, pPresentationTimings, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetPastPresentationTimingGOOGLE");
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


    public VkValidationCacheEXT vkCreateValidationCacheEXT(VkDevice device, VkValidationCacheCreateInfoEXT pCreateInfo){
        VkValidationCacheEXT o = new VkValidationCacheEXT();
        super.vkCreateValidationCacheEXT(device, pCreateInfo, pAllocator, o, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkCreateValidationCacheEXT");
        return o;
    }


    public void vkMergeValidationCachesEXT(VkDevice device, VkValidationCacheEXT dstCache, VkUInt32 srcCacheCount, VkValidationCacheEXT pSrcCaches){
        super.vkMergeValidationCachesEXT(device, dstCache, srcCacheCount, pSrcCaches, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkMergeValidationCachesEXT");
    }


    public void vkGetValidationCacheDataEXT(VkDevice device, VkValidationCacheEXT validationCache, VkSize pDataSize, VkObject pData){
        super.vkGetValidationCacheDataEXT(device, validationCache, pDataSize, pData, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetValidationCacheDataEXT");
    }


    public void vkGetMemoryHostPointerPropertiesEXT(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, VkObject pHostPointer, VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties){
        super.vkGetMemoryHostPointerPropertiesEXT(device, handleType, pHostPointer, pMemoryHostPointerProperties, resources.result.get());
        if(resources.result.get().getValue() != VK_SUCCESS) throw new VkException(resources.result.get(), "vkGetMemoryHostPointerPropertiesEXT");
    }

}
