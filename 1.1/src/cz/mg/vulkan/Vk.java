package cz.mg.vulkan;

public class Vk {
    private VkInstance instance = null;

    public Vk(){
        System.loadLibrary("MgVulkanC");
    }

    public Vk(String mgVulkanLibraryFilename){
        System.loadLibrary(mgVulkanLibraryFilename);
    }

    public VkInstance getInstance(){
        return instance;
    }

    public void setInstance(VkInstance instance){
        this.instance = instance;
    }

    public static int VK_MAKE_VERSION(int major, int minor, int patch){
        return (((major) << 22) | ((minor) << 12) | (patch));
    }

    public static int VK_VERSION_MAJOR(int version){
        return ((int)(version) >> 22);
    }

    public static int VK_VERSION_MINOR(int version){
        return (((int)(version) >> 12) & 0x3ff);
    }

    public static int VK_VERSION_PATCH(int version){
        return ((int)(version) & 0xfff);
    }

    public static int VK_API_VERSION_1_0 = VK_MAKE_VERSION(1, 0, 0);
    public static int VK_API_VERSION_1_1 = VK_MAKE_VERSION(1, 1, 0);

    private PFNvkCreateInstance PFN_vkCreateInstance_f = null;
    private PFNvkDestroyInstance PFN_vkDestroyInstance_f = null;
    private PFNvkEnumeratePhysicalDevices PFN_vkEnumeratePhysicalDevices_f = null;
    private PFNvkGetPhysicalDeviceFeatures PFN_vkGetPhysicalDeviceFeatures_f = null;
    private PFNvkGetPhysicalDeviceFormatProperties PFN_vkGetPhysicalDeviceFormatProperties_f = null;
    private PFNvkGetPhysicalDeviceImageFormatProperties PFN_vkGetPhysicalDeviceImageFormatProperties_f = null;
    private PFNvkGetPhysicalDeviceProperties PFN_vkGetPhysicalDeviceProperties_f = null;
    private PFNvkGetPhysicalDeviceQueueFamilyProperties PFN_vkGetPhysicalDeviceQueueFamilyProperties_f = null;
    private PFNvkGetPhysicalDeviceMemoryProperties PFN_vkGetPhysicalDeviceMemoryProperties_f = null;
    private PFNvkGetInstanceProcAddr PFN_vkGetInstanceProcAddr_f = null;
    private PFNvkGetDeviceProcAddr PFN_vkGetDeviceProcAddr_f = null;
    private PFNvkCreateDevice PFN_vkCreateDevice_f = null;
    private PFNvkDestroyDevice PFN_vkDestroyDevice_f = null;
    private PFNvkEnumerateInstanceExtensionProperties PFN_vkEnumerateInstanceExtensionProperties_f = null;
    private PFNvkEnumerateDeviceExtensionProperties PFN_vkEnumerateDeviceExtensionProperties_f = null;
    private PFNvkEnumerateInstanceLayerProperties PFN_vkEnumerateInstanceLayerProperties_f = null;
    private PFNvkEnumerateDeviceLayerProperties PFN_vkEnumerateDeviceLayerProperties_f = null;
    private PFNvkGetDeviceQueue PFN_vkGetDeviceQueue_f = null;
    private PFNvkQueueSubmit PFN_vkQueueSubmit_f = null;
    private PFNvkQueueWaitIdle PFN_vkQueueWaitIdle_f = null;
    private PFNvkDeviceWaitIdle PFN_vkDeviceWaitIdle_f = null;
    private PFNvkAllocateMemory PFN_vkAllocateMemory_f = null;
    private PFNvkFreeMemory PFN_vkFreeMemory_f = null;
    private PFNvkMapMemory PFN_vkMapMemory_f = null;
    private PFNvkUnmapMemory PFN_vkUnmapMemory_f = null;
    private PFNvkFlushMappedMemoryRanges PFN_vkFlushMappedMemoryRanges_f = null;
    private PFNvkInvalidateMappedMemoryRanges PFN_vkInvalidateMappedMemoryRanges_f = null;
    private PFNvkGetDeviceMemoryCommitment PFN_vkGetDeviceMemoryCommitment_f = null;
    private PFNvkBindBufferMemory PFN_vkBindBufferMemory_f = null;
    private PFNvkBindImageMemory PFN_vkBindImageMemory_f = null;
    private PFNvkGetBufferMemoryRequirements PFN_vkGetBufferMemoryRequirements_f = null;
    private PFNvkGetImageMemoryRequirements PFN_vkGetImageMemoryRequirements_f = null;
    private PFNvkGetImageSparseMemoryRequirements PFN_vkGetImageSparseMemoryRequirements_f = null;
    private PFNvkGetPhysicalDeviceSparseImageFormatProperties PFN_vkGetPhysicalDeviceSparseImageFormatProperties_f = null;
    private PFNvkQueueBindSparse PFN_vkQueueBindSparse_f = null;
    private PFNvkCreateFence PFN_vkCreateFence_f = null;
    private PFNvkDestroyFence PFN_vkDestroyFence_f = null;
    private PFNvkResetFences PFN_vkResetFences_f = null;
    private PFNvkGetFenceStatus PFN_vkGetFenceStatus_f = null;
    private PFNvkWaitForFences PFN_vkWaitForFences_f = null;
    private PFNvkCreateSemaphore PFN_vkCreateSemaphore_f = null;
    private PFNvkDestroySemaphore PFN_vkDestroySemaphore_f = null;
    private PFNvkCreateEvent PFN_vkCreateEvent_f = null;
    private PFNvkDestroyEvent PFN_vkDestroyEvent_f = null;
    private PFNvkGetEventStatus PFN_vkGetEventStatus_f = null;
    private PFNvkSetEvent PFN_vkSetEvent_f = null;
    private PFNvkResetEvent PFN_vkResetEvent_f = null;
    private PFNvkCreateQueryPool PFN_vkCreateQueryPool_f = null;
    private PFNvkDestroyQueryPool PFN_vkDestroyQueryPool_f = null;
    private PFNvkGetQueryPoolResults PFN_vkGetQueryPoolResults_f = null;
    private PFNvkCreateBuffer PFN_vkCreateBuffer_f = null;
    private PFNvkDestroyBuffer PFN_vkDestroyBuffer_f = null;
    private PFNvkCreateBufferView PFN_vkCreateBufferView_f = null;
    private PFNvkDestroyBufferView PFN_vkDestroyBufferView_f = null;
    private PFNvkCreateImage PFN_vkCreateImage_f = null;
    private PFNvkDestroyImage PFN_vkDestroyImage_f = null;
    private PFNvkGetImageSubresourceLayout PFN_vkGetImageSubresourceLayout_f = null;
    private PFNvkCreateImageView PFN_vkCreateImageView_f = null;
    private PFNvkDestroyImageView PFN_vkDestroyImageView_f = null;
    private PFNvkCreateShaderModule PFN_vkCreateShaderModule_f = null;
    private PFNvkDestroyShaderModule PFN_vkDestroyShaderModule_f = null;
    private PFNvkCreatePipelineCache PFN_vkCreatePipelineCache_f = null;
    private PFNvkDestroyPipelineCache PFN_vkDestroyPipelineCache_f = null;
    private PFNvkGetPipelineCacheData PFN_vkGetPipelineCacheData_f = null;
    private PFNvkMergePipelineCaches PFN_vkMergePipelineCaches_f = null;
    private PFNvkCreateGraphicsPipelines PFN_vkCreateGraphicsPipelines_f = null;
    private PFNvkCreateComputePipelines PFN_vkCreateComputePipelines_f = null;
    private PFNvkDestroyPipeline PFN_vkDestroyPipeline_f = null;
    private PFNvkCreatePipelineLayout PFN_vkCreatePipelineLayout_f = null;
    private PFNvkDestroyPipelineLayout PFN_vkDestroyPipelineLayout_f = null;
    private PFNvkCreateSampler PFN_vkCreateSampler_f = null;
    private PFNvkDestroySampler PFN_vkDestroySampler_f = null;
    private PFNvkCreateDescriptorSetLayout PFN_vkCreateDescriptorSetLayout_f = null;
    private PFNvkDestroyDescriptorSetLayout PFN_vkDestroyDescriptorSetLayout_f = null;
    private PFNvkCreateDescriptorPool PFN_vkCreateDescriptorPool_f = null;
    private PFNvkDestroyDescriptorPool PFN_vkDestroyDescriptorPool_f = null;
    private PFNvkResetDescriptorPool PFN_vkResetDescriptorPool_f = null;
    private PFNvkAllocateDescriptorSets PFN_vkAllocateDescriptorSets_f = null;
    private PFNvkFreeDescriptorSets PFN_vkFreeDescriptorSets_f = null;
    private PFNvkUpdateDescriptorSets PFN_vkUpdateDescriptorSets_f = null;
    private PFNvkCreateFramebuffer PFN_vkCreateFramebuffer_f = null;
    private PFNvkDestroyFramebuffer PFN_vkDestroyFramebuffer_f = null;
    private PFNvkCreateRenderPass PFN_vkCreateRenderPass_f = null;
    private PFNvkDestroyRenderPass PFN_vkDestroyRenderPass_f = null;
    private PFNvkGetRenderAreaGranularity PFN_vkGetRenderAreaGranularity_f = null;
    private PFNvkCreateCommandPool PFN_vkCreateCommandPool_f = null;
    private PFNvkDestroyCommandPool PFN_vkDestroyCommandPool_f = null;
    private PFNvkResetCommandPool PFN_vkResetCommandPool_f = null;
    private PFNvkAllocateCommandBuffers PFN_vkAllocateCommandBuffers_f = null;
    private PFNvkFreeCommandBuffers PFN_vkFreeCommandBuffers_f = null;
    private PFNvkBeginCommandBuffer PFN_vkBeginCommandBuffer_f = null;
    private PFNvkEndCommandBuffer PFN_vkEndCommandBuffer_f = null;
    private PFNvkResetCommandBuffer PFN_vkResetCommandBuffer_f = null;
    private PFNvkCmdBindPipeline PFN_vkCmdBindPipeline_f = null;
    private PFNvkCmdSetViewport PFN_vkCmdSetViewport_f = null;
    private PFNvkCmdSetScissor PFN_vkCmdSetScissor_f = null;
    private PFNvkCmdSetLineWidth PFN_vkCmdSetLineWidth_f = null;
    private PFNvkCmdSetDepthBias PFN_vkCmdSetDepthBias_f = null;
    private PFNvkCmdSetBlendConstants PFN_vkCmdSetBlendConstants_f = null;
    private PFNvkCmdSetDepthBounds PFN_vkCmdSetDepthBounds_f = null;
    private PFNvkCmdSetStencilCompareMask PFN_vkCmdSetStencilCompareMask_f = null;
    private PFNvkCmdSetStencilWriteMask PFN_vkCmdSetStencilWriteMask_f = null;
    private PFNvkCmdSetStencilReference PFN_vkCmdSetStencilReference_f = null;
    private PFNvkCmdBindDescriptorSets PFN_vkCmdBindDescriptorSets_f = null;
    private PFNvkCmdBindIndexBuffer PFN_vkCmdBindIndexBuffer_f = null;
    private PFNvkCmdBindVertexBuffers PFN_vkCmdBindVertexBuffers_f = null;
    private PFNvkCmdDraw PFN_vkCmdDraw_f = null;
    private PFNvkCmdDrawIndexed PFN_vkCmdDrawIndexed_f = null;
    private PFNvkCmdDrawIndirect PFN_vkCmdDrawIndirect_f = null;
    private PFNvkCmdDrawIndexedIndirect PFN_vkCmdDrawIndexedIndirect_f = null;
    private PFNvkCmdDispatch PFN_vkCmdDispatch_f = null;
    private PFNvkCmdDispatchIndirect PFN_vkCmdDispatchIndirect_f = null;
    private PFNvkCmdCopyBuffer PFN_vkCmdCopyBuffer_f = null;
    private PFNvkCmdCopyImage PFN_vkCmdCopyImage_f = null;
    private PFNvkCmdBlitImage PFN_vkCmdBlitImage_f = null;
    private PFNvkCmdCopyBufferToImage PFN_vkCmdCopyBufferToImage_f = null;
    private PFNvkCmdCopyImageToBuffer PFN_vkCmdCopyImageToBuffer_f = null;
    private PFNvkCmdUpdateBuffer PFN_vkCmdUpdateBuffer_f = null;
    private PFNvkCmdFillBuffer PFN_vkCmdFillBuffer_f = null;
    private PFNvkCmdClearColorImage PFN_vkCmdClearColorImage_f = null;
    private PFNvkCmdClearDepthStencilImage PFN_vkCmdClearDepthStencilImage_f = null;
    private PFNvkCmdClearAttachments PFN_vkCmdClearAttachments_f = null;
    private PFNvkCmdResolveImage PFN_vkCmdResolveImage_f = null;
    private PFNvkCmdSetEvent PFN_vkCmdSetEvent_f = null;
    private PFNvkCmdResetEvent PFN_vkCmdResetEvent_f = null;
    private PFNvkCmdWaitEvents PFN_vkCmdWaitEvents_f = null;
    private PFNvkCmdPipelineBarrier PFN_vkCmdPipelineBarrier_f = null;
    private PFNvkCmdBeginQuery PFN_vkCmdBeginQuery_f = null;
    private PFNvkCmdEndQuery PFN_vkCmdEndQuery_f = null;
    private PFNvkCmdResetQueryPool PFN_vkCmdResetQueryPool_f = null;
    private PFNvkCmdWriteTimestamp PFN_vkCmdWriteTimestamp_f = null;
    private PFNvkCmdCopyQueryPoolResults PFN_vkCmdCopyQueryPoolResults_f = null;
    private PFNvkCmdPushConstants PFN_vkCmdPushConstants_f = null;
    private PFNvkCmdBeginRenderPass PFN_vkCmdBeginRenderPass_f = null;
    private PFNvkCmdNextSubpass PFN_vkCmdNextSubpass_f = null;
    private PFNvkCmdEndRenderPass PFN_vkCmdEndRenderPass_f = null;
    private PFNvkCmdExecuteCommands PFN_vkCmdExecuteCommands_f = null;
    private PFNvkEnumerateInstanceVersion PFN_vkEnumerateInstanceVersion_f = null;
    private PFNvkBindBufferMemory2 PFN_vkBindBufferMemory2_f = null;
    private PFNvkBindImageMemory2 PFN_vkBindImageMemory2_f = null;
    private PFNvkGetDeviceGroupPeerMemoryFeatures PFN_vkGetDeviceGroupPeerMemoryFeatures_f = null;
    private PFNvkCmdSetDeviceMask PFN_vkCmdSetDeviceMask_f = null;
    private PFNvkCmdDispatchBase PFN_vkCmdDispatchBase_f = null;
    private PFNvkEnumeratePhysicalDeviceGroups PFN_vkEnumeratePhysicalDeviceGroups_f = null;
    private PFNvkGetImageMemoryRequirements2 PFN_vkGetImageMemoryRequirements2_f = null;
    private PFNvkGetBufferMemoryRequirements2 PFN_vkGetBufferMemoryRequirements2_f = null;
    private PFNvkGetImageSparseMemoryRequirements2 PFN_vkGetImageSparseMemoryRequirements2_f = null;
    private PFNvkGetPhysicalDeviceFeatures2 PFN_vkGetPhysicalDeviceFeatures2_f = null;
    private PFNvkGetPhysicalDeviceProperties2 PFN_vkGetPhysicalDeviceProperties2_f = null;
    private PFNvkGetPhysicalDeviceFormatProperties2 PFN_vkGetPhysicalDeviceFormatProperties2_f = null;
    private PFNvkGetPhysicalDeviceImageFormatProperties2 PFN_vkGetPhysicalDeviceImageFormatProperties2_f = null;
    private PFNvkGetPhysicalDeviceQueueFamilyProperties2 PFN_vkGetPhysicalDeviceQueueFamilyProperties2_f = null;
    private PFNvkGetPhysicalDeviceMemoryProperties2 PFN_vkGetPhysicalDeviceMemoryProperties2_f = null;
    private PFNvkGetPhysicalDeviceSparseImageFormatProperties2 PFN_vkGetPhysicalDeviceSparseImageFormatProperties2_f = null;
    private PFNvkTrimCommandPool PFN_vkTrimCommandPool_f = null;
    private PFNvkGetDeviceQueue2 PFN_vkGetDeviceQueue2_f = null;
    private PFNvkCreateSamplerYcbcrConversion PFN_vkCreateSamplerYcbcrConversion_f = null;
    private PFNvkDestroySamplerYcbcrConversion PFN_vkDestroySamplerYcbcrConversion_f = null;
    private PFNvkCreateDescriptorUpdateTemplate PFN_vkCreateDescriptorUpdateTemplate_f = null;
    private PFNvkDestroyDescriptorUpdateTemplate PFN_vkDestroyDescriptorUpdateTemplate_f = null;
    private PFNvkUpdateDescriptorSetWithTemplate PFN_vkUpdateDescriptorSetWithTemplate_f = null;
    private PFNvkGetPhysicalDeviceExternalBufferProperties PFN_vkGetPhysicalDeviceExternalBufferProperties_f = null;
    private PFNvkGetPhysicalDeviceExternalFenceProperties PFN_vkGetPhysicalDeviceExternalFenceProperties_f = null;
    private PFNvkGetPhysicalDeviceExternalSemaphoreProperties PFN_vkGetPhysicalDeviceExternalSemaphoreProperties_f = null;
    private PFNvkGetDescriptorSetLayoutSupport PFN_vkGetDescriptorSetLayoutSupport_f = null;
    private PFNvkDestroySurfaceKHR PFN_vkDestroySurfaceKHR_f = null;
    private PFNvkGetPhysicalDeviceSurfaceSupportKHR PFN_vkGetPhysicalDeviceSurfaceSupportKHR_f = null;
    private PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR_f = null;
    private PFNvkGetPhysicalDeviceSurfaceFormatsKHR PFN_vkGetPhysicalDeviceSurfaceFormatsKHR_f = null;
    private PFNvkGetPhysicalDeviceSurfacePresentModesKHR PFN_vkGetPhysicalDeviceSurfacePresentModesKHR_f = null;
    private PFNvkCreateSwapchainKHR PFN_vkCreateSwapchainKHR_f = null;
    private PFNvkDestroySwapchainKHR PFN_vkDestroySwapchainKHR_f = null;
    private PFNvkGetSwapchainImagesKHR PFN_vkGetSwapchainImagesKHR_f = null;
    private PFNvkAcquireNextImageKHR PFN_vkAcquireNextImageKHR_f = null;
    private PFNvkQueuePresentKHR PFN_vkQueuePresentKHR_f = null;
    private PFNvkGetDeviceGroupPresentCapabilitiesKHR PFN_vkGetDeviceGroupPresentCapabilitiesKHR_f = null;
    private PFNvkGetDeviceGroupSurfacePresentModesKHR PFN_vkGetDeviceGroupSurfacePresentModesKHR_f = null;
    private PFNvkGetPhysicalDevicePresentRectanglesKHR PFN_vkGetPhysicalDevicePresentRectanglesKHR_f = null;
    private PFNvkAcquireNextImage2KHR PFN_vkAcquireNextImage2KHR_f = null;
    private PFNvkGetPhysicalDeviceDisplayPropertiesKHR PFN_vkGetPhysicalDeviceDisplayPropertiesKHR_f = null;
    private PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR_f = null;
    private PFNvkGetDisplayPlaneSupportedDisplaysKHR PFN_vkGetDisplayPlaneSupportedDisplaysKHR_f = null;
    private PFNvkGetDisplayModePropertiesKHR PFN_vkGetDisplayModePropertiesKHR_f = null;
    private PFNvkCreateDisplayModeKHR PFN_vkCreateDisplayModeKHR_f = null;
    private PFNvkGetDisplayPlaneCapabilitiesKHR PFN_vkGetDisplayPlaneCapabilitiesKHR_f = null;
    private PFNvkCreateDisplayPlaneSurfaceKHR PFN_vkCreateDisplayPlaneSurfaceKHR_f = null;
    private PFNvkCreateSharedSwapchainsKHR PFN_vkCreateSharedSwapchainsKHR_f = null;
    private PFNvkGetPhysicalDeviceFeatures2KHR PFN_vkGetPhysicalDeviceFeatures2KHR_f = null;
    private PFNvkGetPhysicalDeviceProperties2KHR PFN_vkGetPhysicalDeviceProperties2KHR_f = null;
    private PFNvkGetPhysicalDeviceFormatProperties2KHR PFN_vkGetPhysicalDeviceFormatProperties2KHR_f = null;
    private PFNvkGetPhysicalDeviceImageFormatProperties2KHR PFN_vkGetPhysicalDeviceImageFormatProperties2KHR_f = null;
    private PFNvkGetPhysicalDeviceQueueFamilyProperties2KHR PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR_f = null;
    private PFNvkGetPhysicalDeviceMemoryProperties2KHR PFN_vkGetPhysicalDeviceMemoryProperties2KHR_f = null;
    private PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR_f = null;
    private PFNvkGetDeviceGroupPeerMemoryFeaturesKHR PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR_f = null;
    private PFNvkCmdSetDeviceMaskKHR PFN_vkCmdSetDeviceMaskKHR_f = null;
    private PFNvkCmdDispatchBaseKHR PFN_vkCmdDispatchBaseKHR_f = null;
    private PFNvkTrimCommandPoolKHR PFN_vkTrimCommandPoolKHR_f = null;
    private PFNvkEnumeratePhysicalDeviceGroupsKHR PFN_vkEnumeratePhysicalDeviceGroupsKHR_f = null;
    private PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR PFN_vkGetPhysicalDeviceExternalBufferPropertiesKHR_f = null;
    private PFNvkGetMemoryFdKHR PFN_vkGetMemoryFdKHR_f = null;
    private PFNvkGetMemoryFdPropertiesKHR PFN_vkGetMemoryFdPropertiesKHR_f = null;
    private PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR PFN_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR_f = null;
    private PFNvkImportSemaphoreFdKHR PFN_vkImportSemaphoreFdKHR_f = null;
    private PFNvkGetSemaphoreFdKHR PFN_vkGetSemaphoreFdKHR_f = null;
    private PFNvkCmdPushDescriptorSetKHR PFN_vkCmdPushDescriptorSetKHR_f = null;
    private PFNvkCmdPushDescriptorSetWithTemplateKHR PFN_vkCmdPushDescriptorSetWithTemplateKHR_f = null;
    private PFNvkCreateDescriptorUpdateTemplateKHR PFN_vkCreateDescriptorUpdateTemplateKHR_f = null;
    private PFNvkDestroyDescriptorUpdateTemplateKHR PFN_vkDestroyDescriptorUpdateTemplateKHR_f = null;
    private PFNvkUpdateDescriptorSetWithTemplateKHR PFN_vkUpdateDescriptorSetWithTemplateKHR_f = null;
    private PFNvkGetSwapchainStatusKHR PFN_vkGetSwapchainStatusKHR_f = null;
    private PFNvkGetPhysicalDeviceExternalFencePropertiesKHR PFN_vkGetPhysicalDeviceExternalFencePropertiesKHR_f = null;
    private PFNvkImportFenceFdKHR PFN_vkImportFenceFdKHR_f = null;
    private PFNvkGetFenceFdKHR PFN_vkGetFenceFdKHR_f = null;
    private PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR_f = null;
    private PFNvkGetPhysicalDeviceSurfaceFormats2KHR PFN_vkGetPhysicalDeviceSurfaceFormats2KHR_f = null;
    private PFNvkGetImageMemoryRequirements2KHR PFN_vkGetImageMemoryRequirements2KHR_f = null;
    private PFNvkGetBufferMemoryRequirements2KHR PFN_vkGetBufferMemoryRequirements2KHR_f = null;
    private PFNvkGetImageSparseMemoryRequirements2KHR PFN_vkGetImageSparseMemoryRequirements2KHR_f = null;
    private PFNvkCreateSamplerYcbcrConversionKHR PFN_vkCreateSamplerYcbcrConversionKHR_f = null;
    private PFNvkDestroySamplerYcbcrConversionKHR PFN_vkDestroySamplerYcbcrConversionKHR_f = null;
    private PFNvkBindBufferMemory2KHR PFN_vkBindBufferMemory2KHR_f = null;
    private PFNvkBindImageMemory2KHR PFN_vkBindImageMemory2KHR_f = null;
    private PFNvkGetDescriptorSetLayoutSupportKHR PFN_vkGetDescriptorSetLayoutSupportKHR_f = null;
    private PFNvkCreateDebugReportCallbackEXT PFN_vkCreateDebugReportCallbackEXT_f = null;
    private PFNvkDestroyDebugReportCallbackEXT PFN_vkDestroyDebugReportCallbackEXT_f = null;
    private PFNvkDebugReportMessageEXT PFN_vkDebugReportMessageEXT_f = null;
    private PFNvkDebugMarkerSetObjectTagEXT PFN_vkDebugMarkerSetObjectTagEXT_f = null;
    private PFNvkDebugMarkerSetObjectNameEXT PFN_vkDebugMarkerSetObjectNameEXT_f = null;
    private PFNvkCmdDebugMarkerBeginEXT PFN_vkCmdDebugMarkerBeginEXT_f = null;
    private PFNvkCmdDebugMarkerEndEXT PFN_vkCmdDebugMarkerEndEXT_f = null;
    private PFNvkCmdDebugMarkerInsertEXT PFN_vkCmdDebugMarkerInsertEXT_f = null;
    private PFNvkCmdDrawIndirectCountAMD PFN_vkCmdDrawIndirectCountAMD_f = null;
    private PFNvkCmdDrawIndexedIndirectCountAMD PFN_vkCmdDrawIndexedIndirectCountAMD_f = null;
    private PFNvkGetShaderInfoAMD PFN_vkGetShaderInfoAMD_f = null;
    private PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV_f = null;
    private PFNvkCmdProcessCommandsNVX PFN_vkCmdProcessCommandsNVX_f = null;
    private PFNvkCmdReserveSpaceForCommandsNVX PFN_vkCmdReserveSpaceForCommandsNVX_f = null;
    private PFNvkCreateIndirectCommandsLayoutNVX PFN_vkCreateIndirectCommandsLayoutNVX_f = null;
    private PFNvkDestroyIndirectCommandsLayoutNVX PFN_vkDestroyIndirectCommandsLayoutNVX_f = null;
    private PFNvkCreateObjectTableNVX PFN_vkCreateObjectTableNVX_f = null;
    private PFNvkDestroyObjectTableNVX PFN_vkDestroyObjectTableNVX_f = null;
    private PFNvkRegisterObjectsNVX PFN_vkRegisterObjectsNVX_f = null;
    private PFNvkUnregisterObjectsNVX PFN_vkUnregisterObjectsNVX_f = null;
    private PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX PFN_vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX_f = null;
    private PFNvkCmdSetViewportWScalingNV PFN_vkCmdSetViewportWScalingNV_f = null;
    private PFNvkReleaseDisplayEXT PFN_vkReleaseDisplayEXT_f = null;
    private PFNvkGetPhysicalDeviceSurfaceCapabilities2EXT PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT_f = null;
    private PFNvkDisplayPowerControlEXT PFN_vkDisplayPowerControlEXT_f = null;
    private PFNvkRegisterDeviceEventEXT PFN_vkRegisterDeviceEventEXT_f = null;
    private PFNvkRegisterDisplayEventEXT PFN_vkRegisterDisplayEventEXT_f = null;
    private PFNvkGetSwapchainCounterEXT PFN_vkGetSwapchainCounterEXT_f = null;
    private PFNvkGetRefreshCycleDurationGOOGLE PFN_vkGetRefreshCycleDurationGOOGLE_f = null;
    private PFNvkGetPastPresentationTimingGOOGLE PFN_vkGetPastPresentationTimingGOOGLE_f = null;
    private PFNvkCmdSetDiscardRectangleEXT PFN_vkCmdSetDiscardRectangleEXT_f = null;
    private PFNvkSetHdrMetadataEXT PFN_vkSetHdrMetadataEXT_f = null;
    private PFNvkSetDebugUtilsObjectNameEXT PFN_vkSetDebugUtilsObjectNameEXT_f = null;
    private PFNvkSetDebugUtilsObjectTagEXT PFN_vkSetDebugUtilsObjectTagEXT_f = null;
    private PFNvkQueueBeginDebugUtilsLabelEXT PFN_vkQueueBeginDebugUtilsLabelEXT_f = null;
    private PFNvkQueueEndDebugUtilsLabelEXT PFN_vkQueueEndDebugUtilsLabelEXT_f = null;
    private PFNvkQueueInsertDebugUtilsLabelEXT PFN_vkQueueInsertDebugUtilsLabelEXT_f = null;
    private PFNvkCmdBeginDebugUtilsLabelEXT PFN_vkCmdBeginDebugUtilsLabelEXT_f = null;
    private PFNvkCmdEndDebugUtilsLabelEXT PFN_vkCmdEndDebugUtilsLabelEXT_f = null;
    private PFNvkCmdInsertDebugUtilsLabelEXT PFN_vkCmdInsertDebugUtilsLabelEXT_f = null;
    private PFNvkCreateDebugUtilsMessengerEXT PFN_vkCreateDebugUtilsMessengerEXT_f = null;
    private PFNvkDestroyDebugUtilsMessengerEXT PFN_vkDestroyDebugUtilsMessengerEXT_f = null;
    private PFNvkSubmitDebugUtilsMessageEXT PFN_vkSubmitDebugUtilsMessageEXT_f = null;
    private PFNvkCmdSetSampleLocationsEXT PFN_vkCmdSetSampleLocationsEXT_f = null;
    private PFNvkGetPhysicalDeviceMultisamplePropertiesEXT PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT_f = null;
    private PFNvkCreateValidationCacheEXT PFN_vkCreateValidationCacheEXT_f = null;
    private PFNvkDestroyValidationCacheEXT PFN_vkDestroyValidationCacheEXT_f = null;
    private PFNvkMergeValidationCachesEXT PFN_vkMergeValidationCachesEXT_f = null;
    private PFNvkGetValidationCacheDataEXT PFN_vkGetValidationCacheDataEXT_f = null;
    private PFNvkGetMemoryHostPointerPropertiesEXT PFN_vkGetMemoryHostPointerPropertiesEXT_f = null;
    private PFNvkCmdWriteBufferMarkerAMD PFN_vkCmdWriteBufferMarkerAMD_f = null;

    public int vkCreateInstance(VkInstanceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkInstance pInstance){
        if(PFN_vkCreateInstance_f == null) PFN_vkCreateInstance_f = new PFNvkCreateInstance(instance);
        return PFN_vkCreateInstance_f.call(pCreateInfo, pAllocator, pInstance);
    }


    public void vkCreateInstanceP(VkInstanceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkInstance pInstance){
        if(PFN_vkCreateInstance_f == null) PFN_vkCreateInstance_f = new PFNvkCreateInstance(instance);
        int result = PFN_vkCreateInstance_f.call(pCreateInfo, pAllocator, pInstance);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyInstance(VkInstance instance, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyInstance_f == null) PFN_vkDestroyInstance_f = new PFNvkDestroyInstance(instance);
        PFN_vkDestroyInstance_f.call(instance, pAllocator);
    }


    public int vkEnumeratePhysicalDevices(VkInstance instance, VkUInt32 pPhysicalDeviceCount, VkPhysicalDevice pPhysicalDevices){
        if(PFN_vkEnumeratePhysicalDevices_f == null) PFN_vkEnumeratePhysicalDevices_f = new PFNvkEnumeratePhysicalDevices(instance);
        return PFN_vkEnumeratePhysicalDevices_f.call(instance, pPhysicalDeviceCount, pPhysicalDevices);
    }


    public void vkEnumeratePhysicalDevicesP(VkInstance instance, VkUInt32 pPhysicalDeviceCount, VkPhysicalDevice pPhysicalDevices){
        if(PFN_vkEnumeratePhysicalDevices_f == null) PFN_vkEnumeratePhysicalDevices_f = new PFNvkEnumeratePhysicalDevices(instance);
        int result = PFN_vkEnumeratePhysicalDevices_f.call(instance, pPhysicalDeviceCount, pPhysicalDevices);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures pFeatures){
        if(PFN_vkGetPhysicalDeviceFeatures_f == null) PFN_vkGetPhysicalDeviceFeatures_f = new PFNvkGetPhysicalDeviceFeatures(instance);
        PFN_vkGetPhysicalDeviceFeatures_f.call(physicalDevice, pFeatures);
    }


