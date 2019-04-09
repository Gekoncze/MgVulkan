#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_Vk_getVkVersion10(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_VERSION_1_0;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkHeaderVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_HEADER_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNullHandle(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NULL_HANDLE;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkLodClampNone(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_LOD_CLAMP_NONE;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkRemainingMipLevels(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_REMAINING_MIP_LEVELS;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkRemainingArrayLayers(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_REMAINING_ARRAY_LAYERS;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkWholeSize(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_WHOLE_SIZE;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAttachmentUnused(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_ATTACHMENT_UNUSED;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkTrue(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_TRUE;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkFalse(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_FALSE;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkQueueFamilyIgnored(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_QUEUE_FAMILY_IGNORED;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkSubpassExternal(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_SUBPASS_EXTERNAL;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkMaxPhysicalDeviceNameSize(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_MAX_PHYSICAL_DEVICE_NAME_SIZE;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkUuidSize(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_UUID_SIZE;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkMaxMemoryTypes(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_MAX_MEMORY_TYPES;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkMaxMemoryHeaps(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_MAX_MEMORY_HEAPS;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkMaxExtensionNameSize(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_MAX_EXTENSION_NAME_SIZE;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkMaxDescriptionSize(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_MAX_DESCRIPTION_SIZE;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkVersion11(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_VERSION_1_1;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkMaxDeviceGroupSize(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_MAX_DEVICE_GROUP_SIZE;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkLuidSize(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_LUID_SIZE;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkQueueFamilyExternal(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_QUEUE_FAMILY_EXTERNAL;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrSurface(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_surface;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrSurfaceSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_SURFACE_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkColorspaceSrgbNonlinearKhr(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_COLORSPACE_SRGB_NONLINEAR_KHR;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrSwapchain(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_swapchain;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrSwapchainSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_SWAPCHAIN_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrDisplay(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_display;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrDisplaySpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_DISPLAY_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrDisplaySwapchain(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_display_swapchain;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrDisplaySwapchainSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrSamplerMirrorClampToEdge(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_sampler_mirror_clamp_to_edge;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrSamplerMirrorClampToEdgeSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrMultiview(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_multiview;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrMultiviewSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_MULTIVIEW_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrGetPhysicalDeviceProperties2(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_get_physical_device_properties2;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrGetPhysicalDeviceProperties2SpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrDeviceGroup(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_device_group;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrDeviceGroupSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_DEVICE_GROUP_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrShaderDrawParameters(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_shader_draw_parameters;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrShaderDrawParametersSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_SHADER_DRAW_PARAMETERS_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrMaintenance1(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_maintenance1;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrMaintenance1SpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_MAINTENANCE1_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrDeviceGroupCreation(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_device_group_creation;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrDeviceGroupCreationSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_DEVICE_GROUP_CREATION_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkMaxDeviceGroupSizeKhr(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_MAX_DEVICE_GROUP_SIZE_KHR;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalMemoryCapabilities(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_external_memory_capabilities;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalMemoryCapabilitiesSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkLuidSizeKhr(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_LUID_SIZE_KHR;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalMemory(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_external_memory;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalMemorySpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_EXTERNAL_MEMORY_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkQueueFamilyExternalKhr(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_QUEUE_FAMILY_EXTERNAL_KHR;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalMemoryFd(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_external_memory_fd;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalMemoryFdSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalSemaphoreCapabilities(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_external_semaphore_capabilities;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalSemaphoreCapabilitiesSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalSemaphore(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_external_semaphore;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalSemaphoreSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_EXTERNAL_SEMAPHORE_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalSemaphoreFd(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_external_semaphore_fd;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalSemaphoreFdSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrPushDescriptor(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_push_descriptor;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrPushDescriptorSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_PUSH_DESCRIPTOR_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhr16bitStorage(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_16bit_storage;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhr16bitStorageSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_16BIT_STORAGE_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrIncrementalPresent(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_incremental_present;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrIncrementalPresentSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_INCREMENTAL_PRESENT_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrDescriptorUpdateTemplate(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_descriptor_update_template;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrDescriptorUpdateTemplateSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrSharedPresentableImage(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_shared_presentable_image;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrSharedPresentableImageSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_SHARED_PRESENTABLE_IMAGE_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalFenceCapabilities(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_external_fence_capabilities;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalFenceCapabilitiesSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_EXTERNAL_FENCE_CAPABILITIES_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalFence(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_external_fence;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalFenceSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_EXTERNAL_FENCE_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalFenceFd(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_external_fence_fd;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrExternalFenceFdSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_EXTERNAL_FENCE_FD_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrMaintenance2(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_maintenance2;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrMaintenance2SpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_MAINTENANCE2_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrGetSurfaceCapabilities2(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_get_surface_capabilities2;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrGetSurfaceCapabilities2SpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrVariablePointers(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_variable_pointers;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrVariablePointersSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_VARIABLE_POINTERS_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrDedicatedAllocation(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_dedicated_allocation;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrDedicatedAllocationSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_DEDICATED_ALLOCATION_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrStorageBufferStorageClass(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_storage_buffer_storage_class;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrStorageBufferStorageClassSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_STORAGE_BUFFER_STORAGE_CLASS_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrRelaxedBlockLayout(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_relaxed_block_layout;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrRelaxedBlockLayoutSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_RELAXED_BLOCK_LAYOUT_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrGetMemoryRequirements2(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_get_memory_requirements2;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrGetMemoryRequirements2SpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrImageFormatList(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_image_format_list;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrImageFormatListSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_IMAGE_FORMAT_LIST_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrSamplerYcbcrConversion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_sampler_ycbcr_conversion;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrSamplerYcbcrConversionSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_SAMPLER_YCBCR_CONVERSION_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrBindMemory2(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_bind_memory2;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrBindMemory2SpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_BIND_MEMORY_2_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrMaintenance3(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_maintenance3;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkKhrMaintenance3SpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_KHR_MAINTENANCE3_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDebugReport(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_debug_report;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDebugReportSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_DEBUG_REPORT_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkStructureTypeDebugReportCreateInfoExt(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkDebugReportObjectTypeDebugReportExt(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvGlslShader(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_glsl_shader;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvGlslShaderSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_GLSL_SHADER_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDepthRangeUnrestricted(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_depth_range_unrestricted;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDepthRangeUnrestrictedSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_DEPTH_RANGE_UNRESTRICTED_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkImgFilterCubic(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_IMG_filter_cubic;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkImgFilterCubicSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_IMG_FILTER_CUBIC_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdRasterizationOrder(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_rasterization_order;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdRasterizationOrderSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_RASTERIZATION_ORDER_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdShaderTrinaryMinmax(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_shader_trinary_minmax;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdShaderTrinaryMinmaxSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_SHADER_TRINARY_MINMAX_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdShaderExplicitVertexParameter(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_shader_explicit_vertex_parameter;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdShaderExplicitVertexParameterSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDebugMarker(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_debug_marker;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDebugMarkerSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_DEBUG_MARKER_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdGcnShader(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_gcn_shader;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdGcnShaderSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_GCN_SHADER_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvDedicatedAllocation(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_dedicated_allocation;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvDedicatedAllocationSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_DEDICATED_ALLOCATION_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdDrawIndirectCount(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_draw_indirect_count;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdDrawIndirectCountSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_DRAW_INDIRECT_COUNT_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdNegativeViewportHeight(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_negative_viewport_height;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdNegativeViewportHeightSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_NEGATIVE_VIEWPORT_HEIGHT_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdGpuShaderHalfFloat(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_gpu_shader_half_float;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdGpuShaderHalfFloatSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_GPU_SHADER_HALF_FLOAT_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdShaderBallot(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_shader_ballot;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdShaderBallotSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_SHADER_BALLOT_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdTextureGatherBiasLod(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_texture_gather_bias_lod;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdTextureGatherBiasLodSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_TEXTURE_GATHER_BIAS_LOD_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdShaderInfo(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_shader_info;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdShaderInfoSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_SHADER_INFO_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdShaderImageLoadStoreLod(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_shader_image_load_store_lod;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdShaderImageLoadStoreLodSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_SHADER_IMAGE_LOAD_STORE_LOD_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkImgFormatPvrtc(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_IMG_format_pvrtc;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkImgFormatPvrtcSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_IMG_FORMAT_PVRTC_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvExternalMemoryCapabilities(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_external_memory_capabilities;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvExternalMemoryCapabilitiesSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvExternalMemory(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_external_memory;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvExternalMemorySpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_EXTERNAL_MEMORY_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtValidationFlags(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_validation_flags;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtValidationFlagsSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_VALIDATION_FLAGS_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtShaderSubgroupBallot(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_shader_subgroup_ballot;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtShaderSubgroupBallotSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_SHADER_SUBGROUP_BALLOT_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtShaderSubgroupVote(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_shader_subgroup_vote;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtShaderSubgroupVoteSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_SHADER_SUBGROUP_VOTE_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvxDeviceGeneratedCommands(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NVX_device_generated_commands;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvxDeviceGeneratedCommandsSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NVX_DEVICE_GENERATED_COMMANDS_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvClipSpaceWScaling(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_clip_space_w_scaling;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvClipSpaceWScalingSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_CLIP_SPACE_W_SCALING_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDirectModeDisplay(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_direct_mode_display;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDirectModeDisplaySpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_DIRECT_MODE_DISPLAY_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDisplaySurfaceCounter(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_display_surface_counter;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDisplaySurfaceCounterSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkStructureTypeSurfaceCapabilities2Ext(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDisplayControl(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_display_control;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDisplayControlSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_DISPLAY_CONTROL_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkGoogleDisplayTiming(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_GOOGLE_display_timing;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkGoogleDisplayTimingSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_GOOGLE_DISPLAY_TIMING_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvSampleMaskOverrideCoverage(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_sample_mask_override_coverage;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvSampleMaskOverrideCoverageSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvGeometryShaderPassthrough(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_geometry_shader_passthrough;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvGeometryShaderPassthroughSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_GEOMETRY_SHADER_PASSTHROUGH_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvViewportArray2(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_viewport_array2;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvViewportArray2SpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_VIEWPORT_ARRAY2_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvxMultiviewPerViewAttributes(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NVX_multiview_per_view_attributes;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvxMultiviewPerViewAttributesSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvViewportSwizzle(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_viewport_swizzle;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvViewportSwizzleSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_VIEWPORT_SWIZZLE_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDiscardRectangles(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_discard_rectangles;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDiscardRectanglesSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_DISCARD_RECTANGLES_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtConservativeRasterization(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_conservative_rasterization;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtConservativeRasterizationSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_CONSERVATIVE_RASTERIZATION_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtSwapchainColorspace(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_swapchain_colorspace;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtSwapchainColorSpaceSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_SWAPCHAIN_COLOR_SPACE_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtHdrMetadata(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_hdr_metadata;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtHdrMetadataSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_HDR_METADATA_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtExternalMemoryDmaBuf(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_external_memory_dma_buf;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtExternalMemoryDmaBufSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_EXTERNAL_MEMORY_DMA_BUF_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtQueueFamilyForeign(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_queue_family_foreign;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtQueueFamilyForeignSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_QUEUE_FAMILY_FOREIGN_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkQueueFamilyForeignExt(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_QUEUE_FAMILY_FOREIGN_EXT;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDebugUtils(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_debug_utils;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDebugUtilsSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_DEBUG_UTILS_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtSamplerFilterMinmax(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_sampler_filter_minmax;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtSamplerFilterMinmaxSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_SAMPLER_FILTER_MINMAX_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdGpuShaderInt16(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_gpu_shader_int16;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdGpuShaderInt16SpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_GPU_SHADER_INT16_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdMixedAttachmentSamples(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_mixed_attachment_samples;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdMixedAttachmentSamplesSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_MIXED_ATTACHMENT_SAMPLES_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdShaderFragmentMask(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_shader_fragment_mask;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdShaderFragmentMaskSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_SHADER_FRAGMENT_MASK_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtShaderStencilExport(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_shader_stencil_export;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtShaderStencilExportSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_SHADER_STENCIL_EXPORT_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtSampleLocations(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_sample_locations;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtSampleLocationsSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_SAMPLE_LOCATIONS_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtBlendOperationAdvanced(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_blend_operation_advanced;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtBlendOperationAdvancedSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_BLEND_OPERATION_ADVANCED_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvFragmentCoverageToColor(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_fragment_coverage_to_color;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvFragmentCoverageToColorSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_FRAGMENT_COVERAGE_TO_COLOR_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvFramebufferMixedSamples(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_framebuffer_mixed_samples;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvFramebufferMixedSamplesSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_FRAMEBUFFER_MIXED_SAMPLES_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvFillRectangle(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_fill_rectangle;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvFillRectangleSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_FILL_RECTANGLE_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtPostDepthCoverage(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_post_depth_coverage;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtPostDepthCoverageSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_POST_DEPTH_COVERAGE_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtValidationCache(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_validation_cache;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtValidationCacheSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_VALIDATION_CACHE_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkDebugReportObjectTypeValidationCacheExt(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDescriptorIndexing(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_descriptor_indexing;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtDescriptorIndexingSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_DESCRIPTOR_INDEXING_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtShaderViewportIndexLayer(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_shader_viewport_index_layer;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtShaderViewportIndexLayerSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_SHADER_VIEWPORT_INDEX_LAYER_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtGlobalPriority(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_global_priority;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtGlobalPrioritySpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_GLOBAL_PRIORITY_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtExternalMemoryHost(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_external_memory_host;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtExternalMemoryHostSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_EXTERNAL_MEMORY_HOST_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdBufferMarker(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_buffer_marker;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdBufferMarkerSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_BUFFER_MARKER_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdShaderCoreProperties(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_shader_core_properties;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkAmdShaderCorePropertiesSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_AMD_SHADER_CORE_PROPERTIES_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtVertexAttributeDivisor(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_vertex_attribute_divisor;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkExtVertexAttributeDivisorSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_EXT_VERTEX_ATTRIBUTE_DIVISOR_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvShaderSubgroupPartitioned(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_shader_subgroup_partitioned;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}

jlong Java_cz_mg_vulkan_Vk_getVkNvShaderSubgroupPartitionedSpecVersion(JNIEnv* env, jclass jc){
    (void)env;
    (void)jc;
    uint64_t value = VK_NV_SHADER_SUBGROUP_PARTITIONED_SPEC_VERSION;
    jlong rval;
    memcpy(&rval, &value, sizeof(jlong));
    return rval;
}
