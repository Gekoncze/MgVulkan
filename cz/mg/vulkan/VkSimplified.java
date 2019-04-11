package cz.mg.vulkan;

public class VkSimplified extends Vk {
    private final ThreadLocal<VkResult> result = ThreadLocal.withInitial(new java.util.function.Supplier<VkResult>() {
        @Override
        public VkResult get() {
            return new VkResult();
        }
    });

    private final ThreadLocal<VkUInt32> count = ThreadLocal.withInitial(new java.util.function.Supplier<VkUInt32>() {
        @Override
        public VkUInt32 get() {
            return new VkUInt32();
        }
    });

    private VkAllocationCallbacks pAllocator = null;

    public VkAllocationCallbacks getAllocator() {
        return pAllocator;
    }

    public void setAllocator(VkAllocationCallbacks pAllocator) {
        this.pAllocator = pAllocator;
    }

    public VkInstance vkCreateInstance(VkInstanceCreateInfo pCreateInfo){
        VkInstance o = new VkInstance();
        super.vkCreateInstance(pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateInstance");
        return o;
    }


    public VkPhysicalDevice.Array vkEnumeratePhysicalDevices(VkInstance instance){
        super.vkEnumeratePhysicalDevices(instance, count.get(), null, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEnumeratePhysicalDevices");

        VkPhysicalDevice.Array o = new VkPhysicalDevice.Array(count.get().getValue());

        super.vkEnumeratePhysicalDevices(instance, count.get(), o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEnumeratePhysicalDevices");

        return o;
    }


    public void vkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags, VkImageFormatProperties pImageFormatProperties){
        super.vkGetPhysicalDeviceImageFormatProperties(physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPhysicalDeviceImageFormatProperties");
    }


    public VkDevice vkCreateDevice(VkPhysicalDevice physicalDevice, VkDeviceCreateInfo pCreateInfo){
        VkDevice o = new VkDevice();
        super.vkCreateDevice(physicalDevice, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateDevice");
        return o;
    }


    public VkExtensionProperties.Array vkEnumerateInstanceExtensionProperties(VkChar pLayerName){
        super.vkEnumerateInstanceExtensionProperties(pLayerName, count.get(), null, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEnumerateInstanceExtensionProperties");

        VkExtensionProperties.Array o = new VkExtensionProperties.Array(count.get().getValue());

        super.vkEnumerateInstanceExtensionProperties(pLayerName, count.get(), o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEnumerateInstanceExtensionProperties");

        return o;
    }


    public VkExtensionProperties.Array vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, VkChar pLayerName){
        super.vkEnumerateDeviceExtensionProperties(physicalDevice, pLayerName, count.get(), null, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEnumerateDeviceExtensionProperties");

        VkExtensionProperties.Array o = new VkExtensionProperties.Array(count.get().getValue());

        super.vkEnumerateDeviceExtensionProperties(physicalDevice, pLayerName, count.get(), o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEnumerateDeviceExtensionProperties");

        return o;
    }


    public VkLayerProperties.Array vkEnumerateInstanceLayerProperties(){
        super.vkEnumerateInstanceLayerProperties(count.get(), null, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEnumerateInstanceLayerProperties");

        VkLayerProperties.Array o = new VkLayerProperties.Array(count.get().getValue());

        super.vkEnumerateInstanceLayerProperties(count.get(), o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEnumerateInstanceLayerProperties");

        return o;
    }


    public VkLayerProperties.Array vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice){
        super.vkEnumerateDeviceLayerProperties(physicalDevice, count.get(), null, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEnumerateDeviceLayerProperties");

        VkLayerProperties.Array o = new VkLayerProperties.Array(count.get().getValue());

        super.vkEnumerateDeviceLayerProperties(physicalDevice, count.get(), o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEnumerateDeviceLayerProperties");

        return o;
    }


    public void vkQueueSubmit(VkQueue queue, VkUInt32 submitCount, VkSubmitInfo pSubmits, VkFence fence){
        super.vkQueueSubmit(queue, submitCount, pSubmits, fence, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkQueueSubmit");
    }


    public void vkQueueWaitIdle(VkQueue queue){
        super.vkQueueWaitIdle(queue, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkQueueWaitIdle");
    }


    public void vkDeviceWaitIdle(VkDevice device){
        super.vkDeviceWaitIdle(device, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkDeviceWaitIdle");
    }


    public void vkAllocateMemory(VkDevice device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, VkDeviceMemory pMemory){
        super.vkAllocateMemory(device, pAllocateInfo, pAllocator, pMemory, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkAllocateMemory");
    }


    public void vkMapMemory(VkDevice device, VkDeviceMemory memory, VkDeviceSize offset, VkDeviceSize size, VkMemoryMapFlags flags, VkObject.Pointer ppData){
        super.vkMapMemory(device, memory, offset, size, flags, ppData, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkMapMemory");
    }


    public void vkFlushMappedMemoryRanges(VkDevice device, VkUInt32 memoryRangeCount, VkMappedMemoryRange pMemoryRanges){
        super.vkFlushMappedMemoryRanges(device, memoryRangeCount, pMemoryRanges, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkFlushMappedMemoryRanges");
    }


    public void vkInvalidateMappedMemoryRanges(VkDevice device, VkUInt32 memoryRangeCount, VkMappedMemoryRange pMemoryRanges){
        super.vkInvalidateMappedMemoryRanges(device, memoryRangeCount, pMemoryRanges, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkInvalidateMappedMemoryRanges");
    }


    public void vkBindBufferMemory(VkDevice device, VkBuffer buffer, VkDeviceMemory memory, VkDeviceSize memoryOffset){
        super.vkBindBufferMemory(device, buffer, memory, memoryOffset, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkBindBufferMemory");
    }


    public void vkBindImageMemory(VkDevice device, VkImage image, VkDeviceMemory memory, VkDeviceSize memoryOffset){
        super.vkBindImageMemory(device, image, memory, memoryOffset, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkBindImageMemory");
    }


    public void vkQueueBindSparse(VkQueue queue, VkUInt32 bindInfoCount, VkBindSparseInfo pBindInfo, VkFence fence){
        super.vkQueueBindSparse(queue, bindInfoCount, pBindInfo, fence, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkQueueBindSparse");
    }


    public VkFence vkCreateFence(VkDevice device, VkFenceCreateInfo pCreateInfo){
        VkFence o = new VkFence();
        super.vkCreateFence(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateFence");
        return o;
    }


    public void vkResetFences(VkDevice device, VkUInt32 fenceCount, VkFence pFences){
        super.vkResetFences(device, fenceCount, pFences, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkResetFences");
    }


    public void vkGetFenceStatus(VkDevice device, VkFence fence){
        super.vkGetFenceStatus(device, fence, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetFenceStatus");
    }


    public void vkWaitForFences(VkDevice device, VkUInt32 fenceCount, VkFence pFences, VkBool32 waitAll, VkUInt64 timeout){
        super.vkWaitForFences(device, fenceCount, pFences, waitAll, timeout, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkWaitForFences");
    }


    public VkSemaphore vkCreateSemaphore(VkDevice device, VkSemaphoreCreateInfo pCreateInfo){
        VkSemaphore o = new VkSemaphore();
        super.vkCreateSemaphore(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateSemaphore");
        return o;
    }


    public VkEvent vkCreateEvent(VkDevice device, VkEventCreateInfo pCreateInfo){
        VkEvent o = new VkEvent();
        super.vkCreateEvent(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateEvent");
        return o;
    }


    public void vkGetEventStatus(VkDevice device, VkEvent event){
        super.vkGetEventStatus(device, event, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetEventStatus");
    }


    public void vkSetEvent(VkDevice device, VkEvent event){
        super.vkSetEvent(device, event, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkSetEvent");
    }


    public void vkResetEvent(VkDevice device, VkEvent event){
        super.vkResetEvent(device, event, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkResetEvent");
    }


    public VkQueryPool vkCreateQueryPool(VkDevice device, VkQueryPoolCreateInfo pCreateInfo){
        VkQueryPool o = new VkQueryPool();
        super.vkCreateQueryPool(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateQueryPool");
        return o;
    }


    public void vkGetQueryPoolResults(VkDevice device, VkQueryPool queryPool, VkUInt32 firstQuery, VkUInt32 queryCount, VkSize dataSize, VkObject pData, VkDeviceSize stride, VkQueryResultFlags flags){
        super.vkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, dataSize, pData, stride, flags, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetQueryPoolResults");
    }


    public VkBuffer vkCreateBuffer(VkDevice device, VkBufferCreateInfo pCreateInfo){
        VkBuffer o = new VkBuffer();
        super.vkCreateBuffer(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateBuffer");
        return o;
    }


    public VkBufferView vkCreateBufferView(VkDevice device, VkBufferViewCreateInfo pCreateInfo){
        VkBufferView o = new VkBufferView();
        super.vkCreateBufferView(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateBufferView");
        return o;
    }


    public VkImage vkCreateImage(VkDevice device, VkImageCreateInfo pCreateInfo){
        VkImage o = new VkImage();
        super.vkCreateImage(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateImage");
        return o;
    }


    public VkImageView vkCreateImageView(VkDevice device, VkImageViewCreateInfo pCreateInfo){
        VkImageView o = new VkImageView();
        super.vkCreateImageView(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateImageView");
        return o;
    }


    public VkShaderModule vkCreateShaderModule(VkDevice device, VkShaderModuleCreateInfo pCreateInfo){
        VkShaderModule o = new VkShaderModule();
        super.vkCreateShaderModule(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateShaderModule");
        return o;
    }


    public VkPipelineCache vkCreatePipelineCache(VkDevice device, VkPipelineCacheCreateInfo pCreateInfo){
        VkPipelineCache o = new VkPipelineCache();
        super.vkCreatePipelineCache(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreatePipelineCache");
        return o;
    }


    public void vkGetPipelineCacheData(VkDevice device, VkPipelineCache pipelineCache, VkSize pDataSize, VkObject pData){
        super.vkGetPipelineCacheData(device, pipelineCache, pDataSize, pData, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPipelineCacheData");
    }


    public void vkMergePipelineCaches(VkDevice device, VkPipelineCache dstCache, VkUInt32 srcCacheCount, VkPipelineCache pSrcCaches){
        super.vkMergePipelineCaches(device, dstCache, srcCacheCount, pSrcCaches, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkMergePipelineCaches");
    }


    public VkPipeline vkCreateGraphicsPipelines(VkDevice device, VkPipelineCache pipelineCache, VkUInt32 createInfoCount, VkGraphicsPipelineCreateInfo pCreateInfos){
        VkPipeline o = new VkPipeline();
        super.vkCreateGraphicsPipelines(device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateGraphicsPipelines");
        return o;
    }


    public VkPipeline vkCreateComputePipelines(VkDevice device, VkPipelineCache pipelineCache, VkUInt32 createInfoCount, VkComputePipelineCreateInfo pCreateInfos){
        VkPipeline o = new VkPipeline();
        super.vkCreateComputePipelines(device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateComputePipelines");
        return o;
    }


    public VkPipelineLayout vkCreatePipelineLayout(VkDevice device, VkPipelineLayoutCreateInfo pCreateInfo){
        VkPipelineLayout o = new VkPipelineLayout();
        super.vkCreatePipelineLayout(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreatePipelineLayout");
        return o;
    }


    public VkSampler vkCreateSampler(VkDevice device, VkSamplerCreateInfo pCreateInfo){
        VkSampler o = new VkSampler();
        super.vkCreateSampler(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateSampler");
        return o;
    }


    public VkDescriptorSetLayout vkCreateDescriptorSetLayout(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo){
        VkDescriptorSetLayout o = new VkDescriptorSetLayout();
        super.vkCreateDescriptorSetLayout(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateDescriptorSetLayout");
        return o;
    }


    public VkDescriptorPool vkCreateDescriptorPool(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo){
        VkDescriptorPool o = new VkDescriptorPool();
        super.vkCreateDescriptorPool(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateDescriptorPool");
        return o;
    }


    public void vkResetDescriptorPool(VkDevice device, VkDescriptorPool descriptorPool, VkDescriptorPoolResetFlags flags){
        super.vkResetDescriptorPool(device, descriptorPool, flags, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkResetDescriptorPool");
    }


    public void vkAllocateDescriptorSets(VkDevice device, VkDescriptorSetAllocateInfo pAllocateInfo, VkDescriptorSet pDescriptorSets){
        super.vkAllocateDescriptorSets(device, pAllocateInfo, pDescriptorSets, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkAllocateDescriptorSets");
    }


    public void vkFreeDescriptorSets(VkDevice device, VkDescriptorPool descriptorPool, VkUInt32 descriptorSetCount, VkDescriptorSet pDescriptorSets){
        super.vkFreeDescriptorSets(device, descriptorPool, descriptorSetCount, pDescriptorSets, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkFreeDescriptorSets");
    }


    public VkFramebuffer vkCreateFramebuffer(VkDevice device, VkFramebufferCreateInfo pCreateInfo){
        VkFramebuffer o = new VkFramebuffer();
        super.vkCreateFramebuffer(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateFramebuffer");
        return o;
    }


    public VkRenderPass vkCreateRenderPass(VkDevice device, VkRenderPassCreateInfo pCreateInfo){
        VkRenderPass o = new VkRenderPass();
        super.vkCreateRenderPass(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateRenderPass");
        return o;
    }


    public VkCommandPool vkCreateCommandPool(VkDevice device, VkCommandPoolCreateInfo pCreateInfo){
        VkCommandPool o = new VkCommandPool();
        super.vkCreateCommandPool(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateCommandPool");
        return o;
    }


    public void vkResetCommandPool(VkDevice device, VkCommandPool commandPool, VkCommandPoolResetFlags flags){
        super.vkResetCommandPool(device, commandPool, flags, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkResetCommandPool");
    }


    public void vkAllocateCommandBuffers(VkDevice device, VkCommandBufferAllocateInfo pAllocateInfo, VkCommandBuffer pCommandBuffers){
        super.vkAllocateCommandBuffers(device, pAllocateInfo, pCommandBuffers, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkAllocateCommandBuffers");
    }


    public void vkBeginCommandBuffer(VkCommandBuffer commandBuffer, VkCommandBufferBeginInfo pBeginInfo){
        super.vkBeginCommandBuffer(commandBuffer, pBeginInfo, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkBeginCommandBuffer");
    }


    public void vkEndCommandBuffer(VkCommandBuffer commandBuffer){
        super.vkEndCommandBuffer(commandBuffer, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEndCommandBuffer");
    }


    public void vkResetCommandBuffer(VkCommandBuffer commandBuffer, VkCommandBufferResetFlags flags){
        super.vkResetCommandBuffer(commandBuffer, flags, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkResetCommandBuffer");
    }


    public void vkEnumerateInstanceVersion(VkUInt32 pApiVersion){
        super.vkEnumerateInstanceVersion(pApiVersion, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEnumerateInstanceVersion");
    }


    public void vkBindBufferMemory2(VkDevice device, VkUInt32 bindInfoCount, VkBindBufferMemoryInfo pBindInfos){
        super.vkBindBufferMemory2(device, bindInfoCount, pBindInfos, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkBindBufferMemory2");
    }


    public void vkBindImageMemory2(VkDevice device, VkUInt32 bindInfoCount, VkBindImageMemoryInfo pBindInfos){
        super.vkBindImageMemory2(device, bindInfoCount, pBindInfos, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkBindImageMemory2");
    }


    public VkPhysicalDeviceGroupProperties.Array vkEnumeratePhysicalDeviceGroups(VkInstance instance){
        super.vkEnumeratePhysicalDeviceGroups(instance, count.get(), null, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEnumeratePhysicalDeviceGroups");

        VkPhysicalDeviceGroupProperties.Array o = new VkPhysicalDeviceGroupProperties.Array(count.get().getValue());

        super.vkEnumeratePhysicalDeviceGroups(instance, count.get(), o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEnumeratePhysicalDeviceGroups");

        return o;
    }


    public void vkGetPhysicalDeviceImageFormatProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties){
        super.vkGetPhysicalDeviceImageFormatProperties2(physicalDevice, pImageFormatInfo, pImageFormatProperties, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPhysicalDeviceImageFormatProperties2");
    }


    public VkSamplerYcbcrConversion vkCreateSamplerYcbcrConversion(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo){
        VkSamplerYcbcrConversion o = new VkSamplerYcbcrConversion();
        super.vkCreateSamplerYcbcrConversion(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateSamplerYcbcrConversion");
        return o;
    }


    public VkDescriptorUpdateTemplate vkCreateDescriptorUpdateTemplate(VkDevice device, VkDescriptorUpdateTemplateCreateInfo pCreateInfo){
        VkDescriptorUpdateTemplate o = new VkDescriptorUpdateTemplate();
        super.vkCreateDescriptorUpdateTemplate(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateDescriptorUpdateTemplate");
        return o;
    }


    public void vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, VkUInt32 queueFamilyIndex, VkSurfaceKHR surface, VkBool32 pSupported){
        super.vkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, queueFamilyIndex, surface, pSupported, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPhysicalDeviceSurfaceSupportKHR");
    }


    public void vkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilitiesKHR pSurfaceCapabilities){
        super.vkGetPhysicalDeviceSurfaceCapabilitiesKHR(physicalDevice, surface, pSurfaceCapabilities, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPhysicalDeviceSurfaceCapabilitiesKHR");
    }


    public void vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pSurfaceFormatCount, VkSurfaceFormatKHR pSurfaceFormats){
        super.vkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, pSurfaceFormatCount, pSurfaceFormats, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPhysicalDeviceSurfaceFormatsKHR");
    }


    public void vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pPresentModeCount, VkPresentModeKHR pPresentModes){
        super.vkGetPhysicalDeviceSurfacePresentModesKHR(physicalDevice, surface, pPresentModeCount, pPresentModes, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPhysicalDeviceSurfacePresentModesKHR");
    }


    public VkSwapchainKHR vkCreateSwapchainKHR(VkDevice device, VkSwapchainCreateInfoKHR pCreateInfo){
        VkSwapchainKHR o = new VkSwapchainKHR();
        super.vkCreateSwapchainKHR(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateSwapchainKHR");
        return o;
    }


    public void vkGetSwapchainImagesKHR(VkDevice device, VkSwapchainKHR swapchain, VkUInt32 pSwapchainImageCount, VkImage pSwapchainImages){
        super.vkGetSwapchainImagesKHR(device, swapchain, pSwapchainImageCount, pSwapchainImages, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetSwapchainImagesKHR");
    }


    public void vkAcquireNextImageKHR(VkDevice device, VkSwapchainKHR swapchain, VkUInt64 timeout, VkSemaphore semaphore, VkFence fence, VkUInt32 pImageIndex){
        super.vkAcquireNextImageKHR(device, swapchain, timeout, semaphore, fence, pImageIndex, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkAcquireNextImageKHR");
    }


    public void vkQueuePresentKHR(VkQueue queue, VkPresentInfoKHR pPresentInfo){
        super.vkQueuePresentKHR(queue, pPresentInfo, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkQueuePresentKHR");
    }


    public void vkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities){
        super.vkGetDeviceGroupPresentCapabilitiesKHR(device, pDeviceGroupPresentCapabilities, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetDeviceGroupPresentCapabilitiesKHR");
    }


    public void vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHR pModes){
        super.vkGetDeviceGroupSurfacePresentModesKHR(device, surface, pModes, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetDeviceGroupSurfacePresentModesKHR");
    }


    public void vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pRectCount, VkRect2D pRects){
        super.vkGetPhysicalDevicePresentRectanglesKHR(physicalDevice, surface, pRectCount, pRects, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPhysicalDevicePresentRectanglesKHR");
    }


    public void vkAcquireNextImage2KHR(VkDevice device, VkAcquireNextImageInfoKHR pAcquireInfo, VkUInt32 pImageIndex){
        super.vkAcquireNextImage2KHR(device, pAcquireInfo, pImageIndex, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkAcquireNextImage2KHR");
    }


    public void vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkDisplayPropertiesKHR pProperties){
        super.vkGetPhysicalDeviceDisplayPropertiesKHR(physicalDevice, pPropertyCount, pProperties, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPhysicalDeviceDisplayPropertiesKHR");
    }


    public void vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkDisplayPlanePropertiesKHR pProperties){
        super.vkGetPhysicalDeviceDisplayPlanePropertiesKHR(physicalDevice, pPropertyCount, pProperties, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPhysicalDeviceDisplayPlanePropertiesKHR");
    }


    public void vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, VkUInt32 planeIndex, VkUInt32 pDisplayCount, VkDisplayKHR pDisplays){
        super.vkGetDisplayPlaneSupportedDisplaysKHR(physicalDevice, planeIndex, pDisplayCount, pDisplays, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetDisplayPlaneSupportedDisplaysKHR");
    }


    public void vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkUInt32 pPropertyCount, VkDisplayModePropertiesKHR pProperties){
        super.vkGetDisplayModePropertiesKHR(physicalDevice, display, pPropertyCount, pProperties, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetDisplayModePropertiesKHR");
    }


    public VkDisplayModeKHR vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkDisplayModeCreateInfoKHR pCreateInfo){
        VkDisplayModeKHR o = new VkDisplayModeKHR();
        super.vkCreateDisplayModeKHR(physicalDevice, display, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateDisplayModeKHR");
        return o;
    }


    public void vkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkDisplayModeKHR mode, VkUInt32 planeIndex, VkDisplayPlaneCapabilitiesKHR pCapabilities){
        super.vkGetDisplayPlaneCapabilitiesKHR(physicalDevice, mode, planeIndex, pCapabilities, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetDisplayPlaneCapabilitiesKHR");
    }


    public VkSurfaceKHR vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, VkDisplaySurfaceCreateInfoKHR pCreateInfo){
        VkSurfaceKHR o = new VkSurfaceKHR();
        super.vkCreateDisplayPlaneSurfaceKHR(instance, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateDisplayPlaneSurfaceKHR");
        return o;
    }


    public VkSwapchainKHR vkCreateSharedSwapchainsKHR(VkDevice device, VkUInt32 swapchainCount, VkSwapchainCreateInfoKHR pCreateInfos){
        VkSwapchainKHR o = new VkSwapchainKHR();
        super.vkCreateSharedSwapchainsKHR(device, swapchainCount, pCreateInfos, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateSharedSwapchainsKHR");
        return o;
    }


    public void vkGetPhysicalDeviceImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties){
        super.vkGetPhysicalDeviceImageFormatProperties2KHR(physicalDevice, pImageFormatInfo, pImageFormatProperties, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPhysicalDeviceImageFormatProperties2KHR");
    }


    public VkPhysicalDeviceGroupProperties.Array vkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance){
        super.vkEnumeratePhysicalDeviceGroupsKHR(instance, count.get(), null, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEnumeratePhysicalDeviceGroupsKHR");

        VkPhysicalDeviceGroupProperties.Array o = new VkPhysicalDeviceGroupProperties.Array(count.get().getValue());

        super.vkEnumeratePhysicalDeviceGroupsKHR(instance, count.get(), o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkEnumeratePhysicalDeviceGroupsKHR");

        return o;
    }


    public void vkGetMemoryFdKHR(VkDevice device, VkMemoryGetFdInfoKHR pGetFdInfo, VkInt pFd){
        super.vkGetMemoryFdKHR(device, pGetFdInfo, pFd, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetMemoryFdKHR");
    }


    public void vkGetMemoryFdPropertiesKHR(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, VkInt fd, VkMemoryFdPropertiesKHR pMemoryFdProperties){
        super.vkGetMemoryFdPropertiesKHR(device, handleType, fd, pMemoryFdProperties, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetMemoryFdPropertiesKHR");
    }


    public void vkImportSemaphoreFdKHR(VkDevice device, VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo){
        super.vkImportSemaphoreFdKHR(device, pImportSemaphoreFdInfo, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkImportSemaphoreFdKHR");
    }


    public void vkGetSemaphoreFdKHR(VkDevice device, VkSemaphoreGetFdInfoKHR pGetFdInfo, VkInt pFd){
        super.vkGetSemaphoreFdKHR(device, pGetFdInfo, pFd, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetSemaphoreFdKHR");
    }


    public VkDescriptorUpdateTemplate vkCreateDescriptorUpdateTemplateKHR(VkDevice device, VkDescriptorUpdateTemplateCreateInfo pCreateInfo){
        VkDescriptorUpdateTemplate o = new VkDescriptorUpdateTemplate();
        super.vkCreateDescriptorUpdateTemplateKHR(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateDescriptorUpdateTemplateKHR");
        return o;
    }


    public void vkGetSwapchainStatusKHR(VkDevice device, VkSwapchainKHR swapchain){
        super.vkGetSwapchainStatusKHR(device, swapchain, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetSwapchainStatusKHR");
    }


    public void vkImportFenceFdKHR(VkDevice device, VkImportFenceFdInfoKHR pImportFenceFdInfo){
        super.vkImportFenceFdKHR(device, pImportFenceFdInfo, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkImportFenceFdKHR");
    }


    public void vkGetFenceFdKHR(VkDevice device, VkFenceGetFdInfoKHR pGetFdInfo, VkInt pFd){
        super.vkGetFenceFdKHR(device, pGetFdInfo, pFd, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetFenceFdKHR");
    }


    public void vkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VkSurfaceCapabilities2KHR pSurfaceCapabilities){
        super.vkGetPhysicalDeviceSurfaceCapabilities2KHR(physicalDevice, pSurfaceInfo, pSurfaceCapabilities, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPhysicalDeviceSurfaceCapabilities2KHR");
    }


    public void vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VkUInt32 pSurfaceFormatCount, VkSurfaceFormat2KHR pSurfaceFormats){
        super.vkGetPhysicalDeviceSurfaceFormats2KHR(physicalDevice, pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPhysicalDeviceSurfaceFormats2KHR");
    }


    public VkSamplerYcbcrConversion vkCreateSamplerYcbcrConversionKHR(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo){
        VkSamplerYcbcrConversion o = new VkSamplerYcbcrConversion();
        super.vkCreateSamplerYcbcrConversionKHR(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateSamplerYcbcrConversionKHR");
        return o;
    }


    public void vkBindBufferMemory2KHR(VkDevice device, VkUInt32 bindInfoCount, VkBindBufferMemoryInfo pBindInfos){
        super.vkBindBufferMemory2KHR(device, bindInfoCount, pBindInfos, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkBindBufferMemory2KHR");
    }


    public void vkBindImageMemory2KHR(VkDevice device, VkUInt32 bindInfoCount, VkBindImageMemoryInfo pBindInfos){
        super.vkBindImageMemory2KHR(device, bindInfoCount, pBindInfos, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkBindImageMemory2KHR");
    }


    public VkDebugReportCallbackEXT vkCreateDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackCreateInfoEXT pCreateInfo){
        VkDebugReportCallbackEXT o = new VkDebugReportCallbackEXT();
        super.vkCreateDebugReportCallbackEXT(instance, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateDebugReportCallbackEXT");
        return o;
    }


    public void vkDebugMarkerSetObjectTagEXT(VkDevice device, VkDebugMarkerObjectTagInfoEXT pTagInfo){
        super.vkDebugMarkerSetObjectTagEXT(device, pTagInfo, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkDebugMarkerSetObjectTagEXT");
    }


    public void vkDebugMarkerSetObjectNameEXT(VkDevice device, VkDebugMarkerObjectNameInfoEXT pNameInfo){
        super.vkDebugMarkerSetObjectNameEXT(device, pNameInfo, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkDebugMarkerSetObjectNameEXT");
    }


    public void vkGetShaderInfoAMD(VkDevice device, VkPipeline pipeline, VkShaderStageFlagBits shaderStage, VkShaderInfoTypeAMD infoType, VkSize pInfoSize, VkObject pInfo){
        super.vkGetShaderInfoAMD(device, pipeline, shaderStage, infoType, pInfoSize, pInfo, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetShaderInfoAMD");
    }


    public void vkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags, VkExternalMemoryHandleTypeFlagsNV externalHandleType, VkExternalImageFormatPropertiesNV pExternalImageFormatProperties){
        super.vkGetPhysicalDeviceExternalImageFormatPropertiesNV(physicalDevice, format, type, tiling, usage, flags, externalHandleType, pExternalImageFormatProperties, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPhysicalDeviceExternalImageFormatPropertiesNV");
    }


    public VkIndirectCommandsLayoutNVX vkCreateIndirectCommandsLayoutNVX(VkDevice device, VkIndirectCommandsLayoutCreateInfoNVX pCreateInfo){
        VkIndirectCommandsLayoutNVX o = new VkIndirectCommandsLayoutNVX();
        super.vkCreateIndirectCommandsLayoutNVX(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateIndirectCommandsLayoutNVX");
        return o;
    }


    public VkObjectTableNVX vkCreateObjectTableNVX(VkDevice device, VkObjectTableCreateInfoNVX pCreateInfo){
        VkObjectTableNVX o = new VkObjectTableNVX();
        super.vkCreateObjectTableNVX(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateObjectTableNVX");
        return o;
    }


    public void vkRegisterObjectsNVX(VkDevice device, VkObjectTableNVX objectTable, VkUInt32 objectCount, VkObjectTableEntryNVX.Pointer ppObjectTableEntries, VkUInt32 pObjectIndices){
        super.vkRegisterObjectsNVX(device, objectTable, objectCount, ppObjectTableEntries, pObjectIndices, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkRegisterObjectsNVX");
    }


    public void vkUnregisterObjectsNVX(VkDevice device, VkObjectTableNVX objectTable, VkUInt32 objectCount, VkObjectEntryTypeNVX pObjectEntryTypes, VkUInt32 pObjectIndices){
        super.vkUnregisterObjectsNVX(device, objectTable, objectCount, pObjectEntryTypes, pObjectIndices, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkUnregisterObjectsNVX");
    }


    public void vkReleaseDisplayEXT(VkPhysicalDevice physicalDevice, VkDisplayKHR display){
        super.vkReleaseDisplayEXT(physicalDevice, display, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkReleaseDisplayEXT");
    }


    public void vkGetPhysicalDeviceSurfaceCapabilities2EXT(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilities2EXT pSurfaceCapabilities){
        super.vkGetPhysicalDeviceSurfaceCapabilities2EXT(physicalDevice, surface, pSurfaceCapabilities, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPhysicalDeviceSurfaceCapabilities2EXT");
    }


    public void vkDisplayPowerControlEXT(VkDevice device, VkDisplayKHR display, VkDisplayPowerInfoEXT pDisplayPowerInfo){
        super.vkDisplayPowerControlEXT(device, display, pDisplayPowerInfo, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkDisplayPowerControlEXT");
    }


    public void vkRegisterDeviceEventEXT(VkDevice device, VkDeviceEventInfoEXT pDeviceEventInfo, VkAllocationCallbacks pAllocator, VkFence pFence){
        super.vkRegisterDeviceEventEXT(device, pDeviceEventInfo, pAllocator, pFence, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkRegisterDeviceEventEXT");
    }


    public void vkRegisterDisplayEventEXT(VkDevice device, VkDisplayKHR display, VkDisplayEventInfoEXT pDisplayEventInfo, VkAllocationCallbacks pAllocator, VkFence pFence){
        super.vkRegisterDisplayEventEXT(device, display, pDisplayEventInfo, pAllocator, pFence, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkRegisterDisplayEventEXT");
    }


    public void vkGetSwapchainCounterEXT(VkDevice device, VkSwapchainKHR swapchain, VkSurfaceCounterFlagBitsEXT counter, VkUInt64 pCounterValue){
        super.vkGetSwapchainCounterEXT(device, swapchain, counter, pCounterValue, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetSwapchainCounterEXT");
    }


    public void vkGetRefreshCycleDurationGOOGLE(VkDevice device, VkSwapchainKHR swapchain, VkRefreshCycleDurationGOOGLE pDisplayTimingProperties){
        super.vkGetRefreshCycleDurationGOOGLE(device, swapchain, pDisplayTimingProperties, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetRefreshCycleDurationGOOGLE");
    }


    public void vkGetPastPresentationTimingGOOGLE(VkDevice device, VkSwapchainKHR swapchain, VkUInt32 pPresentationTimingCount, VkPastPresentationTimingGOOGLE pPresentationTimings){
        super.vkGetPastPresentationTimingGOOGLE(device, swapchain, pPresentationTimingCount, pPresentationTimings, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetPastPresentationTimingGOOGLE");
    }


    public void vkSetDebugUtilsObjectNameEXT(VkDevice device, VkDebugUtilsObjectNameInfoEXT pNameInfo){
        super.vkSetDebugUtilsObjectNameEXT(device, pNameInfo, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkSetDebugUtilsObjectNameEXT");
    }


    public void vkSetDebugUtilsObjectTagEXT(VkDevice device, VkDebugUtilsObjectTagInfoEXT pTagInfo){
        super.vkSetDebugUtilsObjectTagEXT(device, pTagInfo, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkSetDebugUtilsObjectTagEXT");
    }


    public VkDebugUtilsMessengerEXT vkCreateDebugUtilsMessengerEXT(VkInstance instance, VkDebugUtilsMessengerCreateInfoEXT pCreateInfo){
        VkDebugUtilsMessengerEXT o = new VkDebugUtilsMessengerEXT();
        super.vkCreateDebugUtilsMessengerEXT(instance, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateDebugUtilsMessengerEXT");
        return o;
    }


    public VkValidationCacheEXT vkCreateValidationCacheEXT(VkDevice device, VkValidationCacheCreateInfoEXT pCreateInfo){
        VkValidationCacheEXT o = new VkValidationCacheEXT();
        super.vkCreateValidationCacheEXT(device, pCreateInfo, pAllocator, o, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkCreateValidationCacheEXT");
        return o;
    }


    public void vkMergeValidationCachesEXT(VkDevice device, VkValidationCacheEXT dstCache, VkUInt32 srcCacheCount, VkValidationCacheEXT pSrcCaches){
        super.vkMergeValidationCachesEXT(device, dstCache, srcCacheCount, pSrcCaches, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkMergeValidationCachesEXT");
    }


    public void vkGetValidationCacheDataEXT(VkDevice device, VkValidationCacheEXT validationCache, VkSize pDataSize, VkObject pData){
        super.vkGetValidationCacheDataEXT(device, validationCache, pDataSize, pData, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetValidationCacheDataEXT");
    }


    public void vkGetMemoryHostPointerPropertiesEXT(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, VkObject pHostPointer, VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties){
        super.vkGetMemoryHostPointerPropertiesEXT(device, handleType, pHostPointer, pMemoryHostPointerProperties, result.get());
        if(result.get().getValue() != VK_SUCCESS) throw new VkException(result.get(), "vkGetMemoryHostPointerPropertiesEXT");
    }

}