    public void vkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, int format, VkFormatProperties pFormatProperties){
        if(PFN_vkGetPhysicalDeviceFormatProperties_f == null) PFN_vkGetPhysicalDeviceFormatProperties_f = new PFNvkGetPhysicalDeviceFormatProperties(instance);
        PFN_vkGetPhysicalDeviceFormatProperties_f.call(physicalDevice, format, pFormatProperties);
    }


    public int vkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, VkImageFormatProperties pImageFormatProperties){
        if(PFN_vkGetPhysicalDeviceImageFormatProperties_f == null) PFN_vkGetPhysicalDeviceImageFormatProperties_f = new PFNvkGetPhysicalDeviceImageFormatProperties(instance);
        return PFN_vkGetPhysicalDeviceImageFormatProperties_f.call(physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties);
    }


    public void vkGetPhysicalDeviceImageFormatPropertiesP(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, VkImageFormatProperties pImageFormatProperties){
        if(PFN_vkGetPhysicalDeviceImageFormatProperties_f == null) PFN_vkGetPhysicalDeviceImageFormatProperties_f = new PFNvkGetPhysicalDeviceImageFormatProperties(instance);
        int result = PFN_vkGetPhysicalDeviceImageFormatProperties_f.call(physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties pProperties){
        if(PFN_vkGetPhysicalDeviceProperties_f == null) PFN_vkGetPhysicalDeviceProperties_f = new PFNvkGetPhysicalDeviceProperties(instance);
        PFN_vkGetPhysicalDeviceProperties_f.call(physicalDevice, pProperties);
    }


    public void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, VkUInt32 pQueueFamilyPropertyCount, VkQueueFamilyProperties pQueueFamilyProperties){
        if(PFN_vkGetPhysicalDeviceQueueFamilyProperties_f == null) PFN_vkGetPhysicalDeviceQueueFamilyProperties_f = new PFNvkGetPhysicalDeviceQueueFamilyProperties(instance);
        PFN_vkGetPhysicalDeviceQueueFamilyProperties_f.call(physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties);
    }


    public void vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties pMemoryProperties){
        if(PFN_vkGetPhysicalDeviceMemoryProperties_f == null) PFN_vkGetPhysicalDeviceMemoryProperties_f = new PFNvkGetPhysicalDeviceMemoryProperties(instance);
        PFN_vkGetPhysicalDeviceMemoryProperties_f.call(physicalDevice, pMemoryProperties);
    }


    public long vkGetInstanceProcAddr(VkInstance instance, VkChar pName){
        if(PFN_vkGetInstanceProcAddr_f == null) PFN_vkGetInstanceProcAddr_f = new PFNvkGetInstanceProcAddr(instance);
        return PFN_vkGetInstanceProcAddr_f.call(instance, pName);
    }


    public long vkGetDeviceProcAddr(VkDevice device, VkChar pName){
        if(PFN_vkGetDeviceProcAddr_f == null) PFN_vkGetDeviceProcAddr_f = new PFNvkGetDeviceProcAddr(instance);
        return PFN_vkGetDeviceProcAddr_f.call(device, pName);
    }


    public int vkCreateDevice(VkPhysicalDevice physicalDevice, VkDeviceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDevice pDevice){
        if(PFN_vkCreateDevice_f == null) PFN_vkCreateDevice_f = new PFNvkCreateDevice(instance);
        return PFN_vkCreateDevice_f.call(physicalDevice, pCreateInfo, pAllocator, pDevice);
    }


    public void vkCreateDeviceP(VkPhysicalDevice physicalDevice, VkDeviceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDevice pDevice){
        if(PFN_vkCreateDevice_f == null) PFN_vkCreateDevice_f = new PFNvkCreateDevice(instance);
        int result = PFN_vkCreateDevice_f.call(physicalDevice, pCreateInfo, pAllocator, pDevice);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyDevice(VkDevice device, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyDevice_f == null) PFN_vkDestroyDevice_f = new PFNvkDestroyDevice(instance);
        PFN_vkDestroyDevice_f.call(device, pAllocator);
    }


    public int vkEnumerateInstanceExtensionProperties(VkChar pLayerName, VkUInt32 pPropertyCount, VkExtensionProperties pProperties){
        if(PFN_vkEnumerateInstanceExtensionProperties_f == null) PFN_vkEnumerateInstanceExtensionProperties_f = new PFNvkEnumerateInstanceExtensionProperties(instance);
        return PFN_vkEnumerateInstanceExtensionProperties_f.call(pLayerName, pPropertyCount, pProperties);
    }


    public void vkEnumerateInstanceExtensionPropertiesP(VkChar pLayerName, VkUInt32 pPropertyCount, VkExtensionProperties pProperties){
        if(PFN_vkEnumerateInstanceExtensionProperties_f == null) PFN_vkEnumerateInstanceExtensionProperties_f = new PFNvkEnumerateInstanceExtensionProperties(instance);
        int result = PFN_vkEnumerateInstanceExtensionProperties_f.call(pLayerName, pPropertyCount, pProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, VkChar pLayerName, VkUInt32 pPropertyCount, VkExtensionProperties pProperties){
        if(PFN_vkEnumerateDeviceExtensionProperties_f == null) PFN_vkEnumerateDeviceExtensionProperties_f = new PFNvkEnumerateDeviceExtensionProperties(instance);
        return PFN_vkEnumerateDeviceExtensionProperties_f.call(physicalDevice, pLayerName, pPropertyCount, pProperties);
    }


    public void vkEnumerateDeviceExtensionPropertiesP(VkPhysicalDevice physicalDevice, VkChar pLayerName, VkUInt32 pPropertyCount, VkExtensionProperties pProperties){
        if(PFN_vkEnumerateDeviceExtensionProperties_f == null) PFN_vkEnumerateDeviceExtensionProperties_f = new PFNvkEnumerateDeviceExtensionProperties(instance);
        int result = PFN_vkEnumerateDeviceExtensionProperties_f.call(physicalDevice, pLayerName, pPropertyCount, pProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkEnumerateInstanceLayerProperties(VkUInt32 pPropertyCount, VkLayerProperties pProperties){
        if(PFN_vkEnumerateInstanceLayerProperties_f == null) PFN_vkEnumerateInstanceLayerProperties_f = new PFNvkEnumerateInstanceLayerProperties(instance);
        return PFN_vkEnumerateInstanceLayerProperties_f.call(pPropertyCount, pProperties);
    }


    public void vkEnumerateInstanceLayerPropertiesP(VkUInt32 pPropertyCount, VkLayerProperties pProperties){
        if(PFN_vkEnumerateInstanceLayerProperties_f == null) PFN_vkEnumerateInstanceLayerProperties_f = new PFNvkEnumerateInstanceLayerProperties(instance);
        int result = PFN_vkEnumerateInstanceLayerProperties_f.call(pPropertyCount, pProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkLayerProperties pProperties){
        if(PFN_vkEnumerateDeviceLayerProperties_f == null) PFN_vkEnumerateDeviceLayerProperties_f = new PFNvkEnumerateDeviceLayerProperties(instance);
        return PFN_vkEnumerateDeviceLayerProperties_f.call(physicalDevice, pPropertyCount, pProperties);
    }


    public void vkEnumerateDeviceLayerPropertiesP(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkLayerProperties pProperties){
        if(PFN_vkEnumerateDeviceLayerProperties_f == null) PFN_vkEnumerateDeviceLayerProperties_f = new PFNvkEnumerateDeviceLayerProperties(instance);
        int result = PFN_vkEnumerateDeviceLayerProperties_f.call(physicalDevice, pPropertyCount, pProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkGetDeviceQueue(VkDevice device, int queueFamilyIndex, int queueIndex, VkQueue pQueue){
        if(PFN_vkGetDeviceQueue_f == null) PFN_vkGetDeviceQueue_f = new PFNvkGetDeviceQueue(instance);
        PFN_vkGetDeviceQueue_f.call(device, queueFamilyIndex, queueIndex, pQueue);
    }


    public int vkQueueSubmit(VkQueue queue, int submitCount, VkSubmitInfo pSubmits, VkFence fence){
        if(PFN_vkQueueSubmit_f == null) PFN_vkQueueSubmit_f = new PFNvkQueueSubmit(instance);
        return PFN_vkQueueSubmit_f.call(queue, submitCount, pSubmits, fence);
    }


    public void vkQueueSubmitP(VkQueue queue, int submitCount, VkSubmitInfo pSubmits, VkFence fence){
        if(PFN_vkQueueSubmit_f == null) PFN_vkQueueSubmit_f = new PFNvkQueueSubmit(instance);
        int result = PFN_vkQueueSubmit_f.call(queue, submitCount, pSubmits, fence);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkQueueWaitIdle(VkQueue queue){
        if(PFN_vkQueueWaitIdle_f == null) PFN_vkQueueWaitIdle_f = new PFNvkQueueWaitIdle(instance);
        return PFN_vkQueueWaitIdle_f.call(queue);
    }


    public void vkQueueWaitIdleP(VkQueue queue){
        if(PFN_vkQueueWaitIdle_f == null) PFN_vkQueueWaitIdle_f = new PFNvkQueueWaitIdle(instance);
        int result = PFN_vkQueueWaitIdle_f.call(queue);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkDeviceWaitIdle(VkDevice device){
        if(PFN_vkDeviceWaitIdle_f == null) PFN_vkDeviceWaitIdle_f = new PFNvkDeviceWaitIdle(instance);
        return PFN_vkDeviceWaitIdle_f.call(device);
    }


    public void vkDeviceWaitIdleP(VkDevice device){
        if(PFN_vkDeviceWaitIdle_f == null) PFN_vkDeviceWaitIdle_f = new PFNvkDeviceWaitIdle(instance);
        int result = PFN_vkDeviceWaitIdle_f.call(device);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkAllocateMemory(VkDevice device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, VkDeviceMemory pMemory){
        if(PFN_vkAllocateMemory_f == null) PFN_vkAllocateMemory_f = new PFNvkAllocateMemory(instance);
        return PFN_vkAllocateMemory_f.call(device, pAllocateInfo, pAllocator, pMemory);
    }


    public void vkAllocateMemoryP(VkDevice device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, VkDeviceMemory pMemory){
        if(PFN_vkAllocateMemory_f == null) PFN_vkAllocateMemory_f = new PFNvkAllocateMemory(instance);
        int result = PFN_vkAllocateMemory_f.call(device, pAllocateInfo, pAllocator, pMemory);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkFreeMemory(VkDevice device, VkDeviceMemory memory, VkAllocationCallbacks pAllocator){
        if(PFN_vkFreeMemory_f == null) PFN_vkFreeMemory_f = new PFNvkFreeMemory(instance);
        PFN_vkFreeMemory_f.call(device, memory, pAllocator);
    }


    public int vkMapMemory(VkDevice device, VkDeviceMemory memory, long offset, long size, int flags, VkObject ppData){
        if(PFN_vkMapMemory_f == null) PFN_vkMapMemory_f = new PFNvkMapMemory(instance);
        return PFN_vkMapMemory_f.call(device, memory, offset, size, flags, ppData);
    }


    public void vkMapMemoryP(VkDevice device, VkDeviceMemory memory, long offset, long size, int flags, VkObject ppData){
        if(PFN_vkMapMemory_f == null) PFN_vkMapMemory_f = new PFNvkMapMemory(instance);
        int result = PFN_vkMapMemory_f.call(device, memory, offset, size, flags, ppData);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkUnmapMemory(VkDevice device, VkDeviceMemory memory){
        if(PFN_vkUnmapMemory_f == null) PFN_vkUnmapMemory_f = new PFNvkUnmapMemory(instance);
        PFN_vkUnmapMemory_f.call(device, memory);
    }


    public int vkFlushMappedMemoryRanges(VkDevice device, int memoryRangeCount, VkMappedMemoryRange pMemoryRanges){
        if(PFN_vkFlushMappedMemoryRanges_f == null) PFN_vkFlushMappedMemoryRanges_f = new PFNvkFlushMappedMemoryRanges(instance);
        return PFN_vkFlushMappedMemoryRanges_f.call(device, memoryRangeCount, pMemoryRanges);
    }


    public void vkFlushMappedMemoryRangesP(VkDevice device, int memoryRangeCount, VkMappedMemoryRange pMemoryRanges){
        if(PFN_vkFlushMappedMemoryRanges_f == null) PFN_vkFlushMappedMemoryRanges_f = new PFNvkFlushMappedMemoryRanges(instance);
        int result = PFN_vkFlushMappedMemoryRanges_f.call(device, memoryRangeCount, pMemoryRanges);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkInvalidateMappedMemoryRanges(VkDevice device, int memoryRangeCount, VkMappedMemoryRange pMemoryRanges){
        if(PFN_vkInvalidateMappedMemoryRanges_f == null) PFN_vkInvalidateMappedMemoryRanges_f = new PFNvkInvalidateMappedMemoryRanges(instance);
        return PFN_vkInvalidateMappedMemoryRanges_f.call(device, memoryRangeCount, pMemoryRanges);
    }


    public void vkInvalidateMappedMemoryRangesP(VkDevice device, int memoryRangeCount, VkMappedMemoryRange pMemoryRanges){
        if(PFN_vkInvalidateMappedMemoryRanges_f == null) PFN_vkInvalidateMappedMemoryRanges_f = new PFNvkInvalidateMappedMemoryRanges(instance);
        int result = PFN_vkInvalidateMappedMemoryRanges_f.call(device, memoryRangeCount, pMemoryRanges);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkGetDeviceMemoryCommitment(VkDevice device, VkDeviceMemory memory, VkDeviceSize pCommittedMemoryInBytes){
        if(PFN_vkGetDeviceMemoryCommitment_f == null) PFN_vkGetDeviceMemoryCommitment_f = new PFNvkGetDeviceMemoryCommitment(instance);
        PFN_vkGetDeviceMemoryCommitment_f.call(device, memory, pCommittedMemoryInBytes);
    }


    public int vkBindBufferMemory(VkDevice device, VkBuffer buffer, VkDeviceMemory memory, long memoryOffset){
        if(PFN_vkBindBufferMemory_f == null) PFN_vkBindBufferMemory_f = new PFNvkBindBufferMemory(instance);
        return PFN_vkBindBufferMemory_f.call(device, buffer, memory, memoryOffset);
    }


    public void vkBindBufferMemoryP(VkDevice device, VkBuffer buffer, VkDeviceMemory memory, long memoryOffset){
        if(PFN_vkBindBufferMemory_f == null) PFN_vkBindBufferMemory_f = new PFNvkBindBufferMemory(instance);
        int result = PFN_vkBindBufferMemory_f.call(device, buffer, memory, memoryOffset);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkBindImageMemory(VkDevice device, VkImage image, VkDeviceMemory memory, long memoryOffset){
        if(PFN_vkBindImageMemory_f == null) PFN_vkBindImageMemory_f = new PFNvkBindImageMemory(instance);
        return PFN_vkBindImageMemory_f.call(device, image, memory, memoryOffset);
    }


    public void vkBindImageMemoryP(VkDevice device, VkImage image, VkDeviceMemory memory, long memoryOffset){
        if(PFN_vkBindImageMemory_f == null) PFN_vkBindImageMemory_f = new PFNvkBindImageMemory(instance);
        int result = PFN_vkBindImageMemory_f.call(device, image, memory, memoryOffset);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkGetBufferMemoryRequirements(VkDevice device, VkBuffer buffer, VkMemoryRequirements pMemoryRequirements){
        if(PFN_vkGetBufferMemoryRequirements_f == null) PFN_vkGetBufferMemoryRequirements_f = new PFNvkGetBufferMemoryRequirements(instance);
        PFN_vkGetBufferMemoryRequirements_f.call(device, buffer, pMemoryRequirements);
    }


    public void vkGetImageMemoryRequirements(VkDevice device, VkImage image, VkMemoryRequirements pMemoryRequirements){
        if(PFN_vkGetImageMemoryRequirements_f == null) PFN_vkGetImageMemoryRequirements_f = new PFNvkGetImageMemoryRequirements(instance);
        PFN_vkGetImageMemoryRequirements_f.call(device, image, pMemoryRequirements);
    }


    public void vkGetImageSparseMemoryRequirements(VkDevice device, VkImage image, VkUInt32 pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements pSparseMemoryRequirements){
        if(PFN_vkGetImageSparseMemoryRequirements_f == null) PFN_vkGetImageSparseMemoryRequirements_f = new PFNvkGetImageSparseMemoryRequirements(instance);
        PFN_vkGetImageSparseMemoryRequirements_f.call(device, image, pSparseMemoryRequirementCount, pSparseMemoryRequirements);
    }


    public void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, VkUInt32 pPropertyCount, VkSparseImageFormatProperties pProperties){
        if(PFN_vkGetPhysicalDeviceSparseImageFormatProperties_f == null) PFN_vkGetPhysicalDeviceSparseImageFormatProperties_f = new PFNvkGetPhysicalDeviceSparseImageFormatProperties(instance);
        PFN_vkGetPhysicalDeviceSparseImageFormatProperties_f.call(physicalDevice, format, type, samples, usage, tiling, pPropertyCount, pProperties);
    }


    public int vkQueueBindSparse(VkQueue queue, int bindInfoCount, VkBindSparseInfo pBindInfo, VkFence fence){
        if(PFN_vkQueueBindSparse_f == null) PFN_vkQueueBindSparse_f = new PFNvkQueueBindSparse(instance);
        return PFN_vkQueueBindSparse_f.call(queue, bindInfoCount, pBindInfo, fence);
    }


    public void vkQueueBindSparseP(VkQueue queue, int bindInfoCount, VkBindSparseInfo pBindInfo, VkFence fence){
        if(PFN_vkQueueBindSparse_f == null) PFN_vkQueueBindSparse_f = new PFNvkQueueBindSparse(instance);
        int result = PFN_vkQueueBindSparse_f.call(queue, bindInfoCount, pBindInfo, fence);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkCreateFence(VkDevice device, VkFenceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkFence pFence){
        if(PFN_vkCreateFence_f == null) PFN_vkCreateFence_f = new PFNvkCreateFence(instance);
        return PFN_vkCreateFence_f.call(device, pCreateInfo, pAllocator, pFence);
    }


    public void vkCreateFenceP(VkDevice device, VkFenceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkFence pFence){
        if(PFN_vkCreateFence_f == null) PFN_vkCreateFence_f = new PFNvkCreateFence(instance);
        int result = PFN_vkCreateFence_f.call(device, pCreateInfo, pAllocator, pFence);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyFence(VkDevice device, VkFence fence, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyFence_f == null) PFN_vkDestroyFence_f = new PFNvkDestroyFence(instance);
        PFN_vkDestroyFence_f.call(device, fence, pAllocator);
    }


    public int vkResetFences(VkDevice device, int fenceCount, VkFence pFences){
        if(PFN_vkResetFences_f == null) PFN_vkResetFences_f = new PFNvkResetFences(instance);
        return PFN_vkResetFences_f.call(device, fenceCount, pFences);
    }


    public void vkResetFencesP(VkDevice device, int fenceCount, VkFence pFences){
        if(PFN_vkResetFences_f == null) PFN_vkResetFences_f = new PFNvkResetFences(instance);
        int result = PFN_vkResetFences_f.call(device, fenceCount, pFences);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetFenceStatus(VkDevice device, VkFence fence){
        if(PFN_vkGetFenceStatus_f == null) PFN_vkGetFenceStatus_f = new PFNvkGetFenceStatus(instance);
        return PFN_vkGetFenceStatus_f.call(device, fence);
    }


    public int vkWaitForFences(VkDevice device, int fenceCount, VkFence pFences, int waitAll, long timeout){
        if(PFN_vkWaitForFences_f == null) PFN_vkWaitForFences_f = new PFNvkWaitForFences(instance);
        return PFN_vkWaitForFences_f.call(device, fenceCount, pFences, waitAll, timeout);
    }


    public void vkWaitForFencesP(VkDevice device, int fenceCount, VkFence pFences, int waitAll, long timeout){
        if(PFN_vkWaitForFences_f == null) PFN_vkWaitForFences_f = new PFNvkWaitForFences(instance);
        int result = PFN_vkWaitForFences_f.call(device, fenceCount, pFences, waitAll, timeout);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkCreateSemaphore(VkDevice device, VkSemaphoreCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSemaphore pSemaphore){
        if(PFN_vkCreateSemaphore_f == null) PFN_vkCreateSemaphore_f = new PFNvkCreateSemaphore(instance);
        return PFN_vkCreateSemaphore_f.call(device, pCreateInfo, pAllocator, pSemaphore);
    }


    public void vkCreateSemaphoreP(VkDevice device, VkSemaphoreCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSemaphore pSemaphore){
        if(PFN_vkCreateSemaphore_f == null) PFN_vkCreateSemaphore_f = new PFNvkCreateSemaphore(instance);
        int result = PFN_vkCreateSemaphore_f.call(device, pCreateInfo, pAllocator, pSemaphore);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroySemaphore(VkDevice device, VkSemaphore semaphore, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroySemaphore_f == null) PFN_vkDestroySemaphore_f = new PFNvkDestroySemaphore(instance);
        PFN_vkDestroySemaphore_f.call(device, semaphore, pAllocator);
    }


    public int vkCreateEvent(VkDevice device, VkEventCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkEvent pEvent){
        if(PFN_vkCreateEvent_f == null) PFN_vkCreateEvent_f = new PFNvkCreateEvent(instance);
        return PFN_vkCreateEvent_f.call(device, pCreateInfo, pAllocator, pEvent);
    }


    public void vkCreateEventP(VkDevice device, VkEventCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkEvent pEvent){
        if(PFN_vkCreateEvent_f == null) PFN_vkCreateEvent_f = new PFNvkCreateEvent(instance);
        int result = PFN_vkCreateEvent_f.call(device, pCreateInfo, pAllocator, pEvent);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyEvent(VkDevice device, VkEvent event, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyEvent_f == null) PFN_vkDestroyEvent_f = new PFNvkDestroyEvent(instance);
        PFN_vkDestroyEvent_f.call(device, event, pAllocator);
    }


    public int vkGetEventStatus(VkDevice device, VkEvent event){
        if(PFN_vkGetEventStatus_f == null) PFN_vkGetEventStatus_f = new PFNvkGetEventStatus(instance);
        return PFN_vkGetEventStatus_f.call(device, event);
    }


    public int vkSetEvent(VkDevice device, VkEvent event){
        if(PFN_vkSetEvent_f == null) PFN_vkSetEvent_f = new PFNvkSetEvent(instance);
        return PFN_vkSetEvent_f.call(device, event);
    }


    public void vkSetEventP(VkDevice device, VkEvent event){
        if(PFN_vkSetEvent_f == null) PFN_vkSetEvent_f = new PFNvkSetEvent(instance);
        int result = PFN_vkSetEvent_f.call(device, event);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkResetEvent(VkDevice device, VkEvent event){
        if(PFN_vkResetEvent_f == null) PFN_vkResetEvent_f = new PFNvkResetEvent(instance);
        return PFN_vkResetEvent_f.call(device, event);
    }


    public void vkResetEventP(VkDevice device, VkEvent event){
        if(PFN_vkResetEvent_f == null) PFN_vkResetEvent_f = new PFNvkResetEvent(instance);
        int result = PFN_vkResetEvent_f.call(device, event);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkCreateQueryPool(VkDevice device, VkQueryPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkQueryPool pQueryPool){
        if(PFN_vkCreateQueryPool_f == null) PFN_vkCreateQueryPool_f = new PFNvkCreateQueryPool(instance);
        return PFN_vkCreateQueryPool_f.call(device, pCreateInfo, pAllocator, pQueryPool);
    }


    public void vkCreateQueryPoolP(VkDevice device, VkQueryPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkQueryPool pQueryPool){
        if(PFN_vkCreateQueryPool_f == null) PFN_vkCreateQueryPool_f = new PFNvkCreateQueryPool(instance);
        int result = PFN_vkCreateQueryPool_f.call(device, pCreateInfo, pAllocator, pQueryPool);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyQueryPool(VkDevice device, VkQueryPool queryPool, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyQueryPool_f == null) PFN_vkDestroyQueryPool_f = new PFNvkDestroyQueryPool(instance);
        PFN_vkDestroyQueryPool_f.call(device, queryPool, pAllocator);
    }


    public int vkGetQueryPoolResults(VkDevice device, VkQueryPool queryPool, int firstQuery, int queryCount, long dataSize, VkObject pData, long stride, int flags){
        if(PFN_vkGetQueryPoolResults_f == null) PFN_vkGetQueryPoolResults_f = new PFNvkGetQueryPoolResults(instance);
        return PFN_vkGetQueryPoolResults_f.call(device, queryPool, firstQuery, queryCount, dataSize, pData, stride, flags);
    }


    public void vkGetQueryPoolResultsP(VkDevice device, VkQueryPool queryPool, int firstQuery, int queryCount, long dataSize, VkObject pData, long stride, int flags){
        if(PFN_vkGetQueryPoolResults_f == null) PFN_vkGetQueryPoolResults_f = new PFNvkGetQueryPoolResults(instance);
        int result = PFN_vkGetQueryPoolResults_f.call(device, queryPool, firstQuery, queryCount, dataSize, pData, stride, flags);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkCreateBuffer(VkDevice device, VkBufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkBuffer pBuffer){
        if(PFN_vkCreateBuffer_f == null) PFN_vkCreateBuffer_f = new PFNvkCreateBuffer(instance);
        return PFN_vkCreateBuffer_f.call(device, pCreateInfo, pAllocator, pBuffer);
    }


    public void vkCreateBufferP(VkDevice device, VkBufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkBuffer pBuffer){
        if(PFN_vkCreateBuffer_f == null) PFN_vkCreateBuffer_f = new PFNvkCreateBuffer(instance);
        int result = PFN_vkCreateBuffer_f.call(device, pCreateInfo, pAllocator, pBuffer);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyBuffer(VkDevice device, VkBuffer buffer, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyBuffer_f == null) PFN_vkDestroyBuffer_f = new PFNvkDestroyBuffer(instance);
        PFN_vkDestroyBuffer_f.call(device, buffer, pAllocator);
    }


    public int vkCreateBufferView(VkDevice device, VkBufferViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkBufferView pView){
        if(PFN_vkCreateBufferView_f == null) PFN_vkCreateBufferView_f = new PFNvkCreateBufferView(instance);
        return PFN_vkCreateBufferView_f.call(device, pCreateInfo, pAllocator, pView);
    }


    public void vkCreateBufferViewP(VkDevice device, VkBufferViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkBufferView pView){
        if(PFN_vkCreateBufferView_f == null) PFN_vkCreateBufferView_f = new PFNvkCreateBufferView(instance);
        int result = PFN_vkCreateBufferView_f.call(device, pCreateInfo, pAllocator, pView);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyBufferView(VkDevice device, VkBufferView bufferView, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyBufferView_f == null) PFN_vkDestroyBufferView_f = new PFNvkDestroyBufferView(instance);
        PFN_vkDestroyBufferView_f.call(device, bufferView, pAllocator);
    }


    public int vkCreateImage(VkDevice device, VkImageCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkImage pImage){
        if(PFN_vkCreateImage_f == null) PFN_vkCreateImage_f = new PFNvkCreateImage(instance);
        return PFN_vkCreateImage_f.call(device, pCreateInfo, pAllocator, pImage);
    }


    public void vkCreateImageP(VkDevice device, VkImageCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkImage pImage){
        if(PFN_vkCreateImage_f == null) PFN_vkCreateImage_f = new PFNvkCreateImage(instance);
        int result = PFN_vkCreateImage_f.call(device, pCreateInfo, pAllocator, pImage);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyImage(VkDevice device, VkImage image, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyImage_f == null) PFN_vkDestroyImage_f = new PFNvkDestroyImage(instance);
        PFN_vkDestroyImage_f.call(device, image, pAllocator);
    }


    public void vkGetImageSubresourceLayout(VkDevice device, VkImage image, VkImageSubresource pSubresource, VkSubresourceLayout pLayout){
        if(PFN_vkGetImageSubresourceLayout_f == null) PFN_vkGetImageSubresourceLayout_f = new PFNvkGetImageSubresourceLayout(instance);
        PFN_vkGetImageSubresourceLayout_f.call(device, image, pSubresource, pLayout);
    }


    public int vkCreateImageView(VkDevice device, VkImageViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkImageView pView){
        if(PFN_vkCreateImageView_f == null) PFN_vkCreateImageView_f = new PFNvkCreateImageView(instance);
        return PFN_vkCreateImageView_f.call(device, pCreateInfo, pAllocator, pView);
    }


    public void vkCreateImageViewP(VkDevice device, VkImageViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkImageView pView){
        if(PFN_vkCreateImageView_f == null) PFN_vkCreateImageView_f = new PFNvkCreateImageView(instance);
        int result = PFN_vkCreateImageView_f.call(device, pCreateInfo, pAllocator, pView);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyImageView(VkDevice device, VkImageView imageView, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyImageView_f == null) PFN_vkDestroyImageView_f = new PFNvkDestroyImageView(instance);
        PFN_vkDestroyImageView_f.call(device, imageView, pAllocator);
    }


    public int vkCreateShaderModule(VkDevice device, VkShaderModuleCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkShaderModule pShaderModule){
        if(PFN_vkCreateShaderModule_f == null) PFN_vkCreateShaderModule_f = new PFNvkCreateShaderModule(instance);
        return PFN_vkCreateShaderModule_f.call(device, pCreateInfo, pAllocator, pShaderModule);
    }


    public void vkCreateShaderModuleP(VkDevice device, VkShaderModuleCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkShaderModule pShaderModule){
        if(PFN_vkCreateShaderModule_f == null) PFN_vkCreateShaderModule_f = new PFNvkCreateShaderModule(instance);
        int result = PFN_vkCreateShaderModule_f.call(device, pCreateInfo, pAllocator, pShaderModule);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyShaderModule(VkDevice device, VkShaderModule shaderModule, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyShaderModule_f == null) PFN_vkDestroyShaderModule_f = new PFNvkDestroyShaderModule(instance);
        PFN_vkDestroyShaderModule_f.call(device, shaderModule, pAllocator);
    }


    public int vkCreatePipelineCache(VkDevice device, VkPipelineCacheCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkPipelineCache pPipelineCache){
        if(PFN_vkCreatePipelineCache_f == null) PFN_vkCreatePipelineCache_f = new PFNvkCreatePipelineCache(instance);
        return PFN_vkCreatePipelineCache_f.call(device, pCreateInfo, pAllocator, pPipelineCache);
    }


    public void vkCreatePipelineCacheP(VkDevice device, VkPipelineCacheCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkPipelineCache pPipelineCache){
        if(PFN_vkCreatePipelineCache_f == null) PFN_vkCreatePipelineCache_f = new PFNvkCreatePipelineCache(instance);
        int result = PFN_vkCreatePipelineCache_f.call(device, pCreateInfo, pAllocator, pPipelineCache);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyPipelineCache(VkDevice device, VkPipelineCache pipelineCache, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyPipelineCache_f == null) PFN_vkDestroyPipelineCache_f = new PFNvkDestroyPipelineCache(instance);
        PFN_vkDestroyPipelineCache_f.call(device, pipelineCache, pAllocator);
    }


    public int vkGetPipelineCacheData(VkDevice device, VkPipelineCache pipelineCache, VkSize pDataSize, VkObject pData){
        if(PFN_vkGetPipelineCacheData_f == null) PFN_vkGetPipelineCacheData_f = new PFNvkGetPipelineCacheData(instance);
        return PFN_vkGetPipelineCacheData_f.call(device, pipelineCache, pDataSize, pData);
    }


    public void vkGetPipelineCacheDataP(VkDevice device, VkPipelineCache pipelineCache, VkSize pDataSize, VkObject pData){
        if(PFN_vkGetPipelineCacheData_f == null) PFN_vkGetPipelineCacheData_f = new PFNvkGetPipelineCacheData(instance);
        int result = PFN_vkGetPipelineCacheData_f.call(device, pipelineCache, pDataSize, pData);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkMergePipelineCaches(VkDevice device, VkPipelineCache dstCache, int srcCacheCount, VkPipelineCache pSrcCaches){
        if(PFN_vkMergePipelineCaches_f == null) PFN_vkMergePipelineCaches_f = new PFNvkMergePipelineCaches(instance);
        return PFN_vkMergePipelineCaches_f.call(device, dstCache, srcCacheCount, pSrcCaches);
    }


    public void vkMergePipelineCachesP(VkDevice device, VkPipelineCache dstCache, int srcCacheCount, VkPipelineCache pSrcCaches){
        if(PFN_vkMergePipelineCaches_f == null) PFN_vkMergePipelineCaches_f = new PFNvkMergePipelineCaches(instance);
        int result = PFN_vkMergePipelineCaches_f.call(device, dstCache, srcCacheCount, pSrcCaches);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkCreateGraphicsPipelines(VkDevice device, VkPipelineCache pipelineCache, int createInfoCount, VkGraphicsPipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, VkPipeline pPipelines){
        if(PFN_vkCreateGraphicsPipelines_f == null) PFN_vkCreateGraphicsPipelines_f = new PFNvkCreateGraphicsPipelines(instance);
        return PFN_vkCreateGraphicsPipelines_f.call(device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);
    }


    public void vkCreateGraphicsPipelinesP(VkDevice device, VkPipelineCache pipelineCache, int createInfoCount, VkGraphicsPipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, VkPipeline pPipelines){
        if(PFN_vkCreateGraphicsPipelines_f == null) PFN_vkCreateGraphicsPipelines_f = new PFNvkCreateGraphicsPipelines(instance);
        int result = PFN_vkCreateGraphicsPipelines_f.call(device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkCreateComputePipelines(VkDevice device, VkPipelineCache pipelineCache, int createInfoCount, VkComputePipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, VkPipeline pPipelines){
        if(PFN_vkCreateComputePipelines_f == null) PFN_vkCreateComputePipelines_f = new PFNvkCreateComputePipelines(instance);
        return PFN_vkCreateComputePipelines_f.call(device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);
    }


    public void vkCreateComputePipelinesP(VkDevice device, VkPipelineCache pipelineCache, int createInfoCount, VkComputePipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, VkPipeline pPipelines){
        if(PFN_vkCreateComputePipelines_f == null) PFN_vkCreateComputePipelines_f = new PFNvkCreateComputePipelines(instance);
        int result = PFN_vkCreateComputePipelines_f.call(device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyPipeline(VkDevice device, VkPipeline pipeline, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyPipeline_f == null) PFN_vkDestroyPipeline_f = new PFNvkDestroyPipeline(instance);
        PFN_vkDestroyPipeline_f.call(device, pipeline, pAllocator);
    }


    public int vkCreatePipelineLayout(VkDevice device, VkPipelineLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkPipelineLayout pPipelineLayout){
        if(PFN_vkCreatePipelineLayout_f == null) PFN_vkCreatePipelineLayout_f = new PFNvkCreatePipelineLayout(instance);
        return PFN_vkCreatePipelineLayout_f.call(device, pCreateInfo, pAllocator, pPipelineLayout);
    }


    public void vkCreatePipelineLayoutP(VkDevice device, VkPipelineLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkPipelineLayout pPipelineLayout){
        if(PFN_vkCreatePipelineLayout_f == null) PFN_vkCreatePipelineLayout_f = new PFNvkCreatePipelineLayout(instance);
        int result = PFN_vkCreatePipelineLayout_f.call(device, pCreateInfo, pAllocator, pPipelineLayout);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyPipelineLayout(VkDevice device, VkPipelineLayout pipelineLayout, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyPipelineLayout_f == null) PFN_vkDestroyPipelineLayout_f = new PFNvkDestroyPipelineLayout(instance);
        PFN_vkDestroyPipelineLayout_f.call(device, pipelineLayout, pAllocator);
    }


    public int vkCreateSampler(VkDevice device, VkSamplerCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSampler pSampler){
        if(PFN_vkCreateSampler_f == null) PFN_vkCreateSampler_f = new PFNvkCreateSampler(instance);
        return PFN_vkCreateSampler_f.call(device, pCreateInfo, pAllocator, pSampler);
    }


    public void vkCreateSamplerP(VkDevice device, VkSamplerCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSampler pSampler){
        if(PFN_vkCreateSampler_f == null) PFN_vkCreateSampler_f = new PFNvkCreateSampler(instance);
        int result = PFN_vkCreateSampler_f.call(device, pCreateInfo, pAllocator, pSampler);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroySampler(VkDevice device, VkSampler sampler, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroySampler_f == null) PFN_vkDestroySampler_f = new PFNvkDestroySampler(instance);
        PFN_vkDestroySampler_f.call(device, sampler, pAllocator);
    }


    public int vkCreateDescriptorSetLayout(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorSetLayout pSetLayout){
        if(PFN_vkCreateDescriptorSetLayout_f == null) PFN_vkCreateDescriptorSetLayout_f = new PFNvkCreateDescriptorSetLayout(instance);
        return PFN_vkCreateDescriptorSetLayout_f.call(device, pCreateInfo, pAllocator, pSetLayout);
    }


    public void vkCreateDescriptorSetLayoutP(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorSetLayout pSetLayout){
        if(PFN_vkCreateDescriptorSetLayout_f == null) PFN_vkCreateDescriptorSetLayout_f = new PFNvkCreateDescriptorSetLayout(instance);
        int result = PFN_vkCreateDescriptorSetLayout_f.call(device, pCreateInfo, pAllocator, pSetLayout);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyDescriptorSetLayout(VkDevice device, VkDescriptorSetLayout descriptorSetLayout, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyDescriptorSetLayout_f == null) PFN_vkDestroyDescriptorSetLayout_f = new PFNvkDestroyDescriptorSetLayout(instance);
        PFN_vkDestroyDescriptorSetLayout_f.call(device, descriptorSetLayout, pAllocator);
    }


    public int vkCreateDescriptorPool(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorPool pDescriptorPool){
        if(PFN_vkCreateDescriptorPool_f == null) PFN_vkCreateDescriptorPool_f = new PFNvkCreateDescriptorPool(instance);
        return PFN_vkCreateDescriptorPool_f.call(device, pCreateInfo, pAllocator, pDescriptorPool);
    }


    public void vkCreateDescriptorPoolP(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorPool pDescriptorPool){
        if(PFN_vkCreateDescriptorPool_f == null) PFN_vkCreateDescriptorPool_f = new PFNvkCreateDescriptorPool(instance);
        int result = PFN_vkCreateDescriptorPool_f.call(device, pCreateInfo, pAllocator, pDescriptorPool);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyDescriptorPool(VkDevice device, VkDescriptorPool descriptorPool, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyDescriptorPool_f == null) PFN_vkDestroyDescriptorPool_f = new PFNvkDestroyDescriptorPool(instance);
        PFN_vkDestroyDescriptorPool_f.call(device, descriptorPool, pAllocator);
    }


    public int vkResetDescriptorPool(VkDevice device, VkDescriptorPool descriptorPool, int flags){
        if(PFN_vkResetDescriptorPool_f == null) PFN_vkResetDescriptorPool_f = new PFNvkResetDescriptorPool(instance);
        return PFN_vkResetDescriptorPool_f.call(device, descriptorPool, flags);
    }


    public void vkResetDescriptorPoolP(VkDevice device, VkDescriptorPool descriptorPool, int flags){
        if(PFN_vkResetDescriptorPool_f == null) PFN_vkResetDescriptorPool_f = new PFNvkResetDescriptorPool(instance);
        int result = PFN_vkResetDescriptorPool_f.call(device, descriptorPool, flags);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkAllocateDescriptorSets(VkDevice device, VkDescriptorSetAllocateInfo pAllocateInfo, VkDescriptorSet pDescriptorSets){
        if(PFN_vkAllocateDescriptorSets_f == null) PFN_vkAllocateDescriptorSets_f = new PFNvkAllocateDescriptorSets(instance);
        return PFN_vkAllocateDescriptorSets_f.call(device, pAllocateInfo, pDescriptorSets);
    }


    public void vkAllocateDescriptorSetsP(VkDevice device, VkDescriptorSetAllocateInfo pAllocateInfo, VkDescriptorSet pDescriptorSets){
        if(PFN_vkAllocateDescriptorSets_f == null) PFN_vkAllocateDescriptorSets_f = new PFNvkAllocateDescriptorSets(instance);
        int result = PFN_vkAllocateDescriptorSets_f.call(device, pAllocateInfo, pDescriptorSets);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkFreeDescriptorSets(VkDevice device, VkDescriptorPool descriptorPool, int descriptorSetCount, VkDescriptorSet pDescriptorSets){
        if(PFN_vkFreeDescriptorSets_f == null) PFN_vkFreeDescriptorSets_f = new PFNvkFreeDescriptorSets(instance);
        return PFN_vkFreeDescriptorSets_f.call(device, descriptorPool, descriptorSetCount, pDescriptorSets);
    }


    public void vkFreeDescriptorSetsP(VkDevice device, VkDescriptorPool descriptorPool, int descriptorSetCount, VkDescriptorSet pDescriptorSets){
        if(PFN_vkFreeDescriptorSets_f == null) PFN_vkFreeDescriptorSets_f = new PFNvkFreeDescriptorSets(instance);
        int result = PFN_vkFreeDescriptorSets_f.call(device, descriptorPool, descriptorSetCount, pDescriptorSets);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkUpdateDescriptorSets(VkDevice device, int descriptorWriteCount, VkWriteDescriptorSet pDescriptorWrites, int descriptorCopyCount, VkCopyDescriptorSet pDescriptorCopies){
        if(PFN_vkUpdateDescriptorSets_f == null) PFN_vkUpdateDescriptorSets_f = new PFNvkUpdateDescriptorSets(instance);
        PFN_vkUpdateDescriptorSets_f.call(device, descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies);
    }


    public int vkCreateFramebuffer(VkDevice device, VkFramebufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkFramebuffer pFramebuffer){
        if(PFN_vkCreateFramebuffer_f == null) PFN_vkCreateFramebuffer_f = new PFNvkCreateFramebuffer(instance);
        return PFN_vkCreateFramebuffer_f.call(device, pCreateInfo, pAllocator, pFramebuffer);
    }


    public void vkCreateFramebufferP(VkDevice device, VkFramebufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkFramebuffer pFramebuffer){
        if(PFN_vkCreateFramebuffer_f == null) PFN_vkCreateFramebuffer_f = new PFNvkCreateFramebuffer(instance);
        int result = PFN_vkCreateFramebuffer_f.call(device, pCreateInfo, pAllocator, pFramebuffer);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyFramebuffer(VkDevice device, VkFramebuffer framebuffer, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyFramebuffer_f == null) PFN_vkDestroyFramebuffer_f = new PFNvkDestroyFramebuffer(instance);
        PFN_vkDestroyFramebuffer_f.call(device, framebuffer, pAllocator);
    }


    public int vkCreateRenderPass(VkDevice device, VkRenderPassCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkRenderPass pRenderPass){
        if(PFN_vkCreateRenderPass_f == null) PFN_vkCreateRenderPass_f = new PFNvkCreateRenderPass(instance);
        return PFN_vkCreateRenderPass_f.call(device, pCreateInfo, pAllocator, pRenderPass);
    }


    public void vkCreateRenderPassP(VkDevice device, VkRenderPassCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkRenderPass pRenderPass){
        if(PFN_vkCreateRenderPass_f == null) PFN_vkCreateRenderPass_f = new PFNvkCreateRenderPass(instance);
        int result = PFN_vkCreateRenderPass_f.call(device, pCreateInfo, pAllocator, pRenderPass);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyRenderPass(VkDevice device, VkRenderPass renderPass, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyRenderPass_f == null) PFN_vkDestroyRenderPass_f = new PFNvkDestroyRenderPass(instance);
        PFN_vkDestroyRenderPass_f.call(device, renderPass, pAllocator);
    }


    public void vkGetRenderAreaGranularity(VkDevice device, VkRenderPass renderPass, VkExtent2D pGranularity){
        if(PFN_vkGetRenderAreaGranularity_f == null) PFN_vkGetRenderAreaGranularity_f = new PFNvkGetRenderAreaGranularity(instance);
        PFN_vkGetRenderAreaGranularity_f.call(device, renderPass, pGranularity);
    }


    public int vkCreateCommandPool(VkDevice device, VkCommandPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkCommandPool pCommandPool){
        if(PFN_vkCreateCommandPool_f == null) PFN_vkCreateCommandPool_f = new PFNvkCreateCommandPool(instance);
        return PFN_vkCreateCommandPool_f.call(device, pCreateInfo, pAllocator, pCommandPool);
    }


    public void vkCreateCommandPoolP(VkDevice device, VkCommandPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkCommandPool pCommandPool){
        if(PFN_vkCreateCommandPool_f == null) PFN_vkCreateCommandPool_f = new PFNvkCreateCommandPool(instance);
        int result = PFN_vkCreateCommandPool_f.call(device, pCreateInfo, pAllocator, pCommandPool);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyCommandPool(VkDevice device, VkCommandPool commandPool, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyCommandPool_f == null) PFN_vkDestroyCommandPool_f = new PFNvkDestroyCommandPool(instance);
        PFN_vkDestroyCommandPool_f.call(device, commandPool, pAllocator);
    }


    public int vkResetCommandPool(VkDevice device, VkCommandPool commandPool, int flags){
        if(PFN_vkResetCommandPool_f == null) PFN_vkResetCommandPool_f = new PFNvkResetCommandPool(instance);
        return PFN_vkResetCommandPool_f.call(device, commandPool, flags);
    }


    public void vkResetCommandPoolP(VkDevice device, VkCommandPool commandPool, int flags){
        if(PFN_vkResetCommandPool_f == null) PFN_vkResetCommandPool_f = new PFNvkResetCommandPool(instance);
        int result = PFN_vkResetCommandPool_f.call(device, commandPool, flags);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkAllocateCommandBuffers(VkDevice device, VkCommandBufferAllocateInfo pAllocateInfo, VkCommandBuffer pCommandBuffers){
        if(PFN_vkAllocateCommandBuffers_f == null) PFN_vkAllocateCommandBuffers_f = new PFNvkAllocateCommandBuffers(instance);
        return PFN_vkAllocateCommandBuffers_f.call(device, pAllocateInfo, pCommandBuffers);
    }


    public void vkAllocateCommandBuffersP(VkDevice device, VkCommandBufferAllocateInfo pAllocateInfo, VkCommandBuffer pCommandBuffers){
        if(PFN_vkAllocateCommandBuffers_f == null) PFN_vkAllocateCommandBuffers_f = new PFNvkAllocateCommandBuffers(instance);
        int result = PFN_vkAllocateCommandBuffers_f.call(device, pAllocateInfo, pCommandBuffers);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkFreeCommandBuffers(VkDevice device, VkCommandPool commandPool, int commandBufferCount, VkCommandBuffer pCommandBuffers){
        if(PFN_vkFreeCommandBuffers_f == null) PFN_vkFreeCommandBuffers_f = new PFNvkFreeCommandBuffers(instance);
        PFN_vkFreeCommandBuffers_f.call(device, commandPool, commandBufferCount, pCommandBuffers);
    }


    public int vkBeginCommandBuffer(VkCommandBuffer commandBuffer, VkCommandBufferBeginInfo pBeginInfo){
        if(PFN_vkBeginCommandBuffer_f == null) PFN_vkBeginCommandBuffer_f = new PFNvkBeginCommandBuffer(instance);
        return PFN_vkBeginCommandBuffer_f.call(commandBuffer, pBeginInfo);
    }


    public void vkBeginCommandBufferP(VkCommandBuffer commandBuffer, VkCommandBufferBeginInfo pBeginInfo){
        if(PFN_vkBeginCommandBuffer_f == null) PFN_vkBeginCommandBuffer_f = new PFNvkBeginCommandBuffer(instance);
        int result = PFN_vkBeginCommandBuffer_f.call(commandBuffer, pBeginInfo);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkEndCommandBuffer(VkCommandBuffer commandBuffer){
        if(PFN_vkEndCommandBuffer_f == null) PFN_vkEndCommandBuffer_f = new PFNvkEndCommandBuffer(instance);
        return PFN_vkEndCommandBuffer_f.call(commandBuffer);
    }


    public void vkEndCommandBufferP(VkCommandBuffer commandBuffer){
        if(PFN_vkEndCommandBuffer_f == null) PFN_vkEndCommandBuffer_f = new PFNvkEndCommandBuffer(instance);
        int result = PFN_vkEndCommandBuffer_f.call(commandBuffer);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkResetCommandBuffer(VkCommandBuffer commandBuffer, int flags){
        if(PFN_vkResetCommandBuffer_f == null) PFN_vkResetCommandBuffer_f = new PFNvkResetCommandBuffer(instance);
        return PFN_vkResetCommandBuffer_f.call(commandBuffer, flags);
    }


    public void vkResetCommandBufferP(VkCommandBuffer commandBuffer, int flags){
        if(PFN_vkResetCommandBuffer_f == null) PFN_vkResetCommandBuffer_f = new PFNvkResetCommandBuffer(instance);
        int result = PFN_vkResetCommandBuffer_f.call(commandBuffer, flags);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkCmdBindPipeline(VkCommandBuffer commandBuffer, int pipelineBindPoint, VkPipeline pipeline){
        if(PFN_vkCmdBindPipeline_f == null) PFN_vkCmdBindPipeline_f = new PFNvkCmdBindPipeline(instance);
        PFN_vkCmdBindPipeline_f.call(commandBuffer, pipelineBindPoint, pipeline);
    }


    public void vkCmdSetViewport(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, VkViewport pViewports){
        if(PFN_vkCmdSetViewport_f == null) PFN_vkCmdSetViewport_f = new PFNvkCmdSetViewport(instance);
        PFN_vkCmdSetViewport_f.call(commandBuffer, firstViewport, viewportCount, pViewports);
    }


    public void vkCmdSetScissor(VkCommandBuffer commandBuffer, int firstScissor, int scissorCount, VkRect2D pScissors){
        if(PFN_vkCmdSetScissor_f == null) PFN_vkCmdSetScissor_f = new PFNvkCmdSetScissor(instance);
        PFN_vkCmdSetScissor_f.call(commandBuffer, firstScissor, scissorCount, pScissors);
    }


    public void vkCmdSetLineWidth(VkCommandBuffer commandBuffer, float lineWidth){
        if(PFN_vkCmdSetLineWidth_f == null) PFN_vkCmdSetLineWidth_f = new PFNvkCmdSetLineWidth(instance);
        PFN_vkCmdSetLineWidth_f.call(commandBuffer, lineWidth);
    }


    public void vkCmdSetDepthBias(VkCommandBuffer commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor){
        if(PFN_vkCmdSetDepthBias_f == null) PFN_vkCmdSetDepthBias_f = new PFNvkCmdSetDepthBias(instance);
        PFN_vkCmdSetDepthBias_f.call(commandBuffer, depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor);
    }


    public void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, VkFloat blendConstants){
        if(PFN_vkCmdSetBlendConstants_f == null) PFN_vkCmdSetBlendConstants_f = new PFNvkCmdSetBlendConstants(instance);
        PFN_vkCmdSetBlendConstants_f.call(commandBuffer, blendConstants);
    }


    public void vkCmdSetDepthBounds(VkCommandBuffer commandBuffer, float minDepthBounds, float maxDepthBounds){
        if(PFN_vkCmdSetDepthBounds_f == null) PFN_vkCmdSetDepthBounds_f = new PFNvkCmdSetDepthBounds(instance);
        PFN_vkCmdSetDepthBounds_f.call(commandBuffer, minDepthBounds, maxDepthBounds);
    }


    public void vkCmdSetStencilCompareMask(VkCommandBuffer commandBuffer, int faceMask, int compareMask){
        if(PFN_vkCmdSetStencilCompareMask_f == null) PFN_vkCmdSetStencilCompareMask_f = new PFNvkCmdSetStencilCompareMask(instance);
        PFN_vkCmdSetStencilCompareMask_f.call(commandBuffer, faceMask, compareMask);
    }


    public void vkCmdSetStencilWriteMask(VkCommandBuffer commandBuffer, int faceMask, int writeMask){
        if(PFN_vkCmdSetStencilWriteMask_f == null) PFN_vkCmdSetStencilWriteMask_f = new PFNvkCmdSetStencilWriteMask(instance);
        PFN_vkCmdSetStencilWriteMask_f.call(commandBuffer, faceMask, writeMask);
    }


    public void vkCmdSetStencilReference(VkCommandBuffer commandBuffer, int faceMask, int reference){
        if(PFN_vkCmdSetStencilReference_f == null) PFN_vkCmdSetStencilReference_f = new PFNvkCmdSetStencilReference(instance);
        PFN_vkCmdSetStencilReference_f.call(commandBuffer, faceMask, reference);
    }


    public void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, int pipelineBindPoint, VkPipelineLayout layout, int firstSet, int descriptorSetCount, VkDescriptorSet pDescriptorSets, int dynamicOffsetCount, VkUInt32 pDynamicOffsets){
        if(PFN_vkCmdBindDescriptorSets_f == null) PFN_vkCmdBindDescriptorSets_f = new PFNvkCmdBindDescriptorSets(instance);
        PFN_vkCmdBindDescriptorSets_f.call(commandBuffer, pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets);
    }


    public void vkCmdBindIndexBuffer(VkCommandBuffer commandBuffer, VkBuffer buffer, long offset, int indexType){
        if(PFN_vkCmdBindIndexBuffer_f == null) PFN_vkCmdBindIndexBuffer_f = new PFNvkCmdBindIndexBuffer(instance);
        PFN_vkCmdBindIndexBuffer_f.call(commandBuffer, buffer, offset, indexType);
    }


    public void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, VkBuffer pBuffers, VkDeviceSize pOffsets){
        if(PFN_vkCmdBindVertexBuffers_f == null) PFN_vkCmdBindVertexBuffers_f = new PFNvkCmdBindVertexBuffers(instance);
        PFN_vkCmdBindVertexBuffers_f.call(commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets);
    }


    public void vkCmdDraw(VkCommandBuffer commandBuffer, int vertexCount, int instanceCount, int firstVertex, int firstInstance){
        if(PFN_vkCmdDraw_f == null) PFN_vkCmdDraw_f = new PFNvkCmdDraw(instance);
        PFN_vkCmdDraw_f.call(commandBuffer, vertexCount, instanceCount, firstVertex, firstInstance);
    }


    public void vkCmdDrawIndexed(VkCommandBuffer commandBuffer, int indexCount, int instanceCount, int firstIndex, int vertexOffset, int firstInstance){
        if(PFN_vkCmdDrawIndexed_f == null) PFN_vkCmdDrawIndexed_f = new PFNvkCmdDrawIndexed(instance);
        PFN_vkCmdDrawIndexed_f.call(commandBuffer, indexCount, instanceCount, firstIndex, vertexOffset, firstInstance);
    }


    public void vkCmdDrawIndirect(VkCommandBuffer commandBuffer, VkBuffer buffer, long offset, int drawCount, int stride){
        if(PFN_vkCmdDrawIndirect_f == null) PFN_vkCmdDrawIndirect_f = new PFNvkCmdDrawIndirect(instance);
        PFN_vkCmdDrawIndirect_f.call(commandBuffer, buffer, offset, drawCount, stride);
    }


    public void vkCmdDrawIndexedIndirect(VkCommandBuffer commandBuffer, VkBuffer buffer, long offset, int drawCount, int stride){
        if(PFN_vkCmdDrawIndexedIndirect_f == null) PFN_vkCmdDrawIndexedIndirect_f = new PFNvkCmdDrawIndexedIndirect(instance);
        PFN_vkCmdDrawIndexedIndirect_f.call(commandBuffer, buffer, offset, drawCount, stride);
    }


    public void vkCmdDispatch(VkCommandBuffer commandBuffer, int groupCountX, int groupCountY, int groupCountZ){
        if(PFN_vkCmdDispatch_f == null) PFN_vkCmdDispatch_f = new PFNvkCmdDispatch(instance);
        PFN_vkCmdDispatch_f.call(commandBuffer, groupCountX, groupCountY, groupCountZ);
    }


    public void vkCmdDispatchIndirect(VkCommandBuffer commandBuffer, VkBuffer buffer, long offset){
        if(PFN_vkCmdDispatchIndirect_f == null) PFN_vkCmdDispatchIndirect_f = new PFNvkCmdDispatchIndirect(instance);
        PFN_vkCmdDispatchIndirect_f.call(commandBuffer, buffer, offset);
    }


    public void vkCmdCopyBuffer(VkCommandBuffer commandBuffer, VkBuffer srcBuffer, VkBuffer dstBuffer, int regionCount, VkBufferCopy pRegions){
        if(PFN_vkCmdCopyBuffer_f == null) PFN_vkCmdCopyBuffer_f = new PFNvkCmdCopyBuffer(instance);
        PFN_vkCmdCopyBuffer_f.call(commandBuffer, srcBuffer, dstBuffer, regionCount, pRegions);
    }


    public void vkCmdCopyImage(VkCommandBuffer commandBuffer, VkImage srcImage, int srcImageLayout, VkImage dstImage, int dstImageLayout, int regionCount, VkImageCopy pRegions){
        if(PFN_vkCmdCopyImage_f == null) PFN_vkCmdCopyImage_f = new PFNvkCmdCopyImage(instance);
        PFN_vkCmdCopyImage_f.call(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);
    }


    public void vkCmdBlitImage(VkCommandBuffer commandBuffer, VkImage srcImage, int srcImageLayout, VkImage dstImage, int dstImageLayout, int regionCount, VkImageBlit pRegions, int filter){
        if(PFN_vkCmdBlitImage_f == null) PFN_vkCmdBlitImage_f = new PFNvkCmdBlitImage(instance);
        PFN_vkCmdBlitImage_f.call(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter);
    }


    public void vkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, VkBuffer srcBuffer, VkImage dstImage, int dstImageLayout, int regionCount, VkBufferImageCopy pRegions){
        if(PFN_vkCmdCopyBufferToImage_f == null) PFN_vkCmdCopyBufferToImage_f = new PFNvkCmdCopyBufferToImage(instance);
        PFN_vkCmdCopyBufferToImage_f.call(commandBuffer, srcBuffer, dstImage, dstImageLayout, regionCount, pRegions);
    }


    public void vkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, VkImage srcImage, int srcImageLayout, VkBuffer dstBuffer, int regionCount, VkBufferImageCopy pRegions){
        if(PFN_vkCmdCopyImageToBuffer_f == null) PFN_vkCmdCopyImageToBuffer_f = new PFNvkCmdCopyImageToBuffer(instance);
        PFN_vkCmdCopyImageToBuffer_f.call(commandBuffer, srcImage, srcImageLayout, dstBuffer, regionCount, pRegions);
    }


    public void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, long dstOffset, long dataSize, VkObject pData){
        if(PFN_vkCmdUpdateBuffer_f == null) PFN_vkCmdUpdateBuffer_f = new PFNvkCmdUpdateBuffer(instance);
        PFN_vkCmdUpdateBuffer_f.call(commandBuffer, dstBuffer, dstOffset, dataSize, pData);
    }


    public void vkCmdFillBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, long dstOffset, long size, int data){
        if(PFN_vkCmdFillBuffer_f == null) PFN_vkCmdFillBuffer_f = new PFNvkCmdFillBuffer(instance);
        PFN_vkCmdFillBuffer_f.call(commandBuffer, dstBuffer, dstOffset, size, data);
    }


    public void vkCmdClearColorImage(VkCommandBuffer commandBuffer, VkImage image, int imageLayout, VkClearColorValue pColor, int rangeCount, VkImageSubresourceRange pRanges){
        if(PFN_vkCmdClearColorImage_f == null) PFN_vkCmdClearColorImage_f = new PFNvkCmdClearColorImage(instance);
        PFN_vkCmdClearColorImage_f.call(commandBuffer, image, imageLayout, pColor, rangeCount, pRanges);
    }


    public void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, VkImage image, int imageLayout, VkClearDepthStencilValue pDepthStencil, int rangeCount, VkImageSubresourceRange pRanges){
        if(PFN_vkCmdClearDepthStencilImage_f == null) PFN_vkCmdClearDepthStencilImage_f = new PFNvkCmdClearDepthStencilImage(instance);
        PFN_vkCmdClearDepthStencilImage_f.call(commandBuffer, image, imageLayout, pDepthStencil, rangeCount, pRanges);
    }


    public void vkCmdClearAttachments(VkCommandBuffer commandBuffer, int attachmentCount, VkClearAttachment pAttachments, int rectCount, VkClearRect pRects){
        if(PFN_vkCmdClearAttachments_f == null) PFN_vkCmdClearAttachments_f = new PFNvkCmdClearAttachments(instance);
        PFN_vkCmdClearAttachments_f.call(commandBuffer, attachmentCount, pAttachments, rectCount, pRects);
    }


    public void vkCmdResolveImage(VkCommandBuffer commandBuffer, VkImage srcImage, int srcImageLayout, VkImage dstImage, int dstImageLayout, int regionCount, VkImageResolve pRegions){
        if(PFN_vkCmdResolveImage_f == null) PFN_vkCmdResolveImage_f = new PFNvkCmdResolveImage(instance);
        PFN_vkCmdResolveImage_f.call(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);
    }


    public void vkCmdSetEvent(VkCommandBuffer commandBuffer, VkEvent event, int stageMask){
        if(PFN_vkCmdSetEvent_f == null) PFN_vkCmdSetEvent_f = new PFNvkCmdSetEvent(instance);
        PFN_vkCmdSetEvent_f.call(commandBuffer, event, stageMask);
    }


    public void vkCmdResetEvent(VkCommandBuffer commandBuffer, VkEvent event, int stageMask){
        if(PFN_vkCmdResetEvent_f == null) PFN_vkCmdResetEvent_f = new PFNvkCmdResetEvent(instance);
        PFN_vkCmdResetEvent_f.call(commandBuffer, event, stageMask);
    }


    public void vkCmdWaitEvents(VkCommandBuffer commandBuffer, int eventCount, VkEvent pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, VkMemoryBarrier pMemoryBarriers, int bufferMemoryBarrierCount, VkBufferMemoryBarrier pBufferMemoryBarriers, int imageMemoryBarrierCount, VkImageMemoryBarrier pImageMemoryBarriers){
        if(PFN_vkCmdWaitEvents_f == null) PFN_vkCmdWaitEvents_f = new PFNvkCmdWaitEvents(instance);
        PFN_vkCmdWaitEvents_f.call(commandBuffer, eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);
    }


    public void vkCmdPipelineBarrier(VkCommandBuffer commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, int memoryBarrierCount, VkMemoryBarrier pMemoryBarriers, int bufferMemoryBarrierCount, VkBufferMemoryBarrier pBufferMemoryBarriers, int imageMemoryBarrierCount, VkImageMemoryBarrier pImageMemoryBarriers){
        if(PFN_vkCmdPipelineBarrier_f == null) PFN_vkCmdPipelineBarrier_f = new PFNvkCmdPipelineBarrier(instance);
        PFN_vkCmdPipelineBarrier_f.call(commandBuffer, srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);
    }


    public void vkCmdBeginQuery(VkCommandBuffer commandBuffer, VkQueryPool queryPool, int query, int flags){
        if(PFN_vkCmdBeginQuery_f == null) PFN_vkCmdBeginQuery_f = new PFNvkCmdBeginQuery(instance);
        PFN_vkCmdBeginQuery_f.call(commandBuffer, queryPool, query, flags);
    }


    public void vkCmdEndQuery(VkCommandBuffer commandBuffer, VkQueryPool queryPool, int query){
        if(PFN_vkCmdEndQuery_f == null) PFN_vkCmdEndQuery_f = new PFNvkCmdEndQuery(instance);
        PFN_vkCmdEndQuery_f.call(commandBuffer, queryPool, query);
    }


    public void vkCmdResetQueryPool(VkCommandBuffer commandBuffer, VkQueryPool queryPool, int firstQuery, int queryCount){
        if(PFN_vkCmdResetQueryPool_f == null) PFN_vkCmdResetQueryPool_f = new PFNvkCmdResetQueryPool(instance);
        PFN_vkCmdResetQueryPool_f.call(commandBuffer, queryPool, firstQuery, queryCount);
    }


    public void vkCmdWriteTimestamp(VkCommandBuffer commandBuffer, int pipelineStage, VkQueryPool queryPool, int query){
        if(PFN_vkCmdWriteTimestamp_f == null) PFN_vkCmdWriteTimestamp_f = new PFNvkCmdWriteTimestamp(instance);
        PFN_vkCmdWriteTimestamp_f.call(commandBuffer, pipelineStage, queryPool, query);
    }


    public void vkCmdCopyQueryPoolResults(VkCommandBuffer commandBuffer, VkQueryPool queryPool, int firstQuery, int queryCount, VkBuffer dstBuffer, long dstOffset, long stride, int flags){
        if(PFN_vkCmdCopyQueryPoolResults_f == null) PFN_vkCmdCopyQueryPoolResults_f = new PFNvkCmdCopyQueryPoolResults(instance);
        PFN_vkCmdCopyQueryPoolResults_f.call(commandBuffer, queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags);
    }


    public void vkCmdPushConstants(VkCommandBuffer commandBuffer, VkPipelineLayout layout, int stageFlags, int offset, int size, VkObject pValues){
        if(PFN_vkCmdPushConstants_f == null) PFN_vkCmdPushConstants_f = new PFNvkCmdPushConstants(instance);
        PFN_vkCmdPushConstants_f.call(commandBuffer, layout, stageFlags, offset, size, pValues);
    }


    public void vkCmdBeginRenderPass(VkCommandBuffer commandBuffer, VkRenderPassBeginInfo pRenderPassBegin, int contents){
        if(PFN_vkCmdBeginRenderPass_f == null) PFN_vkCmdBeginRenderPass_f = new PFNvkCmdBeginRenderPass(instance);
        PFN_vkCmdBeginRenderPass_f.call(commandBuffer, pRenderPassBegin, contents);
    }


    public void vkCmdNextSubpass(VkCommandBuffer commandBuffer, int contents){
        if(PFN_vkCmdNextSubpass_f == null) PFN_vkCmdNextSubpass_f = new PFNvkCmdNextSubpass(instance);
        PFN_vkCmdNextSubpass_f.call(commandBuffer, contents);
    }


    public void vkCmdEndRenderPass(VkCommandBuffer commandBuffer){
        if(PFN_vkCmdEndRenderPass_f == null) PFN_vkCmdEndRenderPass_f = new PFNvkCmdEndRenderPass(instance);
        PFN_vkCmdEndRenderPass_f.call(commandBuffer);
    }


    public void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, int commandBufferCount, VkCommandBuffer pCommandBuffers){
        if(PFN_vkCmdExecuteCommands_f == null) PFN_vkCmdExecuteCommands_f = new PFNvkCmdExecuteCommands(instance);
        PFN_vkCmdExecuteCommands_f.call(commandBuffer, commandBufferCount, pCommandBuffers);
    }


    public int vkEnumerateInstanceVersion(VkUInt32 pApiVersion){
        if(PFN_vkEnumerateInstanceVersion_f == null) PFN_vkEnumerateInstanceVersion_f = new PFNvkEnumerateInstanceVersion(instance);
        return PFN_vkEnumerateInstanceVersion_f.call(pApiVersion);
    }


    public void vkEnumerateInstanceVersionP(VkUInt32 pApiVersion){
        if(PFN_vkEnumerateInstanceVersion_f == null) PFN_vkEnumerateInstanceVersion_f = new PFNvkEnumerateInstanceVersion(instance);
        int result = PFN_vkEnumerateInstanceVersion_f.call(pApiVersion);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkBindBufferMemory2(VkDevice device, int bindInfoCount, VkBindBufferMemoryInfo pBindInfos){
        if(PFN_vkBindBufferMemory2_f == null) PFN_vkBindBufferMemory2_f = new PFNvkBindBufferMemory2(instance);
        return PFN_vkBindBufferMemory2_f.call(device, bindInfoCount, pBindInfos);
    }


    public void vkBindBufferMemory2P(VkDevice device, int bindInfoCount, VkBindBufferMemoryInfo pBindInfos){
        if(PFN_vkBindBufferMemory2_f == null) PFN_vkBindBufferMemory2_f = new PFNvkBindBufferMemory2(instance);
        int result = PFN_vkBindBufferMemory2_f.call(device, bindInfoCount, pBindInfos);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkBindImageMemory2(VkDevice device, int bindInfoCount, VkBindImageMemoryInfo pBindInfos){
        if(PFN_vkBindImageMemory2_f == null) PFN_vkBindImageMemory2_f = new PFNvkBindImageMemory2(instance);
        return PFN_vkBindImageMemory2_f.call(device, bindInfoCount, pBindInfos);
    }


    public void vkBindImageMemory2P(VkDevice device, int bindInfoCount, VkBindImageMemoryInfo pBindInfos){
        if(PFN_vkBindImageMemory2_f == null) PFN_vkBindImageMemory2_f = new PFNvkBindImageMemory2(instance);
        int result = PFN_vkBindImageMemory2_f.call(device, bindInfoCount, pBindInfos);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkGetDeviceGroupPeerMemoryFeatures(VkDevice device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, VkPeerMemoryFeatureFlags pPeerMemoryFeatures){
        if(PFN_vkGetDeviceGroupPeerMemoryFeatures_f == null) PFN_vkGetDeviceGroupPeerMemoryFeatures_f = new PFNvkGetDeviceGroupPeerMemoryFeatures(instance);
        PFN_vkGetDeviceGroupPeerMemoryFeatures_f.call(device, heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures);
    }


    public void vkCmdSetDeviceMask(VkCommandBuffer commandBuffer, int deviceMask){
        if(PFN_vkCmdSetDeviceMask_f == null) PFN_vkCmdSetDeviceMask_f = new PFNvkCmdSetDeviceMask(instance);
        PFN_vkCmdSetDeviceMask_f.call(commandBuffer, deviceMask);
    }


    public void vkCmdDispatchBase(VkCommandBuffer commandBuffer, int baseGroupX, int baseGroupY, int baseGroupZ, int groupCountX, int groupCountY, int groupCountZ){
        if(PFN_vkCmdDispatchBase_f == null) PFN_vkCmdDispatchBase_f = new PFNvkCmdDispatchBase(instance);
        PFN_vkCmdDispatchBase_f.call(commandBuffer, baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ);
    }


    public int vkEnumeratePhysicalDeviceGroups(VkInstance instance, VkUInt32 pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties pPhysicalDeviceGroupProperties){
        if(PFN_vkEnumeratePhysicalDeviceGroups_f == null) PFN_vkEnumeratePhysicalDeviceGroups_f = new PFNvkEnumeratePhysicalDeviceGroups(instance);
        return PFN_vkEnumeratePhysicalDeviceGroups_f.call(instance, pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties);
    }


    public void vkEnumeratePhysicalDeviceGroupsP(VkInstance instance, VkUInt32 pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties pPhysicalDeviceGroupProperties){
        if(PFN_vkEnumeratePhysicalDeviceGroups_f == null) PFN_vkEnumeratePhysicalDeviceGroups_f = new PFNvkEnumeratePhysicalDeviceGroups(instance);
        int result = PFN_vkEnumeratePhysicalDeviceGroups_f.call(instance, pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkGetImageMemoryRequirements2(VkDevice device, VkImageMemoryRequirementsInfo2 pInfo, VkMemoryRequirements2 pMemoryRequirements){
        if(PFN_vkGetImageMemoryRequirements2_f == null) PFN_vkGetImageMemoryRequirements2_f = new PFNvkGetImageMemoryRequirements2(instance);
        PFN_vkGetImageMemoryRequirements2_f.call(device, pInfo, pMemoryRequirements);
    }


    public void vkGetBufferMemoryRequirements2(VkDevice device, VkBufferMemoryRequirementsInfo2 pInfo, VkMemoryRequirements2 pMemoryRequirements){
        if(PFN_vkGetBufferMemoryRequirements2_f == null) PFN_vkGetBufferMemoryRequirements2_f = new PFNvkGetBufferMemoryRequirements2(instance);
        PFN_vkGetBufferMemoryRequirements2_f.call(device, pInfo, pMemoryRequirements);
    }


    public void vkGetImageSparseMemoryRequirements2(VkDevice device, VkImageSparseMemoryRequirementsInfo2 pInfo, VkUInt32 pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 pSparseMemoryRequirements){
        if(PFN_vkGetImageSparseMemoryRequirements2_f == null) PFN_vkGetImageSparseMemoryRequirements2_f = new PFNvkGetImageSparseMemoryRequirements2(instance);
        PFN_vkGetImageSparseMemoryRequirements2_f.call(device, pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements);
    }


    public void vkGetPhysicalDeviceFeatures2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures2 pFeatures){
        if(PFN_vkGetPhysicalDeviceFeatures2_f == null) PFN_vkGetPhysicalDeviceFeatures2_f = new PFNvkGetPhysicalDeviceFeatures2(instance);
        PFN_vkGetPhysicalDeviceFeatures2_f.call(physicalDevice, pFeatures);
    }


    public void vkGetPhysicalDeviceProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties2 pProperties){
        if(PFN_vkGetPhysicalDeviceProperties2_f == null) PFN_vkGetPhysicalDeviceProperties2_f = new PFNvkGetPhysicalDeviceProperties2(instance);
        PFN_vkGetPhysicalDeviceProperties2_f.call(physicalDevice, pProperties);
    }


    public void vkGetPhysicalDeviceFormatProperties2(VkPhysicalDevice physicalDevice, int format, VkFormatProperties2 pFormatProperties){
        if(PFN_vkGetPhysicalDeviceFormatProperties2_f == null) PFN_vkGetPhysicalDeviceFormatProperties2_f = new PFNvkGetPhysicalDeviceFormatProperties2(instance);
        PFN_vkGetPhysicalDeviceFormatProperties2_f.call(physicalDevice, format, pFormatProperties);
    }


    public int vkGetPhysicalDeviceImageFormatProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties){
        if(PFN_vkGetPhysicalDeviceImageFormatProperties2_f == null) PFN_vkGetPhysicalDeviceImageFormatProperties2_f = new PFNvkGetPhysicalDeviceImageFormatProperties2(instance);
        return PFN_vkGetPhysicalDeviceImageFormatProperties2_f.call(physicalDevice, pImageFormatInfo, pImageFormatProperties);
    }


    public void vkGetPhysicalDeviceImageFormatProperties2P(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties){
        if(PFN_vkGetPhysicalDeviceImageFormatProperties2_f == null) PFN_vkGetPhysicalDeviceImageFormatProperties2_f = new PFNvkGetPhysicalDeviceImageFormatProperties2(instance);
        int result = PFN_vkGetPhysicalDeviceImageFormatProperties2_f.call(physicalDevice, pImageFormatInfo, pImageFormatProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, VkUInt32 pQueueFamilyPropertyCount, VkQueueFamilyProperties2 pQueueFamilyProperties){
        if(PFN_vkGetPhysicalDeviceQueueFamilyProperties2_f == null) PFN_vkGetPhysicalDeviceQueueFamilyProperties2_f = new PFNvkGetPhysicalDeviceQueueFamilyProperties2(instance);
        PFN_vkGetPhysicalDeviceQueueFamilyProperties2_f.call(physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties);
    }


    public void vkGetPhysicalDeviceMemoryProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2 pMemoryProperties){
        if(PFN_vkGetPhysicalDeviceMemoryProperties2_f == null) PFN_vkGetPhysicalDeviceMemoryProperties2_f = new PFNvkGetPhysicalDeviceMemoryProperties2(instance);
        PFN_vkGetPhysicalDeviceMemoryProperties2_f.call(physicalDevice, pMemoryProperties);
    }


    public void vkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, VkUInt32 pPropertyCount, VkSparseImageFormatProperties2 pProperties){
        if(PFN_vkGetPhysicalDeviceSparseImageFormatProperties2_f == null) PFN_vkGetPhysicalDeviceSparseImageFormatProperties2_f = new PFNvkGetPhysicalDeviceSparseImageFormatProperties2(instance);
        PFN_vkGetPhysicalDeviceSparseImageFormatProperties2_f.call(physicalDevice, pFormatInfo, pPropertyCount, pProperties);
    }


    public void vkTrimCommandPool(VkDevice device, VkCommandPool commandPool, int flags){
        if(PFN_vkTrimCommandPool_f == null) PFN_vkTrimCommandPool_f = new PFNvkTrimCommandPool(instance);
        PFN_vkTrimCommandPool_f.call(device, commandPool, flags);
    }


    public void vkGetDeviceQueue2(VkDevice device, VkDeviceQueueInfo2 pQueueInfo, VkQueue pQueue){
        if(PFN_vkGetDeviceQueue2_f == null) PFN_vkGetDeviceQueue2_f = new PFNvkGetDeviceQueue2(instance);
        PFN_vkGetDeviceQueue2_f.call(device, pQueueInfo, pQueue);
    }


    public int vkCreateSamplerYcbcrConversion(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSamplerYcbcrConversion pYcbcrConversion){
        if(PFN_vkCreateSamplerYcbcrConversion_f == null) PFN_vkCreateSamplerYcbcrConversion_f = new PFNvkCreateSamplerYcbcrConversion(instance);
        return PFN_vkCreateSamplerYcbcrConversion_f.call(device, pCreateInfo, pAllocator, pYcbcrConversion);
    }


    public void vkCreateSamplerYcbcrConversionP(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSamplerYcbcrConversion pYcbcrConversion){
        if(PFN_vkCreateSamplerYcbcrConversion_f == null) PFN_vkCreateSamplerYcbcrConversion_f = new PFNvkCreateSamplerYcbcrConversion(instance);
        int result = PFN_vkCreateSamplerYcbcrConversion_f.call(device, pCreateInfo, pAllocator, pYcbcrConversion);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroySamplerYcbcrConversion(VkDevice device, VkSamplerYcbcrConversion ycbcrConversion, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroySamplerYcbcrConversion_f == null) PFN_vkDestroySamplerYcbcrConversion_f = new PFNvkDestroySamplerYcbcrConversion(instance);
        PFN_vkDestroySamplerYcbcrConversion_f.call(device, ycbcrConversion, pAllocator);
    }


    public int vkCreateDescriptorUpdateTemplate(VkDevice device, VkDescriptorUpdateTemplateCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorUpdateTemplate pDescriptorUpdateTemplate){
        if(PFN_vkCreateDescriptorUpdateTemplate_f == null) PFN_vkCreateDescriptorUpdateTemplate_f = new PFNvkCreateDescriptorUpdateTemplate(instance);
        return PFN_vkCreateDescriptorUpdateTemplate_f.call(device, pCreateInfo, pAllocator, pDescriptorUpdateTemplate);
    }


    public void vkCreateDescriptorUpdateTemplateP(VkDevice device, VkDescriptorUpdateTemplateCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorUpdateTemplate pDescriptorUpdateTemplate){
        if(PFN_vkCreateDescriptorUpdateTemplate_f == null) PFN_vkCreateDescriptorUpdateTemplate_f = new PFNvkCreateDescriptorUpdateTemplate(instance);
        int result = PFN_vkCreateDescriptorUpdateTemplate_f.call(device, pCreateInfo, pAllocator, pDescriptorUpdateTemplate);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyDescriptorUpdateTemplate(VkDevice device, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyDescriptorUpdateTemplate_f == null) PFN_vkDestroyDescriptorUpdateTemplate_f = new PFNvkDestroyDescriptorUpdateTemplate(instance);
        PFN_vkDestroyDescriptorUpdateTemplate_f.call(device, descriptorUpdateTemplate, pAllocator);
    }


    public void vkUpdateDescriptorSetWithTemplate(VkDevice device, VkDescriptorSet descriptorSet, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkObject pData){
        if(PFN_vkUpdateDescriptorSetWithTemplate_f == null) PFN_vkUpdateDescriptorSetWithTemplate_f = new PFNvkUpdateDescriptorSetWithTemplate(instance);
        PFN_vkUpdateDescriptorSetWithTemplate_f.call(device, descriptorSet, descriptorUpdateTemplate, pData);
    }


    public void vkGetPhysicalDeviceExternalBufferProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo, VkExternalBufferProperties pExternalBufferProperties){
        if(PFN_vkGetPhysicalDeviceExternalBufferProperties_f == null) PFN_vkGetPhysicalDeviceExternalBufferProperties_f = new PFNvkGetPhysicalDeviceExternalBufferProperties(instance);
        PFN_vkGetPhysicalDeviceExternalBufferProperties_f.call(physicalDevice, pExternalBufferInfo, pExternalBufferProperties);
    }


    public void vkGetPhysicalDeviceExternalFenceProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo, VkExternalFenceProperties pExternalFenceProperties){
        if(PFN_vkGetPhysicalDeviceExternalFenceProperties_f == null) PFN_vkGetPhysicalDeviceExternalFenceProperties_f = new PFNvkGetPhysicalDeviceExternalFenceProperties(instance);
        PFN_vkGetPhysicalDeviceExternalFenceProperties_f.call(physicalDevice, pExternalFenceInfo, pExternalFenceProperties);
    }


    public void vkGetPhysicalDeviceExternalSemaphoreProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo, VkExternalSemaphoreProperties pExternalSemaphoreProperties){
        if(PFN_vkGetPhysicalDeviceExternalSemaphoreProperties_f == null) PFN_vkGetPhysicalDeviceExternalSemaphoreProperties_f = new PFNvkGetPhysicalDeviceExternalSemaphoreProperties(instance);
        PFN_vkGetPhysicalDeviceExternalSemaphoreProperties_f.call(physicalDevice, pExternalSemaphoreInfo, pExternalSemaphoreProperties);
    }


    public void vkGetDescriptorSetLayoutSupport(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkDescriptorSetLayoutSupport pSupport){
        if(PFN_vkGetDescriptorSetLayoutSupport_f == null) PFN_vkGetDescriptorSetLayoutSupport_f = new PFNvkGetDescriptorSetLayoutSupport(instance);
        PFN_vkGetDescriptorSetLayoutSupport_f.call(device, pCreateInfo, pSupport);
    }


    public void vkDestroySurfaceKHR(VkInstance instance, VkSurfaceKHR surface, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroySurfaceKHR_f == null) PFN_vkDestroySurfaceKHR_f = new PFNvkDestroySurfaceKHR(instance);
        PFN_vkDestroySurfaceKHR_f.call(instance, surface, pAllocator);
    }


    public int vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, VkSurfaceKHR surface, VkBool32 pSupported){
        if(PFN_vkGetPhysicalDeviceSurfaceSupportKHR_f == null) PFN_vkGetPhysicalDeviceSurfaceSupportKHR_f = new PFNvkGetPhysicalDeviceSurfaceSupportKHR(instance);
        return PFN_vkGetPhysicalDeviceSurfaceSupportKHR_f.call(physicalDevice, queueFamilyIndex, surface, pSupported);
    }


    public void vkGetPhysicalDeviceSurfaceSupportKHRP(VkPhysicalDevice physicalDevice, int queueFamilyIndex, VkSurfaceKHR surface, VkBool32 pSupported){
        if(PFN_vkGetPhysicalDeviceSurfaceSupportKHR_f == null) PFN_vkGetPhysicalDeviceSurfaceSupportKHR_f = new PFNvkGetPhysicalDeviceSurfaceSupportKHR(instance);
        int result = PFN_vkGetPhysicalDeviceSurfaceSupportKHR_f.call(physicalDevice, queueFamilyIndex, surface, pSupported);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilitiesKHR pSurfaceCapabilities){
        if(PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR_f == null) PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR_f = new PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR(instance);
        return PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR_f.call(physicalDevice, surface, pSurfaceCapabilities);
    }


    public void vkGetPhysicalDeviceSurfaceCapabilitiesKHRP(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilitiesKHR pSurfaceCapabilities){
        if(PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR_f == null) PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR_f = new PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR(instance);
        int result = PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR_f.call(physicalDevice, surface, pSurfaceCapabilities);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pSurfaceFormatCount, VkSurfaceFormatKHR pSurfaceFormats){
        if(PFN_vkGetPhysicalDeviceSurfaceFormatsKHR_f == null) PFN_vkGetPhysicalDeviceSurfaceFormatsKHR_f = new PFNvkGetPhysicalDeviceSurfaceFormatsKHR(instance);
        return PFN_vkGetPhysicalDeviceSurfaceFormatsKHR_f.call(physicalDevice, surface, pSurfaceFormatCount, pSurfaceFormats);
    }


    public void vkGetPhysicalDeviceSurfaceFormatsKHRP(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pSurfaceFormatCount, VkSurfaceFormatKHR pSurfaceFormats){
        if(PFN_vkGetPhysicalDeviceSurfaceFormatsKHR_f == null) PFN_vkGetPhysicalDeviceSurfaceFormatsKHR_f = new PFNvkGetPhysicalDeviceSurfaceFormatsKHR(instance);
        int result = PFN_vkGetPhysicalDeviceSurfaceFormatsKHR_f.call(physicalDevice, surface, pSurfaceFormatCount, pSurfaceFormats);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pPresentModeCount, VkPresentModeKHR pPresentModes){
        if(PFN_vkGetPhysicalDeviceSurfacePresentModesKHR_f == null) PFN_vkGetPhysicalDeviceSurfacePresentModesKHR_f = new PFNvkGetPhysicalDeviceSurfacePresentModesKHR(instance);
        return PFN_vkGetPhysicalDeviceSurfacePresentModesKHR_f.call(physicalDevice, surface, pPresentModeCount, pPresentModes);
    }


    public void vkGetPhysicalDeviceSurfacePresentModesKHRP(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pPresentModeCount, VkPresentModeKHR pPresentModes){
        if(PFN_vkGetPhysicalDeviceSurfacePresentModesKHR_f == null) PFN_vkGetPhysicalDeviceSurfacePresentModesKHR_f = new PFNvkGetPhysicalDeviceSurfacePresentModesKHR(instance);
        int result = PFN_vkGetPhysicalDeviceSurfacePresentModesKHR_f.call(physicalDevice, surface, pPresentModeCount, pPresentModes);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkCreateSwapchainKHR(VkDevice device, VkSwapchainCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkSwapchainKHR pSwapchain){
        if(PFN_vkCreateSwapchainKHR_f == null) PFN_vkCreateSwapchainKHR_f = new PFNvkCreateSwapchainKHR(instance);
        return PFN_vkCreateSwapchainKHR_f.call(device, pCreateInfo, pAllocator, pSwapchain);
    }


    public void vkCreateSwapchainKHRP(VkDevice device, VkSwapchainCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkSwapchainKHR pSwapchain){
        if(PFN_vkCreateSwapchainKHR_f == null) PFN_vkCreateSwapchainKHR_f = new PFNvkCreateSwapchainKHR(instance);
        int result = PFN_vkCreateSwapchainKHR_f.call(device, pCreateInfo, pAllocator, pSwapchain);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroySwapchainKHR(VkDevice device, VkSwapchainKHR swapchain, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroySwapchainKHR_f == null) PFN_vkDestroySwapchainKHR_f = new PFNvkDestroySwapchainKHR(instance);
        PFN_vkDestroySwapchainKHR_f.call(device, swapchain, pAllocator);
    }


    public int vkGetSwapchainImagesKHR(VkDevice device, VkSwapchainKHR swapchain, VkUInt32 pSwapchainImageCount, VkImage pSwapchainImages){
        if(PFN_vkGetSwapchainImagesKHR_f == null) PFN_vkGetSwapchainImagesKHR_f = new PFNvkGetSwapchainImagesKHR(instance);
        return PFN_vkGetSwapchainImagesKHR_f.call(device, swapchain, pSwapchainImageCount, pSwapchainImages);
    }


    public void vkGetSwapchainImagesKHRP(VkDevice device, VkSwapchainKHR swapchain, VkUInt32 pSwapchainImageCount, VkImage pSwapchainImages){
        if(PFN_vkGetSwapchainImagesKHR_f == null) PFN_vkGetSwapchainImagesKHR_f = new PFNvkGetSwapchainImagesKHR(instance);
        int result = PFN_vkGetSwapchainImagesKHR_f.call(device, swapchain, pSwapchainImageCount, pSwapchainImages);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkAcquireNextImageKHR(VkDevice device, VkSwapchainKHR swapchain, long timeout, VkSemaphore semaphore, VkFence fence, VkUInt32 pImageIndex){
        if(PFN_vkAcquireNextImageKHR_f == null) PFN_vkAcquireNextImageKHR_f = new PFNvkAcquireNextImageKHR(instance);
        return PFN_vkAcquireNextImageKHR_f.call(device, swapchain, timeout, semaphore, fence, pImageIndex);
    }


    public void vkAcquireNextImageKHRP(VkDevice device, VkSwapchainKHR swapchain, long timeout, VkSemaphore semaphore, VkFence fence, VkUInt32 pImageIndex){
        if(PFN_vkAcquireNextImageKHR_f == null) PFN_vkAcquireNextImageKHR_f = new PFNvkAcquireNextImageKHR(instance);
        int result = PFN_vkAcquireNextImageKHR_f.call(device, swapchain, timeout, semaphore, fence, pImageIndex);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkQueuePresentKHR(VkQueue queue, VkPresentInfoKHR pPresentInfo){
        if(PFN_vkQueuePresentKHR_f == null) PFN_vkQueuePresentKHR_f = new PFNvkQueuePresentKHR(instance);
        return PFN_vkQueuePresentKHR_f.call(queue, pPresentInfo);
    }


    public void vkQueuePresentKHRP(VkQueue queue, VkPresentInfoKHR pPresentInfo){
        if(PFN_vkQueuePresentKHR_f == null) PFN_vkQueuePresentKHR_f = new PFNvkQueuePresentKHR(instance);
        int result = PFN_vkQueuePresentKHR_f.call(queue, pPresentInfo);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities){
        if(PFN_vkGetDeviceGroupPresentCapabilitiesKHR_f == null) PFN_vkGetDeviceGroupPresentCapabilitiesKHR_f = new PFNvkGetDeviceGroupPresentCapabilitiesKHR(instance);
        return PFN_vkGetDeviceGroupPresentCapabilitiesKHR_f.call(device, pDeviceGroupPresentCapabilities);
    }


    public void vkGetDeviceGroupPresentCapabilitiesKHRP(VkDevice device, VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities){
        if(PFN_vkGetDeviceGroupPresentCapabilitiesKHR_f == null) PFN_vkGetDeviceGroupPresentCapabilitiesKHR_f = new PFNvkGetDeviceGroupPresentCapabilitiesKHR(instance);
        int result = PFN_vkGetDeviceGroupPresentCapabilitiesKHR_f.call(device, pDeviceGroupPresentCapabilities);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHR pModes){
        if(PFN_vkGetDeviceGroupSurfacePresentModesKHR_f == null) PFN_vkGetDeviceGroupSurfacePresentModesKHR_f = new PFNvkGetDeviceGroupSurfacePresentModesKHR(instance);
        return PFN_vkGetDeviceGroupSurfacePresentModesKHR_f.call(device, surface, pModes);
    }


    public void vkGetDeviceGroupSurfacePresentModesKHRP(VkDevice device, VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHR pModes){
        if(PFN_vkGetDeviceGroupSurfacePresentModesKHR_f == null) PFN_vkGetDeviceGroupSurfacePresentModesKHR_f = new PFNvkGetDeviceGroupSurfacePresentModesKHR(instance);
        int result = PFN_vkGetDeviceGroupSurfacePresentModesKHR_f.call(device, surface, pModes);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pRectCount, VkRect2D pRects){
        if(PFN_vkGetPhysicalDevicePresentRectanglesKHR_f == null) PFN_vkGetPhysicalDevicePresentRectanglesKHR_f = new PFNvkGetPhysicalDevicePresentRectanglesKHR(instance);
        return PFN_vkGetPhysicalDevicePresentRectanglesKHR_f.call(physicalDevice, surface, pRectCount, pRects);
    }


    public void vkGetPhysicalDevicePresentRectanglesKHRP(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pRectCount, VkRect2D pRects){
        if(PFN_vkGetPhysicalDevicePresentRectanglesKHR_f == null) PFN_vkGetPhysicalDevicePresentRectanglesKHR_f = new PFNvkGetPhysicalDevicePresentRectanglesKHR(instance);
        int result = PFN_vkGetPhysicalDevicePresentRectanglesKHR_f.call(physicalDevice, surface, pRectCount, pRects);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkAcquireNextImage2KHR(VkDevice device, VkAcquireNextImageInfoKHR pAcquireInfo, VkUInt32 pImageIndex){
        if(PFN_vkAcquireNextImage2KHR_f == null) PFN_vkAcquireNextImage2KHR_f = new PFNvkAcquireNextImage2KHR(instance);
        return PFN_vkAcquireNextImage2KHR_f.call(device, pAcquireInfo, pImageIndex);
    }


    public void vkAcquireNextImage2KHRP(VkDevice device, VkAcquireNextImageInfoKHR pAcquireInfo, VkUInt32 pImageIndex){
        if(PFN_vkAcquireNextImage2KHR_f == null) PFN_vkAcquireNextImage2KHR_f = new PFNvkAcquireNextImage2KHR(instance);
        int result = PFN_vkAcquireNextImage2KHR_f.call(device, pAcquireInfo, pImageIndex);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkDisplayPropertiesKHR pProperties){
        if(PFN_vkGetPhysicalDeviceDisplayPropertiesKHR_f == null) PFN_vkGetPhysicalDeviceDisplayPropertiesKHR_f = new PFNvkGetPhysicalDeviceDisplayPropertiesKHR(instance);
        return PFN_vkGetPhysicalDeviceDisplayPropertiesKHR_f.call(physicalDevice, pPropertyCount, pProperties);
    }


    public void vkGetPhysicalDeviceDisplayPropertiesKHRP(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkDisplayPropertiesKHR pProperties){
        if(PFN_vkGetPhysicalDeviceDisplayPropertiesKHR_f == null) PFN_vkGetPhysicalDeviceDisplayPropertiesKHR_f = new PFNvkGetPhysicalDeviceDisplayPropertiesKHR(instance);
        int result = PFN_vkGetPhysicalDeviceDisplayPropertiesKHR_f.call(physicalDevice, pPropertyCount, pProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkDisplayPlanePropertiesKHR pProperties){
        if(PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR_f == null) PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR_f = new PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR(instance);
        return PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR_f.call(physicalDevice, pPropertyCount, pProperties);
    }


    public void vkGetPhysicalDeviceDisplayPlanePropertiesKHRP(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkDisplayPlanePropertiesKHR pProperties){
        if(PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR_f == null) PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR_f = new PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR(instance);
        int result = PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR_f.call(physicalDevice, pPropertyCount, pProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, int planeIndex, VkUInt32 pDisplayCount, VkDisplayKHR pDisplays){
        if(PFN_vkGetDisplayPlaneSupportedDisplaysKHR_f == null) PFN_vkGetDisplayPlaneSupportedDisplaysKHR_f = new PFNvkGetDisplayPlaneSupportedDisplaysKHR(instance);
        return PFN_vkGetDisplayPlaneSupportedDisplaysKHR_f.call(physicalDevice, planeIndex, pDisplayCount, pDisplays);
    }


    public void vkGetDisplayPlaneSupportedDisplaysKHRP(VkPhysicalDevice physicalDevice, int planeIndex, VkUInt32 pDisplayCount, VkDisplayKHR pDisplays){
        if(PFN_vkGetDisplayPlaneSupportedDisplaysKHR_f == null) PFN_vkGetDisplayPlaneSupportedDisplaysKHR_f = new PFNvkGetDisplayPlaneSupportedDisplaysKHR(instance);
        int result = PFN_vkGetDisplayPlaneSupportedDisplaysKHR_f.call(physicalDevice, planeIndex, pDisplayCount, pDisplays);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkUInt32 pPropertyCount, VkDisplayModePropertiesKHR pProperties){
        if(PFN_vkGetDisplayModePropertiesKHR_f == null) PFN_vkGetDisplayModePropertiesKHR_f = new PFNvkGetDisplayModePropertiesKHR(instance);
        return PFN_vkGetDisplayModePropertiesKHR_f.call(physicalDevice, display, pPropertyCount, pProperties);
    }


    public void vkGetDisplayModePropertiesKHRP(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkUInt32 pPropertyCount, VkDisplayModePropertiesKHR pProperties){
        if(PFN_vkGetDisplayModePropertiesKHR_f == null) PFN_vkGetDisplayModePropertiesKHR_f = new PFNvkGetDisplayModePropertiesKHR(instance);
        int result = PFN_vkGetDisplayModePropertiesKHR_f.call(physicalDevice, display, pPropertyCount, pProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkDisplayModeCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkDisplayModeKHR pMode){
        if(PFN_vkCreateDisplayModeKHR_f == null) PFN_vkCreateDisplayModeKHR_f = new PFNvkCreateDisplayModeKHR(instance);
        return PFN_vkCreateDisplayModeKHR_f.call(physicalDevice, display, pCreateInfo, pAllocator, pMode);
    }


    public void vkCreateDisplayModeKHRP(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkDisplayModeCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkDisplayModeKHR pMode){
        if(PFN_vkCreateDisplayModeKHR_f == null) PFN_vkCreateDisplayModeKHR_f = new PFNvkCreateDisplayModeKHR(instance);
        int result = PFN_vkCreateDisplayModeKHR_f.call(physicalDevice, display, pCreateInfo, pAllocator, pMode);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkDisplayModeKHR mode, int planeIndex, VkDisplayPlaneCapabilitiesKHR pCapabilities){
        if(PFN_vkGetDisplayPlaneCapabilitiesKHR_f == null) PFN_vkGetDisplayPlaneCapabilitiesKHR_f = new PFNvkGetDisplayPlaneCapabilitiesKHR(instance);
        return PFN_vkGetDisplayPlaneCapabilitiesKHR_f.call(physicalDevice, mode, planeIndex, pCapabilities);
    }


    public void vkGetDisplayPlaneCapabilitiesKHRP(VkPhysicalDevice physicalDevice, VkDisplayModeKHR mode, int planeIndex, VkDisplayPlaneCapabilitiesKHR pCapabilities){
        if(PFN_vkGetDisplayPlaneCapabilitiesKHR_f == null) PFN_vkGetDisplayPlaneCapabilitiesKHR_f = new PFNvkGetDisplayPlaneCapabilitiesKHR(instance);
        int result = PFN_vkGetDisplayPlaneCapabilitiesKHR_f.call(physicalDevice, mode, planeIndex, pCapabilities);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, VkDisplaySurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkSurfaceKHR pSurface){
        if(PFN_vkCreateDisplayPlaneSurfaceKHR_f == null) PFN_vkCreateDisplayPlaneSurfaceKHR_f = new PFNvkCreateDisplayPlaneSurfaceKHR(instance);
        return PFN_vkCreateDisplayPlaneSurfaceKHR_f.call(instance, pCreateInfo, pAllocator, pSurface);
    }


    public void vkCreateDisplayPlaneSurfaceKHRP(VkInstance instance, VkDisplaySurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkSurfaceKHR pSurface){
        if(PFN_vkCreateDisplayPlaneSurfaceKHR_f == null) PFN_vkCreateDisplayPlaneSurfaceKHR_f = new PFNvkCreateDisplayPlaneSurfaceKHR(instance);
        int result = PFN_vkCreateDisplayPlaneSurfaceKHR_f.call(instance, pCreateInfo, pAllocator, pSurface);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkCreateSharedSwapchainsKHR(VkDevice device, int swapchainCount, VkSwapchainCreateInfoKHR pCreateInfos, VkAllocationCallbacks pAllocator, VkSwapchainKHR pSwapchains){
        if(PFN_vkCreateSharedSwapchainsKHR_f == null) PFN_vkCreateSharedSwapchainsKHR_f = new PFNvkCreateSharedSwapchainsKHR(instance);
        return PFN_vkCreateSharedSwapchainsKHR_f.call(device, swapchainCount, pCreateInfos, pAllocator, pSwapchains);
    }


    public void vkCreateSharedSwapchainsKHRP(VkDevice device, int swapchainCount, VkSwapchainCreateInfoKHR pCreateInfos, VkAllocationCallbacks pAllocator, VkSwapchainKHR pSwapchains){
        if(PFN_vkCreateSharedSwapchainsKHR_f == null) PFN_vkCreateSharedSwapchainsKHR_f = new PFNvkCreateSharedSwapchainsKHR(instance);
        int result = PFN_vkCreateSharedSwapchainsKHR_f.call(device, swapchainCount, pCreateInfos, pAllocator, pSwapchains);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkGetPhysicalDeviceFeatures2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures2 pFeatures){
        if(PFN_vkGetPhysicalDeviceFeatures2KHR_f == null) PFN_vkGetPhysicalDeviceFeatures2KHR_f = new PFNvkGetPhysicalDeviceFeatures2KHR(instance);
        PFN_vkGetPhysicalDeviceFeatures2KHR_f.call(physicalDevice, pFeatures);
    }


    public void vkGetPhysicalDeviceProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties2 pProperties){
        if(PFN_vkGetPhysicalDeviceProperties2KHR_f == null) PFN_vkGetPhysicalDeviceProperties2KHR_f = new PFNvkGetPhysicalDeviceProperties2KHR(instance);
        PFN_vkGetPhysicalDeviceProperties2KHR_f.call(physicalDevice, pProperties);
    }


    public void vkGetPhysicalDeviceFormatProperties2KHR(VkPhysicalDevice physicalDevice, int format, VkFormatProperties2 pFormatProperties){
        if(PFN_vkGetPhysicalDeviceFormatProperties2KHR_f == null) PFN_vkGetPhysicalDeviceFormatProperties2KHR_f = new PFNvkGetPhysicalDeviceFormatProperties2KHR(instance);
        PFN_vkGetPhysicalDeviceFormatProperties2KHR_f.call(physicalDevice, format, pFormatProperties);
    }


    public int vkGetPhysicalDeviceImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties){
        if(PFN_vkGetPhysicalDeviceImageFormatProperties2KHR_f == null) PFN_vkGetPhysicalDeviceImageFormatProperties2KHR_f = new PFNvkGetPhysicalDeviceImageFormatProperties2KHR(instance);
        return PFN_vkGetPhysicalDeviceImageFormatProperties2KHR_f.call(physicalDevice, pImageFormatInfo, pImageFormatProperties);
    }


    public void vkGetPhysicalDeviceImageFormatProperties2KHRP(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties){
        if(PFN_vkGetPhysicalDeviceImageFormatProperties2KHR_f == null) PFN_vkGetPhysicalDeviceImageFormatProperties2KHR_f = new PFNvkGetPhysicalDeviceImageFormatProperties2KHR(instance);
        int result = PFN_vkGetPhysicalDeviceImageFormatProperties2KHR_f.call(physicalDevice, pImageFormatInfo, pImageFormatProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, VkUInt32 pQueueFamilyPropertyCount, VkQueueFamilyProperties2 pQueueFamilyProperties){
        if(PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR_f == null) PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR_f = new PFNvkGetPhysicalDeviceQueueFamilyProperties2KHR(instance);
        PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR_f.call(physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties);
    }


    public void vkGetPhysicalDeviceMemoryProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2 pMemoryProperties){
        if(PFN_vkGetPhysicalDeviceMemoryProperties2KHR_f == null) PFN_vkGetPhysicalDeviceMemoryProperties2KHR_f = new PFNvkGetPhysicalDeviceMemoryProperties2KHR(instance);
        PFN_vkGetPhysicalDeviceMemoryProperties2KHR_f.call(physicalDevice, pMemoryProperties);
    }


    public void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, VkUInt32 pPropertyCount, VkSparseImageFormatProperties2 pProperties){
        if(PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR_f == null) PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR_f = new PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR(instance);
        PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR_f.call(physicalDevice, pFormatInfo, pPropertyCount, pProperties);
    }


    public void vkGetDeviceGroupPeerMemoryFeaturesKHR(VkDevice device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, VkPeerMemoryFeatureFlags pPeerMemoryFeatures){
        if(PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR_f == null) PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR_f = new PFNvkGetDeviceGroupPeerMemoryFeaturesKHR(instance);
        PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR_f.call(device, heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures);
    }


    public void vkCmdSetDeviceMaskKHR(VkCommandBuffer commandBuffer, int deviceMask){
        if(PFN_vkCmdSetDeviceMaskKHR_f == null) PFN_vkCmdSetDeviceMaskKHR_f = new PFNvkCmdSetDeviceMaskKHR(instance);
        PFN_vkCmdSetDeviceMaskKHR_f.call(commandBuffer, deviceMask);
    }


    public void vkCmdDispatchBaseKHR(VkCommandBuffer commandBuffer, int baseGroupX, int baseGroupY, int baseGroupZ, int groupCountX, int groupCountY, int groupCountZ){
        if(PFN_vkCmdDispatchBaseKHR_f == null) PFN_vkCmdDispatchBaseKHR_f = new PFNvkCmdDispatchBaseKHR(instance);
        PFN_vkCmdDispatchBaseKHR_f.call(commandBuffer, baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ);
    }


    public void vkTrimCommandPoolKHR(VkDevice device, VkCommandPool commandPool, int flags){
        if(PFN_vkTrimCommandPoolKHR_f == null) PFN_vkTrimCommandPoolKHR_f = new PFNvkTrimCommandPoolKHR(instance);
        PFN_vkTrimCommandPoolKHR_f.call(device, commandPool, flags);
    }


    public int vkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance, VkUInt32 pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties pPhysicalDeviceGroupProperties){
        if(PFN_vkEnumeratePhysicalDeviceGroupsKHR_f == null) PFN_vkEnumeratePhysicalDeviceGroupsKHR_f = new PFNvkEnumeratePhysicalDeviceGroupsKHR(instance);
        return PFN_vkEnumeratePhysicalDeviceGroupsKHR_f.call(instance, pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties);
    }


    public void vkEnumeratePhysicalDeviceGroupsKHRP(VkInstance instance, VkUInt32 pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties pPhysicalDeviceGroupProperties){
        if(PFN_vkEnumeratePhysicalDeviceGroupsKHR_f == null) PFN_vkEnumeratePhysicalDeviceGroupsKHR_f = new PFNvkEnumeratePhysicalDeviceGroupsKHR(instance);
        int result = PFN_vkEnumeratePhysicalDeviceGroupsKHR_f.call(instance, pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkGetPhysicalDeviceExternalBufferPropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo, VkExternalBufferProperties pExternalBufferProperties){
        if(PFN_vkGetPhysicalDeviceExternalBufferPropertiesKHR_f == null) PFN_vkGetPhysicalDeviceExternalBufferPropertiesKHR_f = new PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR(instance);
        PFN_vkGetPhysicalDeviceExternalBufferPropertiesKHR_f.call(physicalDevice, pExternalBufferInfo, pExternalBufferProperties);
    }


    public int vkGetMemoryFdKHR(VkDevice device, VkMemoryGetFdInfoKHR pGetFdInfo, VkInt pFd){
        if(PFN_vkGetMemoryFdKHR_f == null) PFN_vkGetMemoryFdKHR_f = new PFNvkGetMemoryFdKHR(instance);
        return PFN_vkGetMemoryFdKHR_f.call(device, pGetFdInfo, pFd);
    }


    public void vkGetMemoryFdKHRP(VkDevice device, VkMemoryGetFdInfoKHR pGetFdInfo, VkInt pFd){
        if(PFN_vkGetMemoryFdKHR_f == null) PFN_vkGetMemoryFdKHR_f = new PFNvkGetMemoryFdKHR(instance);
        int result = PFN_vkGetMemoryFdKHR_f.call(device, pGetFdInfo, pFd);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetMemoryFdPropertiesKHR(VkDevice device, int handleType, int fd, VkMemoryFdPropertiesKHR pMemoryFdProperties){
        if(PFN_vkGetMemoryFdPropertiesKHR_f == null) PFN_vkGetMemoryFdPropertiesKHR_f = new PFNvkGetMemoryFdPropertiesKHR(instance);
        return PFN_vkGetMemoryFdPropertiesKHR_f.call(device, handleType, fd, pMemoryFdProperties);
    }


    public void vkGetMemoryFdPropertiesKHRP(VkDevice device, int handleType, int fd, VkMemoryFdPropertiesKHR pMemoryFdProperties){
        if(PFN_vkGetMemoryFdPropertiesKHR_f == null) PFN_vkGetMemoryFdPropertiesKHR_f = new PFNvkGetMemoryFdPropertiesKHR(instance);
        int result = PFN_vkGetMemoryFdPropertiesKHR_f.call(device, handleType, fd, pMemoryFdProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkGetPhysicalDeviceExternalSemaphorePropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo, VkExternalSemaphoreProperties pExternalSemaphoreProperties){
        if(PFN_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR_f == null) PFN_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR_f = new PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(instance);
        PFN_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR_f.call(physicalDevice, pExternalSemaphoreInfo, pExternalSemaphoreProperties);
    }


    public int vkImportSemaphoreFdKHR(VkDevice device, VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo){
        if(PFN_vkImportSemaphoreFdKHR_f == null) PFN_vkImportSemaphoreFdKHR_f = new PFNvkImportSemaphoreFdKHR(instance);
        return PFN_vkImportSemaphoreFdKHR_f.call(device, pImportSemaphoreFdInfo);
    }


    public void vkImportSemaphoreFdKHRP(VkDevice device, VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo){
        if(PFN_vkImportSemaphoreFdKHR_f == null) PFN_vkImportSemaphoreFdKHR_f = new PFNvkImportSemaphoreFdKHR(instance);
        int result = PFN_vkImportSemaphoreFdKHR_f.call(device, pImportSemaphoreFdInfo);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetSemaphoreFdKHR(VkDevice device, VkSemaphoreGetFdInfoKHR pGetFdInfo, VkInt pFd){
        if(PFN_vkGetSemaphoreFdKHR_f == null) PFN_vkGetSemaphoreFdKHR_f = new PFNvkGetSemaphoreFdKHR(instance);
        return PFN_vkGetSemaphoreFdKHR_f.call(device, pGetFdInfo, pFd);
    }


    public void vkGetSemaphoreFdKHRP(VkDevice device, VkSemaphoreGetFdInfoKHR pGetFdInfo, VkInt pFd){
        if(PFN_vkGetSemaphoreFdKHR_f == null) PFN_vkGetSemaphoreFdKHR_f = new PFNvkGetSemaphoreFdKHR(instance);
        int result = PFN_vkGetSemaphoreFdKHR_f.call(device, pGetFdInfo, pFd);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkCmdPushDescriptorSetKHR(VkCommandBuffer commandBuffer, int pipelineBindPoint, VkPipelineLayout layout, int set, int descriptorWriteCount, VkWriteDescriptorSet pDescriptorWrites){
        if(PFN_vkCmdPushDescriptorSetKHR_f == null) PFN_vkCmdPushDescriptorSetKHR_f = new PFNvkCmdPushDescriptorSetKHR(instance);
        PFN_vkCmdPushDescriptorSetKHR_f.call(commandBuffer, pipelineBindPoint, layout, set, descriptorWriteCount, pDescriptorWrites);
    }


    public void vkCmdPushDescriptorSetWithTemplateKHR(VkCommandBuffer commandBuffer, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkPipelineLayout layout, int set, VkObject pData){
        if(PFN_vkCmdPushDescriptorSetWithTemplateKHR_f == null) PFN_vkCmdPushDescriptorSetWithTemplateKHR_f = new PFNvkCmdPushDescriptorSetWithTemplateKHR(instance);
        PFN_vkCmdPushDescriptorSetWithTemplateKHR_f.call(commandBuffer, descriptorUpdateTemplate, layout, set, pData);
    }


    public int vkCreateDescriptorUpdateTemplateKHR(VkDevice device, VkDescriptorUpdateTemplateCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorUpdateTemplate pDescriptorUpdateTemplate){
        if(PFN_vkCreateDescriptorUpdateTemplateKHR_f == null) PFN_vkCreateDescriptorUpdateTemplateKHR_f = new PFNvkCreateDescriptorUpdateTemplateKHR(instance);
        return PFN_vkCreateDescriptorUpdateTemplateKHR_f.call(device, pCreateInfo, pAllocator, pDescriptorUpdateTemplate);
    }


    public void vkCreateDescriptorUpdateTemplateKHRP(VkDevice device, VkDescriptorUpdateTemplateCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorUpdateTemplate pDescriptorUpdateTemplate){
        if(PFN_vkCreateDescriptorUpdateTemplateKHR_f == null) PFN_vkCreateDescriptorUpdateTemplateKHR_f = new PFNvkCreateDescriptorUpdateTemplateKHR(instance);
        int result = PFN_vkCreateDescriptorUpdateTemplateKHR_f.call(device, pCreateInfo, pAllocator, pDescriptorUpdateTemplate);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyDescriptorUpdateTemplateKHR(VkDevice device, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyDescriptorUpdateTemplateKHR_f == null) PFN_vkDestroyDescriptorUpdateTemplateKHR_f = new PFNvkDestroyDescriptorUpdateTemplateKHR(instance);
        PFN_vkDestroyDescriptorUpdateTemplateKHR_f.call(device, descriptorUpdateTemplate, pAllocator);
    }


    public void vkUpdateDescriptorSetWithTemplateKHR(VkDevice device, VkDescriptorSet descriptorSet, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkObject pData){
        if(PFN_vkUpdateDescriptorSetWithTemplateKHR_f == null) PFN_vkUpdateDescriptorSetWithTemplateKHR_f = new PFNvkUpdateDescriptorSetWithTemplateKHR(instance);
        PFN_vkUpdateDescriptorSetWithTemplateKHR_f.call(device, descriptorSet, descriptorUpdateTemplate, pData);
    }


    public int vkGetSwapchainStatusKHR(VkDevice device, VkSwapchainKHR swapchain){
        if(PFN_vkGetSwapchainStatusKHR_f == null) PFN_vkGetSwapchainStatusKHR_f = new PFNvkGetSwapchainStatusKHR(instance);
        return PFN_vkGetSwapchainStatusKHR_f.call(device, swapchain);
    }


    public void vkGetPhysicalDeviceExternalFencePropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo, VkExternalFenceProperties pExternalFenceProperties){
        if(PFN_vkGetPhysicalDeviceExternalFencePropertiesKHR_f == null) PFN_vkGetPhysicalDeviceExternalFencePropertiesKHR_f = new PFNvkGetPhysicalDeviceExternalFencePropertiesKHR(instance);
        PFN_vkGetPhysicalDeviceExternalFencePropertiesKHR_f.call(physicalDevice, pExternalFenceInfo, pExternalFenceProperties);
    }


    public int vkImportFenceFdKHR(VkDevice device, VkImportFenceFdInfoKHR pImportFenceFdInfo){
        if(PFN_vkImportFenceFdKHR_f == null) PFN_vkImportFenceFdKHR_f = new PFNvkImportFenceFdKHR(instance);
        return PFN_vkImportFenceFdKHR_f.call(device, pImportFenceFdInfo);
    }


    public void vkImportFenceFdKHRP(VkDevice device, VkImportFenceFdInfoKHR pImportFenceFdInfo){
        if(PFN_vkImportFenceFdKHR_f == null) PFN_vkImportFenceFdKHR_f = new PFNvkImportFenceFdKHR(instance);
        int result = PFN_vkImportFenceFdKHR_f.call(device, pImportFenceFdInfo);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetFenceFdKHR(VkDevice device, VkFenceGetFdInfoKHR pGetFdInfo, VkInt pFd){
        if(PFN_vkGetFenceFdKHR_f == null) PFN_vkGetFenceFdKHR_f = new PFNvkGetFenceFdKHR(instance);
        return PFN_vkGetFenceFdKHR_f.call(device, pGetFdInfo, pFd);
    }


    public void vkGetFenceFdKHRP(VkDevice device, VkFenceGetFdInfoKHR pGetFdInfo, VkInt pFd){
        if(PFN_vkGetFenceFdKHR_f == null) PFN_vkGetFenceFdKHR_f = new PFNvkGetFenceFdKHR(instance);
        int result = PFN_vkGetFenceFdKHR_f.call(device, pGetFdInfo, pFd);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VkSurfaceCapabilities2KHR pSurfaceCapabilities){
        if(PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR_f == null) PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR_f = new PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR(instance);
        return PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR_f.call(physicalDevice, pSurfaceInfo, pSurfaceCapabilities);
    }


    public void vkGetPhysicalDeviceSurfaceCapabilities2KHRP(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VkSurfaceCapabilities2KHR pSurfaceCapabilities){
        if(PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR_f == null) PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR_f = new PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR(instance);
        int result = PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR_f.call(physicalDevice, pSurfaceInfo, pSurfaceCapabilities);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VkUInt32 pSurfaceFormatCount, VkSurfaceFormat2KHR pSurfaceFormats){
        if(PFN_vkGetPhysicalDeviceSurfaceFormats2KHR_f == null) PFN_vkGetPhysicalDeviceSurfaceFormats2KHR_f = new PFNvkGetPhysicalDeviceSurfaceFormats2KHR(instance);
        return PFN_vkGetPhysicalDeviceSurfaceFormats2KHR_f.call(physicalDevice, pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats);
    }


    public void vkGetPhysicalDeviceSurfaceFormats2KHRP(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VkUInt32 pSurfaceFormatCount, VkSurfaceFormat2KHR pSurfaceFormats){
        if(PFN_vkGetPhysicalDeviceSurfaceFormats2KHR_f == null) PFN_vkGetPhysicalDeviceSurfaceFormats2KHR_f = new PFNvkGetPhysicalDeviceSurfaceFormats2KHR(instance);
        int result = PFN_vkGetPhysicalDeviceSurfaceFormats2KHR_f.call(physicalDevice, pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkGetImageMemoryRequirements2KHR(VkDevice device, VkImageMemoryRequirementsInfo2 pInfo, VkMemoryRequirements2 pMemoryRequirements){
        if(PFN_vkGetImageMemoryRequirements2KHR_f == null) PFN_vkGetImageMemoryRequirements2KHR_f = new PFNvkGetImageMemoryRequirements2KHR(instance);
        PFN_vkGetImageMemoryRequirements2KHR_f.call(device, pInfo, pMemoryRequirements);
    }


    public void vkGetBufferMemoryRequirements2KHR(VkDevice device, VkBufferMemoryRequirementsInfo2 pInfo, VkMemoryRequirements2 pMemoryRequirements){
        if(PFN_vkGetBufferMemoryRequirements2KHR_f == null) PFN_vkGetBufferMemoryRequirements2KHR_f = new PFNvkGetBufferMemoryRequirements2KHR(instance);
        PFN_vkGetBufferMemoryRequirements2KHR_f.call(device, pInfo, pMemoryRequirements);
    }


    public void vkGetImageSparseMemoryRequirements2KHR(VkDevice device, VkImageSparseMemoryRequirementsInfo2 pInfo, VkUInt32 pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 pSparseMemoryRequirements){
        if(PFN_vkGetImageSparseMemoryRequirements2KHR_f == null) PFN_vkGetImageSparseMemoryRequirements2KHR_f = new PFNvkGetImageSparseMemoryRequirements2KHR(instance);
        PFN_vkGetImageSparseMemoryRequirements2KHR_f.call(device, pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements);
    }


    public int vkCreateSamplerYcbcrConversionKHR(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSamplerYcbcrConversion pYcbcrConversion){
        if(PFN_vkCreateSamplerYcbcrConversionKHR_f == null) PFN_vkCreateSamplerYcbcrConversionKHR_f = new PFNvkCreateSamplerYcbcrConversionKHR(instance);
        return PFN_vkCreateSamplerYcbcrConversionKHR_f.call(device, pCreateInfo, pAllocator, pYcbcrConversion);
    }


    public void vkCreateSamplerYcbcrConversionKHRP(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSamplerYcbcrConversion pYcbcrConversion){
        if(PFN_vkCreateSamplerYcbcrConversionKHR_f == null) PFN_vkCreateSamplerYcbcrConversionKHR_f = new PFNvkCreateSamplerYcbcrConversionKHR(instance);
        int result = PFN_vkCreateSamplerYcbcrConversionKHR_f.call(device, pCreateInfo, pAllocator, pYcbcrConversion);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroySamplerYcbcrConversionKHR(VkDevice device, VkSamplerYcbcrConversion ycbcrConversion, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroySamplerYcbcrConversionKHR_f == null) PFN_vkDestroySamplerYcbcrConversionKHR_f = new PFNvkDestroySamplerYcbcrConversionKHR(instance);
        PFN_vkDestroySamplerYcbcrConversionKHR_f.call(device, ycbcrConversion, pAllocator);
    }


    public int vkBindBufferMemory2KHR(VkDevice device, int bindInfoCount, VkBindBufferMemoryInfo pBindInfos){
        if(PFN_vkBindBufferMemory2KHR_f == null) PFN_vkBindBufferMemory2KHR_f = new PFNvkBindBufferMemory2KHR(instance);
        return PFN_vkBindBufferMemory2KHR_f.call(device, bindInfoCount, pBindInfos);
    }


    public void vkBindBufferMemory2KHRP(VkDevice device, int bindInfoCount, VkBindBufferMemoryInfo pBindInfos){
        if(PFN_vkBindBufferMemory2KHR_f == null) PFN_vkBindBufferMemory2KHR_f = new PFNvkBindBufferMemory2KHR(instance);
        int result = PFN_vkBindBufferMemory2KHR_f.call(device, bindInfoCount, pBindInfos);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkBindImageMemory2KHR(VkDevice device, int bindInfoCount, VkBindImageMemoryInfo pBindInfos){
        if(PFN_vkBindImageMemory2KHR_f == null) PFN_vkBindImageMemory2KHR_f = new PFNvkBindImageMemory2KHR(instance);
        return PFN_vkBindImageMemory2KHR_f.call(device, bindInfoCount, pBindInfos);
    }


    public void vkBindImageMemory2KHRP(VkDevice device, int bindInfoCount, VkBindImageMemoryInfo pBindInfos){
        if(PFN_vkBindImageMemory2KHR_f == null) PFN_vkBindImageMemory2KHR_f = new PFNvkBindImageMemory2KHR(instance);
        int result = PFN_vkBindImageMemory2KHR_f.call(device, bindInfoCount, pBindInfos);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkGetDescriptorSetLayoutSupportKHR(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkDescriptorSetLayoutSupport pSupport){
        if(PFN_vkGetDescriptorSetLayoutSupportKHR_f == null) PFN_vkGetDescriptorSetLayoutSupportKHR_f = new PFNvkGetDescriptorSetLayoutSupportKHR(instance);
        PFN_vkGetDescriptorSetLayoutSupportKHR_f.call(device, pCreateInfo, pSupport);
    }


    public int vkCreateDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkDebugReportCallbackEXT pCallback){
        if(PFN_vkCreateDebugReportCallbackEXT_f == null) PFN_vkCreateDebugReportCallbackEXT_f = new PFNvkCreateDebugReportCallbackEXT(instance);
        return PFN_vkCreateDebugReportCallbackEXT_f.call(instance, pCreateInfo, pAllocator, pCallback);
    }


    public void vkCreateDebugReportCallbackEXTP(VkInstance instance, VkDebugReportCallbackCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkDebugReportCallbackEXT pCallback){
        if(PFN_vkCreateDebugReportCallbackEXT_f == null) PFN_vkCreateDebugReportCallbackEXT_f = new PFNvkCreateDebugReportCallbackEXT(instance);
        int result = PFN_vkCreateDebugReportCallbackEXT_f.call(instance, pCreateInfo, pAllocator, pCallback);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackEXT callback, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyDebugReportCallbackEXT_f == null) PFN_vkDestroyDebugReportCallbackEXT_f = new PFNvkDestroyDebugReportCallbackEXT(instance);
        PFN_vkDestroyDebugReportCallbackEXT_f.call(instance, callback, pAllocator);
    }


    public void vkDebugReportMessageEXT(VkInstance instance, int flags, int objectType, long object, long location, int messageCode, VkChar pLayerPrefix, VkChar pMessage){
        if(PFN_vkDebugReportMessageEXT_f == null) PFN_vkDebugReportMessageEXT_f = new PFNvkDebugReportMessageEXT(instance);
        PFN_vkDebugReportMessageEXT_f.call(instance, flags, objectType, object, location, messageCode, pLayerPrefix, pMessage);
    }


    public int vkDebugMarkerSetObjectTagEXT(VkDevice device, VkDebugMarkerObjectTagInfoEXT pTagInfo){
        if(PFN_vkDebugMarkerSetObjectTagEXT_f == null) PFN_vkDebugMarkerSetObjectTagEXT_f = new PFNvkDebugMarkerSetObjectTagEXT(instance);
        return PFN_vkDebugMarkerSetObjectTagEXT_f.call(device, pTagInfo);
    }


    public void vkDebugMarkerSetObjectTagEXTP(VkDevice device, VkDebugMarkerObjectTagInfoEXT pTagInfo){
        if(PFN_vkDebugMarkerSetObjectTagEXT_f == null) PFN_vkDebugMarkerSetObjectTagEXT_f = new PFNvkDebugMarkerSetObjectTagEXT(instance);
        int result = PFN_vkDebugMarkerSetObjectTagEXT_f.call(device, pTagInfo);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkDebugMarkerSetObjectNameEXT(VkDevice device, VkDebugMarkerObjectNameInfoEXT pNameInfo){
        if(PFN_vkDebugMarkerSetObjectNameEXT_f == null) PFN_vkDebugMarkerSetObjectNameEXT_f = new PFNvkDebugMarkerSetObjectNameEXT(instance);
        return PFN_vkDebugMarkerSetObjectNameEXT_f.call(device, pNameInfo);
    }


    public void vkDebugMarkerSetObjectNameEXTP(VkDevice device, VkDebugMarkerObjectNameInfoEXT pNameInfo){
        if(PFN_vkDebugMarkerSetObjectNameEXT_f == null) PFN_vkDebugMarkerSetObjectNameEXT_f = new PFNvkDebugMarkerSetObjectNameEXT(instance);
        int result = PFN_vkDebugMarkerSetObjectNameEXT_f.call(device, pNameInfo);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkCmdDebugMarkerBeginEXT(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT pMarkerInfo){
        if(PFN_vkCmdDebugMarkerBeginEXT_f == null) PFN_vkCmdDebugMarkerBeginEXT_f = new PFNvkCmdDebugMarkerBeginEXT(instance);
        PFN_vkCmdDebugMarkerBeginEXT_f.call(commandBuffer, pMarkerInfo);
    }


    public void vkCmdDebugMarkerEndEXT(VkCommandBuffer commandBuffer){
        if(PFN_vkCmdDebugMarkerEndEXT_f == null) PFN_vkCmdDebugMarkerEndEXT_f = new PFNvkCmdDebugMarkerEndEXT(instance);
        PFN_vkCmdDebugMarkerEndEXT_f.call(commandBuffer);
    }


    public void vkCmdDebugMarkerInsertEXT(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT pMarkerInfo){
        if(PFN_vkCmdDebugMarkerInsertEXT_f == null) PFN_vkCmdDebugMarkerInsertEXT_f = new PFNvkCmdDebugMarkerInsertEXT(instance);
        PFN_vkCmdDebugMarkerInsertEXT_f.call(commandBuffer, pMarkerInfo);
    }


    public void vkCmdDrawIndirectCountAMD(VkCommandBuffer commandBuffer, VkBuffer buffer, long offset, VkBuffer countBuffer, long countBufferOffset, int maxDrawCount, int stride){
        if(PFN_vkCmdDrawIndirectCountAMD_f == null) PFN_vkCmdDrawIndirectCountAMD_f = new PFNvkCmdDrawIndirectCountAMD(instance);
        PFN_vkCmdDrawIndirectCountAMD_f.call(commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);
    }


    public void vkCmdDrawIndexedIndirectCountAMD(VkCommandBuffer commandBuffer, VkBuffer buffer, long offset, VkBuffer countBuffer, long countBufferOffset, int maxDrawCount, int stride){
        if(PFN_vkCmdDrawIndexedIndirectCountAMD_f == null) PFN_vkCmdDrawIndexedIndirectCountAMD_f = new PFNvkCmdDrawIndexedIndirectCountAMD(instance);
        PFN_vkCmdDrawIndexedIndirectCountAMD_f.call(commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);
    }


    public int vkGetShaderInfoAMD(VkDevice device, VkPipeline pipeline, int shaderStage, int infoType, VkSize pInfoSize, VkObject pInfo){
        if(PFN_vkGetShaderInfoAMD_f == null) PFN_vkGetShaderInfoAMD_f = new PFNvkGetShaderInfoAMD(instance);
        return PFN_vkGetShaderInfoAMD_f.call(device, pipeline, shaderStage, infoType, pInfoSize, pInfo);
    }


    public void vkGetShaderInfoAMDP(VkDevice device, VkPipeline pipeline, int shaderStage, int infoType, VkSize pInfoSize, VkObject pInfo){
        if(PFN_vkGetShaderInfoAMD_f == null) PFN_vkGetShaderInfoAMD_f = new PFNvkGetShaderInfoAMD(instance);
        int result = PFN_vkGetShaderInfoAMD_f.call(device, pipeline, shaderStage, infoType, pInfoSize, pInfo);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, int externalHandleType, VkExternalImageFormatPropertiesNV pExternalImageFormatProperties){
        if(PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV_f == null) PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV_f = new PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV(instance);
        return PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV_f.call(physicalDevice, format, type, tiling, usage, flags, externalHandleType, pExternalImageFormatProperties);
    }


    public void vkGetPhysicalDeviceExternalImageFormatPropertiesNVP(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, int externalHandleType, VkExternalImageFormatPropertiesNV pExternalImageFormatProperties){
        if(PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV_f == null) PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV_f = new PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV(instance);
        int result = PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV_f.call(physicalDevice, format, type, tiling, usage, flags, externalHandleType, pExternalImageFormatProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkCmdProcessCommandsNVX(VkCommandBuffer commandBuffer, VkCmdProcessCommandsInfoNVX pProcessCommandsInfo){
        if(PFN_vkCmdProcessCommandsNVX_f == null) PFN_vkCmdProcessCommandsNVX_f = new PFNvkCmdProcessCommandsNVX(instance);
        PFN_vkCmdProcessCommandsNVX_f.call(commandBuffer, pProcessCommandsInfo);
    }


    public void vkCmdReserveSpaceForCommandsNVX(VkCommandBuffer commandBuffer, VkCmdReserveSpaceForCommandsInfoNVX pReserveSpaceInfo){
        if(PFN_vkCmdReserveSpaceForCommandsNVX_f == null) PFN_vkCmdReserveSpaceForCommandsNVX_f = new PFNvkCmdReserveSpaceForCommandsNVX(instance);
        PFN_vkCmdReserveSpaceForCommandsNVX_f.call(commandBuffer, pReserveSpaceInfo);
    }


    public int vkCreateIndirectCommandsLayoutNVX(VkDevice device, VkIndirectCommandsLayoutCreateInfoNVX pCreateInfo, VkAllocationCallbacks pAllocator, VkIndirectCommandsLayoutNVX pIndirectCommandsLayout){
        if(PFN_vkCreateIndirectCommandsLayoutNVX_f == null) PFN_vkCreateIndirectCommandsLayoutNVX_f = new PFNvkCreateIndirectCommandsLayoutNVX(instance);
        return PFN_vkCreateIndirectCommandsLayoutNVX_f.call(device, pCreateInfo, pAllocator, pIndirectCommandsLayout);
    }


    public void vkCreateIndirectCommandsLayoutNVXP(VkDevice device, VkIndirectCommandsLayoutCreateInfoNVX pCreateInfo, VkAllocationCallbacks pAllocator, VkIndirectCommandsLayoutNVX pIndirectCommandsLayout){
        if(PFN_vkCreateIndirectCommandsLayoutNVX_f == null) PFN_vkCreateIndirectCommandsLayoutNVX_f = new PFNvkCreateIndirectCommandsLayoutNVX(instance);
        int result = PFN_vkCreateIndirectCommandsLayoutNVX_f.call(device, pCreateInfo, pAllocator, pIndirectCommandsLayout);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyIndirectCommandsLayoutNVX(VkDevice device, VkIndirectCommandsLayoutNVX indirectCommandsLayout, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyIndirectCommandsLayoutNVX_f == null) PFN_vkDestroyIndirectCommandsLayoutNVX_f = new PFNvkDestroyIndirectCommandsLayoutNVX(instance);
        PFN_vkDestroyIndirectCommandsLayoutNVX_f.call(device, indirectCommandsLayout, pAllocator);
    }


    public int vkCreateObjectTableNVX(VkDevice device, VkObjectTableCreateInfoNVX pCreateInfo, VkAllocationCallbacks pAllocator, VkObjectTableNVX pObjectTable){
        if(PFN_vkCreateObjectTableNVX_f == null) PFN_vkCreateObjectTableNVX_f = new PFNvkCreateObjectTableNVX(instance);
        return PFN_vkCreateObjectTableNVX_f.call(device, pCreateInfo, pAllocator, pObjectTable);
    }


    public void vkCreateObjectTableNVXP(VkDevice device, VkObjectTableCreateInfoNVX pCreateInfo, VkAllocationCallbacks pAllocator, VkObjectTableNVX pObjectTable){
        if(PFN_vkCreateObjectTableNVX_f == null) PFN_vkCreateObjectTableNVX_f = new PFNvkCreateObjectTableNVX(instance);
        int result = PFN_vkCreateObjectTableNVX_f.call(device, pCreateInfo, pAllocator, pObjectTable);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyObjectTableNVX(VkDevice device, VkObjectTableNVX objectTable, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyObjectTableNVX_f == null) PFN_vkDestroyObjectTableNVX_f = new PFNvkDestroyObjectTableNVX(instance);
        PFN_vkDestroyObjectTableNVX_f.call(device, objectTable, pAllocator);
    }


    public int vkRegisterObjectsNVX(VkDevice device, VkObjectTableNVX objectTable, int objectCount, VkObject ppObjectTableEntries, VkUInt32 pObjectIndices){
        if(PFN_vkRegisterObjectsNVX_f == null) PFN_vkRegisterObjectsNVX_f = new PFNvkRegisterObjectsNVX(instance);
        return PFN_vkRegisterObjectsNVX_f.call(device, objectTable, objectCount, ppObjectTableEntries, pObjectIndices);
    }


    public void vkRegisterObjectsNVXP(VkDevice device, VkObjectTableNVX objectTable, int objectCount, VkObject ppObjectTableEntries, VkUInt32 pObjectIndices){
        if(PFN_vkRegisterObjectsNVX_f == null) PFN_vkRegisterObjectsNVX_f = new PFNvkRegisterObjectsNVX(instance);
        int result = PFN_vkRegisterObjectsNVX_f.call(device, objectTable, objectCount, ppObjectTableEntries, pObjectIndices);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkUnregisterObjectsNVX(VkDevice device, VkObjectTableNVX objectTable, int objectCount, VkObjectEntryTypeNVX pObjectEntryTypes, VkUInt32 pObjectIndices){
        if(PFN_vkUnregisterObjectsNVX_f == null) PFN_vkUnregisterObjectsNVX_f = new PFNvkUnregisterObjectsNVX(instance);
        return PFN_vkUnregisterObjectsNVX_f.call(device, objectTable, objectCount, pObjectEntryTypes, pObjectIndices);
    }


    public void vkUnregisterObjectsNVXP(VkDevice device, VkObjectTableNVX objectTable, int objectCount, VkObjectEntryTypeNVX pObjectEntryTypes, VkUInt32 pObjectIndices){
        if(PFN_vkUnregisterObjectsNVX_f == null) PFN_vkUnregisterObjectsNVX_f = new PFNvkUnregisterObjectsNVX(instance);
        int result = PFN_vkUnregisterObjectsNVX_f.call(device, objectTable, objectCount, pObjectEntryTypes, pObjectIndices);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(VkPhysicalDevice physicalDevice, VkDeviceGeneratedCommandsFeaturesNVX pFeatures, VkDeviceGeneratedCommandsLimitsNVX pLimits){
        if(PFN_vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX_f == null) PFN_vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX_f = new PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(instance);
        PFN_vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX_f.call(physicalDevice, pFeatures, pLimits);
    }


    public void vkCmdSetViewportWScalingNV(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, VkViewportWScalingNV pViewportWScalings){
        if(PFN_vkCmdSetViewportWScalingNV_f == null) PFN_vkCmdSetViewportWScalingNV_f = new PFNvkCmdSetViewportWScalingNV(instance);
        PFN_vkCmdSetViewportWScalingNV_f.call(commandBuffer, firstViewport, viewportCount, pViewportWScalings);
    }


    public int vkReleaseDisplayEXT(VkPhysicalDevice physicalDevice, VkDisplayKHR display){
        if(PFN_vkReleaseDisplayEXT_f == null) PFN_vkReleaseDisplayEXT_f = new PFNvkReleaseDisplayEXT(instance);
        return PFN_vkReleaseDisplayEXT_f.call(physicalDevice, display);
    }


    public void vkReleaseDisplayEXTP(VkPhysicalDevice physicalDevice, VkDisplayKHR display){
        if(PFN_vkReleaseDisplayEXT_f == null) PFN_vkReleaseDisplayEXT_f = new PFNvkReleaseDisplayEXT(instance);
        int result = PFN_vkReleaseDisplayEXT_f.call(physicalDevice, display);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetPhysicalDeviceSurfaceCapabilities2EXT(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilities2EXT pSurfaceCapabilities){
        if(PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT_f == null) PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT_f = new PFNvkGetPhysicalDeviceSurfaceCapabilities2EXT(instance);
        return PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT_f.call(physicalDevice, surface, pSurfaceCapabilities);
    }


    public void vkGetPhysicalDeviceSurfaceCapabilities2EXTP(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilities2EXT pSurfaceCapabilities){
        if(PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT_f == null) PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT_f = new PFNvkGetPhysicalDeviceSurfaceCapabilities2EXT(instance);
        int result = PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT_f.call(physicalDevice, surface, pSurfaceCapabilities);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkDisplayPowerControlEXT(VkDevice device, VkDisplayKHR display, VkDisplayPowerInfoEXT pDisplayPowerInfo){
        if(PFN_vkDisplayPowerControlEXT_f == null) PFN_vkDisplayPowerControlEXT_f = new PFNvkDisplayPowerControlEXT(instance);
        return PFN_vkDisplayPowerControlEXT_f.call(device, display, pDisplayPowerInfo);
    }


    public void vkDisplayPowerControlEXTP(VkDevice device, VkDisplayKHR display, VkDisplayPowerInfoEXT pDisplayPowerInfo){
        if(PFN_vkDisplayPowerControlEXT_f == null) PFN_vkDisplayPowerControlEXT_f = new PFNvkDisplayPowerControlEXT(instance);
        int result = PFN_vkDisplayPowerControlEXT_f.call(device, display, pDisplayPowerInfo);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkRegisterDeviceEventEXT(VkDevice device, VkDeviceEventInfoEXT pDeviceEventInfo, VkAllocationCallbacks pAllocator, VkFence pFence){
        if(PFN_vkRegisterDeviceEventEXT_f == null) PFN_vkRegisterDeviceEventEXT_f = new PFNvkRegisterDeviceEventEXT(instance);
        return PFN_vkRegisterDeviceEventEXT_f.call(device, pDeviceEventInfo, pAllocator, pFence);
    }


    public void vkRegisterDeviceEventEXTP(VkDevice device, VkDeviceEventInfoEXT pDeviceEventInfo, VkAllocationCallbacks pAllocator, VkFence pFence){
        if(PFN_vkRegisterDeviceEventEXT_f == null) PFN_vkRegisterDeviceEventEXT_f = new PFNvkRegisterDeviceEventEXT(instance);
        int result = PFN_vkRegisterDeviceEventEXT_f.call(device, pDeviceEventInfo, pAllocator, pFence);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkRegisterDisplayEventEXT(VkDevice device, VkDisplayKHR display, VkDisplayEventInfoEXT pDisplayEventInfo, VkAllocationCallbacks pAllocator, VkFence pFence){
        if(PFN_vkRegisterDisplayEventEXT_f == null) PFN_vkRegisterDisplayEventEXT_f = new PFNvkRegisterDisplayEventEXT(instance);
        return PFN_vkRegisterDisplayEventEXT_f.call(device, display, pDisplayEventInfo, pAllocator, pFence);
    }


    public void vkRegisterDisplayEventEXTP(VkDevice device, VkDisplayKHR display, VkDisplayEventInfoEXT pDisplayEventInfo, VkAllocationCallbacks pAllocator, VkFence pFence){
        if(PFN_vkRegisterDisplayEventEXT_f == null) PFN_vkRegisterDisplayEventEXT_f = new PFNvkRegisterDisplayEventEXT(instance);
        int result = PFN_vkRegisterDisplayEventEXT_f.call(device, display, pDisplayEventInfo, pAllocator, pFence);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetSwapchainCounterEXT(VkDevice device, VkSwapchainKHR swapchain, int counter, VkUInt64 pCounterValue){
        if(PFN_vkGetSwapchainCounterEXT_f == null) PFN_vkGetSwapchainCounterEXT_f = new PFNvkGetSwapchainCounterEXT(instance);
        return PFN_vkGetSwapchainCounterEXT_f.call(device, swapchain, counter, pCounterValue);
    }


    public void vkGetSwapchainCounterEXTP(VkDevice device, VkSwapchainKHR swapchain, int counter, VkUInt64 pCounterValue){
        if(PFN_vkGetSwapchainCounterEXT_f == null) PFN_vkGetSwapchainCounterEXT_f = new PFNvkGetSwapchainCounterEXT(instance);
        int result = PFN_vkGetSwapchainCounterEXT_f.call(device, swapchain, counter, pCounterValue);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetRefreshCycleDurationGOOGLE(VkDevice device, VkSwapchainKHR swapchain, VkRefreshCycleDurationGOOGLE pDisplayTimingProperties){
        if(PFN_vkGetRefreshCycleDurationGOOGLE_f == null) PFN_vkGetRefreshCycleDurationGOOGLE_f = new PFNvkGetRefreshCycleDurationGOOGLE(instance);
        return PFN_vkGetRefreshCycleDurationGOOGLE_f.call(device, swapchain, pDisplayTimingProperties);
    }


    public void vkGetRefreshCycleDurationGOOGLEP(VkDevice device, VkSwapchainKHR swapchain, VkRefreshCycleDurationGOOGLE pDisplayTimingProperties){
        if(PFN_vkGetRefreshCycleDurationGOOGLE_f == null) PFN_vkGetRefreshCycleDurationGOOGLE_f = new PFNvkGetRefreshCycleDurationGOOGLE(instance);
        int result = PFN_vkGetRefreshCycleDurationGOOGLE_f.call(device, swapchain, pDisplayTimingProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetPastPresentationTimingGOOGLE(VkDevice device, VkSwapchainKHR swapchain, VkUInt32 pPresentationTimingCount, VkPastPresentationTimingGOOGLE pPresentationTimings){
        if(PFN_vkGetPastPresentationTimingGOOGLE_f == null) PFN_vkGetPastPresentationTimingGOOGLE_f = new PFNvkGetPastPresentationTimingGOOGLE(instance);
        return PFN_vkGetPastPresentationTimingGOOGLE_f.call(device, swapchain, pPresentationTimingCount, pPresentationTimings);
    }


    public void vkGetPastPresentationTimingGOOGLEP(VkDevice device, VkSwapchainKHR swapchain, VkUInt32 pPresentationTimingCount, VkPastPresentationTimingGOOGLE pPresentationTimings){
        if(PFN_vkGetPastPresentationTimingGOOGLE_f == null) PFN_vkGetPastPresentationTimingGOOGLE_f = new PFNvkGetPastPresentationTimingGOOGLE(instance);
        int result = PFN_vkGetPastPresentationTimingGOOGLE_f.call(device, swapchain, pPresentationTimingCount, pPresentationTimings);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkCmdSetDiscardRectangleEXT(VkCommandBuffer commandBuffer, int firstDiscardRectangle, int discardRectangleCount, VkRect2D pDiscardRectangles){
        if(PFN_vkCmdSetDiscardRectangleEXT_f == null) PFN_vkCmdSetDiscardRectangleEXT_f = new PFNvkCmdSetDiscardRectangleEXT(instance);
        PFN_vkCmdSetDiscardRectangleEXT_f.call(commandBuffer, firstDiscardRectangle, discardRectangleCount, pDiscardRectangles);
    }


    public void vkSetHdrMetadataEXT(VkDevice device, int swapchainCount, VkSwapchainKHR pSwapchains, VkHdrMetadataEXT pMetadata){
        if(PFN_vkSetHdrMetadataEXT_f == null) PFN_vkSetHdrMetadataEXT_f = new PFNvkSetHdrMetadataEXT(instance);
        PFN_vkSetHdrMetadataEXT_f.call(device, swapchainCount, pSwapchains, pMetadata);
    }


    public int vkSetDebugUtilsObjectNameEXT(VkDevice device, VkDebugUtilsObjectNameInfoEXT pNameInfo){
        if(PFN_vkSetDebugUtilsObjectNameEXT_f == null) PFN_vkSetDebugUtilsObjectNameEXT_f = new PFNvkSetDebugUtilsObjectNameEXT(instance);
        return PFN_vkSetDebugUtilsObjectNameEXT_f.call(device, pNameInfo);
    }


    public void vkSetDebugUtilsObjectNameEXTP(VkDevice device, VkDebugUtilsObjectNameInfoEXT pNameInfo){
        if(PFN_vkSetDebugUtilsObjectNameEXT_f == null) PFN_vkSetDebugUtilsObjectNameEXT_f = new PFNvkSetDebugUtilsObjectNameEXT(instance);
        int result = PFN_vkSetDebugUtilsObjectNameEXT_f.call(device, pNameInfo);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkSetDebugUtilsObjectTagEXT(VkDevice device, VkDebugUtilsObjectTagInfoEXT pTagInfo){
        if(PFN_vkSetDebugUtilsObjectTagEXT_f == null) PFN_vkSetDebugUtilsObjectTagEXT_f = new PFNvkSetDebugUtilsObjectTagEXT(instance);
        return PFN_vkSetDebugUtilsObjectTagEXT_f.call(device, pTagInfo);
    }


    public void vkSetDebugUtilsObjectTagEXTP(VkDevice device, VkDebugUtilsObjectTagInfoEXT pTagInfo){
        if(PFN_vkSetDebugUtilsObjectTagEXT_f == null) PFN_vkSetDebugUtilsObjectTagEXT_f = new PFNvkSetDebugUtilsObjectTagEXT(instance);
        int result = PFN_vkSetDebugUtilsObjectTagEXT_f.call(device, pTagInfo);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkQueueBeginDebugUtilsLabelEXT(VkQueue queue, VkDebugUtilsLabelEXT pLabelInfo){
        if(PFN_vkQueueBeginDebugUtilsLabelEXT_f == null) PFN_vkQueueBeginDebugUtilsLabelEXT_f = new PFNvkQueueBeginDebugUtilsLabelEXT(instance);
        PFN_vkQueueBeginDebugUtilsLabelEXT_f.call(queue, pLabelInfo);
    }


    public void vkQueueEndDebugUtilsLabelEXT(VkQueue queue){
        if(PFN_vkQueueEndDebugUtilsLabelEXT_f == null) PFN_vkQueueEndDebugUtilsLabelEXT_f = new PFNvkQueueEndDebugUtilsLabelEXT(instance);
        PFN_vkQueueEndDebugUtilsLabelEXT_f.call(queue);
    }


    public void vkQueueInsertDebugUtilsLabelEXT(VkQueue queue, VkDebugUtilsLabelEXT pLabelInfo){
        if(PFN_vkQueueInsertDebugUtilsLabelEXT_f == null) PFN_vkQueueInsertDebugUtilsLabelEXT_f = new PFNvkQueueInsertDebugUtilsLabelEXT(instance);
        PFN_vkQueueInsertDebugUtilsLabelEXT_f.call(queue, pLabelInfo);
    }


    public void vkCmdBeginDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, VkDebugUtilsLabelEXT pLabelInfo){
        if(PFN_vkCmdBeginDebugUtilsLabelEXT_f == null) PFN_vkCmdBeginDebugUtilsLabelEXT_f = new PFNvkCmdBeginDebugUtilsLabelEXT(instance);
        PFN_vkCmdBeginDebugUtilsLabelEXT_f.call(commandBuffer, pLabelInfo);
    }


    public void vkCmdEndDebugUtilsLabelEXT(VkCommandBuffer commandBuffer){
        if(PFN_vkCmdEndDebugUtilsLabelEXT_f == null) PFN_vkCmdEndDebugUtilsLabelEXT_f = new PFNvkCmdEndDebugUtilsLabelEXT(instance);
        PFN_vkCmdEndDebugUtilsLabelEXT_f.call(commandBuffer);
    }


    public void vkCmdInsertDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, VkDebugUtilsLabelEXT pLabelInfo){
        if(PFN_vkCmdInsertDebugUtilsLabelEXT_f == null) PFN_vkCmdInsertDebugUtilsLabelEXT_f = new PFNvkCmdInsertDebugUtilsLabelEXT(instance);
        PFN_vkCmdInsertDebugUtilsLabelEXT_f.call(commandBuffer, pLabelInfo);
    }


    public int vkCreateDebugUtilsMessengerEXT(VkInstance instance, VkDebugUtilsMessengerCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkDebugUtilsMessengerEXT pMessenger){
        if(PFN_vkCreateDebugUtilsMessengerEXT_f == null) PFN_vkCreateDebugUtilsMessengerEXT_f = new PFNvkCreateDebugUtilsMessengerEXT(instance);
        return PFN_vkCreateDebugUtilsMessengerEXT_f.call(instance, pCreateInfo, pAllocator, pMessenger);
    }


    public void vkCreateDebugUtilsMessengerEXTP(VkInstance instance, VkDebugUtilsMessengerCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkDebugUtilsMessengerEXT pMessenger){
        if(PFN_vkCreateDebugUtilsMessengerEXT_f == null) PFN_vkCreateDebugUtilsMessengerEXT_f = new PFNvkCreateDebugUtilsMessengerEXT(instance);
        int result = PFN_vkCreateDebugUtilsMessengerEXT_f.call(instance, pCreateInfo, pAllocator, pMessenger);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyDebugUtilsMessengerEXT(VkInstance instance, VkDebugUtilsMessengerEXT messenger, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyDebugUtilsMessengerEXT_f == null) PFN_vkDestroyDebugUtilsMessengerEXT_f = new PFNvkDestroyDebugUtilsMessengerEXT(instance);
        PFN_vkDestroyDebugUtilsMessengerEXT_f.call(instance, messenger, pAllocator);
    }


    public void vkSubmitDebugUtilsMessageEXT(VkInstance instance, int messageSeverity, int messageTypes, VkDebugUtilsMessengerCallbackDataEXT pCallbackData){
        if(PFN_vkSubmitDebugUtilsMessageEXT_f == null) PFN_vkSubmitDebugUtilsMessageEXT_f = new PFNvkSubmitDebugUtilsMessageEXT(instance);
        PFN_vkSubmitDebugUtilsMessageEXT_f.call(instance, messageSeverity, messageTypes, pCallbackData);
    }


    public void vkCmdSetSampleLocationsEXT(VkCommandBuffer commandBuffer, VkSampleLocationsInfoEXT pSampleLocationsInfo){
        if(PFN_vkCmdSetSampleLocationsEXT_f == null) PFN_vkCmdSetSampleLocationsEXT_f = new PFNvkCmdSetSampleLocationsEXT(instance);
        PFN_vkCmdSetSampleLocationsEXT_f.call(commandBuffer, pSampleLocationsInfo);
    }


    public void vkGetPhysicalDeviceMultisamplePropertiesEXT(VkPhysicalDevice physicalDevice, int samples, VkMultisamplePropertiesEXT pMultisampleProperties){
        if(PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT_f == null) PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT_f = new PFNvkGetPhysicalDeviceMultisamplePropertiesEXT(instance);
        PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT_f.call(physicalDevice, samples, pMultisampleProperties);
    }


    public int vkCreateValidationCacheEXT(VkDevice device, VkValidationCacheCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkValidationCacheEXT pValidationCache){
        if(PFN_vkCreateValidationCacheEXT_f == null) PFN_vkCreateValidationCacheEXT_f = new PFNvkCreateValidationCacheEXT(instance);
        return PFN_vkCreateValidationCacheEXT_f.call(device, pCreateInfo, pAllocator, pValidationCache);
    }


    public void vkCreateValidationCacheEXTP(VkDevice device, VkValidationCacheCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkValidationCacheEXT pValidationCache){
        if(PFN_vkCreateValidationCacheEXT_f == null) PFN_vkCreateValidationCacheEXT_f = new PFNvkCreateValidationCacheEXT(instance);
        int result = PFN_vkCreateValidationCacheEXT_f.call(device, pCreateInfo, pAllocator, pValidationCache);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkDestroyValidationCacheEXT(VkDevice device, VkValidationCacheEXT validationCache, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyValidationCacheEXT_f == null) PFN_vkDestroyValidationCacheEXT_f = new PFNvkDestroyValidationCacheEXT(instance);
        PFN_vkDestroyValidationCacheEXT_f.call(device, validationCache, pAllocator);
    }


    public int vkMergeValidationCachesEXT(VkDevice device, VkValidationCacheEXT dstCache, int srcCacheCount, VkValidationCacheEXT pSrcCaches){
        if(PFN_vkMergeValidationCachesEXT_f == null) PFN_vkMergeValidationCachesEXT_f = new PFNvkMergeValidationCachesEXT(instance);
        return PFN_vkMergeValidationCachesEXT_f.call(device, dstCache, srcCacheCount, pSrcCaches);
    }


    public void vkMergeValidationCachesEXTP(VkDevice device, VkValidationCacheEXT dstCache, int srcCacheCount, VkValidationCacheEXT pSrcCaches){
        if(PFN_vkMergeValidationCachesEXT_f == null) PFN_vkMergeValidationCachesEXT_f = new PFNvkMergeValidationCachesEXT(instance);
        int result = PFN_vkMergeValidationCachesEXT_f.call(device, dstCache, srcCacheCount, pSrcCaches);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetValidationCacheDataEXT(VkDevice device, VkValidationCacheEXT validationCache, VkSize pDataSize, VkObject pData){
        if(PFN_vkGetValidationCacheDataEXT_f == null) PFN_vkGetValidationCacheDataEXT_f = new PFNvkGetValidationCacheDataEXT(instance);
        return PFN_vkGetValidationCacheDataEXT_f.call(device, validationCache, pDataSize, pData);
    }


    public void vkGetValidationCacheDataEXTP(VkDevice device, VkValidationCacheEXT validationCache, VkSize pDataSize, VkObject pData){
        if(PFN_vkGetValidationCacheDataEXT_f == null) PFN_vkGetValidationCacheDataEXT_f = new PFNvkGetValidationCacheDataEXT(instance);
        int result = PFN_vkGetValidationCacheDataEXT_f.call(device, validationCache, pDataSize, pData);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public int vkGetMemoryHostPointerPropertiesEXT(VkDevice device, int handleType, VkObject pHostPointer, VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties){
        if(PFN_vkGetMemoryHostPointerPropertiesEXT_f == null) PFN_vkGetMemoryHostPointerPropertiesEXT_f = new PFNvkGetMemoryHostPointerPropertiesEXT(instance);
        return PFN_vkGetMemoryHostPointerPropertiesEXT_f.call(device, handleType, pHostPointer, pMemoryHostPointerProperties);
    }


    public void vkGetMemoryHostPointerPropertiesEXTP(VkDevice device, int handleType, VkObject pHostPointer, VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties){
        if(PFN_vkGetMemoryHostPointerPropertiesEXT_f == null) PFN_vkGetMemoryHostPointerPropertiesEXT_f = new PFNvkGetMemoryHostPointerPropertiesEXT(instance);
        int result = PFN_vkGetMemoryHostPointerPropertiesEXT_f.call(device, handleType, pHostPointer, pMemoryHostPointerProperties);
        if(result != VK_SUCCESS) throw new VkException(result, "%VKFUNCTIONNAME%");
    }


    public void vkCmdWriteBufferMarkerAMD(VkCommandBuffer commandBuffer, int pipelineStage, VkBuffer dstBuffer, long dstOffset, int marker){
        if(PFN_vkCmdWriteBufferMarkerAMD_f == null) PFN_vkCmdWriteBufferMarkerAMD_f = new PFNvkCmdWriteBufferMarkerAMD(instance);
        PFN_vkCmdWriteBufferMarkerAMD_f.call(commandBuffer, pipelineStage, dstBuffer, dstOffset, marker);
    }


    public static final int VK_PIPELINE_CACHE_HEADER_VERSION_ONE = VkPipelineCacheHeaderVersion.VK_PIPELINE_CACHE_HEADER_VERSION_ONE;
    public static final int VK_SUCCESS = VkResult.VK_SUCCESS;
    public static final int VK_NOT_READY = VkResult.VK_NOT_READY;
    public static final int VK_TIMEOUT = VkResult.VK_TIMEOUT;
    public static final int VK_EVENT_SET = VkResult.VK_EVENT_SET;
    public static final int VK_EVENT_RESET = VkResult.VK_EVENT_RESET;
    public static final int VK_INCOMPLETE = VkResult.VK_INCOMPLETE;
    public static final int VK_ERROR_OUT_OF_HOST_MEMORY = VkResult.VK_ERROR_OUT_OF_HOST_MEMORY;
    public static final int VK_ERROR_OUT_OF_DEVICE_MEMORY = VkResult.VK_ERROR_OUT_OF_DEVICE_MEMORY;
    public static final int VK_ERROR_INITIALIZATION_FAILED = VkResult.VK_ERROR_INITIALIZATION_FAILED;
    public static final int VK_ERROR_DEVICE_LOST = VkResult.VK_ERROR_DEVICE_LOST;
    public static final int VK_ERROR_MEMORY_MAP_FAILED = VkResult.VK_ERROR_MEMORY_MAP_FAILED;
    public static final int VK_ERROR_LAYER_NOT_PRESENT = VkResult.VK_ERROR_LAYER_NOT_PRESENT;
    public static final int VK_ERROR_EXTENSION_NOT_PRESENT = VkResult.VK_ERROR_EXTENSION_NOT_PRESENT;
    public static final int VK_ERROR_FEATURE_NOT_PRESENT = VkResult.VK_ERROR_FEATURE_NOT_PRESENT;
    public static final int VK_ERROR_INCOMPATIBLE_DRIVER = VkResult.VK_ERROR_INCOMPATIBLE_DRIVER;
    public static final int VK_ERROR_TOO_MANY_OBJECTS = VkResult.VK_ERROR_TOO_MANY_OBJECTS;
    public static final int VK_ERROR_FORMAT_NOT_SUPPORTED = VkResult.VK_ERROR_FORMAT_NOT_SUPPORTED;
    public static final int VK_ERROR_FRAGMENTED_POOL = VkResult.VK_ERROR_FRAGMENTED_POOL;
    public static final int VK_ERROR_OUT_OF_POOL_MEMORY = VkResult.VK_ERROR_OUT_OF_POOL_MEMORY;
    public static final int VK_ERROR_INVALID_EXTERNAL_HANDLE = VkResult.VK_ERROR_INVALID_EXTERNAL_HANDLE;
    public static final int VK_ERROR_SURFACE_LOST_KHR = VkResult.VK_ERROR_SURFACE_LOST_KHR;
    public static final int VK_ERROR_NATIVE_WINDOW_IN_USE_KHR = VkResult.VK_ERROR_NATIVE_WINDOW_IN_USE_KHR;
    public static final int VK_SUBOPTIMAL_KHR = VkResult.VK_SUBOPTIMAL_KHR;
    public static final int VK_ERROR_OUT_OF_DATE_KHR = VkResult.VK_ERROR_OUT_OF_DATE_KHR;
    public static final int VK_ERROR_INCOMPATIBLE_DISPLAY_KHR = VkResult.VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
    public static final int VK_ERROR_VALIDATION_FAILED_EXT = VkResult.VK_ERROR_VALIDATION_FAILED_EXT;
    public static final int VK_ERROR_INVALID_SHADER_NV = VkResult.VK_ERROR_INVALID_SHADER_NV;
    public static final int VK_ERROR_FRAGMENTATION_EXT = VkResult.VK_ERROR_FRAGMENTATION_EXT;
    public static final int VK_ERROR_NOT_PERMITTED_EXT = VkResult.VK_ERROR_NOT_PERMITTED_EXT;
    public static final int VK_ERROR_OUT_OF_POOL_MEMORY_KHR = VkResult.VK_ERROR_OUT_OF_POOL_MEMORY_KHR;
    public static final int VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR = VkResult.VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR;
    public static final int VK_STRUCTURE_TYPE_APPLICATION_INFO = VkStructureType.VK_STRUCTURE_TYPE_APPLICATION_INFO;
    public static final int VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_SUBMIT_INFO = VkStructureType.VK_STRUCTURE_TYPE_SUBMIT_INFO;
    public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO;
    public static final int VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE = VkStructureType.VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE;
    public static final int VK_STRUCTURE_TYPE_BIND_SPARSE_INFO = VkStructureType.VK_STRUCTURE_TYPE_BIND_SPARSE_INFO;
    public static final int VK_STRUCTURE_TYPE_FENCE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_FENCE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_EVENT_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_EVENT_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET = VkStructureType.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET;
    public static final int VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET = VkStructureType.VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET;
    public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO = VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO = VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO = VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER = VkStructureType.VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER = VkStructureType.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
    public static final int VK_STRUCTURE_TYPE_MEMORY_BARRIER = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_BARRIER;
    public static final int VK_STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO = VkStructureType.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO = VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES;
    public static final int VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS;
    public static final int VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO;
    public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO;
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO = VkStructureType.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO = VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2 = VkStructureType.VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2 = VkStructureType.VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2 = VkStructureType.VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2;
    public static final int VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2 = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2;
    public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2 = VkStructureType.VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2 = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2 = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2;
    public static final int VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2 = VkStructureType.VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2;
    public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2 = VkStructureType.VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2 = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2 = VkStructureType.VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2 = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2;
    public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2 = VkStructureType.VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2 = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES;
    public static final int VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO = VkStructureType.VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2 = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO = VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO = VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO;
    public static final int VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO = VkStructureType.VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES = VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES = VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES = VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES = VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO = VkStructureType.VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES = VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT = VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_PRESENT_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_PRESENT_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_MIR_SURFACE_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_MIR_SURFACE_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD;
    public static final int VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV = VkStructureType.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV;
    public static final int VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV = VkStructureType.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV;
    public static final int VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV = VkStructureType.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV;
    public static final int VK_STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD = VkStructureType.VK_STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV = VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV = VkStructureType.VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV;
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV = VkStructureType.VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV = VkStructureType.VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV;
    public static final int VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV = VkStructureType.VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV;
    public static final int VK_STRUCTURE_TYPE_VALIDATION_FLAGS_EXT = VkStructureType.VK_STRUCTURE_TYPE_VALIDATION_FLAGS_EXT;
    public static final int VK_STRUCTURE_TYPE_VI_SURFACE_CREATE_INFO_NN = VkStructureType.VK_STRUCTURE_TYPE_VI_SURFACE_CREATE_INFO_NN;
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHR = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHR;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR;
    public static final int VK_STRUCTURE_TYPE_PRESENT_REGIONS_KHR = VkStructureType.VK_STRUCTURE_TYPE_PRESENT_REGIONS_KHR;
    public static final int VK_STRUCTURE_TYPE_OBJECT_TABLE_CREATE_INFO_NVX = VkStructureType.VK_STRUCTURE_TYPE_OBJECT_TABLE_CREATE_INFO_NVX;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX = VkStructureType.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX;
    public static final int VK_STRUCTURE_TYPE_CMD_PROCESS_COMMANDS_INFO_NVX = VkStructureType.VK_STRUCTURE_TYPE_CMD_PROCESS_COMMANDS_INFO_NVX;
    public static final int VK_STRUCTURE_TYPE_CMD_RESERVE_SPACE_FOR_COMMANDS_INFO_NVX = VkStructureType.VK_STRUCTURE_TYPE_CMD_RESERVE_SPACE_FOR_COMMANDS_INFO_NVX;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_LIMITS_NVX = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_LIMITS_NVX;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_FEATURES_NVX = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_FEATURES_NVX;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT = VkStructureType.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE = VkStructureType.VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_HDR_METADATA_EXT = VkStructureType.VK_STRUCTURE_TYPE_HDR_METADATA_EXT;
    public static final int VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR = VkStructureType.VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR;
    public static final int VK_STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR;
    public static final int VK_STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR;
    public static final int VK_STRUCTURE_TYPE_IOS_SURFACE_CREATE_INFO_MVK = VkStructureType.VK_STRUCTURE_TYPE_IOS_SURFACE_CREATE_INFO_MVK;
    public static final int VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK = VkStructureType.VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT = VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT = VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID = VkStructureType.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID;
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID = VkStructureType.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID;
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID = VkStructureType.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID;
    public static final int VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID = VkStructureType.VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID = VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES_EXT = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES_EXT;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT;
    public static final int VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT = VkStructureType.VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT;
    public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV;
    public static final int VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES_EXT = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES_EXT;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES_EXT = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES_EXT;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT_EXT = VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT_EXT;
    public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2_KHR;
    public static final int VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2_KHR;
    public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR;
    public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR;
    public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHR = VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES_KHR = VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES_KHR = VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES_KHR;
    public static final int VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES_KHR;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES_KHR = VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES_KHR;
    public static final int VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES_KHR;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES_KHR;
    public static final int VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS_KHR = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS_KHR;
    public static final int VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR;
    public static final int VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2_KHR;
    public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR = VkStructureType.VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES_KHR;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES_KHR = VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES_KHR;
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR = VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR = VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR = VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_COMMAND;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_OBJECT;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_CACHE = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_CACHE;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_DEVICE;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE;
    public static final int VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = VkInternalAllocationType.VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE;
    public static final int VK_FORMAT_UNDEFINED = VkFormat.VK_FORMAT_UNDEFINED;
    public static final int VK_FORMAT_R4G4_UNORM_PACK8 = VkFormat.VK_FORMAT_R4G4_UNORM_PACK8;
    public static final int VK_FORMAT_R4G4B4A4_UNORM_PACK16 = VkFormat.VK_FORMAT_R4G4B4A4_UNORM_PACK16;
    public static final int VK_FORMAT_B4G4R4A4_UNORM_PACK16 = VkFormat.VK_FORMAT_B4G4R4A4_UNORM_PACK16;
    public static final int VK_FORMAT_R5G6B5_UNORM_PACK16 = VkFormat.VK_FORMAT_R5G6B5_UNORM_PACK16;
    public static final int VK_FORMAT_B5G6R5_UNORM_PACK16 = VkFormat.VK_FORMAT_B5G6R5_UNORM_PACK16;
    public static final int VK_FORMAT_R5G5B5A1_UNORM_PACK16 = VkFormat.VK_FORMAT_R5G5B5A1_UNORM_PACK16;
    public static final int VK_FORMAT_B5G5R5A1_UNORM_PACK16 = VkFormat.VK_FORMAT_B5G5R5A1_UNORM_PACK16;
    public static final int VK_FORMAT_A1R5G5B5_UNORM_PACK16 = VkFormat.VK_FORMAT_A1R5G5B5_UNORM_PACK16;
    public static final int VK_FORMAT_R8_UNORM = VkFormat.VK_FORMAT_R8_UNORM;
    public static final int VK_FORMAT_R8_SNORM = VkFormat.VK_FORMAT_R8_SNORM;
    public static final int VK_FORMAT_R8_USCALED = VkFormat.VK_FORMAT_R8_USCALED;
    public static final int VK_FORMAT_R8_SSCALED = VkFormat.VK_FORMAT_R8_SSCALED;
    public static final int VK_FORMAT_R8_UINT = VkFormat.VK_FORMAT_R8_UINT;
    public static final int VK_FORMAT_R8_SINT = VkFormat.VK_FORMAT_R8_SINT;
    public static final int VK_FORMAT_R8_SRGB = VkFormat.VK_FORMAT_R8_SRGB;
    public static final int VK_FORMAT_R8G8_UNORM = VkFormat.VK_FORMAT_R8G8_UNORM;
    public static final int VK_FORMAT_R8G8_SNORM = VkFormat.VK_FORMAT_R8G8_SNORM;
    public static final int VK_FORMAT_R8G8_USCALED = VkFormat.VK_FORMAT_R8G8_USCALED;
    public static final int VK_FORMAT_R8G8_SSCALED = VkFormat.VK_FORMAT_R8G8_SSCALED;
    public static final int VK_FORMAT_R8G8_UINT = VkFormat.VK_FORMAT_R8G8_UINT;
    public static final int VK_FORMAT_R8G8_SINT = VkFormat.VK_FORMAT_R8G8_SINT;
    public static final int VK_FORMAT_R8G8_SRGB = VkFormat.VK_FORMAT_R8G8_SRGB;
    public static final int VK_FORMAT_R8G8B8_UNORM = VkFormat.VK_FORMAT_R8G8B8_UNORM;
    public static final int VK_FORMAT_R8G8B8_SNORM = VkFormat.VK_FORMAT_R8G8B8_SNORM;
    public static final int VK_FORMAT_R8G8B8_USCALED = VkFormat.VK_FORMAT_R8G8B8_USCALED;
    public static final int VK_FORMAT_R8G8B8_SSCALED = VkFormat.VK_FORMAT_R8G8B8_SSCALED;
    public static final int VK_FORMAT_R8G8B8_UINT = VkFormat.VK_FORMAT_R8G8B8_UINT;
    public static final int VK_FORMAT_R8G8B8_SINT = VkFormat.VK_FORMAT_R8G8B8_SINT;
    public static final int VK_FORMAT_R8G8B8_SRGB = VkFormat.VK_FORMAT_R8G8B8_SRGB;
    public static final int VK_FORMAT_B8G8R8_UNORM = VkFormat.VK_FORMAT_B8G8R8_UNORM;
    public static final int VK_FORMAT_B8G8R8_SNORM = VkFormat.VK_FORMAT_B8G8R8_SNORM;
    public static final int VK_FORMAT_B8G8R8_USCALED = VkFormat.VK_FORMAT_B8G8R8_USCALED;
    public static final int VK_FORMAT_B8G8R8_SSCALED = VkFormat.VK_FORMAT_B8G8R8_SSCALED;
    public static final int VK_FORMAT_B8G8R8_UINT = VkFormat.VK_FORMAT_B8G8R8_UINT;
    public static final int VK_FORMAT_B8G8R8_SINT = VkFormat.VK_FORMAT_B8G8R8_SINT;
    public static final int VK_FORMAT_B8G8R8_SRGB = VkFormat.VK_FORMAT_B8G8R8_SRGB;
    public static final int VK_FORMAT_R8G8B8A8_UNORM = VkFormat.VK_FORMAT_R8G8B8A8_UNORM;
    public static final int VK_FORMAT_R8G8B8A8_SNORM = VkFormat.VK_FORMAT_R8G8B8A8_SNORM;
    public static final int VK_FORMAT_R8G8B8A8_USCALED = VkFormat.VK_FORMAT_R8G8B8A8_USCALED;
    public static final int VK_FORMAT_R8G8B8A8_SSCALED = VkFormat.VK_FORMAT_R8G8B8A8_SSCALED;
    public static final int VK_FORMAT_R8G8B8A8_UINT = VkFormat.VK_FORMAT_R8G8B8A8_UINT;
    public static final int VK_FORMAT_R8G8B8A8_SINT = VkFormat.VK_FORMAT_R8G8B8A8_SINT;
    public static final int VK_FORMAT_R8G8B8A8_SRGB = VkFormat.VK_FORMAT_R8G8B8A8_SRGB;
    public static final int VK_FORMAT_B8G8R8A8_UNORM = VkFormat.VK_FORMAT_B8G8R8A8_UNORM;
    public static final int VK_FORMAT_B8G8R8A8_SNORM = VkFormat.VK_FORMAT_B8G8R8A8_SNORM;
    public static final int VK_FORMAT_B8G8R8A8_USCALED = VkFormat.VK_FORMAT_B8G8R8A8_USCALED;
    public static final int VK_FORMAT_B8G8R8A8_SSCALED = VkFormat.VK_FORMAT_B8G8R8A8_SSCALED;
    public static final int VK_FORMAT_B8G8R8A8_UINT = VkFormat.VK_FORMAT_B8G8R8A8_UINT;
    public static final int VK_FORMAT_B8G8R8A8_SINT = VkFormat.VK_FORMAT_B8G8R8A8_SINT;
    public static final int VK_FORMAT_B8G8R8A8_SRGB = VkFormat.VK_FORMAT_B8G8R8A8_SRGB;
    public static final int VK_FORMAT_A8B8G8R8_UNORM_PACK32 = VkFormat.VK_FORMAT_A8B8G8R8_UNORM_PACK32;
    public static final int VK_FORMAT_A8B8G8R8_SNORM_PACK32 = VkFormat.VK_FORMAT_A8B8G8R8_SNORM_PACK32;
    public static final int VK_FORMAT_A8B8G8R8_USCALED_PACK32 = VkFormat.VK_FORMAT_A8B8G8R8_USCALED_PACK32;
    public static final int VK_FORMAT_A8B8G8R8_SSCALED_PACK32 = VkFormat.VK_FORMAT_A8B8G8R8_SSCALED_PACK32;
    public static final int VK_FORMAT_A8B8G8R8_UINT_PACK32 = VkFormat.VK_FORMAT_A8B8G8R8_UINT_PACK32;
    public static final int VK_FORMAT_A8B8G8R8_SINT_PACK32 = VkFormat.VK_FORMAT_A8B8G8R8_SINT_PACK32;
    public static final int VK_FORMAT_A8B8G8R8_SRGB_PACK32 = VkFormat.VK_FORMAT_A8B8G8R8_SRGB_PACK32;
    public static final int VK_FORMAT_A2R10G10B10_UNORM_PACK32 = VkFormat.VK_FORMAT_A2R10G10B10_UNORM_PACK32;
    public static final int VK_FORMAT_A2R10G10B10_SNORM_PACK32 = VkFormat.VK_FORMAT_A2R10G10B10_SNORM_PACK32;
    public static final int VK_FORMAT_A2R10G10B10_USCALED_PACK32 = VkFormat.VK_FORMAT_A2R10G10B10_USCALED_PACK32;
    public static final int VK_FORMAT_A2R10G10B10_SSCALED_PACK32 = VkFormat.VK_FORMAT_A2R10G10B10_SSCALED_PACK32;
    public static final int VK_FORMAT_A2R10G10B10_UINT_PACK32 = VkFormat.VK_FORMAT_A2R10G10B10_UINT_PACK32;
    public static final int VK_FORMAT_A2R10G10B10_SINT_PACK32 = VkFormat.VK_FORMAT_A2R10G10B10_SINT_PACK32;
    public static final int VK_FORMAT_A2B10G10R10_UNORM_PACK32 = VkFormat.VK_FORMAT_A2B10G10R10_UNORM_PACK32;
    public static final int VK_FORMAT_A2B10G10R10_SNORM_PACK32 = VkFormat.VK_FORMAT_A2B10G10R10_SNORM_PACK32;
    public static final int VK_FORMAT_A2B10G10R10_USCALED_PACK32 = VkFormat.VK_FORMAT_A2B10G10R10_USCALED_PACK32;
    public static final int VK_FORMAT_A2B10G10R10_SSCALED_PACK32 = VkFormat.VK_FORMAT_A2B10G10R10_SSCALED_PACK32;
    public static final int VK_FORMAT_A2B10G10R10_UINT_PACK32 = VkFormat.VK_FORMAT_A2B10G10R10_UINT_PACK32;
    public static final int VK_FORMAT_A2B10G10R10_SINT_PACK32 = VkFormat.VK_FORMAT_A2B10G10R10_SINT_PACK32;
    public static final int VK_FORMAT_R16_UNORM = VkFormat.VK_FORMAT_R16_UNORM;
    public static final int VK_FORMAT_R16_SNORM = VkFormat.VK_FORMAT_R16_SNORM;
    public static final int VK_FORMAT_R16_USCALED = VkFormat.VK_FORMAT_R16_USCALED;
    public static final int VK_FORMAT_R16_SSCALED = VkFormat.VK_FORMAT_R16_SSCALED;
    public static final int VK_FORMAT_R16_UINT = VkFormat.VK_FORMAT_R16_UINT;
    public static final int VK_FORMAT_R16_SINT = VkFormat.VK_FORMAT_R16_SINT;
    public static final int VK_FORMAT_R16_SFLOAT = VkFormat.VK_FORMAT_R16_SFLOAT;
    public static final int VK_FORMAT_R16G16_UNORM = VkFormat.VK_FORMAT_R16G16_UNORM;
    public static final int VK_FORMAT_R16G16_SNORM = VkFormat.VK_FORMAT_R16G16_SNORM;
    public static final int VK_FORMAT_R16G16_USCALED = VkFormat.VK_FORMAT_R16G16_USCALED;
    public static final int VK_FORMAT_R16G16_SSCALED = VkFormat.VK_FORMAT_R16G16_SSCALED;
    public static final int VK_FORMAT_R16G16_UINT = VkFormat.VK_FORMAT_R16G16_UINT;
    public static final int VK_FORMAT_R16G16_SINT = VkFormat.VK_FORMAT_R16G16_SINT;
    public static final int VK_FORMAT_R16G16_SFLOAT = VkFormat.VK_FORMAT_R16G16_SFLOAT;
    public static final int VK_FORMAT_R16G16B16_UNORM = VkFormat.VK_FORMAT_R16G16B16_UNORM;
    public static final int VK_FORMAT_R16G16B16_SNORM = VkFormat.VK_FORMAT_R16G16B16_SNORM;
    public static final int VK_FORMAT_R16G16B16_USCALED = VkFormat.VK_FORMAT_R16G16B16_USCALED;
    public static final int VK_FORMAT_R16G16B16_SSCALED = VkFormat.VK_FORMAT_R16G16B16_SSCALED;
    public static final int VK_FORMAT_R16G16B16_UINT = VkFormat.VK_FORMAT_R16G16B16_UINT;
    public static final int VK_FORMAT_R16G16B16_SINT = VkFormat.VK_FORMAT_R16G16B16_SINT;
    public static final int VK_FORMAT_R16G16B16_SFLOAT = VkFormat.VK_FORMAT_R16G16B16_SFLOAT;
    public static final int VK_FORMAT_R16G16B16A16_UNORM = VkFormat.VK_FORMAT_R16G16B16A16_UNORM;
    public static final int VK_FORMAT_R16G16B16A16_SNORM = VkFormat.VK_FORMAT_R16G16B16A16_SNORM;
    public static final int VK_FORMAT_R16G16B16A16_USCALED = VkFormat.VK_FORMAT_R16G16B16A16_USCALED;
    public static final int VK_FORMAT_R16G16B16A16_SSCALED = VkFormat.VK_FORMAT_R16G16B16A16_SSCALED;
    public static final int VK_FORMAT_R16G16B16A16_UINT = VkFormat.VK_FORMAT_R16G16B16A16_UINT;
    public static final int VK_FORMAT_R16G16B16A16_SINT = VkFormat.VK_FORMAT_R16G16B16A16_SINT;
    public static final int VK_FORMAT_R16G16B16A16_SFLOAT = VkFormat.VK_FORMAT_R16G16B16A16_SFLOAT;
    public static final int VK_FORMAT_R32_UINT = VkFormat.VK_FORMAT_R32_UINT;
    public static final int VK_FORMAT_R32_SINT = VkFormat.VK_FORMAT_R32_SINT;
    public static final int VK_FORMAT_R32_SFLOAT = VkFormat.VK_FORMAT_R32_SFLOAT;
    public static final int VK_FORMAT_R32G32_UINT = VkFormat.VK_FORMAT_R32G32_UINT;
    public static final int VK_FORMAT_R32G32_SINT = VkFormat.VK_FORMAT_R32G32_SINT;
    public static final int VK_FORMAT_R32G32_SFLOAT = VkFormat.VK_FORMAT_R32G32_SFLOAT;
    public static final int VK_FORMAT_R32G32B32_UINT = VkFormat.VK_FORMAT_R32G32B32_UINT;
    public static final int VK_FORMAT_R32G32B32_SINT = VkFormat.VK_FORMAT_R32G32B32_SINT;
    public static final int VK_FORMAT_R32G32B32_SFLOAT = VkFormat.VK_FORMAT_R32G32B32_SFLOAT;
    public static final int VK_FORMAT_R32G32B32A32_UINT = VkFormat.VK_FORMAT_R32G32B32A32_UINT;
    public static final int VK_FORMAT_R32G32B32A32_SINT = VkFormat.VK_FORMAT_R32G32B32A32_SINT;
    public static final int VK_FORMAT_R32G32B32A32_SFLOAT = VkFormat.VK_FORMAT_R32G32B32A32_SFLOAT;
    public static final int VK_FORMAT_R64_UINT = VkFormat.VK_FORMAT_R64_UINT;
    public static final int VK_FORMAT_R64_SINT = VkFormat.VK_FORMAT_R64_SINT;
    public static final int VK_FORMAT_R64_SFLOAT = VkFormat.VK_FORMAT_R64_SFLOAT;
    public static final int VK_FORMAT_R64G64_UINT = VkFormat.VK_FORMAT_R64G64_UINT;
    public static final int VK_FORMAT_R64G64_SINT = VkFormat.VK_FORMAT_R64G64_SINT;
    public static final int VK_FORMAT_R64G64_SFLOAT = VkFormat.VK_FORMAT_R64G64_SFLOAT;
    public static final int VK_FORMAT_R64G64B64_UINT = VkFormat.VK_FORMAT_R64G64B64_UINT;
    public static final int VK_FORMAT_R64G64B64_SINT = VkFormat.VK_FORMAT_R64G64B64_SINT;
    public static final int VK_FORMAT_R64G64B64_SFLOAT = VkFormat.VK_FORMAT_R64G64B64_SFLOAT;
    public static final int VK_FORMAT_R64G64B64A64_UINT = VkFormat.VK_FORMAT_R64G64B64A64_UINT;
    public static final int VK_FORMAT_R64G64B64A64_SINT = VkFormat.VK_FORMAT_R64G64B64A64_SINT;
    public static final int VK_FORMAT_R64G64B64A64_SFLOAT = VkFormat.VK_FORMAT_R64G64B64A64_SFLOAT;
    public static final int VK_FORMAT_B10G11R11_UFLOAT_PACK32 = VkFormat.VK_FORMAT_B10G11R11_UFLOAT_PACK32;
    public static final int VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 = VkFormat.VK_FORMAT_E5B9G9R9_UFLOAT_PACK32;
    public static final int VK_FORMAT_D16_UNORM = VkFormat.VK_FORMAT_D16_UNORM;
    public static final int VK_FORMAT_X8_D24_UNORM_PACK32 = VkFormat.VK_FORMAT_X8_D24_UNORM_PACK32;
    public static final int VK_FORMAT_D32_SFLOAT = VkFormat.VK_FORMAT_D32_SFLOAT;
    public static final int VK_FORMAT_S8_UINT = VkFormat.VK_FORMAT_S8_UINT;
    public static final int VK_FORMAT_D16_UNORM_S8_UINT = VkFormat.VK_FORMAT_D16_UNORM_S8_UINT;
    public static final int VK_FORMAT_D24_UNORM_S8_UINT = VkFormat.VK_FORMAT_D24_UNORM_S8_UINT;
    public static final int VK_FORMAT_D32_SFLOAT_S8_UINT = VkFormat.VK_FORMAT_D32_SFLOAT_S8_UINT;
    public static final int VK_FORMAT_BC1_RGB_UNORM_BLOCK = VkFormat.VK_FORMAT_BC1_RGB_UNORM_BLOCK;
    public static final int VK_FORMAT_BC1_RGB_SRGB_BLOCK = VkFormat.VK_FORMAT_BC1_RGB_SRGB_BLOCK;
    public static final int VK_FORMAT_BC1_RGBA_UNORM_BLOCK = VkFormat.VK_FORMAT_BC1_RGBA_UNORM_BLOCK;
    public static final int VK_FORMAT_BC1_RGBA_SRGB_BLOCK = VkFormat.VK_FORMAT_BC1_RGBA_SRGB_BLOCK;
    public static final int VK_FORMAT_BC2_UNORM_BLOCK = VkFormat.VK_FORMAT_BC2_UNORM_BLOCK;
    public static final int VK_FORMAT_BC2_SRGB_BLOCK = VkFormat.VK_FORMAT_BC2_SRGB_BLOCK;
    public static final int VK_FORMAT_BC3_UNORM_BLOCK = VkFormat.VK_FORMAT_BC3_UNORM_BLOCK;
    public static final int VK_FORMAT_BC3_SRGB_BLOCK = VkFormat.VK_FORMAT_BC3_SRGB_BLOCK;
    public static final int VK_FORMAT_BC4_UNORM_BLOCK = VkFormat.VK_FORMAT_BC4_UNORM_BLOCK;
    public static final int VK_FORMAT_BC4_SNORM_BLOCK = VkFormat.VK_FORMAT_BC4_SNORM_BLOCK;
    public static final int VK_FORMAT_BC5_UNORM_BLOCK = VkFormat.VK_FORMAT_BC5_UNORM_BLOCK;
    public static final int VK_FORMAT_BC5_SNORM_BLOCK = VkFormat.VK_FORMAT_BC5_SNORM_BLOCK;
    public static final int VK_FORMAT_BC6H_UFLOAT_BLOCK = VkFormat.VK_FORMAT_BC6H_UFLOAT_BLOCK;
    public static final int VK_FORMAT_BC6H_SFLOAT_BLOCK = VkFormat.VK_FORMAT_BC6H_SFLOAT_BLOCK;
    public static final int VK_FORMAT_BC7_UNORM_BLOCK = VkFormat.VK_FORMAT_BC7_UNORM_BLOCK;
    public static final int VK_FORMAT_BC7_SRGB_BLOCK = VkFormat.VK_FORMAT_BC7_SRGB_BLOCK;
    public static final int VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK = VkFormat.VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK;
    public static final int VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK = VkFormat.VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK;
    public static final int VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK = VkFormat.VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK;
    public static final int VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK = VkFormat.VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK;
    public static final int VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK = VkFormat.VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK;
    public static final int VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK = VkFormat.VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK;
    public static final int VK_FORMAT_EAC_R11_UNORM_BLOCK = VkFormat.VK_FORMAT_EAC_R11_UNORM_BLOCK;
    public static final int VK_FORMAT_EAC_R11_SNORM_BLOCK = VkFormat.VK_FORMAT_EAC_R11_SNORM_BLOCK;
    public static final int VK_FORMAT_EAC_R11G11_UNORM_BLOCK = VkFormat.VK_FORMAT_EAC_R11G11_UNORM_BLOCK;
    public static final int VK_FORMAT_EAC_R11G11_SNORM_BLOCK = VkFormat.VK_FORMAT_EAC_R11G11_SNORM_BLOCK;
    public static final int VK_FORMAT_ASTC_4x4_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_4x4_UNORM_BLOCK;
    public static final int VK_FORMAT_ASTC_4x4_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_4x4_SRGB_BLOCK;
    public static final int VK_FORMAT_ASTC_5x4_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_5x4_UNORM_BLOCK;
    public static final int VK_FORMAT_ASTC_5x4_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_5x4_SRGB_BLOCK;
    public static final int VK_FORMAT_ASTC_5x5_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_5x5_UNORM_BLOCK;
    public static final int VK_FORMAT_ASTC_5x5_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_5x5_SRGB_BLOCK;
    public static final int VK_FORMAT_ASTC_6x5_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_6x5_UNORM_BLOCK;
    public static final int VK_FORMAT_ASTC_6x5_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_6x5_SRGB_BLOCK;
    public static final int VK_FORMAT_ASTC_6x6_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_6x6_UNORM_BLOCK;
    public static final int VK_FORMAT_ASTC_6x6_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_6x6_SRGB_BLOCK;
    public static final int VK_FORMAT_ASTC_8x5_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_8x5_UNORM_BLOCK;
    public static final int VK_FORMAT_ASTC_8x5_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_8x5_SRGB_BLOCK;
    public static final int VK_FORMAT_ASTC_8x6_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_8x6_UNORM_BLOCK;
    public static final int VK_FORMAT_ASTC_8x6_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_8x6_SRGB_BLOCK;
    public static final int VK_FORMAT_ASTC_8x8_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_8x8_UNORM_BLOCK;
    public static final int VK_FORMAT_ASTC_8x8_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_8x8_SRGB_BLOCK;
    public static final int VK_FORMAT_ASTC_10x5_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_10x5_UNORM_BLOCK;
    public static final int VK_FORMAT_ASTC_10x5_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_10x5_SRGB_BLOCK;
    public static final int VK_FORMAT_ASTC_10x6_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_10x6_UNORM_BLOCK;
    public static final int VK_FORMAT_ASTC_10x6_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_10x6_SRGB_BLOCK;
    public static final int VK_FORMAT_ASTC_10x8_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_10x8_UNORM_BLOCK;
    public static final int VK_FORMAT_ASTC_10x8_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_10x8_SRGB_BLOCK;
    public static final int VK_FORMAT_ASTC_10x10_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_10x10_UNORM_BLOCK;
    public static final int VK_FORMAT_ASTC_10x10_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_10x10_SRGB_BLOCK;
    public static final int VK_FORMAT_ASTC_12x10_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_12x10_UNORM_BLOCK;
    public static final int VK_FORMAT_ASTC_12x10_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_12x10_SRGB_BLOCK;
    public static final int VK_FORMAT_ASTC_12x12_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_12x12_UNORM_BLOCK;
    public static final int VK_FORMAT_ASTC_12x12_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_12x12_SRGB_BLOCK;
    public static final int VK_FORMAT_G8B8G8R8_422_UNORM = VkFormat.VK_FORMAT_G8B8G8R8_422_UNORM;
    public static final int VK_FORMAT_B8G8R8G8_422_UNORM = VkFormat.VK_FORMAT_B8G8R8G8_422_UNORM;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM = VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_420_UNORM = VkFormat.VK_FORMAT_G8_B8R8_2PLANE_420_UNORM;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM = VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_422_UNORM = VkFormat.VK_FORMAT_G8_B8R8_2PLANE_422_UNORM;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM = VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM;
    public static final int VK_FORMAT_R10X6_UNORM_PACK16 = VkFormat.VK_FORMAT_R10X6_UNORM_PACK16;
    public static final int VK_FORMAT_R10X6G10X6_UNORM_2PACK16 = VkFormat.VK_FORMAT_R10X6G10X6_UNORM_2PACK16;
    public static final int VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16 = VkFormat.VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16;
    public static final int VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16 = VkFormat.VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16;
    public static final int VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16 = VkFormat.VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16 = VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16 = VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16 = VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16 = VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16 = VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16;
    public static final int VK_FORMAT_R12X4_UNORM_PACK16 = VkFormat.VK_FORMAT_R12X4_UNORM_PACK16;
    public static final int VK_FORMAT_R12X4G12X4_UNORM_2PACK16 = VkFormat.VK_FORMAT_R12X4G12X4_UNORM_2PACK16;
    public static final int VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16 = VkFormat.VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16;
    public static final int VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16 = VkFormat.VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16;
    public static final int VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16 = VkFormat.VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16 = VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16 = VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16 = VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16 = VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16 = VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16;
    public static final int VK_FORMAT_G16B16G16R16_422_UNORM = VkFormat.VK_FORMAT_G16B16G16R16_422_UNORM;
    public static final int VK_FORMAT_B16G16R16G16_422_UNORM = VkFormat.VK_FORMAT_B16G16R16G16_422_UNORM;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM = VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_420_UNORM = VkFormat.VK_FORMAT_G16_B16R16_2PLANE_420_UNORM;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM = VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_422_UNORM = VkFormat.VK_FORMAT_G16_B16R16_2PLANE_422_UNORM;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM = VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM;
    public static final int VK_FORMAT_PVRTC1_2BPP_UNORM_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC1_2BPP_UNORM_BLOCK_IMG;
    public static final int VK_FORMAT_PVRTC1_4BPP_UNORM_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC1_4BPP_UNORM_BLOCK_IMG;
    public static final int VK_FORMAT_PVRTC2_2BPP_UNORM_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC2_2BPP_UNORM_BLOCK_IMG;
    public static final int VK_FORMAT_PVRTC2_4BPP_UNORM_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC2_4BPP_UNORM_BLOCK_IMG;
    public static final int VK_FORMAT_PVRTC1_2BPP_SRGB_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC1_2BPP_SRGB_BLOCK_IMG;
    public static final int VK_FORMAT_PVRTC1_4BPP_SRGB_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC1_4BPP_SRGB_BLOCK_IMG;
    public static final int VK_FORMAT_PVRTC2_2BPP_SRGB_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC2_2BPP_SRGB_BLOCK_IMG;
    public static final int VK_FORMAT_PVRTC2_4BPP_SRGB_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC2_4BPP_SRGB_BLOCK_IMG;
    public static final int VK_FORMAT_G8B8G8R8_422_UNORM_KHR = VkFormat.VK_FORMAT_G8B8G8R8_422_UNORM_KHR;
    public static final int VK_FORMAT_B8G8R8G8_422_UNORM_KHR = VkFormat.VK_FORMAT_B8G8R8G8_422_UNORM_KHR;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM_KHR = VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM_KHR;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_420_UNORM_KHR = VkFormat.VK_FORMAT_G8_B8R8_2PLANE_420_UNORM_KHR;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM_KHR = VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM_KHR;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_422_UNORM_KHR = VkFormat.VK_FORMAT_G8_B8R8_2PLANE_422_UNORM_KHR;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM_KHR = VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM_KHR;
    public static final int VK_FORMAT_R10X6_UNORM_PACK16_KHR = VkFormat.VK_FORMAT_R10X6_UNORM_PACK16_KHR;
    public static final int VK_FORMAT_R10X6G10X6_UNORM_2PACK16_KHR = VkFormat.VK_FORMAT_R10X6G10X6_UNORM_2PACK16_KHR;
    public static final int VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16_KHR = VkFormat.VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16_KHR;
    public static final int VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16_KHR = VkFormat.VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16_KHR;
    public static final int VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16_KHR = VkFormat.VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16_KHR;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16_KHR;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16_KHR;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16_KHR;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16_KHR;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16_KHR;
    public static final int VK_FORMAT_R12X4_UNORM_PACK16_KHR = VkFormat.VK_FORMAT_R12X4_UNORM_PACK16_KHR;
    public static final int VK_FORMAT_R12X4G12X4_UNORM_2PACK16_KHR = VkFormat.VK_FORMAT_R12X4G12X4_UNORM_2PACK16_KHR;
    public static final int VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16_KHR = VkFormat.VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16_KHR;
    public static final int VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16_KHR = VkFormat.VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16_KHR;
    public static final int VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16_KHR = VkFormat.VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16_KHR;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16_KHR;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16_KHR;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16_KHR;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16_KHR;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16_KHR;
    public static final int VK_FORMAT_G16B16G16R16_422_UNORM_KHR = VkFormat.VK_FORMAT_G16B16G16R16_422_UNORM_KHR;
    public static final int VK_FORMAT_B16G16R16G16_422_UNORM_KHR = VkFormat.VK_FORMAT_B16G16R16G16_422_UNORM_KHR;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM_KHR = VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM_KHR;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_420_UNORM_KHR = VkFormat.VK_FORMAT_G16_B16R16_2PLANE_420_UNORM_KHR;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM_KHR = VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM_KHR;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_422_UNORM_KHR = VkFormat.VK_FORMAT_G16_B16R16_2PLANE_422_UNORM_KHR;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM_KHR = VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM_KHR;
    public static final int VK_IMAGE_TYPE_1D = VkImageType.VK_IMAGE_TYPE_1D;
    public static final int VK_IMAGE_TYPE_2D = VkImageType.VK_IMAGE_TYPE_2D;
    public static final int VK_IMAGE_TYPE_3D = VkImageType.VK_IMAGE_TYPE_3D;
    public static final int VK_IMAGE_TILING_OPTIMAL = VkImageTiling.VK_IMAGE_TILING_OPTIMAL;
    public static final int VK_IMAGE_TILING_LINEAR = VkImageTiling.VK_IMAGE_TILING_LINEAR;
    public static final int VK_PHYSICAL_DEVICE_TYPE_OTHER = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_OTHER;
    public static final int VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU;
    public static final int VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU;
    public static final int VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU;
    public static final int VK_PHYSICAL_DEVICE_TYPE_CPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_CPU;
    public static final int VK_QUERY_TYPE_OCCLUSION = VkQueryType.VK_QUERY_TYPE_OCCLUSION;
    public static final int VK_QUERY_TYPE_PIPELINE_STATISTICS = VkQueryType.VK_QUERY_TYPE_PIPELINE_STATISTICS;
    public static final int VK_QUERY_TYPE_TIMESTAMP = VkQueryType.VK_QUERY_TYPE_TIMESTAMP;
    public static final int VK_SHARING_MODE_EXCLUSIVE = VkSharingMode.VK_SHARING_MODE_EXCLUSIVE;
    public static final int VK_SHARING_MODE_CONCURRENT = VkSharingMode.VK_SHARING_MODE_CONCURRENT;
    public static final int VK_IMAGE_LAYOUT_UNDEFINED = VkImageLayout.VK_IMAGE_LAYOUT_UNDEFINED;
    public static final int VK_IMAGE_LAYOUT_GENERAL = VkImageLayout.VK_IMAGE_LAYOUT_GENERAL;
    public static final int VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL;
    public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL;
    public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL;
    public static final int VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL;
    public static final int VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL;
    public static final int VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL;
    public static final int VK_IMAGE_LAYOUT_PREINITIALIZED = VkImageLayout.VK_IMAGE_LAYOUT_PREINITIALIZED;
    public static final int VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL;
    public static final int VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL;
    public static final int VK_IMAGE_LAYOUT_PRESENT_SRC_KHR = VkImageLayout.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR;
    public static final int VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR = VkImageLayout.VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR;
    public static final int VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR;
    public static final int VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR;
    public static final int VK_IMAGE_VIEW_TYPE_1D = VkImageViewType.VK_IMAGE_VIEW_TYPE_1D;
    public static final int VK_IMAGE_VIEW_TYPE_2D = VkImageViewType.VK_IMAGE_VIEW_TYPE_2D;
    public static final int VK_IMAGE_VIEW_TYPE_3D = VkImageViewType.VK_IMAGE_VIEW_TYPE_3D;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE = VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE;
    public static final int VK_IMAGE_VIEW_TYPE_1D_ARRAY = VkImageViewType.VK_IMAGE_VIEW_TYPE_1D_ARRAY;
    public static final int VK_IMAGE_VIEW_TYPE_2D_ARRAY = VkImageViewType.VK_IMAGE_VIEW_TYPE_2D_ARRAY;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE_ARRAY;
    public static final int VK_COMPONENT_SWIZZLE_IDENTITY = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY;
    public static final int VK_COMPONENT_SWIZZLE_ZERO = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_ZERO;
    public static final int VK_COMPONENT_SWIZZLE_ONE = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_ONE;
    public static final int VK_COMPONENT_SWIZZLE_R = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_R;
    public static final int VK_COMPONENT_SWIZZLE_G = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_G;
    public static final int VK_COMPONENT_SWIZZLE_B = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_B;
    public static final int VK_COMPONENT_SWIZZLE_A = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_A;
    public static final int VK_VERTEX_INPUT_RATE_VERTEX = VkVertexInputRate.VK_VERTEX_INPUT_RATE_VERTEX;
    public static final int VK_VERTEX_INPUT_RATE_INSTANCE = VkVertexInputRate.VK_VERTEX_INPUT_RATE_INSTANCE;
    public static final int VK_PRIMITIVE_TOPOLOGY_POINT_LIST = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_POINT_LIST;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_LIST;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_STRIP;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY;
    public static final int VK_PRIMITIVE_TOPOLOGY_PATCH_LIST = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_PATCH_LIST;
    public static final int VK_POLYGON_MODE_FILL = VkPolygonMode.VK_POLYGON_MODE_FILL;
    public static final int VK_POLYGON_MODE_LINE = VkPolygonMode.VK_POLYGON_MODE_LINE;
    public static final int VK_POLYGON_MODE_POINT = VkPolygonMode.VK_POLYGON_MODE_POINT;
    public static final int VK_POLYGON_MODE_FILL_RECTANGLE_NV = VkPolygonMode.VK_POLYGON_MODE_FILL_RECTANGLE_NV;
    public static final int VK_FRONT_FACE_COUNTER_CLOCKWISE = VkFrontFace.VK_FRONT_FACE_COUNTER_CLOCKWISE;
    public static final int VK_FRONT_FACE_CLOCKWISE = VkFrontFace.VK_FRONT_FACE_CLOCKWISE;
    public static final int VK_COMPARE_OP_NEVER = VkCompareOp.VK_COMPARE_OP_NEVER;
    public static final int VK_COMPARE_OP_LESS = VkCompareOp.VK_COMPARE_OP_LESS;
    public static final int VK_COMPARE_OP_EQUAL = VkCompareOp.VK_COMPARE_OP_EQUAL;
    public static final int VK_COMPARE_OP_LESS_OR_EQUAL = VkCompareOp.VK_COMPARE_OP_LESS_OR_EQUAL;
    public static final int VK_COMPARE_OP_GREATER = VkCompareOp.VK_COMPARE_OP_GREATER;
    public static final int VK_COMPARE_OP_NOT_EQUAL = VkCompareOp.VK_COMPARE_OP_NOT_EQUAL;
    public static final int VK_COMPARE_OP_GREATER_OR_EQUAL = VkCompareOp.VK_COMPARE_OP_GREATER_OR_EQUAL;
    public static final int VK_COMPARE_OP_ALWAYS = VkCompareOp.VK_COMPARE_OP_ALWAYS;
    public static final int VK_STENCIL_OP_KEEP = VkStencilOp.VK_STENCIL_OP_KEEP;
    public static final int VK_STENCIL_OP_ZERO = VkStencilOp.VK_STENCIL_OP_ZERO;
    public static final int VK_STENCIL_OP_REPLACE = VkStencilOp.VK_STENCIL_OP_REPLACE;
    public static final int VK_STENCIL_OP_INCREMENT_AND_CLAMP = VkStencilOp.VK_STENCIL_OP_INCREMENT_AND_CLAMP;
    public static final int VK_STENCIL_OP_DECREMENT_AND_CLAMP = VkStencilOp.VK_STENCIL_OP_DECREMENT_AND_CLAMP;
    public static final int VK_STENCIL_OP_INVERT = VkStencilOp.VK_STENCIL_OP_INVERT;
    public static final int VK_STENCIL_OP_INCREMENT_AND_WRAP = VkStencilOp.VK_STENCIL_OP_INCREMENT_AND_WRAP;
    public static final int VK_STENCIL_OP_DECREMENT_AND_WRAP = VkStencilOp.VK_STENCIL_OP_DECREMENT_AND_WRAP;
    public static final int VK_LOGIC_OP_CLEAR = VkLogicOp.VK_LOGIC_OP_CLEAR;
    public static final int VK_LOGIC_OP_AND = VkLogicOp.VK_LOGIC_OP_AND;
    public static final int VK_LOGIC_OP_AND_REVERSE = VkLogicOp.VK_LOGIC_OP_AND_REVERSE;
    public static final int VK_LOGIC_OP_COPY = VkLogicOp.VK_LOGIC_OP_COPY;
    public static final int VK_LOGIC_OP_AND_INVERTED = VkLogicOp.VK_LOGIC_OP_AND_INVERTED;
    public static final int VK_LOGIC_OP_NO_OP = VkLogicOp.VK_LOGIC_OP_NO_OP;
    public static final int VK_LOGIC_OP_XOR = VkLogicOp.VK_LOGIC_OP_XOR;
    public static final int VK_LOGIC_OP_OR = VkLogicOp.VK_LOGIC_OP_OR;
    public static final int VK_LOGIC_OP_NOR = VkLogicOp.VK_LOGIC_OP_NOR;
    public static final int VK_LOGIC_OP_EQUIVALENT = VkLogicOp.VK_LOGIC_OP_EQUIVALENT;
    public static final int VK_LOGIC_OP_INVERT = VkLogicOp.VK_LOGIC_OP_INVERT;
    public static final int VK_LOGIC_OP_OR_REVERSE = VkLogicOp.VK_LOGIC_OP_OR_REVERSE;
    public static final int VK_LOGIC_OP_COPY_INVERTED = VkLogicOp.VK_LOGIC_OP_COPY_INVERTED;
    public static final int VK_LOGIC_OP_OR_INVERTED = VkLogicOp.VK_LOGIC_OP_OR_INVERTED;
    public static final int VK_LOGIC_OP_NAND = VkLogicOp.VK_LOGIC_OP_NAND;
    public static final int VK_LOGIC_OP_SET = VkLogicOp.VK_LOGIC_OP_SET;
    public static final int VK_BLEND_FACTOR_ZERO = VkBlendFactor.VK_BLEND_FACTOR_ZERO;
    public static final int VK_BLEND_FACTOR_ONE = VkBlendFactor.VK_BLEND_FACTOR_ONE;
    public static final int VK_BLEND_FACTOR_SRC_COLOR = VkBlendFactor.VK_BLEND_FACTOR_SRC_COLOR;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR;
    public static final int VK_BLEND_FACTOR_DST_COLOR = VkBlendFactor.VK_BLEND_FACTOR_DST_COLOR;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR;
    public static final int VK_BLEND_FACTOR_SRC_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_SRC_ALPHA;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA;
    public static final int VK_BLEND_FACTOR_DST_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_DST_ALPHA;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA;
    public static final int VK_BLEND_FACTOR_CONSTANT_COLOR = VkBlendFactor.VK_BLEND_FACTOR_CONSTANT_COLOR;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR;
    public static final int VK_BLEND_FACTOR_CONSTANT_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_CONSTANT_ALPHA;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA;
    public static final int VK_BLEND_FACTOR_SRC_ALPHA_SATURATE = VkBlendFactor.VK_BLEND_FACTOR_SRC_ALPHA_SATURATE;
    public static final int VK_BLEND_FACTOR_SRC1_COLOR = VkBlendFactor.VK_BLEND_FACTOR_SRC1_COLOR;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR;
    public static final int VK_BLEND_FACTOR_SRC1_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_SRC1_ALPHA;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA;
    public static final int VK_BLEND_OP_ADD = VkBlendOp.VK_BLEND_OP_ADD;
    public static final int VK_BLEND_OP_SUBTRACT = VkBlendOp.VK_BLEND_OP_SUBTRACT;
    public static final int VK_BLEND_OP_REVERSE_SUBTRACT = VkBlendOp.VK_BLEND_OP_REVERSE_SUBTRACT;
    public static final int VK_BLEND_OP_MIN = VkBlendOp.VK_BLEND_OP_MIN;
    public static final int VK_BLEND_OP_MAX = VkBlendOp.VK_BLEND_OP_MAX;
    public static final int VK_BLEND_OP_ZERO_EXT = VkBlendOp.VK_BLEND_OP_ZERO_EXT;
    public static final int VK_BLEND_OP_SRC_EXT = VkBlendOp.VK_BLEND_OP_SRC_EXT;
    public static final int VK_BLEND_OP_DST_EXT = VkBlendOp.VK_BLEND_OP_DST_EXT;
    public static final int VK_BLEND_OP_SRC_OVER_EXT = VkBlendOp.VK_BLEND_OP_SRC_OVER_EXT;
    public static final int VK_BLEND_OP_DST_OVER_EXT = VkBlendOp.VK_BLEND_OP_DST_OVER_EXT;
    public static final int VK_BLEND_OP_SRC_IN_EXT = VkBlendOp.VK_BLEND_OP_SRC_IN_EXT;
    public static final int VK_BLEND_OP_DST_IN_EXT = VkBlendOp.VK_BLEND_OP_DST_IN_EXT;
    public static final int VK_BLEND_OP_SRC_OUT_EXT = VkBlendOp.VK_BLEND_OP_SRC_OUT_EXT;
    public static final int VK_BLEND_OP_DST_OUT_EXT = VkBlendOp.VK_BLEND_OP_DST_OUT_EXT;
    public static final int VK_BLEND_OP_SRC_ATOP_EXT = VkBlendOp.VK_BLEND_OP_SRC_ATOP_EXT;
    public static final int VK_BLEND_OP_DST_ATOP_EXT = VkBlendOp.VK_BLEND_OP_DST_ATOP_EXT;
    public static final int VK_BLEND_OP_XOR_EXT = VkBlendOp.VK_BLEND_OP_XOR_EXT;
    public static final int VK_BLEND_OP_MULTIPLY_EXT = VkBlendOp.VK_BLEND_OP_MULTIPLY_EXT;
    public static final int VK_BLEND_OP_SCREEN_EXT = VkBlendOp.VK_BLEND_OP_SCREEN_EXT;
    public static final int VK_BLEND_OP_OVERLAY_EXT = VkBlendOp.VK_BLEND_OP_OVERLAY_EXT;
    public static final int VK_BLEND_OP_DARKEN_EXT = VkBlendOp.VK_BLEND_OP_DARKEN_EXT;
    public static final int VK_BLEND_OP_LIGHTEN_EXT = VkBlendOp.VK_BLEND_OP_LIGHTEN_EXT;
    public static final int VK_BLEND_OP_COLORDODGE_EXT = VkBlendOp.VK_BLEND_OP_COLORDODGE_EXT;
    public static final int VK_BLEND_OP_COLORBURN_EXT = VkBlendOp.VK_BLEND_OP_COLORBURN_EXT;
    public static final int VK_BLEND_OP_HARDLIGHT_EXT = VkBlendOp.VK_BLEND_OP_HARDLIGHT_EXT;
    public static final int VK_BLEND_OP_SOFTLIGHT_EXT = VkBlendOp.VK_BLEND_OP_SOFTLIGHT_EXT;
    public static final int VK_BLEND_OP_DIFFERENCE_EXT = VkBlendOp.VK_BLEND_OP_DIFFERENCE_EXT;
    public static final int VK_BLEND_OP_EXCLUSION_EXT = VkBlendOp.VK_BLEND_OP_EXCLUSION_EXT;
    public static final int VK_BLEND_OP_INVERT_EXT = VkBlendOp.VK_BLEND_OP_INVERT_EXT;
    public static final int VK_BLEND_OP_INVERT_RGB_EXT = VkBlendOp.VK_BLEND_OP_INVERT_RGB_EXT;
    public static final int VK_BLEND_OP_LINEARDODGE_EXT = VkBlendOp.VK_BLEND_OP_LINEARDODGE_EXT;
    public static final int VK_BLEND_OP_LINEARBURN_EXT = VkBlendOp.VK_BLEND_OP_LINEARBURN_EXT;
    public static final int VK_BLEND_OP_VIVIDLIGHT_EXT = VkBlendOp.VK_BLEND_OP_VIVIDLIGHT_EXT;
    public static final int VK_BLEND_OP_LINEARLIGHT_EXT = VkBlendOp.VK_BLEND_OP_LINEARLIGHT_EXT;
    public static final int VK_BLEND_OP_PINLIGHT_EXT = VkBlendOp.VK_BLEND_OP_PINLIGHT_EXT;
    public static final int VK_BLEND_OP_HARDMIX_EXT = VkBlendOp.VK_BLEND_OP_HARDMIX_EXT;
    public static final int VK_BLEND_OP_HSL_HUE_EXT = VkBlendOp.VK_BLEND_OP_HSL_HUE_EXT;
    public static final int VK_BLEND_OP_HSL_SATURATION_EXT = VkBlendOp.VK_BLEND_OP_HSL_SATURATION_EXT;
    public static final int VK_BLEND_OP_HSL_COLOR_EXT = VkBlendOp.VK_BLEND_OP_HSL_COLOR_EXT;
    public static final int VK_BLEND_OP_HSL_LUMINOSITY_EXT = VkBlendOp.VK_BLEND_OP_HSL_LUMINOSITY_EXT;
    public static final int VK_BLEND_OP_PLUS_EXT = VkBlendOp.VK_BLEND_OP_PLUS_EXT;
    public static final int VK_BLEND_OP_PLUS_CLAMPED_EXT = VkBlendOp.VK_BLEND_OP_PLUS_CLAMPED_EXT;
    public static final int VK_BLEND_OP_PLUS_CLAMPED_ALPHA_EXT = VkBlendOp.VK_BLEND_OP_PLUS_CLAMPED_ALPHA_EXT;
    public static final int VK_BLEND_OP_PLUS_DARKER_EXT = VkBlendOp.VK_BLEND_OP_PLUS_DARKER_EXT;
    public static final int VK_BLEND_OP_MINUS_EXT = VkBlendOp.VK_BLEND_OP_MINUS_EXT;
    public static final int VK_BLEND_OP_MINUS_CLAMPED_EXT = VkBlendOp.VK_BLEND_OP_MINUS_CLAMPED_EXT;
    public static final int VK_BLEND_OP_CONTRAST_EXT = VkBlendOp.VK_BLEND_OP_CONTRAST_EXT;
    public static final int VK_BLEND_OP_INVERT_OVG_EXT = VkBlendOp.VK_BLEND_OP_INVERT_OVG_EXT;
    public static final int VK_BLEND_OP_RED_EXT = VkBlendOp.VK_BLEND_OP_RED_EXT;
    public static final int VK_BLEND_OP_GREEN_EXT = VkBlendOp.VK_BLEND_OP_GREEN_EXT;
    public static final int VK_BLEND_OP_BLUE_EXT = VkBlendOp.VK_BLEND_OP_BLUE_EXT;
    public static final int VK_DYNAMIC_STATE_VIEWPORT = VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT;
    public static final int VK_DYNAMIC_STATE_SCISSOR = VkDynamicState.VK_DYNAMIC_STATE_SCISSOR;
    public static final int VK_DYNAMIC_STATE_LINE_WIDTH = VkDynamicState.VK_DYNAMIC_STATE_LINE_WIDTH;
    public static final int VK_DYNAMIC_STATE_DEPTH_BIAS = VkDynamicState.VK_DYNAMIC_STATE_DEPTH_BIAS;
    public static final int VK_DYNAMIC_STATE_BLEND_CONSTANTS = VkDynamicState.VK_DYNAMIC_STATE_BLEND_CONSTANTS;
    public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS = VkDynamicState.VK_DYNAMIC_STATE_DEPTH_BOUNDS;
    public static final int VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK = VkDynamicState.VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK;
    public static final int VK_DYNAMIC_STATE_STENCIL_WRITE_MASK = VkDynamicState.VK_DYNAMIC_STATE_STENCIL_WRITE_MASK;
    public static final int VK_DYNAMIC_STATE_STENCIL_REFERENCE = VkDynamicState.VK_DYNAMIC_STATE_STENCIL_REFERENCE;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV = VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV;
    public static final int VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT = VkDynamicState.VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT;
    public static final int VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT = VkDynamicState.VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT;
    public static final int VK_FILTER_NEAREST = VkFilter.VK_FILTER_NEAREST;
    public static final int VK_FILTER_LINEAR = VkFilter.VK_FILTER_LINEAR;
    public static final int VK_FILTER_CUBIC_IMG = VkFilter.VK_FILTER_CUBIC_IMG;
    public static final int VK_SAMPLER_MIPMAP_MODE_NEAREST = VkSamplerMipmapMode.VK_SAMPLER_MIPMAP_MODE_NEAREST;
    public static final int VK_SAMPLER_MIPMAP_MODE_LINEAR = VkSamplerMipmapMode.VK_SAMPLER_MIPMAP_MODE_LINEAR;
    public static final int VK_SAMPLER_ADDRESS_MODE_REPEAT = VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_REPEAT;
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER;
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE = VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE;
    public static final int VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK = VkBorderColor.VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK;
    public static final int VK_BORDER_COLOR_INT_TRANSPARENT_BLACK = VkBorderColor.VK_BORDER_COLOR_INT_TRANSPARENT_BLACK;
    public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK = VkBorderColor.VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK;
    public static final int VK_BORDER_COLOR_INT_OPAQUE_BLACK = VkBorderColor.VK_BORDER_COLOR_INT_OPAQUE_BLACK;
    public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE = VkBorderColor.VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE;
    public static final int VK_BORDER_COLOR_INT_OPAQUE_WHITE = VkBorderColor.VK_BORDER_COLOR_INT_OPAQUE_WHITE;
    public static final int VK_DESCRIPTOR_TYPE_SAMPLER = VkDescriptorType.VK_DESCRIPTOR_TYPE_SAMPLER;
    public static final int VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER = VkDescriptorType.VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER;
    public static final int VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE = VkDescriptorType.VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_IMAGE = VkDescriptorType.VK_DESCRIPTOR_TYPE_STORAGE_IMAGE;
    public static final int VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER = VkDescriptorType.VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER = VkDescriptorType.VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER;
    public static final int VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER = VkDescriptorType.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_BUFFER = VkDescriptorType.VK_DESCRIPTOR_TYPE_STORAGE_BUFFER;
    public static final int VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC = VkDescriptorType.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC = VkDescriptorType.VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC;
    public static final int VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT = VkDescriptorType.VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT;
    public static final int VK_ATTACHMENT_LOAD_OP_LOAD = VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_LOAD;
    public static final int VK_ATTACHMENT_LOAD_OP_CLEAR = VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_CLEAR;
    public static final int VK_ATTACHMENT_LOAD_OP_DONT_CARE = VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_DONT_CARE;
    public static final int VK_ATTACHMENT_STORE_OP_STORE = VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_STORE;
    public static final int VK_ATTACHMENT_STORE_OP_DONT_CARE = VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_DONT_CARE;
    public static final int VK_PIPELINE_BIND_POINT_GRAPHICS = VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_GRAPHICS;
    public static final int VK_PIPELINE_BIND_POINT_COMPUTE = VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_COMPUTE;
    public static final int VK_COMMAND_BUFFER_LEVEL_PRIMARY = VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_PRIMARY;
    public static final int VK_COMMAND_BUFFER_LEVEL_SECONDARY = VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_SECONDARY;
    public static final int VK_INDEX_TYPE_UINT16 = VkIndexType.VK_INDEX_TYPE_UINT16;
    public static final int VK_INDEX_TYPE_UINT32 = VkIndexType.VK_INDEX_TYPE_UINT32;
    public static final int VK_SUBPASS_CONTENTS_INLINE = VkSubpassContents.VK_SUBPASS_CONTENTS_INLINE;
    public static final int VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = VkSubpassContents.VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS;
    public static final int VK_OBJECT_TYPE_UNKNOWN = VkObjectType.VK_OBJECT_TYPE_UNKNOWN;
    public static final int VK_OBJECT_TYPE_INSTANCE = VkObjectType.VK_OBJECT_TYPE_INSTANCE;
    public static final int VK_OBJECT_TYPE_PHYSICAL_DEVICE = VkObjectType.VK_OBJECT_TYPE_PHYSICAL_DEVICE;
    public static final int VK_OBJECT_TYPE_DEVICE = VkObjectType.VK_OBJECT_TYPE_DEVICE;
    public static final int VK_OBJECT_TYPE_QUEUE = VkObjectType.VK_OBJECT_TYPE_QUEUE;
    public static final int VK_OBJECT_TYPE_SEMAPHORE = VkObjectType.VK_OBJECT_TYPE_SEMAPHORE;
    public static final int VK_OBJECT_TYPE_COMMAND_BUFFER = VkObjectType.VK_OBJECT_TYPE_COMMAND_BUFFER;
    public static final int VK_OBJECT_TYPE_FENCE = VkObjectType.VK_OBJECT_TYPE_FENCE;
    public static final int VK_OBJECT_TYPE_DEVICE_MEMORY = VkObjectType.VK_OBJECT_TYPE_DEVICE_MEMORY;
    public static final int VK_OBJECT_TYPE_BUFFER = VkObjectType.VK_OBJECT_TYPE_BUFFER;
    public static final int VK_OBJECT_TYPE_IMAGE = VkObjectType.VK_OBJECT_TYPE_IMAGE;
    public static final int VK_OBJECT_TYPE_EVENT = VkObjectType.VK_OBJECT_TYPE_EVENT;
    public static final int VK_OBJECT_TYPE_QUERY_POOL = VkObjectType.VK_OBJECT_TYPE_QUERY_POOL;
    public static final int VK_OBJECT_TYPE_BUFFER_VIEW = VkObjectType.VK_OBJECT_TYPE_BUFFER_VIEW;
    public static final int VK_OBJECT_TYPE_IMAGE_VIEW = VkObjectType.VK_OBJECT_TYPE_IMAGE_VIEW;
    public static final int VK_OBJECT_TYPE_SHADER_MODULE = VkObjectType.VK_OBJECT_TYPE_SHADER_MODULE;
    public static final int VK_OBJECT_TYPE_PIPELINE_CACHE = VkObjectType.VK_OBJECT_TYPE_PIPELINE_CACHE;
    public static final int VK_OBJECT_TYPE_PIPELINE_LAYOUT = VkObjectType.VK_OBJECT_TYPE_PIPELINE_LAYOUT;
    public static final int VK_OBJECT_TYPE_RENDER_PASS = VkObjectType.VK_OBJECT_TYPE_RENDER_PASS;
    public static final int VK_OBJECT_TYPE_PIPELINE = VkObjectType.VK_OBJECT_TYPE_PIPELINE;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT = VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT;
    public static final int VK_OBJECT_TYPE_SAMPLER = VkObjectType.VK_OBJECT_TYPE_SAMPLER;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_POOL = VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_POOL;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_SET = VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_SET;
    public static final int VK_OBJECT_TYPE_FRAMEBUFFER = VkObjectType.VK_OBJECT_TYPE_FRAMEBUFFER;
    public static final int VK_OBJECT_TYPE_COMMAND_POOL = VkObjectType.VK_OBJECT_TYPE_COMMAND_POOL;
    public static final int VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION = VkObjectType.VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE = VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE;
    public static final int VK_OBJECT_TYPE_SURFACE_KHR = VkObjectType.VK_OBJECT_TYPE_SURFACE_KHR;
    public static final int VK_OBJECT_TYPE_SWAPCHAIN_KHR = VkObjectType.VK_OBJECT_TYPE_SWAPCHAIN_KHR;
    public static final int VK_OBJECT_TYPE_DISPLAY_KHR = VkObjectType.VK_OBJECT_TYPE_DISPLAY_KHR;
    public static final int VK_OBJECT_TYPE_DISPLAY_MODE_KHR = VkObjectType.VK_OBJECT_TYPE_DISPLAY_MODE_KHR;
    public static final int VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT = VkObjectType.VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT;
    public static final int VK_OBJECT_TYPE_OBJECT_TABLE_NVX = VkObjectType.VK_OBJECT_TYPE_OBJECT_TABLE_NVX;
    public static final int VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX = VkObjectType.VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX;
    public static final int VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT = VkObjectType.VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT;
    public static final int VK_OBJECT_TYPE_VALIDATION_CACHE_EXT = VkObjectType.VK_OBJECT_TYPE_VALIDATION_CACHE_EXT;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR = VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR;
    public static final int VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR = VkObjectType.VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT;
    public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT;
    public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT;
    public static final int VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT;
    public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT;
    public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT;
    public static final int VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT;
    public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT;
    public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT;
    public static final int VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT;
    public static final int VK_FORMAT_FEATURE_BLIT_SRC_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_BLIT_SRC_BIT;
    public static final int VK_FORMAT_FEATURE_BLIT_DST_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_BLIT_DST_BIT;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT;
    public static final int VK_FORMAT_FEATURE_TRANSFER_SRC_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_SRC_BIT;
    public static final int VK_FORMAT_FEATURE_TRANSFER_DST_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_DST_BIT;
    public static final int VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT;
    public static final int VK_FORMAT_FEATURE_DISJOINT_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_DISJOINT_BIT;
    public static final int VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT_EXT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT_EXT;
    public static final int VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR;
    public static final int VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR;
    public static final int VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR;
    public static final int VK_FORMAT_FEATURE_DISJOINT_BIT_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_DISJOINT_BIT_KHR;
    public static final int VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR;
    public static final int VK_IMAGE_USAGE_TRANSFER_SRC_BIT = VkImageUsageFlagBits.VK_IMAGE_USAGE_TRANSFER_SRC_BIT;
    public static final int VK_IMAGE_USAGE_TRANSFER_DST_BIT = VkImageUsageFlagBits.VK_IMAGE_USAGE_TRANSFER_DST_BIT;
    public static final int VK_IMAGE_USAGE_SAMPLED_BIT = VkImageUsageFlagBits.VK_IMAGE_USAGE_SAMPLED_BIT;
    public static final int VK_IMAGE_USAGE_STORAGE_BIT = VkImageUsageFlagBits.VK_IMAGE_USAGE_STORAGE_BIT;
    public static final int VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT = VkImageUsageFlagBits.VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT;
    public static final int VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = VkImageUsageFlagBits.VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT;
    public static final int VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT = VkImageUsageFlagBits.VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT;
    public static final int VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT = VkImageUsageFlagBits.VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT;
    public static final int VK_IMAGE_CREATE_SPARSE_BINDING_BIT = VkImageCreateFlagBits.VK_IMAGE_CREATE_SPARSE_BINDING_BIT;
    public static final int VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = VkImageCreateFlagBits.VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT;
    public static final int VK_IMAGE_CREATE_SPARSE_ALIASED_BIT = VkImageCreateFlagBits.VK_IMAGE_CREATE_SPARSE_ALIASED_BIT;
    public static final int VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT = VkImageCreateFlagBits.VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT;
    public static final int VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT = VkImageCreateFlagBits.VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT;
    public static final int VK_IMAGE_CREATE_ALIAS_BIT = VkImageCreateFlagBits.VK_IMAGE_CREATE_ALIAS_BIT;
    public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT = VkImageCreateFlagBits.VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT;
    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT = VkImageCreateFlagBits.VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT;
    public static final int VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT = VkImageCreateFlagBits.VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT;
    public static final int VK_IMAGE_CREATE_EXTENDED_USAGE_BIT = VkImageCreateFlagBits.VK_IMAGE_CREATE_EXTENDED_USAGE_BIT;
    public static final int VK_IMAGE_CREATE_PROTECTED_BIT = VkImageCreateFlagBits.VK_IMAGE_CREATE_PROTECTED_BIT;
    public static final int VK_IMAGE_CREATE_DISJOINT_BIT = VkImageCreateFlagBits.VK_IMAGE_CREATE_DISJOINT_BIT;
    public static final int VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT = VkImageCreateFlagBits.VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT;
    public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = VkImageCreateFlagBits.VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR;
    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR = VkImageCreateFlagBits.VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR;
    public static final int VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR = VkImageCreateFlagBits.VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR;
    public static final int VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR = VkImageCreateFlagBits.VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR;
    public static final int VK_IMAGE_CREATE_DISJOINT_BIT_KHR = VkImageCreateFlagBits.VK_IMAGE_CREATE_DISJOINT_BIT_KHR;
    public static final int VK_IMAGE_CREATE_ALIAS_BIT_KHR = VkImageCreateFlagBits.VK_IMAGE_CREATE_ALIAS_BIT_KHR;
    public static final int VK_SAMPLE_COUNT_1_BIT = VkSampleCountFlagBits.VK_SAMPLE_COUNT_1_BIT;
    public static final int VK_SAMPLE_COUNT_2_BIT = VkSampleCountFlagBits.VK_SAMPLE_COUNT_2_BIT;
    public static final int VK_SAMPLE_COUNT_4_BIT = VkSampleCountFlagBits.VK_SAMPLE_COUNT_4_BIT;
    public static final int VK_SAMPLE_COUNT_8_BIT = VkSampleCountFlagBits.VK_SAMPLE_COUNT_8_BIT;
    public static final int VK_SAMPLE_COUNT_16_BIT = VkSampleCountFlagBits.VK_SAMPLE_COUNT_16_BIT;
    public static final int VK_SAMPLE_COUNT_32_BIT = VkSampleCountFlagBits.VK_SAMPLE_COUNT_32_BIT;
    public static final int VK_SAMPLE_COUNT_64_BIT = VkSampleCountFlagBits.VK_SAMPLE_COUNT_64_BIT;
    public static final int VK_QUEUE_GRAPHICS_BIT = VkQueueFlagBits.VK_QUEUE_GRAPHICS_BIT;
    public static final int VK_QUEUE_COMPUTE_BIT = VkQueueFlagBits.VK_QUEUE_COMPUTE_BIT;
    public static final int VK_QUEUE_TRANSFER_BIT = VkQueueFlagBits.VK_QUEUE_TRANSFER_BIT;
    public static final int VK_QUEUE_SPARSE_BINDING_BIT = VkQueueFlagBits.VK_QUEUE_SPARSE_BINDING_BIT;
    public static final int VK_QUEUE_PROTECTED_BIT = VkQueueFlagBits.VK_QUEUE_PROTECTED_BIT;
    public static final int VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT;
    public static final int VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT;
    public static final int VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT;
    public static final int VK_MEMORY_PROPERTY_HOST_CACHED_BIT = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_HOST_CACHED_BIT;
    public static final int VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT;
    public static final int VK_MEMORY_PROPERTY_PROTECTED_BIT = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_PROTECTED_BIT;
    public static final int VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = VkMemoryHeapFlagBits.VK_MEMORY_HEAP_DEVICE_LOCAL_BIT;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT = VkMemoryHeapFlagBits.VK_MEMORY_HEAP_MULTI_INSTANCE_BIT;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR = VkMemoryHeapFlagBits.VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR;
    public static final int VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT = VkDeviceQueueCreateFlagBits.VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT;
    public static final int VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT;
    public static final int VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT;
    public static final int VK_PIPELINE_STAGE_VERTEX_INPUT_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_VERTEX_INPUT_BIT;
    public static final int VK_PIPELINE_STAGE_VERTEX_SHADER_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_VERTEX_SHADER_BIT;
    public static final int VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT;
    public static final int VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT;
    public static final int VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT;
    public static final int VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT;
    public static final int VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT;
    public static final int VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT;
    public static final int VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT;
    public static final int VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT;
    public static final int VK_PIPELINE_STAGE_TRANSFER_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_TRANSFER_BIT;
    public static final int VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT;
    public static final int VK_PIPELINE_STAGE_HOST_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_HOST_BIT;
    public static final int VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT;
    public static final int VK_PIPELINE_STAGE_ALL_COMMANDS_BIT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_ALL_COMMANDS_BIT;
    public static final int VK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX;
    public static final int VK_IMAGE_ASPECT_COLOR_BIT = VkImageAspectFlagBits.VK_IMAGE_ASPECT_COLOR_BIT;
    public static final int VK_IMAGE_ASPECT_DEPTH_BIT = VkImageAspectFlagBits.VK_IMAGE_ASPECT_DEPTH_BIT;
    public static final int VK_IMAGE_ASPECT_STENCIL_BIT = VkImageAspectFlagBits.VK_IMAGE_ASPECT_STENCIL_BIT;
    public static final int VK_IMAGE_ASPECT_METADATA_BIT = VkImageAspectFlagBits.VK_IMAGE_ASPECT_METADATA_BIT;
    public static final int VK_IMAGE_ASPECT_PLANE_0_BIT = VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_0_BIT;
    public static final int VK_IMAGE_ASPECT_PLANE_1_BIT = VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_1_BIT;
    public static final int VK_IMAGE_ASPECT_PLANE_2_BIT = VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_2_BIT;
    public static final int VK_IMAGE_ASPECT_PLANE_0_BIT_KHR = VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_0_BIT_KHR;
    public static final int VK_IMAGE_ASPECT_PLANE_1_BIT_KHR = VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_1_BIT_KHR;
    public static final int VK_IMAGE_ASPECT_PLANE_2_BIT_KHR = VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_2_BIT_KHR;
    public static final int VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT = VkSparseImageFormatFlagBits.VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT;
    public static final int VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT = VkSparseImageFormatFlagBits.VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT;
    public static final int VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT = VkSparseImageFormatFlagBits.VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT;
    public static final int VK_SPARSE_MEMORY_BIND_METADATA_BIT = VkSparseMemoryBindFlagBits.VK_SPARSE_MEMORY_BIND_METADATA_BIT;
    public static final int VK_FENCE_CREATE_SIGNALED_BIT = VkFenceCreateFlagBits.VK_FENCE_CREATE_SIGNALED_BIT;
    public static final int VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT;
    public static final int VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT;
    public static final int VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT;
    public static final int VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT;
    public static final int VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT;
    public static final int VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT;
    public static final int VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT;
    public static final int VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT;
    public static final int VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT;
    public static final int VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT;
    public static final int VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT;
    public static final int VK_QUERY_RESULT_64_BIT = VkQueryResultFlagBits.VK_QUERY_RESULT_64_BIT;
    public static final int VK_QUERY_RESULT_WAIT_BIT = VkQueryResultFlagBits.VK_QUERY_RESULT_WAIT_BIT;
    public static final int VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = VkQueryResultFlagBits.VK_QUERY_RESULT_WITH_AVAILABILITY_BIT;
    public static final int VK_QUERY_RESULT_PARTIAL_BIT = VkQueryResultFlagBits.VK_QUERY_RESULT_PARTIAL_BIT;
    public static final int VK_BUFFER_CREATE_SPARSE_BINDING_BIT = VkBufferCreateFlagBits.VK_BUFFER_CREATE_SPARSE_BINDING_BIT;
    public static final int VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = VkBufferCreateFlagBits.VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT;
    public static final int VK_BUFFER_CREATE_SPARSE_ALIASED_BIT = VkBufferCreateFlagBits.VK_BUFFER_CREATE_SPARSE_ALIASED_BIT;
    public static final int VK_BUFFER_CREATE_PROTECTED_BIT = VkBufferCreateFlagBits.VK_BUFFER_CREATE_PROTECTED_BIT;
    public static final int VK_BUFFER_USAGE_TRANSFER_SRC_BIT = VkBufferUsageFlagBits.VK_BUFFER_USAGE_TRANSFER_SRC_BIT;
    public static final int VK_BUFFER_USAGE_TRANSFER_DST_BIT = VkBufferUsageFlagBits.VK_BUFFER_USAGE_TRANSFER_DST_BIT;
    public static final int VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT = VkBufferUsageFlagBits.VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT;
    public static final int VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT = VkBufferUsageFlagBits.VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT;
    public static final int VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT = VkBufferUsageFlagBits.VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT;
    public static final int VK_BUFFER_USAGE_STORAGE_BUFFER_BIT = VkBufferUsageFlagBits.VK_BUFFER_USAGE_STORAGE_BUFFER_BIT;
    public static final int VK_BUFFER_USAGE_INDEX_BUFFER_BIT = VkBufferUsageFlagBits.VK_BUFFER_USAGE_INDEX_BUFFER_BIT;
    public static final int VK_BUFFER_USAGE_VERTEX_BUFFER_BIT = VkBufferUsageFlagBits.VK_BUFFER_USAGE_VERTEX_BUFFER_BIT;
    public static final int VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT = VkBufferUsageFlagBits.VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT;
    public static final int VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT;
    public static final int VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT;
    public static final int VK_PIPELINE_CREATE_DERIVATIVE_BIT = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DERIVATIVE_BIT;
    public static final int VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISPATCH_BASE;
    public static final int VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE_KHR = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISPATCH_BASE_KHR;
    public static final int VK_SHADER_STAGE_VERTEX_BIT = VkShaderStageFlagBits.VK_SHADER_STAGE_VERTEX_BIT;
    public static final int VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT = VkShaderStageFlagBits.VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT;
    public static final int VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = VkShaderStageFlagBits.VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT;
    public static final int VK_SHADER_STAGE_GEOMETRY_BIT = VkShaderStageFlagBits.VK_SHADER_STAGE_GEOMETRY_BIT;
    public static final int VK_SHADER_STAGE_FRAGMENT_BIT = VkShaderStageFlagBits.VK_SHADER_STAGE_FRAGMENT_BIT;
    public static final int VK_SHADER_STAGE_COMPUTE_BIT = VkShaderStageFlagBits.VK_SHADER_STAGE_COMPUTE_BIT;
    public static final int VK_SHADER_STAGE_ALL_GRAPHICS = VkShaderStageFlagBits.VK_SHADER_STAGE_ALL_GRAPHICS;
    public static final int VK_SHADER_STAGE_ALL = VkShaderStageFlagBits.VK_SHADER_STAGE_ALL;
    public static final int VK_CULL_MODE_NONE = VkCullModeFlagBits.VK_CULL_MODE_NONE;
    public static final int VK_CULL_MODE_FRONT_BIT = VkCullModeFlagBits.VK_CULL_MODE_FRONT_BIT;
    public static final int VK_CULL_MODE_BACK_BIT = VkCullModeFlagBits.VK_CULL_MODE_BACK_BIT;
    public static final int VK_CULL_MODE_FRONT_AND_BACK = VkCullModeFlagBits.VK_CULL_MODE_FRONT_AND_BACK;
    public static final int VK_COLOR_COMPONENT_R_BIT = VkColorComponentFlagBits.VK_COLOR_COMPONENT_R_BIT;
    public static final int VK_COLOR_COMPONENT_G_BIT = VkColorComponentFlagBits.VK_COLOR_COMPONENT_G_BIT;
    public static final int VK_COLOR_COMPONENT_B_BIT = VkColorComponentFlagBits.VK_COLOR_COMPONENT_B_BIT;
    public static final int VK_COLOR_COMPONENT_A_BIT = VkColorComponentFlagBits.VK_COLOR_COMPONENT_A_BIT;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR = VkDescriptorSetLayoutCreateFlagBits.VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT = VkDescriptorSetLayoutCreateFlagBits.VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT;
    public static final int VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = VkDescriptorPoolCreateFlagBits.VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT;
    public static final int VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT = VkDescriptorPoolCreateFlagBits.VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT;
    public static final int VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT = VkAttachmentDescriptionFlagBits.VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT;
    public static final int VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX = VkSubpassDescriptionFlagBits.VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX;
    public static final int VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX = VkSubpassDescriptionFlagBits.VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX;
    public static final int VK_ACCESS_INDIRECT_COMMAND_READ_BIT = VkAccessFlagBits.VK_ACCESS_INDIRECT_COMMAND_READ_BIT;
    public static final int VK_ACCESS_INDEX_READ_BIT = VkAccessFlagBits.VK_ACCESS_INDEX_READ_BIT;
    public static final int VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT = VkAccessFlagBits.VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT;
    public static final int VK_ACCESS_UNIFORM_READ_BIT = VkAccessFlagBits.VK_ACCESS_UNIFORM_READ_BIT;
    public static final int VK_ACCESS_INPUT_ATTACHMENT_READ_BIT = VkAccessFlagBits.VK_ACCESS_INPUT_ATTACHMENT_READ_BIT;
    public static final int VK_ACCESS_SHADER_READ_BIT = VkAccessFlagBits.VK_ACCESS_SHADER_READ_BIT;
    public static final int VK_ACCESS_SHADER_WRITE_BIT = VkAccessFlagBits.VK_ACCESS_SHADER_WRITE_BIT;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_READ_BIT = VkAccessFlagBits.VK_ACCESS_COLOR_ATTACHMENT_READ_BIT;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT = VkAccessFlagBits.VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
    public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT = VkAccessFlagBits.VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT;
    public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = VkAccessFlagBits.VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT;
    public static final int VK_ACCESS_TRANSFER_READ_BIT = VkAccessFlagBits.VK_ACCESS_TRANSFER_READ_BIT;
    public static final int VK_ACCESS_TRANSFER_WRITE_BIT = VkAccessFlagBits.VK_ACCESS_TRANSFER_WRITE_BIT;
    public static final int VK_ACCESS_HOST_READ_BIT = VkAccessFlagBits.VK_ACCESS_HOST_READ_BIT;
    public static final int VK_ACCESS_HOST_WRITE_BIT = VkAccessFlagBits.VK_ACCESS_HOST_WRITE_BIT;
    public static final int VK_ACCESS_MEMORY_READ_BIT = VkAccessFlagBits.VK_ACCESS_MEMORY_READ_BIT;
    public static final int VK_ACCESS_MEMORY_WRITE_BIT = VkAccessFlagBits.VK_ACCESS_MEMORY_WRITE_BIT;
    public static final int VK_ACCESS_COMMAND_PROCESS_READ_BIT_NVX = VkAccessFlagBits.VK_ACCESS_COMMAND_PROCESS_READ_BIT_NVX;
    public static final int VK_ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX = VkAccessFlagBits.VK_ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT = VkAccessFlagBits.VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT;
    public static final int VK_DEPENDENCY_BY_REGION_BIT = VkDependencyFlagBits.VK_DEPENDENCY_BY_REGION_BIT;
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT = VkDependencyFlagBits.VK_DEPENDENCY_DEVICE_GROUP_BIT;
    public static final int VK_DEPENDENCY_VIEW_LOCAL_BIT = VkDependencyFlagBits.VK_DEPENDENCY_VIEW_LOCAL_BIT;
    public static final int VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR = VkDependencyFlagBits.VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR;
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR = VkDependencyFlagBits.VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR;
    public static final int VK_COMMAND_POOL_CREATE_TRANSIENT_BIT = VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_TRANSIENT_BIT;
    public static final int VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT = VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT;
    public static final int VK_COMMAND_POOL_CREATE_PROTECTED_BIT = VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_PROTECTED_BIT;
    public static final int VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = VkCommandPoolResetFlagBits.VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT;
    public static final int VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT = VkCommandBufferUsageFlagBits.VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT;
    public static final int VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = VkCommandBufferUsageFlagBits.VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT;
    public static final int VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT = VkCommandBufferUsageFlagBits.VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT;
    public static final int VK_QUERY_CONTROL_PRECISE_BIT = VkQueryControlFlagBits.VK_QUERY_CONTROL_PRECISE_BIT;
    public static final int VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = VkCommandBufferResetFlagBits.VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT;
    public static final int VK_STENCIL_FACE_FRONT_BIT = VkStencilFaceFlagBits.VK_STENCIL_FACE_FRONT_BIT;
    public static final int VK_STENCIL_FACE_BACK_BIT = VkStencilFaceFlagBits.VK_STENCIL_FACE_BACK_BIT;
    public static final int VK_STENCIL_FRONT_AND_BACK = VkStencilFaceFlagBits.VK_STENCIL_FRONT_AND_BACK;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES = VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY = VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR = VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR = VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT = VkTessellationDomainOrigin.VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT = VkTessellationDomainOrigin.VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR = VkTessellationDomainOrigin.VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR = VkTessellationDomainOrigin.VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709 = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601 = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020 = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_FULL = VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_FULL;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_NARROW = VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_NARROW;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR = VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR = VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR;
    public static final int VK_CHROMA_LOCATION_COSITED_EVEN = VkChromaLocation.VK_CHROMA_LOCATION_COSITED_EVEN;
    public static final int VK_CHROMA_LOCATION_MIDPOINT = VkChromaLocation.VK_CHROMA_LOCATION_MIDPOINT;
    public static final int VK_CHROMA_LOCATION_COSITED_EVEN_KHR = VkChromaLocation.VK_CHROMA_LOCATION_COSITED_EVEN_KHR;
    public static final int VK_CHROMA_LOCATION_MIDPOINT_KHR = VkChromaLocation.VK_CHROMA_LOCATION_MIDPOINT_KHR;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET = VkDescriptorUpdateTemplateType.VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR = VkDescriptorUpdateTemplateType.VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR = VkDescriptorUpdateTemplateType.VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR;
    public static final int VK_SUBGROUP_FEATURE_BASIC_BIT = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_BASIC_BIT;
    public static final int VK_SUBGROUP_FEATURE_VOTE_BIT = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_VOTE_BIT;
    public static final int VK_SUBGROUP_FEATURE_ARITHMETIC_BIT = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_ARITHMETIC_BIT;
    public static final int VK_SUBGROUP_FEATURE_BALLOT_BIT = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_BALLOT_BIT;
    public static final int VK_SUBGROUP_FEATURE_SHUFFLE_BIT = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_SHUFFLE_BIT;
    public static final int VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT;
    public static final int VK_SUBGROUP_FEATURE_CLUSTERED_BIT = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_CLUSTERED_BIT;
    public static final int VK_SUBGROUP_FEATURE_QUAD_BIT = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_QUAD_BIT;
    public static final int VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_DST_BIT = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_COPY_DST_BIT;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT = VkMemoryAllocateFlagBits.VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR = VkMemoryAllocateFlagBits.VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR = VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHR = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHR;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHR = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHR;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR;
    public static final int VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT = VkExternalFenceFeatureFlagBits.VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT;
    public static final int VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT = VkExternalFenceFeatureFlagBits.VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT;
    public static final int VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR = VkExternalFenceFeatureFlagBits.VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR;
    public static final int VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR = VkExternalFenceFeatureFlagBits.VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR;
    public static final int VK_FENCE_IMPORT_TEMPORARY_BIT = VkFenceImportFlagBits.VK_FENCE_IMPORT_TEMPORARY_BIT;
    public static final int VK_FENCE_IMPORT_TEMPORARY_BIT_KHR = VkFenceImportFlagBits.VK_FENCE_IMPORT_TEMPORARY_BIT_KHR;
    public static final int VK_SEMAPHORE_IMPORT_TEMPORARY_BIT = VkSemaphoreImportFlagBits.VK_SEMAPHORE_IMPORT_TEMPORARY_BIT;
    public static final int VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR = VkSemaphoreImportFlagBits.VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR;
    public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT = VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT;
    public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT = VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT;
    public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR = VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR;
    public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR = VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR;
    public static final int VK_COLOR_SPACE_SRGB_NONLINEAR_KHR = VkColorSpaceKHR.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR;
    public static final int VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT;
    public static final int VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT;
    public static final int VK_COLOR_SPACE_DCI_P3_LINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_DCI_P3_LINEAR_EXT;
    public static final int VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT;
    public static final int VK_COLOR_SPACE_BT709_LINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_BT709_LINEAR_EXT;
    public static final int VK_COLOR_SPACE_BT709_NONLINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_BT709_NONLINEAR_EXT;
    public static final int VK_COLOR_SPACE_BT2020_LINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_BT2020_LINEAR_EXT;
    public static final int VK_COLOR_SPACE_HDR10_ST2084_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_HDR10_ST2084_EXT;
    public static final int VK_COLOR_SPACE_DOLBYVISION_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_DOLBYVISION_EXT;
    public static final int VK_COLOR_SPACE_HDR10_HLG_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_HDR10_HLG_EXT;
    public static final int VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT;
    public static final int VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT;
    public static final int VK_COLOR_SPACE_PASS_THROUGH_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_PASS_THROUGH_EXT;
    public static final int VK_COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT;
    public static final int VK_PRESENT_MODE_IMMEDIATE_KHR = VkPresentModeKHR.VK_PRESENT_MODE_IMMEDIATE_KHR;
    public static final int VK_PRESENT_MODE_MAILBOX_KHR = VkPresentModeKHR.VK_PRESENT_MODE_MAILBOX_KHR;
    public static final int VK_PRESENT_MODE_FIFO_KHR = VkPresentModeKHR.VK_PRESENT_MODE_FIFO_KHR;
    public static final int VK_PRESENT_MODE_FIFO_RELAXED_KHR = VkPresentModeKHR.VK_PRESENT_MODE_FIFO_RELAXED_KHR;
    public static final int VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR = VkPresentModeKHR.VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR;
    public static final int VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR = VkPresentModeKHR.VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR;
    public static final int VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR;
    public static final int VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR;
    public static final int VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR;
    public static final int VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR;
    public static final int VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR;
    public static final int VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR;
    public static final int VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = VkSwapchainCreateFlagBitsKHR.VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR;
    public static final int VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR = VkSwapchainCreateFlagBitsKHR.VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR;
    public static final int VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR;
    public static final int VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT;
    public static final int VK_DEBUG_REPORT_INFORMATION_BIT_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_INFORMATION_BIT_EXT;
    public static final int VK_DEBUG_REPORT_WARNING_BIT_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_WARNING_BIT_EXT;
    public static final int VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT;
    public static final int VK_DEBUG_REPORT_ERROR_BIT_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_ERROR_BIT_EXT;
    public static final int VK_DEBUG_REPORT_DEBUG_BIT_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_DEBUG_BIT_EXT;
    public static final int VK_RASTERIZATION_ORDER_STRICT_AMD = VkRasterizationOrderAMD.VK_RASTERIZATION_ORDER_STRICT_AMD;
    public static final int VK_RASTERIZATION_ORDER_RELAXED_AMD = VkRasterizationOrderAMD.VK_RASTERIZATION_ORDER_RELAXED_AMD;
    public static final int VK_SHADER_INFO_TYPE_STATISTICS_AMD = VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_STATISTICS_AMD;
    public static final int VK_SHADER_INFO_TYPE_BINARY_AMD = VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_BINARY_AMD;
    public static final int VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD = VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV = VkExternalMemoryHandleTypeFlagBitsNV.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV = VkExternalMemoryHandleTypeFlagBitsNV.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV = VkExternalMemoryHandleTypeFlagBitsNV.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV = VkExternalMemoryHandleTypeFlagBitsNV.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV = VkExternalMemoryFeatureFlagBitsNV.VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV = VkExternalMemoryFeatureFlagBitsNV.VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV = VkExternalMemoryFeatureFlagBitsNV.VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV;
    public static final int VK_VALIDATION_CHECK_ALL_EXT = VkValidationCheckEXT.VK_VALIDATION_CHECK_ALL_EXT;
    public static final int VK_VALIDATION_CHECK_SHADERS_EXT = VkValidationCheckEXT.VK_VALIDATION_CHECK_SHADERS_EXT;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX;
    public static final int VK_OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX = VkObjectEntryTypeNVX.VK_OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX;
    public static final int VK_OBJECT_ENTRY_TYPE_PIPELINE_NVX = VkObjectEntryTypeNVX.VK_OBJECT_ENTRY_TYPE_PIPELINE_NVX;
    public static final int VK_OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX = VkObjectEntryTypeNVX.VK_OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX;
    public static final int VK_OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX = VkObjectEntryTypeNVX.VK_OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX;
    public static final int VK_OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX = VkObjectEntryTypeNVX.VK_OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX = VkIndirectCommandsLayoutUsageFlagBitsNVX.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_BIT_NVX = VkIndirectCommandsLayoutUsageFlagBitsNVX.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_BIT_NVX;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_BIT_NVX = VkIndirectCommandsLayoutUsageFlagBitsNVX.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_BIT_NVX;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX = VkIndirectCommandsLayoutUsageFlagBitsNVX.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX;
    public static final int VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX = VkObjectEntryUsageFlagBitsNVX.VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX;
    public static final int VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX = VkObjectEntryUsageFlagBitsNVX.VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX;
    public static final int VK_SURFACE_COUNTER_VBLANK_EXT = VkSurfaceCounterFlagBitsEXT.VK_SURFACE_COUNTER_VBLANK_EXT;
    public static final int VK_DISPLAY_POWER_STATE_OFF_EXT = VkDisplayPowerStateEXT.VK_DISPLAY_POWER_STATE_OFF_EXT;
    public static final int VK_DISPLAY_POWER_STATE_SUSPEND_EXT = VkDisplayPowerStateEXT.VK_DISPLAY_POWER_STATE_SUSPEND_EXT;
    public static final int VK_DISPLAY_POWER_STATE_ON_EXT = VkDisplayPowerStateEXT.VK_DISPLAY_POWER_STATE_ON_EXT;
    public static final int VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT = VkDeviceEventTypeEXT.VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT;
    public static final int VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT = VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV;
    public static final int VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT = VkDiscardRectangleModeEXT.VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT;
    public static final int VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT = VkDiscardRectangleModeEXT.VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT;
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT = VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT;
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT = VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT;
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT = VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT = VkDebugUtilsMessageSeverityFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT = VkDebugUtilsMessageSeverityFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT = VkDebugUtilsMessageSeverityFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT = VkDebugUtilsMessageSeverityFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT = VkDebugUtilsMessageTypeFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT = VkDebugUtilsMessageTypeFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT = VkDebugUtilsMessageTypeFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT;
    public static final int VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT = VkSamplerReductionModeEXT.VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT;
    public static final int VK_SAMPLER_REDUCTION_MODE_MIN_EXT = VkSamplerReductionModeEXT.VK_SAMPLER_REDUCTION_MODE_MIN_EXT;
    public static final int VK_SAMPLER_REDUCTION_MODE_MAX_EXT = VkSamplerReductionModeEXT.VK_SAMPLER_REDUCTION_MODE_MAX_EXT;
    public static final int VK_BLEND_OVERLAP_UNCORRELATED_EXT = VkBlendOverlapEXT.VK_BLEND_OVERLAP_UNCORRELATED_EXT;
    public static final int VK_BLEND_OVERLAP_DISJOINT_EXT = VkBlendOverlapEXT.VK_BLEND_OVERLAP_DISJOINT_EXT;
    public static final int VK_BLEND_OVERLAP_CONJOINT_EXT = VkBlendOverlapEXT.VK_BLEND_OVERLAP_CONJOINT_EXT;
    public static final int VK_COVERAGE_MODULATION_MODE_NONE_NV = VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_NONE_NV;
    public static final int VK_COVERAGE_MODULATION_MODE_RGB_NV = VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_RGB_NV;
    public static final int VK_COVERAGE_MODULATION_MODE_ALPHA_NV = VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_ALPHA_NV;
    public static final int VK_COVERAGE_MODULATION_MODE_RGBA_NV = VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_RGBA_NV;
    public static final int VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT = VkValidationCacheHeaderVersionEXT.VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT;
    public static final int VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT = VkDescriptorBindingFlagBitsEXT.VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT;
    public static final int VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT = VkDescriptorBindingFlagBitsEXT.VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT;
    public static final int VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT = VkDescriptorBindingFlagBitsEXT.VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT;
    public static final int VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT = VkDescriptorBindingFlagBitsEXT.VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT = VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT = VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT = VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT = VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT;

    public static final long VK_VERSION_1_0 = 1;
    public static final long VK_HEADER_VERSION = 73;
    public static final long VK_NULL_HANDLE = 0;
    public static final float VK_LOD_CLAMP_NONE = 1000.0f;
    public static final long VK_REMAINING_MIP_LEVELS = 4294967295L;
    public static final long VK_REMAINING_ARRAY_LAYERS = 4294967295L;
    public static final long VK_WHOLE_SIZE = -1L;
    public static final long VK_ATTACHMENT_UNUSED = 4294967295L;
    public static final int VK_TRUE = 1;
    public static final int VK_FALSE = 0;
    public static final long VK_QUEUE_FAMILY_IGNORED = 4294967295L;
    public static final long VK_SUBPASS_EXTERNAL = 4294967295L;
    public static final long VK_MAX_PHYSICAL_DEVICE_NAME_SIZE = 256;
    public static final long VK_UUID_SIZE = 16;
    public static final long VK_MAX_MEMORY_TYPES = 32;
    public static final long VK_MAX_MEMORY_HEAPS = 16;
    public static final long VK_MAX_EXTENSION_NAME_SIZE = 256;
    public static final long VK_MAX_DESCRIPTION_SIZE = 256;
    public static final long VK_VERSION_1_1 = 1;
    public static final long VK_MAX_DEVICE_GROUP_SIZE = 32;
    public static final long VK_LUID_SIZE = 8;
    public static final long VK_QUEUE_FAMILY_EXTERNAL = 4294967294L;
    public static final long VK_KHR_surface = 1;
    public static final long VK_KHR_SURFACE_SPEC_VERSION = 25;
    public static final String VK_KHR_SURFACE_EXTENSION_NAME = "VK_KHR_surface";
    public static final long VK_COLORSPACE_SRGB_NONLINEAR_KHR = VK_COLOR_SPACE_SRGB_NONLINEAR_KHR;
    public static final long VK_KHR_swapchain = 1;
    public static final long VK_KHR_SWAPCHAIN_SPEC_VERSION = 70;
    public static final String VK_KHR_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_swapchain";
    public static final long VK_KHR_display = 1;
    public static final long VK_KHR_DISPLAY_SPEC_VERSION = 21;
    public static final String VK_KHR_DISPLAY_EXTENSION_NAME = "VK_KHR_display";
    public static final long VK_KHR_display_swapchain = 1;
    public static final long VK_KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION = 9;
    public static final String VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_display_swapchain";
    public static final long VK_KHR_sampler_mirror_clamp_to_edge = 1;
    public static final long VK_KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_SPEC_VERSION = 1;
    public static final String VK_KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_EXTENSION_NAME = "VK_KHR_sampler_mirror_clamp_to_edge";
    public static final long VK_KHR_multiview = 1;
    public static final long VK_KHR_MULTIVIEW_SPEC_VERSION = 1;
    public static final String VK_KHR_MULTIVIEW_EXTENSION_NAME = "VK_KHR_multiview";
    public static final long VK_KHR_get_physical_device_properties2 = 1;
    public static final long VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION = 1;
    public static final String VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME = "VK_KHR_get_physical_device_properties2";
    public static final long VK_KHR_device_group = 1;
    public static final long VK_KHR_DEVICE_GROUP_SPEC_VERSION = 3;
    public static final String VK_KHR_DEVICE_GROUP_EXTENSION_NAME = "VK_KHR_device_group";
    public static final long VK_KHR_shader_draw_parameters = 1;
    public static final long VK_KHR_SHADER_DRAW_PARAMETERS_SPEC_VERSION = 1;
    public static final String VK_KHR_SHADER_DRAW_PARAMETERS_EXTENSION_NAME = "VK_KHR_shader_draw_parameters";
    public static final long VK_KHR_maintenance1 = 1;
    public static final long VK_KHR_MAINTENANCE1_SPEC_VERSION = 2;
    public static final String VK_KHR_MAINTENANCE1_EXTENSION_NAME = "VK_KHR_maintenance1";
    public static final long VK_KHR_device_group_creation = 1;
    public static final long VK_KHR_DEVICE_GROUP_CREATION_SPEC_VERSION = 1;
    public static final String VK_KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME = "VK_KHR_device_group_creation";
    public static final long VK_MAX_DEVICE_GROUP_SIZE_KHR = VK_MAX_DEVICE_GROUP_SIZE;
    public static final long VK_KHR_external_memory_capabilities = 1;
    public static final long VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME = "VK_KHR_external_memory_capabilities";
    public static final long VK_LUID_SIZE_KHR = VK_LUID_SIZE;
    public static final long VK_KHR_external_memory = 1;
    public static final long VK_KHR_EXTERNAL_MEMORY_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_MEMORY_EXTENSION_NAME = "VK_KHR_external_memory";
    public static final long VK_QUEUE_FAMILY_EXTERNAL_KHR = 4294967294L;
    public static final long VK_KHR_external_memory_fd = 1;
    public static final long VK_KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME = "VK_KHR_external_memory_fd";
    public static final long VK_KHR_external_semaphore_capabilities = 1;
    public static final long VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_EXTENSION_NAME = "VK_KHR_external_semaphore_capabilities";
    public static final long VK_KHR_external_semaphore = 1;
    public static final long VK_KHR_EXTERNAL_SEMAPHORE_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_EXTENSION_NAME = "VK_KHR_external_semaphore";
    public static final long VK_KHR_external_semaphore_fd = 1;
    public static final long VK_KHR_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME = "VK_KHR_external_semaphore_fd";
    public static final long VK_KHR_push_descriptor = 1;
    public static final long VK_KHR_PUSH_DESCRIPTOR_SPEC_VERSION = 2;
    public static final String VK_KHR_PUSH_DESCRIPTOR_EXTENSION_NAME = "VK_KHR_push_descriptor";
    public static final long VK_KHR_16bit_storage = 1;
    public static final long VK_KHR_16BIT_STORAGE_SPEC_VERSION = 1;
    public static final String VK_KHR_16BIT_STORAGE_EXTENSION_NAME = "VK_KHR_16bit_storage";
    public static final long VK_KHR_incremental_present = 1;
    public static final long VK_KHR_INCREMENTAL_PRESENT_SPEC_VERSION = 1;
    public static final String VK_KHR_INCREMENTAL_PRESENT_EXTENSION_NAME = "VK_KHR_incremental_present";
    public static final long VK_KHR_descriptor_update_template = 1;
    public static final long VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_SPEC_VERSION = 1;
    public static final String VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME = "VK_KHR_descriptor_update_template";
    public static final long VK_KHR_shared_presentable_image = 1;
    public static final long VK_KHR_SHARED_PRESENTABLE_IMAGE_SPEC_VERSION = 1;
    public static final String VK_KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME = "VK_KHR_shared_presentable_image";
    public static final long VK_KHR_external_fence_capabilities = 1;
    public static final long VK_KHR_EXTERNAL_FENCE_CAPABILITIES_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_FENCE_CAPABILITIES_EXTENSION_NAME = "VK_KHR_external_fence_capabilities";
    public static final long VK_KHR_external_fence = 1;
    public static final long VK_KHR_EXTERNAL_FENCE_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_FENCE_EXTENSION_NAME = "VK_KHR_external_fence";
    public static final long VK_KHR_external_fence_fd = 1;
    public static final long VK_KHR_EXTERNAL_FENCE_FD_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME = "VK_KHR_external_fence_fd";
    public static final long VK_KHR_maintenance2 = 1;
    public static final long VK_KHR_MAINTENANCE2_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE2_EXTENSION_NAME = "VK_KHR_maintenance2";
    public static final long VK_KHR_get_surface_capabilities2 = 1;
    public static final long VK_KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION = 1;
    public static final String VK_KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME = "VK_KHR_get_surface_capabilities2";
    public static final long VK_KHR_variable_pointers = 1;
    public static final long VK_KHR_VARIABLE_POINTERS_SPEC_VERSION = 1;
    public static final String VK_KHR_VARIABLE_POINTERS_EXTENSION_NAME = "VK_KHR_variable_pointers";
    public static final long VK_KHR_dedicated_allocation = 1;
    public static final long VK_KHR_DEDICATED_ALLOCATION_SPEC_VERSION = 3;
    public static final String VK_KHR_DEDICATED_ALLOCATION_EXTENSION_NAME = "VK_KHR_dedicated_allocation";
    public static final long VK_KHR_storage_buffer_storage_class = 1;
    public static final long VK_KHR_STORAGE_BUFFER_STORAGE_CLASS_SPEC_VERSION = 1;
    public static final String VK_KHR_STORAGE_BUFFER_STORAGE_CLASS_EXTENSION_NAME = "VK_KHR_storage_buffer_storage_class";
    public static final long VK_KHR_relaxed_block_layout = 1;
    public static final long VK_KHR_RELAXED_BLOCK_LAYOUT_SPEC_VERSION = 1;
    public static final String VK_KHR_RELAXED_BLOCK_LAYOUT_EXTENSION_NAME = "VK_KHR_relaxed_block_layout";
    public static final long VK_KHR_get_memory_requirements2 = 1;
    public static final long VK_KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION = 1;
    public static final String VK_KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME = "VK_KHR_get_memory_requirements2";
    public static final long VK_KHR_image_format_list = 1;
    public static final long VK_KHR_IMAGE_FORMAT_LIST_SPEC_VERSION = 1;
    public static final String VK_KHR_IMAGE_FORMAT_LIST_EXTENSION_NAME = "VK_KHR_image_format_list";
    public static final long VK_KHR_sampler_ycbcr_conversion = 1;
    public static final long VK_KHR_SAMPLER_YCBCR_CONVERSION_SPEC_VERSION = 1;
    public static final String VK_KHR_SAMPLER_YCBCR_CONVERSION_EXTENSION_NAME = "VK_KHR_sampler_ycbcr_conversion";
    public static final long VK_KHR_bind_memory2 = 1;
    public static final long VK_KHR_BIND_MEMORY_2_SPEC_VERSION = 1;
    public static final String VK_KHR_BIND_MEMORY_2_EXTENSION_NAME = "VK_KHR_bind_memory2";
    public static final long VK_KHR_maintenance3 = 1;
    public static final long VK_KHR_MAINTENANCE3_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE3_EXTENSION_NAME = "VK_KHR_maintenance3";
    public static final long VK_EXT_debug_report = 1;
    public static final long VK_EXT_DEBUG_REPORT_SPEC_VERSION = 9;
    public static final String VK_EXT_DEBUG_REPORT_EXTENSION_NAME = "VK_EXT_debug_report";
    public static final long VK_STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT = VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT;
    public static final long VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT;
    public static final long VK_NV_glsl_shader = 1;
    public static final long VK_NV_GLSL_SHADER_SPEC_VERSION = 1;
    public static final String VK_NV_GLSL_SHADER_EXTENSION_NAME = "VK_NV_glsl_shader";
    public static final long VK_EXT_depth_range_unrestricted = 1;
    public static final long VK_EXT_DEPTH_RANGE_UNRESTRICTED_SPEC_VERSION = 1;
    public static final String VK_EXT_DEPTH_RANGE_UNRESTRICTED_EXTENSION_NAME = "VK_EXT_depth_range_unrestricted";
    public static final long VK_IMG_filter_cubic = 1;
    public static final long VK_IMG_FILTER_CUBIC_SPEC_VERSION = 1;
    public static final String VK_IMG_FILTER_CUBIC_EXTENSION_NAME = "VK_IMG_filter_cubic";
    public static final long VK_AMD_rasterization_order = 1;
    public static final long VK_AMD_RASTERIZATION_ORDER_SPEC_VERSION = 1;
    public static final String VK_AMD_RASTERIZATION_ORDER_EXTENSION_NAME = "VK_AMD_rasterization_order";
    public static final long VK_AMD_shader_trinary_minmax = 1;
    public static final long VK_AMD_SHADER_TRINARY_MINMAX_SPEC_VERSION = 1;
    public static final String VK_AMD_SHADER_TRINARY_MINMAX_EXTENSION_NAME = "VK_AMD_shader_trinary_minmax";
    public static final long VK_AMD_shader_explicit_vertex_parameter = 1;
    public static final long VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_SPEC_VERSION = 1;
    public static final String VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_EXTENSION_NAME = "VK_AMD_shader_explicit_vertex_parameter";
    public static final long VK_EXT_debug_marker = 1;
    public static final long VK_EXT_DEBUG_MARKER_SPEC_VERSION = 4;
    public static final String VK_EXT_DEBUG_MARKER_EXTENSION_NAME = "VK_EXT_debug_marker";
    public static final long VK_AMD_gcn_shader = 1;
    public static final long VK_AMD_GCN_SHADER_SPEC_VERSION = 1;
    public static final String VK_AMD_GCN_SHADER_EXTENSION_NAME = "VK_AMD_gcn_shader";
    public static final long VK_NV_dedicated_allocation = 1;
    public static final long VK_NV_DEDICATED_ALLOCATION_SPEC_VERSION = 1;
    public static final String VK_NV_DEDICATED_ALLOCATION_EXTENSION_NAME = "VK_NV_dedicated_allocation";
    public static final long VK_AMD_draw_indirect_count = 1;
    public static final long VK_AMD_DRAW_INDIRECT_COUNT_SPEC_VERSION = 1;
    public static final String VK_AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME = "VK_AMD_draw_indirect_count";
    public static final long VK_AMD_negative_viewport_height = 1;
    public static final long VK_AMD_NEGATIVE_VIEWPORT_HEIGHT_SPEC_VERSION = 1;
    public static final String VK_AMD_NEGATIVE_VIEWPORT_HEIGHT_EXTENSION_NAME = "VK_AMD_negative_viewport_height";
    public static final long VK_AMD_gpu_shader_half_float = 1;
    public static final long VK_AMD_GPU_SHADER_HALF_FLOAT_SPEC_VERSION = 1;
    public static final String VK_AMD_GPU_SHADER_HALF_FLOAT_EXTENSION_NAME = "VK_AMD_gpu_shader_half_float";
    public static final long VK_AMD_shader_ballot = 1;
    public static final long VK_AMD_SHADER_BALLOT_SPEC_VERSION = 1;
    public static final String VK_AMD_SHADER_BALLOT_EXTENSION_NAME = "VK_AMD_shader_ballot";
    public static final long VK_AMD_texture_gather_bias_lod = 1;
    public static final long VK_AMD_TEXTURE_GATHER_BIAS_LOD_SPEC_VERSION = 1;
    public static final String VK_AMD_TEXTURE_GATHER_BIAS_LOD_EXTENSION_NAME = "VK_AMD_texture_gather_bias_lod";
    public static final long VK_AMD_shader_info = 1;
    public static final long VK_AMD_SHADER_INFO_SPEC_VERSION = 1;
    public static final String VK_AMD_SHADER_INFO_EXTENSION_NAME = "VK_AMD_shader_info";
    public static final long VK_AMD_shader_image_load_store_lod = 1;
    public static final long VK_AMD_SHADER_IMAGE_LOAD_STORE_LOD_SPEC_VERSION = 1;
    public static final String VK_AMD_SHADER_IMAGE_LOAD_STORE_LOD_EXTENSION_NAME = "VK_AMD_shader_image_load_store_lod";
    public static final long VK_IMG_format_pvrtc = 1;
    public static final long VK_IMG_FORMAT_PVRTC_SPEC_VERSION = 1;
    public static final String VK_IMG_FORMAT_PVRTC_EXTENSION_NAME = "VK_IMG_format_pvrtc";
    public static final long VK_NV_external_memory_capabilities = 1;
    public static final long VK_NV_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION = 1;
    public static final String VK_NV_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME = "VK_NV_external_memory_capabilities";
    public static final long VK_NV_external_memory = 1;
    public static final long VK_NV_EXTERNAL_MEMORY_SPEC_VERSION = 1;
    public static final String VK_NV_EXTERNAL_MEMORY_EXTENSION_NAME = "VK_NV_external_memory";
    public static final long VK_EXT_validation_flags = 1;
    public static final long VK_EXT_VALIDATION_FLAGS_SPEC_VERSION = 1;
    public static final String VK_EXT_VALIDATION_FLAGS_EXTENSION_NAME = "VK_EXT_validation_flags";
    public static final long VK_EXT_shader_subgroup_ballot = 1;
    public static final long VK_EXT_SHADER_SUBGROUP_BALLOT_SPEC_VERSION = 1;
    public static final String VK_EXT_SHADER_SUBGROUP_BALLOT_EXTENSION_NAME = "VK_EXT_shader_subgroup_ballot";
    public static final long VK_EXT_shader_subgroup_vote = 1;
    public static final long VK_EXT_SHADER_SUBGROUP_VOTE_SPEC_VERSION = 1;
    public static final String VK_EXT_SHADER_SUBGROUP_VOTE_EXTENSION_NAME = "VK_EXT_shader_subgroup_vote";
    public static final long VK_NVX_device_generated_commands = 1;
    public static final long VK_NVX_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = 3;
    public static final String VK_NVX_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_NVX_device_generated_commands";
    public static final long VK_NV_clip_space_w_scaling = 1;
    public static final long VK_NV_CLIP_SPACE_W_SCALING_SPEC_VERSION = 1;
    public static final String VK_NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME = "VK_NV_clip_space_w_scaling";
    public static final long VK_EXT_direct_mode_display = 1;
    public static final long VK_EXT_DIRECT_MODE_DISPLAY_SPEC_VERSION = 1;
    public static final String VK_EXT_DIRECT_MODE_DISPLAY_EXTENSION_NAME = "VK_EXT_direct_mode_display";
    public static final long VK_EXT_display_surface_counter = 1;
    public static final long VK_EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION = 1;
    public static final String VK_EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME = "VK_EXT_display_surface_counter";
    public static final long VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT = VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT;
    public static final long VK_EXT_display_control = 1;
    public static final long VK_EXT_DISPLAY_CONTROL_SPEC_VERSION = 1;
    public static final String VK_EXT_DISPLAY_CONTROL_EXTENSION_NAME = "VK_EXT_display_control";
    public static final long VK_GOOGLE_display_timing = 1;
    public static final long VK_GOOGLE_DISPLAY_TIMING_SPEC_VERSION = 1;
    public static final String VK_GOOGLE_DISPLAY_TIMING_EXTENSION_NAME = "VK_GOOGLE_display_timing";
    public static final long VK_NV_sample_mask_override_coverage = 1;
    public static final long VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_SPEC_VERSION = 1;
    public static final String VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_EXTENSION_NAME = "VK_NV_sample_mask_override_coverage";
    public static final long VK_NV_geometry_shader_passthrough = 1;
    public static final long VK_NV_GEOMETRY_SHADER_PASSTHROUGH_SPEC_VERSION = 1;
    public static final String VK_NV_GEOMETRY_SHADER_PASSTHROUGH_EXTENSION_NAME = "VK_NV_geometry_shader_passthrough";
    public static final long VK_NV_viewport_array2 = 1;
    public static final long VK_NV_VIEWPORT_ARRAY2_SPEC_VERSION = 1;
    public static final String VK_NV_VIEWPORT_ARRAY2_EXTENSION_NAME = "VK_NV_viewport_array2";
    public static final long VK_NVX_multiview_per_view_attributes = 1;
    public static final long VK_NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_SPEC_VERSION = 1;
    public static final String VK_NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_EXTENSION_NAME = "VK_NVX_multiview_per_view_attributes";
    public static final long VK_NV_viewport_swizzle = 1;
    public static final long VK_NV_VIEWPORT_SWIZZLE_SPEC_VERSION = 1;
    public static final String VK_NV_VIEWPORT_SWIZZLE_EXTENSION_NAME = "VK_NV_viewport_swizzle";
    public static final long VK_EXT_discard_rectangles = 1;
    public static final long VK_EXT_DISCARD_RECTANGLES_SPEC_VERSION = 1;
    public static final String VK_EXT_DISCARD_RECTANGLES_EXTENSION_NAME = "VK_EXT_discard_rectangles";
    public static final long VK_EXT_conservative_rasterization = 1;
    public static final long VK_EXT_CONSERVATIVE_RASTERIZATION_SPEC_VERSION = 1;
    public static final String VK_EXT_CONSERVATIVE_RASTERIZATION_EXTENSION_NAME = "VK_EXT_conservative_rasterization";
    public static final long VK_EXT_swapchain_colorspace = 1;
    public static final long VK_EXT_SWAPCHAIN_COLOR_SPACE_SPEC_VERSION = 3;
    public static final String VK_EXT_SWAPCHAIN_COLOR_SPACE_EXTENSION_NAME = "VK_EXT_swapchain_colorspace";
    public static final long VK_EXT_hdr_metadata = 1;
    public static final long VK_EXT_HDR_METADATA_SPEC_VERSION = 1;
    public static final String VK_EXT_HDR_METADATA_EXTENSION_NAME = "VK_EXT_hdr_metadata";
    public static final long VK_EXT_external_memory_dma_buf = 1;
    public static final long VK_EXT_EXTERNAL_MEMORY_DMA_BUF_SPEC_VERSION = 1;
    public static final String VK_EXT_EXTERNAL_MEMORY_DMA_BUF_EXTENSION_NAME = "VK_EXT_external_memory_dma_buf";
    public static final long VK_EXT_queue_family_foreign = 1;
    public static final long VK_EXT_QUEUE_FAMILY_FOREIGN_SPEC_VERSION = 1;
    public static final String VK_EXT_QUEUE_FAMILY_FOREIGN_EXTENSION_NAME = "VK_EXT_queue_family_foreign";
    public static final long VK_QUEUE_FAMILY_FOREIGN_EXT = 4294967293L;
    public static final long VK_EXT_debug_utils = 1;
    public static final long VK_EXT_DEBUG_UTILS_SPEC_VERSION = 1;
    public static final String VK_EXT_DEBUG_UTILS_EXTENSION_NAME = "VK_EXT_debug_utils";
    public static final long VK_EXT_sampler_filter_minmax = 1;
    public static final long VK_EXT_SAMPLER_FILTER_MINMAX_SPEC_VERSION = 1;
    public static final String VK_EXT_SAMPLER_FILTER_MINMAX_EXTENSION_NAME = "VK_EXT_sampler_filter_minmax";
    public static final long VK_AMD_gpu_shader_int16 = 1;
    public static final long VK_AMD_GPU_SHADER_INT16_SPEC_VERSION = 1;
    public static final String VK_AMD_GPU_SHADER_INT16_EXTENSION_NAME = "VK_AMD_gpu_shader_int16";
    public static final long VK_AMD_mixed_attachment_samples = 1;
    public static final long VK_AMD_MIXED_ATTACHMENT_SAMPLES_SPEC_VERSION = 1;
    public static final String VK_AMD_MIXED_ATTACHMENT_SAMPLES_EXTENSION_NAME = "VK_AMD_mixed_attachment_samples";
    public static final long VK_AMD_shader_fragment_mask = 1;
    public static final long VK_AMD_SHADER_FRAGMENT_MASK_SPEC_VERSION = 1;
    public static final String VK_AMD_SHADER_FRAGMENT_MASK_EXTENSION_NAME = "VK_AMD_shader_fragment_mask";
    public static final long VK_EXT_shader_stencil_export = 1;
    public static final long VK_EXT_SHADER_STENCIL_EXPORT_SPEC_VERSION = 1;
    public static final String VK_EXT_SHADER_STENCIL_EXPORT_EXTENSION_NAME = "VK_EXT_shader_stencil_export";
    public static final long VK_EXT_sample_locations = 1;
    public static final long VK_EXT_SAMPLE_LOCATIONS_SPEC_VERSION = 1;
    public static final String VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME = "VK_EXT_sample_locations";
    public static final long VK_EXT_blend_operation_advanced = 1;
    public static final long VK_EXT_BLEND_OPERATION_ADVANCED_SPEC_VERSION = 2;
    public static final String VK_EXT_BLEND_OPERATION_ADVANCED_EXTENSION_NAME = "VK_EXT_blend_operation_advanced";
    public static final long VK_NV_fragment_coverage_to_color = 1;
    public static final long VK_NV_FRAGMENT_COVERAGE_TO_COLOR_SPEC_VERSION = 1;
    public static final String VK_NV_FRAGMENT_COVERAGE_TO_COLOR_EXTENSION_NAME = "VK_NV_fragment_coverage_to_color";
    public static final long VK_NV_framebuffer_mixed_samples = 1;
    public static final long VK_NV_FRAMEBUFFER_MIXED_SAMPLES_SPEC_VERSION = 1;
    public static final String VK_NV_FRAMEBUFFER_MIXED_SAMPLES_EXTENSION_NAME = "VK_NV_framebuffer_mixed_samples";
    public static final long VK_NV_fill_rectangle = 1;
    public static final long VK_NV_FILL_RECTANGLE_SPEC_VERSION = 1;
    public static final String VK_NV_FILL_RECTANGLE_EXTENSION_NAME = "VK_NV_fill_rectangle";
    public static final long VK_EXT_post_depth_coverage = 1;
    public static final long VK_EXT_POST_DEPTH_COVERAGE_SPEC_VERSION = 1;
    public static final String VK_EXT_POST_DEPTH_COVERAGE_EXTENSION_NAME = "VK_EXT_post_depth_coverage";
    public static final long VK_EXT_validation_cache = 1;
    public static final long VK_EXT_VALIDATION_CACHE_SPEC_VERSION = 1;
    public static final String VK_EXT_VALIDATION_CACHE_EXTENSION_NAME = "VK_EXT_validation_cache";
    public static final long VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT = VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT;
    public static final long VK_EXT_descriptor_indexing = 1;
    public static final long VK_EXT_DESCRIPTOR_INDEXING_SPEC_VERSION = 2;
    public static final String VK_EXT_DESCRIPTOR_INDEXING_EXTENSION_NAME = "VK_EXT_descriptor_indexing";
    public static final long VK_EXT_shader_viewport_index_layer = 1;
    public static final long VK_EXT_SHADER_VIEWPORT_INDEX_LAYER_SPEC_VERSION = 1;
    public static final String VK_EXT_SHADER_VIEWPORT_INDEX_LAYER_EXTENSION_NAME = "VK_EXT_shader_viewport_index_layer";
    public static final long VK_EXT_global_priority = 1;
    public static final long VK_EXT_GLOBAL_PRIORITY_SPEC_VERSION = 2;
    public static final String VK_EXT_GLOBAL_PRIORITY_EXTENSION_NAME = "VK_EXT_global_priority";
    public static final long VK_EXT_external_memory_host = 1;
    public static final long VK_EXT_EXTERNAL_MEMORY_HOST_SPEC_VERSION = 1;
    public static final String VK_EXT_EXTERNAL_MEMORY_HOST_EXTENSION_NAME = "VK_EXT_external_memory_host";
    public static final long VK_AMD_buffer_marker = 1;
    public static final long VK_AMD_BUFFER_MARKER_SPEC_VERSION = 1;
    public static final String VK_AMD_BUFFER_MARKER_EXTENSION_NAME = "VK_AMD_buffer_marker";
    public static final long VK_AMD_shader_core_properties = 1;
    public static final long VK_AMD_SHADER_CORE_PROPERTIES_SPEC_VERSION = 1;
    public static final String VK_AMD_SHADER_CORE_PROPERTIES_EXTENSION_NAME = "VK_AMD_shader_core_properties";
    public static final long VK_EXT_vertex_attribute_divisor = 1;
    public static final long VK_EXT_VERTEX_ATTRIBUTE_DIVISOR_SPEC_VERSION = 1;
    public static final String VK_EXT_VERTEX_ATTRIBUTE_DIVISOR_EXTENSION_NAME = "VK_EXT_vertex_attribute_divisor";
    public static final long VK_NV_shader_subgroup_partitioned = 1;
    public static final long VK_NV_SHADER_SUBGROUP_PARTITIONED_SPEC_VERSION = 1;
    public static final String VK_NV_SHADER_SUBGROUP_PARTITIONED_EXTENSION_NAME = "VK_NV_shader_subgroup_partitioned";
}
