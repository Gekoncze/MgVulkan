package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/">khronos documentation</a>
 **/
public class Vk {
    private VkInstance instance = null;

    public Vk(){
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

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_VERSION_1_0.html">khronos documentation</a>
     **/
    public static final long VK_VERSION_1_0 = getVkVersion10();
    private static native long getVkVersion10();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_HEADER_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_HEADER_VERSION = getVkHeaderVersion();
    private static native long getVkHeaderVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NULL_HANDLE.html">khronos documentation</a>
     **/
    public static final long VK_NULL_HANDLE = getVkNullHandle();
    private static native long getVkNullHandle();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_LOD_CLAMP_NONE.html">khronos documentation</a>
     **/
    public static final long VK_LOD_CLAMP_NONE = getVkLodClampNone();
    private static native long getVkLodClampNone();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_REMAINING_MIP_LEVELS.html">khronos documentation</a>
     **/
    public static final long VK_REMAINING_MIP_LEVELS = getVkRemainingMipLevels();
    private static native long getVkRemainingMipLevels();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_REMAINING_ARRAY_LAYERS.html">khronos documentation</a>
     **/
    public static final long VK_REMAINING_ARRAY_LAYERS = getVkRemainingArrayLayers();
    private static native long getVkRemainingArrayLayers();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_WHOLE_SIZE.html">khronos documentation</a>
     **/
    public static final long VK_WHOLE_SIZE = getVkWholeSize();
    private static native long getVkWholeSize();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_ATTACHMENT_UNUSED.html">khronos documentation</a>
     **/
    public static final long VK_ATTACHMENT_UNUSED = getVkAttachmentUnused();
    private static native long getVkAttachmentUnused();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_TRUE.html">khronos documentation</a>
     **/
    public static final long VK_TRUE = getVkTrue();
    private static native long getVkTrue();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_FALSE.html">khronos documentation</a>
     **/
    public static final long VK_FALSE = getVkFalse();
    private static native long getVkFalse();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_QUEUE_FAMILY_IGNORED.html">khronos documentation</a>
     **/
    public static final long VK_QUEUE_FAMILY_IGNORED = getVkQueueFamilyIgnored();
    private static native long getVkQueueFamilyIgnored();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_SUBPASS_EXTERNAL.html">khronos documentation</a>
     **/
    public static final long VK_SUBPASS_EXTERNAL = getVkSubpassExternal();
    private static native long getVkSubpassExternal();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_MAX_PHYSICAL_DEVICE_NAME_SIZE.html">khronos documentation</a>
     **/
    public static final long VK_MAX_PHYSICAL_DEVICE_NAME_SIZE = getVkMaxPhysicalDeviceNameSize();
    private static native long getVkMaxPhysicalDeviceNameSize();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_UUID_SIZE.html">khronos documentation</a>
     **/
    public static final long VK_UUID_SIZE = getVkUuidSize();
    private static native long getVkUuidSize();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_MAX_MEMORY_TYPES.html">khronos documentation</a>
     **/
    public static final long VK_MAX_MEMORY_TYPES = getVkMaxMemoryTypes();
    private static native long getVkMaxMemoryTypes();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_MAX_MEMORY_HEAPS.html">khronos documentation</a>
     **/
    public static final long VK_MAX_MEMORY_HEAPS = getVkMaxMemoryHeaps();
    private static native long getVkMaxMemoryHeaps();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_MAX_EXTENSION_NAME_SIZE.html">khronos documentation</a>
     **/
    public static final long VK_MAX_EXTENSION_NAME_SIZE = getVkMaxExtensionNameSize();
    private static native long getVkMaxExtensionNameSize();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_MAX_DESCRIPTION_SIZE.html">khronos documentation</a>
     **/
    public static final long VK_MAX_DESCRIPTION_SIZE = getVkMaxDescriptionSize();
    private static native long getVkMaxDescriptionSize();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_VERSION_1_1.html">khronos documentation</a>
     **/
    public static final long VK_VERSION_1_1 = getVkVersion11();
    private static native long getVkVersion11();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_MAX_DEVICE_GROUP_SIZE.html">khronos documentation</a>
     **/
    public static final long VK_MAX_DEVICE_GROUP_SIZE = getVkMaxDeviceGroupSize();
    private static native long getVkMaxDeviceGroupSize();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_LUID_SIZE.html">khronos documentation</a>
     **/
    public static final long VK_LUID_SIZE = getVkLuidSize();
    private static native long getVkLuidSize();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_QUEUE_FAMILY_EXTERNAL.html">khronos documentation</a>
     **/
    public static final long VK_QUEUE_FAMILY_EXTERNAL = getVkQueueFamilyExternal();
    private static native long getVkQueueFamilyExternal();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_surface.html">khronos documentation</a>
     **/
    public static final long VK_KHR_surface = getVkKhrSurface();
    private static native long getVkKhrSurface();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_SURFACE_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_SURFACE_SPEC_VERSION = getVkKhrSurfaceSpecVersion();
    private static native long getVkKhrSurfaceSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_SURFACE_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_SURFACE_EXTENSION_NAME = "VK_KHR_surface";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_COLORSPACE_SRGB_NONLINEAR_KHR.html">khronos documentation</a>
     **/
    public static final long VK_COLORSPACE_SRGB_NONLINEAR_KHR = getVkColorspaceSrgbNonlinearKhr();
    private static native long getVkColorspaceSrgbNonlinearKhr();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_swapchain.html">khronos documentation</a>
     **/
    public static final long VK_KHR_swapchain = getVkKhrSwapchain();
    private static native long getVkKhrSwapchain();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_SWAPCHAIN_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_SWAPCHAIN_SPEC_VERSION = getVkKhrSwapchainSpecVersion();
    private static native long getVkKhrSwapchainSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_SWAPCHAIN_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_swapchain";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_display.html">khronos documentation</a>
     **/
    public static final long VK_KHR_display = getVkKhrDisplay();
    private static native long getVkKhrDisplay();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_DISPLAY_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_DISPLAY_SPEC_VERSION = getVkKhrDisplaySpecVersion();
    private static native long getVkKhrDisplaySpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_DISPLAY_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_DISPLAY_EXTENSION_NAME = "VK_KHR_display";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_display_swapchain.html">khronos documentation</a>
     **/
    public static final long VK_KHR_display_swapchain = getVkKhrDisplaySwapchain();
    private static native long getVkKhrDisplaySwapchain();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION = getVkKhrDisplaySwapchainSpecVersion();
    private static native long getVkKhrDisplaySwapchainSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_display_swapchain";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_sampler_mirror_clamp_to_edge.html">khronos documentation</a>
     **/
    public static final long VK_KHR_sampler_mirror_clamp_to_edge = getVkKhrSamplerMirrorClampToEdge();
    private static native long getVkKhrSamplerMirrorClampToEdge();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_SPEC_VERSION = getVkKhrSamplerMirrorClampToEdgeSpecVersion();
    private static native long getVkKhrSamplerMirrorClampToEdgeSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_EXTENSION_NAME = "VK_KHR_sampler_mirror_clamp_to_edge";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_multiview.html">khronos documentation</a>
     **/
    public static final long VK_KHR_multiview = getVkKhrMultiview();
    private static native long getVkKhrMultiview();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_MULTIVIEW_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_MULTIVIEW_SPEC_VERSION = getVkKhrMultiviewSpecVersion();
    private static native long getVkKhrMultiviewSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_MULTIVIEW_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_MULTIVIEW_EXTENSION_NAME = "VK_KHR_multiview";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_get_physical_device_properties2.html">khronos documentation</a>
     **/
    public static final long VK_KHR_get_physical_device_properties2 = getVkKhrGetPhysicalDeviceProperties2();
    private static native long getVkKhrGetPhysicalDeviceProperties2();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION = getVkKhrGetPhysicalDeviceProperties2SpecVersion();
    private static native long getVkKhrGetPhysicalDeviceProperties2SpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME = "VK_KHR_get_physical_device_properties2";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_device_group.html">khronos documentation</a>
     **/
    public static final long VK_KHR_device_group = getVkKhrDeviceGroup();
    private static native long getVkKhrDeviceGroup();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_DEVICE_GROUP_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_DEVICE_GROUP_SPEC_VERSION = getVkKhrDeviceGroupSpecVersion();
    private static native long getVkKhrDeviceGroupSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_DEVICE_GROUP_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_DEVICE_GROUP_EXTENSION_NAME = "VK_KHR_device_group";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_shader_draw_parameters.html">khronos documentation</a>
     **/
    public static final long VK_KHR_shader_draw_parameters = getVkKhrShaderDrawParameters();
    private static native long getVkKhrShaderDrawParameters();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_SHADER_DRAW_PARAMETERS_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_SHADER_DRAW_PARAMETERS_SPEC_VERSION = getVkKhrShaderDrawParametersSpecVersion();
    private static native long getVkKhrShaderDrawParametersSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_SHADER_DRAW_PARAMETERS_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_SHADER_DRAW_PARAMETERS_EXTENSION_NAME = "VK_KHR_shader_draw_parameters";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_maintenance1.html">khronos documentation</a>
     **/
    public static final long VK_KHR_maintenance1 = getVkKhrMaintenance1();
    private static native long getVkKhrMaintenance1();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_MAINTENANCE1_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_MAINTENANCE1_SPEC_VERSION = getVkKhrMaintenance1SpecVersion();
    private static native long getVkKhrMaintenance1SpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_MAINTENANCE1_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_MAINTENANCE1_EXTENSION_NAME = "VK_KHR_maintenance1";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_device_group_creation.html">khronos documentation</a>
     **/
    public static final long VK_KHR_device_group_creation = getVkKhrDeviceGroupCreation();
    private static native long getVkKhrDeviceGroupCreation();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_DEVICE_GROUP_CREATION_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_DEVICE_GROUP_CREATION_SPEC_VERSION = getVkKhrDeviceGroupCreationSpecVersion();
    private static native long getVkKhrDeviceGroupCreationSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME = "VK_KHR_device_group_creation";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_MAX_DEVICE_GROUP_SIZE_KHR.html">khronos documentation</a>
     **/
    public static final long VK_MAX_DEVICE_GROUP_SIZE_KHR = getVkMaxDeviceGroupSizeKhr();
    private static native long getVkMaxDeviceGroupSizeKhr();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_external_memory_capabilities.html">khronos documentation</a>
     **/
    public static final long VK_KHR_external_memory_capabilities = getVkKhrExternalMemoryCapabilities();
    private static native long getVkKhrExternalMemoryCapabilities();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION = getVkKhrExternalMemoryCapabilitiesSpecVersion();
    private static native long getVkKhrExternalMemoryCapabilitiesSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME = "VK_KHR_external_memory_capabilities";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_LUID_SIZE_KHR.html">khronos documentation</a>
     **/
    public static final long VK_LUID_SIZE_KHR = getVkLuidSizeKhr();
    private static native long getVkLuidSizeKhr();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_external_memory.html">khronos documentation</a>
     **/
    public static final long VK_KHR_external_memory = getVkKhrExternalMemory();
    private static native long getVkKhrExternalMemory();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_MEMORY_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_EXTERNAL_MEMORY_SPEC_VERSION = getVkKhrExternalMemorySpecVersion();
    private static native long getVkKhrExternalMemorySpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_MEMORY_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_EXTERNAL_MEMORY_EXTENSION_NAME = "VK_KHR_external_memory";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_QUEUE_FAMILY_EXTERNAL_KHR.html">khronos documentation</a>
     **/
    public static final long VK_QUEUE_FAMILY_EXTERNAL_KHR = getVkQueueFamilyExternalKhr();
    private static native long getVkQueueFamilyExternalKhr();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_external_memory_fd.html">khronos documentation</a>
     **/
    public static final long VK_KHR_external_memory_fd = getVkKhrExternalMemoryFd();
    private static native long getVkKhrExternalMemoryFd();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION = getVkKhrExternalMemoryFdSpecVersion();
    private static native long getVkKhrExternalMemoryFdSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME = "VK_KHR_external_memory_fd";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_external_semaphore_capabilities.html">khronos documentation</a>
     **/
    public static final long VK_KHR_external_semaphore_capabilities = getVkKhrExternalSemaphoreCapabilities();
    private static native long getVkKhrExternalSemaphoreCapabilities();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_SPEC_VERSION = getVkKhrExternalSemaphoreCapabilitiesSpecVersion();
    private static native long getVkKhrExternalSemaphoreCapabilitiesSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_EXTENSION_NAME = "VK_KHR_external_semaphore_capabilities";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_external_semaphore.html">khronos documentation</a>
     **/
    public static final long VK_KHR_external_semaphore = getVkKhrExternalSemaphore();
    private static native long getVkKhrExternalSemaphore();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_SEMAPHORE_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_EXTERNAL_SEMAPHORE_SPEC_VERSION = getVkKhrExternalSemaphoreSpecVersion();
    private static native long getVkKhrExternalSemaphoreSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_SEMAPHORE_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_EXTENSION_NAME = "VK_KHR_external_semaphore";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_external_semaphore_fd.html">khronos documentation</a>
     **/
    public static final long VK_KHR_external_semaphore_fd = getVkKhrExternalSemaphoreFd();
    private static native long getVkKhrExternalSemaphoreFd();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION = getVkKhrExternalSemaphoreFdSpecVersion();
    private static native long getVkKhrExternalSemaphoreFdSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME = "VK_KHR_external_semaphore_fd";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_push_descriptor.html">khronos documentation</a>
     **/
    public static final long VK_KHR_push_descriptor = getVkKhrPushDescriptor();
    private static native long getVkKhrPushDescriptor();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_PUSH_DESCRIPTOR_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_PUSH_DESCRIPTOR_SPEC_VERSION = getVkKhrPushDescriptorSpecVersion();
    private static native long getVkKhrPushDescriptorSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_PUSH_DESCRIPTOR_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_PUSH_DESCRIPTOR_EXTENSION_NAME = "VK_KHR_push_descriptor";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_16bit_storage.html">khronos documentation</a>
     **/
    public static final long VK_KHR_16bit_storage = getVkKhr16bitStorage();
    private static native long getVkKhr16bitStorage();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_16BIT_STORAGE_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_16BIT_STORAGE_SPEC_VERSION = getVkKhr16bitStorageSpecVersion();
    private static native long getVkKhr16bitStorageSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_16BIT_STORAGE_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_16BIT_STORAGE_EXTENSION_NAME = "VK_KHR_16bit_storage";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_incremental_present.html">khronos documentation</a>
     **/
    public static final long VK_KHR_incremental_present = getVkKhrIncrementalPresent();
    private static native long getVkKhrIncrementalPresent();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_INCREMENTAL_PRESENT_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_INCREMENTAL_PRESENT_SPEC_VERSION = getVkKhrIncrementalPresentSpecVersion();
    private static native long getVkKhrIncrementalPresentSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_INCREMENTAL_PRESENT_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_INCREMENTAL_PRESENT_EXTENSION_NAME = "VK_KHR_incremental_present";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_descriptor_update_template.html">khronos documentation</a>
     **/
    public static final long VK_KHR_descriptor_update_template = getVkKhrDescriptorUpdateTemplate();
    private static native long getVkKhrDescriptorUpdateTemplate();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_SPEC_VERSION = getVkKhrDescriptorUpdateTemplateSpecVersion();
    private static native long getVkKhrDescriptorUpdateTemplateSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME = "VK_KHR_descriptor_update_template";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_shared_presentable_image.html">khronos documentation</a>
     **/
    public static final long VK_KHR_shared_presentable_image = getVkKhrSharedPresentableImage();
    private static native long getVkKhrSharedPresentableImage();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_SHARED_PRESENTABLE_IMAGE_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_SHARED_PRESENTABLE_IMAGE_SPEC_VERSION = getVkKhrSharedPresentableImageSpecVersion();
    private static native long getVkKhrSharedPresentableImageSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME = "VK_KHR_shared_presentable_image";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_external_fence_capabilities.html">khronos documentation</a>
     **/
    public static final long VK_KHR_external_fence_capabilities = getVkKhrExternalFenceCapabilities();
    private static native long getVkKhrExternalFenceCapabilities();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_FENCE_CAPABILITIES_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_EXTERNAL_FENCE_CAPABILITIES_SPEC_VERSION = getVkKhrExternalFenceCapabilitiesSpecVersion();
    private static native long getVkKhrExternalFenceCapabilitiesSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_FENCE_CAPABILITIES_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_EXTERNAL_FENCE_CAPABILITIES_EXTENSION_NAME = "VK_KHR_external_fence_capabilities";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_external_fence.html">khronos documentation</a>
     **/
    public static final long VK_KHR_external_fence = getVkKhrExternalFence();
    private static native long getVkKhrExternalFence();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_FENCE_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_EXTERNAL_FENCE_SPEC_VERSION = getVkKhrExternalFenceSpecVersion();
    private static native long getVkKhrExternalFenceSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_FENCE_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_EXTERNAL_FENCE_EXTENSION_NAME = "VK_KHR_external_fence";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_external_fence_fd.html">khronos documentation</a>
     **/
    public static final long VK_KHR_external_fence_fd = getVkKhrExternalFenceFd();
    private static native long getVkKhrExternalFenceFd();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_FENCE_FD_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_EXTERNAL_FENCE_FD_SPEC_VERSION = getVkKhrExternalFenceFdSpecVersion();
    private static native long getVkKhrExternalFenceFdSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME = "VK_KHR_external_fence_fd";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_maintenance2.html">khronos documentation</a>
     **/
    public static final long VK_KHR_maintenance2 = getVkKhrMaintenance2();
    private static native long getVkKhrMaintenance2();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_MAINTENANCE2_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_MAINTENANCE2_SPEC_VERSION = getVkKhrMaintenance2SpecVersion();
    private static native long getVkKhrMaintenance2SpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_MAINTENANCE2_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_MAINTENANCE2_EXTENSION_NAME = "VK_KHR_maintenance2";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_get_surface_capabilities2.html">khronos documentation</a>
     **/
    public static final long VK_KHR_get_surface_capabilities2 = getVkKhrGetSurfaceCapabilities2();
    private static native long getVkKhrGetSurfaceCapabilities2();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION = getVkKhrGetSurfaceCapabilities2SpecVersion();
    private static native long getVkKhrGetSurfaceCapabilities2SpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME = "VK_KHR_get_surface_capabilities2";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_variable_pointers.html">khronos documentation</a>
     **/
    public static final long VK_KHR_variable_pointers = getVkKhrVariablePointers();
    private static native long getVkKhrVariablePointers();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_VARIABLE_POINTERS_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_VARIABLE_POINTERS_SPEC_VERSION = getVkKhrVariablePointersSpecVersion();
    private static native long getVkKhrVariablePointersSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_VARIABLE_POINTERS_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_VARIABLE_POINTERS_EXTENSION_NAME = "VK_KHR_variable_pointers";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_dedicated_allocation.html">khronos documentation</a>
     **/
    public static final long VK_KHR_dedicated_allocation = getVkKhrDedicatedAllocation();
    private static native long getVkKhrDedicatedAllocation();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_DEDICATED_ALLOCATION_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_DEDICATED_ALLOCATION_SPEC_VERSION = getVkKhrDedicatedAllocationSpecVersion();
    private static native long getVkKhrDedicatedAllocationSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_DEDICATED_ALLOCATION_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_DEDICATED_ALLOCATION_EXTENSION_NAME = "VK_KHR_dedicated_allocation";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_storage_buffer_storage_class.html">khronos documentation</a>
     **/
    public static final long VK_KHR_storage_buffer_storage_class = getVkKhrStorageBufferStorageClass();
    private static native long getVkKhrStorageBufferStorageClass();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_STORAGE_BUFFER_STORAGE_CLASS_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_STORAGE_BUFFER_STORAGE_CLASS_SPEC_VERSION = getVkKhrStorageBufferStorageClassSpecVersion();
    private static native long getVkKhrStorageBufferStorageClassSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_STORAGE_BUFFER_STORAGE_CLASS_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_STORAGE_BUFFER_STORAGE_CLASS_EXTENSION_NAME = "VK_KHR_storage_buffer_storage_class";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_relaxed_block_layout.html">khronos documentation</a>
     **/
    public static final long VK_KHR_relaxed_block_layout = getVkKhrRelaxedBlockLayout();
    private static native long getVkKhrRelaxedBlockLayout();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_RELAXED_BLOCK_LAYOUT_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_RELAXED_BLOCK_LAYOUT_SPEC_VERSION = getVkKhrRelaxedBlockLayoutSpecVersion();
    private static native long getVkKhrRelaxedBlockLayoutSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_RELAXED_BLOCK_LAYOUT_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_RELAXED_BLOCK_LAYOUT_EXTENSION_NAME = "VK_KHR_relaxed_block_layout";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_get_memory_requirements2.html">khronos documentation</a>
     **/
    public static final long VK_KHR_get_memory_requirements2 = getVkKhrGetMemoryRequirements2();
    private static native long getVkKhrGetMemoryRequirements2();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION = getVkKhrGetMemoryRequirements2SpecVersion();
    private static native long getVkKhrGetMemoryRequirements2SpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME = "VK_KHR_get_memory_requirements2";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_image_format_list.html">khronos documentation</a>
     **/
    public static final long VK_KHR_image_format_list = getVkKhrImageFormatList();
    private static native long getVkKhrImageFormatList();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_IMAGE_FORMAT_LIST_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_IMAGE_FORMAT_LIST_SPEC_VERSION = getVkKhrImageFormatListSpecVersion();
    private static native long getVkKhrImageFormatListSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_IMAGE_FORMAT_LIST_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_IMAGE_FORMAT_LIST_EXTENSION_NAME = "VK_KHR_image_format_list";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_sampler_ycbcr_conversion.html">khronos documentation</a>
     **/
    public static final long VK_KHR_sampler_ycbcr_conversion = getVkKhrSamplerYcbcrConversion();
    private static native long getVkKhrSamplerYcbcrConversion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_SAMPLER_YCBCR_CONVERSION_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_SAMPLER_YCBCR_CONVERSION_SPEC_VERSION = getVkKhrSamplerYcbcrConversionSpecVersion();
    private static native long getVkKhrSamplerYcbcrConversionSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_SAMPLER_YCBCR_CONVERSION_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_SAMPLER_YCBCR_CONVERSION_EXTENSION_NAME = "VK_KHR_sampler_ycbcr_conversion";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_bind_memory2.html">khronos documentation</a>
     **/
    public static final long VK_KHR_bind_memory2 = getVkKhrBindMemory2();
    private static native long getVkKhrBindMemory2();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_BIND_MEMORY_2_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_BIND_MEMORY_2_SPEC_VERSION = getVkKhrBindMemory2SpecVersion();
    private static native long getVkKhrBindMemory2SpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_BIND_MEMORY_2_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_BIND_MEMORY_2_EXTENSION_NAME = "VK_KHR_bind_memory2";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_maintenance3.html">khronos documentation</a>
     **/
    public static final long VK_KHR_maintenance3 = getVkKhrMaintenance3();
    private static native long getVkKhrMaintenance3();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_MAINTENANCE3_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_KHR_MAINTENANCE3_SPEC_VERSION = getVkKhrMaintenance3SpecVersion();
    private static native long getVkKhrMaintenance3SpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_KHR_MAINTENANCE3_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_KHR_MAINTENANCE3_EXTENSION_NAME = "VK_KHR_maintenance3";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_debug_report.html">khronos documentation</a>
     **/
    public static final long VK_EXT_debug_report = getVkExtDebugReport();
    private static native long getVkExtDebugReport();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DEBUG_REPORT_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_DEBUG_REPORT_SPEC_VERSION = getVkExtDebugReportSpecVersion();
    private static native long getVkExtDebugReportSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DEBUG_REPORT_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_DEBUG_REPORT_EXTENSION_NAME = "VK_EXT_debug_report";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT.html">khronos documentation</a>
     **/
    public static final long VK_STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT = getVkStructureTypeDebugReportCreateInfoExt();
    private static native long getVkStructureTypeDebugReportCreateInfoExt();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT.html">khronos documentation</a>
     **/
    public static final long VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = getVkDebugReportObjectTypeDebugReportExt();
    private static native long getVkDebugReportObjectTypeDebugReportExt();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_glsl_shader.html">khronos documentation</a>
     **/
    public static final long VK_NV_glsl_shader = getVkNvGlslShader();
    private static native long getVkNvGlslShader();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_GLSL_SHADER_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_NV_GLSL_SHADER_SPEC_VERSION = getVkNvGlslShaderSpecVersion();
    private static native long getVkNvGlslShaderSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_GLSL_SHADER_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_NV_GLSL_SHADER_EXTENSION_NAME = "VK_NV_glsl_shader";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_depth_range_unrestricted.html">khronos documentation</a>
     **/
    public static final long VK_EXT_depth_range_unrestricted = getVkExtDepthRangeUnrestricted();
    private static native long getVkExtDepthRangeUnrestricted();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DEPTH_RANGE_UNRESTRICTED_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_DEPTH_RANGE_UNRESTRICTED_SPEC_VERSION = getVkExtDepthRangeUnrestrictedSpecVersion();
    private static native long getVkExtDepthRangeUnrestrictedSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DEPTH_RANGE_UNRESTRICTED_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_DEPTH_RANGE_UNRESTRICTED_EXTENSION_NAME = "VK_EXT_depth_range_unrestricted";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_IMG_filter_cubic.html">khronos documentation</a>
     **/
    public static final long VK_IMG_filter_cubic = getVkImgFilterCubic();
    private static native long getVkImgFilterCubic();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_IMG_FILTER_CUBIC_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_IMG_FILTER_CUBIC_SPEC_VERSION = getVkImgFilterCubicSpecVersion();
    private static native long getVkImgFilterCubicSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_IMG_FILTER_CUBIC_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_IMG_FILTER_CUBIC_EXTENSION_NAME = "VK_IMG_filter_cubic";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_rasterization_order.html">khronos documentation</a>
     **/
    public static final long VK_AMD_rasterization_order = getVkAmdRasterizationOrder();
    private static native long getVkAmdRasterizationOrder();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_RASTERIZATION_ORDER_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_RASTERIZATION_ORDER_SPEC_VERSION = getVkAmdRasterizationOrderSpecVersion();
    private static native long getVkAmdRasterizationOrderSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_RASTERIZATION_ORDER_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_RASTERIZATION_ORDER_EXTENSION_NAME = "VK_AMD_rasterization_order";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_shader_trinary_minmax.html">khronos documentation</a>
     **/
    public static final long VK_AMD_shader_trinary_minmax = getVkAmdShaderTrinaryMinmax();
    private static native long getVkAmdShaderTrinaryMinmax();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_SHADER_TRINARY_MINMAX_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_SHADER_TRINARY_MINMAX_SPEC_VERSION = getVkAmdShaderTrinaryMinmaxSpecVersion();
    private static native long getVkAmdShaderTrinaryMinmaxSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_SHADER_TRINARY_MINMAX_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_SHADER_TRINARY_MINMAX_EXTENSION_NAME = "VK_AMD_shader_trinary_minmax";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_shader_explicit_vertex_parameter.html">khronos documentation</a>
     **/
    public static final long VK_AMD_shader_explicit_vertex_parameter = getVkAmdShaderExplicitVertexParameter();
    private static native long getVkAmdShaderExplicitVertexParameter();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_SPEC_VERSION = getVkAmdShaderExplicitVertexParameterSpecVersion();
    private static native long getVkAmdShaderExplicitVertexParameterSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_EXTENSION_NAME = "VK_AMD_shader_explicit_vertex_parameter";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_debug_marker.html">khronos documentation</a>
     **/
    public static final long VK_EXT_debug_marker = getVkExtDebugMarker();
    private static native long getVkExtDebugMarker();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DEBUG_MARKER_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_DEBUG_MARKER_SPEC_VERSION = getVkExtDebugMarkerSpecVersion();
    private static native long getVkExtDebugMarkerSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DEBUG_MARKER_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_DEBUG_MARKER_EXTENSION_NAME = "VK_EXT_debug_marker";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_gcn_shader.html">khronos documentation</a>
     **/
    public static final long VK_AMD_gcn_shader = getVkAmdGcnShader();
    private static native long getVkAmdGcnShader();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_GCN_SHADER_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_GCN_SHADER_SPEC_VERSION = getVkAmdGcnShaderSpecVersion();
    private static native long getVkAmdGcnShaderSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_GCN_SHADER_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_GCN_SHADER_EXTENSION_NAME = "VK_AMD_gcn_shader";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_dedicated_allocation.html">khronos documentation</a>
     **/
    public static final long VK_NV_dedicated_allocation = getVkNvDedicatedAllocation();
    private static native long getVkNvDedicatedAllocation();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_DEDICATED_ALLOCATION_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_NV_DEDICATED_ALLOCATION_SPEC_VERSION = getVkNvDedicatedAllocationSpecVersion();
    private static native long getVkNvDedicatedAllocationSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_DEDICATED_ALLOCATION_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_NV_DEDICATED_ALLOCATION_EXTENSION_NAME = "VK_NV_dedicated_allocation";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_draw_indirect_count.html">khronos documentation</a>
     **/
    public static final long VK_AMD_draw_indirect_count = getVkAmdDrawIndirectCount();
    private static native long getVkAmdDrawIndirectCount();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_DRAW_INDIRECT_COUNT_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_DRAW_INDIRECT_COUNT_SPEC_VERSION = getVkAmdDrawIndirectCountSpecVersion();
    private static native long getVkAmdDrawIndirectCountSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME = "VK_AMD_draw_indirect_count";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_negative_viewport_height.html">khronos documentation</a>
     **/
    public static final long VK_AMD_negative_viewport_height = getVkAmdNegativeViewportHeight();
    private static native long getVkAmdNegativeViewportHeight();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_NEGATIVE_VIEWPORT_HEIGHT_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_NEGATIVE_VIEWPORT_HEIGHT_SPEC_VERSION = getVkAmdNegativeViewportHeightSpecVersion();
    private static native long getVkAmdNegativeViewportHeightSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_NEGATIVE_VIEWPORT_HEIGHT_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_NEGATIVE_VIEWPORT_HEIGHT_EXTENSION_NAME = "VK_AMD_negative_viewport_height";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_gpu_shader_half_float.html">khronos documentation</a>
     **/
    public static final long VK_AMD_gpu_shader_half_float = getVkAmdGpuShaderHalfFloat();
    private static native long getVkAmdGpuShaderHalfFloat();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_GPU_SHADER_HALF_FLOAT_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_GPU_SHADER_HALF_FLOAT_SPEC_VERSION = getVkAmdGpuShaderHalfFloatSpecVersion();
    private static native long getVkAmdGpuShaderHalfFloatSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_GPU_SHADER_HALF_FLOAT_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_GPU_SHADER_HALF_FLOAT_EXTENSION_NAME = "VK_AMD_gpu_shader_half_float";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_shader_ballot.html">khronos documentation</a>
     **/
    public static final long VK_AMD_shader_ballot = getVkAmdShaderBallot();
    private static native long getVkAmdShaderBallot();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_SHADER_BALLOT_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_SHADER_BALLOT_SPEC_VERSION = getVkAmdShaderBallotSpecVersion();
    private static native long getVkAmdShaderBallotSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_SHADER_BALLOT_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_SHADER_BALLOT_EXTENSION_NAME = "VK_AMD_shader_ballot";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_texture_gather_bias_lod.html">khronos documentation</a>
     **/
    public static final long VK_AMD_texture_gather_bias_lod = getVkAmdTextureGatherBiasLod();
    private static native long getVkAmdTextureGatherBiasLod();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_TEXTURE_GATHER_BIAS_LOD_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_TEXTURE_GATHER_BIAS_LOD_SPEC_VERSION = getVkAmdTextureGatherBiasLodSpecVersion();
    private static native long getVkAmdTextureGatherBiasLodSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_TEXTURE_GATHER_BIAS_LOD_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_TEXTURE_GATHER_BIAS_LOD_EXTENSION_NAME = "VK_AMD_texture_gather_bias_lod";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_shader_info.html">khronos documentation</a>
     **/
    public static final long VK_AMD_shader_info = getVkAmdShaderInfo();
    private static native long getVkAmdShaderInfo();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_SHADER_INFO_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_SHADER_INFO_SPEC_VERSION = getVkAmdShaderInfoSpecVersion();
    private static native long getVkAmdShaderInfoSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_SHADER_INFO_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_SHADER_INFO_EXTENSION_NAME = "VK_AMD_shader_info";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_shader_image_load_store_lod.html">khronos documentation</a>
     **/
    public static final long VK_AMD_shader_image_load_store_lod = getVkAmdShaderImageLoadStoreLod();
    private static native long getVkAmdShaderImageLoadStoreLod();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_SHADER_IMAGE_LOAD_STORE_LOD_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_SHADER_IMAGE_LOAD_STORE_LOD_SPEC_VERSION = getVkAmdShaderImageLoadStoreLodSpecVersion();
    private static native long getVkAmdShaderImageLoadStoreLodSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_SHADER_IMAGE_LOAD_STORE_LOD_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_SHADER_IMAGE_LOAD_STORE_LOD_EXTENSION_NAME = "VK_AMD_shader_image_load_store_lod";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_IMG_format_pvrtc.html">khronos documentation</a>
     **/
    public static final long VK_IMG_format_pvrtc = getVkImgFormatPvrtc();
    private static native long getVkImgFormatPvrtc();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_IMG_FORMAT_PVRTC_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_IMG_FORMAT_PVRTC_SPEC_VERSION = getVkImgFormatPvrtcSpecVersion();
    private static native long getVkImgFormatPvrtcSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_IMG_FORMAT_PVRTC_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_IMG_FORMAT_PVRTC_EXTENSION_NAME = "VK_IMG_format_pvrtc";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_external_memory_capabilities.html">khronos documentation</a>
     **/
    public static final long VK_NV_external_memory_capabilities = getVkNvExternalMemoryCapabilities();
    private static native long getVkNvExternalMemoryCapabilities();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_NV_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION = getVkNvExternalMemoryCapabilitiesSpecVersion();
    private static native long getVkNvExternalMemoryCapabilitiesSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_NV_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME = "VK_NV_external_memory_capabilities";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_external_memory.html">khronos documentation</a>
     **/
    public static final long VK_NV_external_memory = getVkNvExternalMemory();
    private static native long getVkNvExternalMemory();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_EXTERNAL_MEMORY_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_NV_EXTERNAL_MEMORY_SPEC_VERSION = getVkNvExternalMemorySpecVersion();
    private static native long getVkNvExternalMemorySpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_EXTERNAL_MEMORY_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_NV_EXTERNAL_MEMORY_EXTENSION_NAME = "VK_NV_external_memory";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_validation_flags.html">khronos documentation</a>
     **/
    public static final long VK_EXT_validation_flags = getVkExtValidationFlags();
    private static native long getVkExtValidationFlags();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_VALIDATION_FLAGS_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_VALIDATION_FLAGS_SPEC_VERSION = getVkExtValidationFlagsSpecVersion();
    private static native long getVkExtValidationFlagsSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_VALIDATION_FLAGS_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_VALIDATION_FLAGS_EXTENSION_NAME = "VK_EXT_validation_flags";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_shader_subgroup_ballot.html">khronos documentation</a>
     **/
    public static final long VK_EXT_shader_subgroup_ballot = getVkExtShaderSubgroupBallot();
    private static native long getVkExtShaderSubgroupBallot();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_SHADER_SUBGROUP_BALLOT_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_SHADER_SUBGROUP_BALLOT_SPEC_VERSION = getVkExtShaderSubgroupBallotSpecVersion();
    private static native long getVkExtShaderSubgroupBallotSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_SHADER_SUBGROUP_BALLOT_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_SHADER_SUBGROUP_BALLOT_EXTENSION_NAME = "VK_EXT_shader_subgroup_ballot";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_shader_subgroup_vote.html">khronos documentation</a>
     **/
    public static final long VK_EXT_shader_subgroup_vote = getVkExtShaderSubgroupVote();
    private static native long getVkExtShaderSubgroupVote();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_SHADER_SUBGROUP_VOTE_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_SHADER_SUBGROUP_VOTE_SPEC_VERSION = getVkExtShaderSubgroupVoteSpecVersion();
    private static native long getVkExtShaderSubgroupVoteSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_SHADER_SUBGROUP_VOTE_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_SHADER_SUBGROUP_VOTE_EXTENSION_NAME = "VK_EXT_shader_subgroup_vote";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NVX_device_generated_commands.html">khronos documentation</a>
     **/
    public static final long VK_NVX_device_generated_commands = getVkNvxDeviceGeneratedCommands();
    private static native long getVkNvxDeviceGeneratedCommands();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NVX_DEVICE_GENERATED_COMMANDS_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_NVX_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = getVkNvxDeviceGeneratedCommandsSpecVersion();
    private static native long getVkNvxDeviceGeneratedCommandsSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NVX_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_NVX_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_NVX_device_generated_commands";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_clip_space_w_scaling.html">khronos documentation</a>
     **/
    public static final long VK_NV_clip_space_w_scaling = getVkNvClipSpaceWScaling();
    private static native long getVkNvClipSpaceWScaling();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_CLIP_SPACE_W_SCALING_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_NV_CLIP_SPACE_W_SCALING_SPEC_VERSION = getVkNvClipSpaceWScalingSpecVersion();
    private static native long getVkNvClipSpaceWScalingSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME = "VK_NV_clip_space_w_scaling";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_direct_mode_display.html">khronos documentation</a>
     **/
    public static final long VK_EXT_direct_mode_display = getVkExtDirectModeDisplay();
    private static native long getVkExtDirectModeDisplay();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DIRECT_MODE_DISPLAY_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_DIRECT_MODE_DISPLAY_SPEC_VERSION = getVkExtDirectModeDisplaySpecVersion();
    private static native long getVkExtDirectModeDisplaySpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DIRECT_MODE_DISPLAY_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_DIRECT_MODE_DISPLAY_EXTENSION_NAME = "VK_EXT_direct_mode_display";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_display_surface_counter.html">khronos documentation</a>
     **/
    public static final long VK_EXT_display_surface_counter = getVkExtDisplaySurfaceCounter();
    private static native long getVkExtDisplaySurfaceCounter();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION = getVkExtDisplaySurfaceCounterSpecVersion();
    private static native long getVkExtDisplaySurfaceCounterSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME = "VK_EXT_display_surface_counter";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT.html">khronos documentation</a>
     **/
    public static final long VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT = getVkStructureTypeSurfaceCapabilities2Ext();
    private static native long getVkStructureTypeSurfaceCapabilities2Ext();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_display_control.html">khronos documentation</a>
     **/
    public static final long VK_EXT_display_control = getVkExtDisplayControl();
    private static native long getVkExtDisplayControl();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DISPLAY_CONTROL_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_DISPLAY_CONTROL_SPEC_VERSION = getVkExtDisplayControlSpecVersion();
    private static native long getVkExtDisplayControlSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DISPLAY_CONTROL_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_DISPLAY_CONTROL_EXTENSION_NAME = "VK_EXT_display_control";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_GOOGLE_display_timing.html">khronos documentation</a>
     **/
    public static final long VK_GOOGLE_display_timing = getVkGoogleDisplayTiming();
    private static native long getVkGoogleDisplayTiming();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_GOOGLE_DISPLAY_TIMING_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_GOOGLE_DISPLAY_TIMING_SPEC_VERSION = getVkGoogleDisplayTimingSpecVersion();
    private static native long getVkGoogleDisplayTimingSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_GOOGLE_DISPLAY_TIMING_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_GOOGLE_DISPLAY_TIMING_EXTENSION_NAME = "VK_GOOGLE_display_timing";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_sample_mask_override_coverage.html">khronos documentation</a>
     **/
    public static final long VK_NV_sample_mask_override_coverage = getVkNvSampleMaskOverrideCoverage();
    private static native long getVkNvSampleMaskOverrideCoverage();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_SPEC_VERSION = getVkNvSampleMaskOverrideCoverageSpecVersion();
    private static native long getVkNvSampleMaskOverrideCoverageSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_EXTENSION_NAME = "VK_NV_sample_mask_override_coverage";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_geometry_shader_passthrough.html">khronos documentation</a>
     **/
    public static final long VK_NV_geometry_shader_passthrough = getVkNvGeometryShaderPassthrough();
    private static native long getVkNvGeometryShaderPassthrough();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_GEOMETRY_SHADER_PASSTHROUGH_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_NV_GEOMETRY_SHADER_PASSTHROUGH_SPEC_VERSION = getVkNvGeometryShaderPassthroughSpecVersion();
    private static native long getVkNvGeometryShaderPassthroughSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_GEOMETRY_SHADER_PASSTHROUGH_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_NV_GEOMETRY_SHADER_PASSTHROUGH_EXTENSION_NAME = "VK_NV_geometry_shader_passthrough";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_viewport_array2.html">khronos documentation</a>
     **/
    public static final long VK_NV_viewport_array2 = getVkNvViewportArray2();
    private static native long getVkNvViewportArray2();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_VIEWPORT_ARRAY2_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_NV_VIEWPORT_ARRAY2_SPEC_VERSION = getVkNvViewportArray2SpecVersion();
    private static native long getVkNvViewportArray2SpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_VIEWPORT_ARRAY2_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_NV_VIEWPORT_ARRAY2_EXTENSION_NAME = "VK_NV_viewport_array2";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NVX_multiview_per_view_attributes.html">khronos documentation</a>
     **/
    public static final long VK_NVX_multiview_per_view_attributes = getVkNvxMultiviewPerViewAttributes();
    private static native long getVkNvxMultiviewPerViewAttributes();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_SPEC_VERSION = getVkNvxMultiviewPerViewAttributesSpecVersion();
    private static native long getVkNvxMultiviewPerViewAttributesSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_EXTENSION_NAME = "VK_NVX_multiview_per_view_attributes";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_viewport_swizzle.html">khronos documentation</a>
     **/
    public static final long VK_NV_viewport_swizzle = getVkNvViewportSwizzle();
    private static native long getVkNvViewportSwizzle();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_VIEWPORT_SWIZZLE_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_NV_VIEWPORT_SWIZZLE_SPEC_VERSION = getVkNvViewportSwizzleSpecVersion();
    private static native long getVkNvViewportSwizzleSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_VIEWPORT_SWIZZLE_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_NV_VIEWPORT_SWIZZLE_EXTENSION_NAME = "VK_NV_viewport_swizzle";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_discard_rectangles.html">khronos documentation</a>
     **/
    public static final long VK_EXT_discard_rectangles = getVkExtDiscardRectangles();
    private static native long getVkExtDiscardRectangles();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DISCARD_RECTANGLES_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_DISCARD_RECTANGLES_SPEC_VERSION = getVkExtDiscardRectanglesSpecVersion();
    private static native long getVkExtDiscardRectanglesSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DISCARD_RECTANGLES_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_DISCARD_RECTANGLES_EXTENSION_NAME = "VK_EXT_discard_rectangles";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_conservative_rasterization.html">khronos documentation</a>
     **/
    public static final long VK_EXT_conservative_rasterization = getVkExtConservativeRasterization();
    private static native long getVkExtConservativeRasterization();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_CONSERVATIVE_RASTERIZATION_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_CONSERVATIVE_RASTERIZATION_SPEC_VERSION = getVkExtConservativeRasterizationSpecVersion();
    private static native long getVkExtConservativeRasterizationSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_CONSERVATIVE_RASTERIZATION_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_CONSERVATIVE_RASTERIZATION_EXTENSION_NAME = "VK_EXT_conservative_rasterization";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_swapchain_colorspace.html">khronos documentation</a>
     **/
    public static final long VK_EXT_swapchain_colorspace = getVkExtSwapchainColorspace();
    private static native long getVkExtSwapchainColorspace();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_SWAPCHAIN_COLOR_SPACE_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_SWAPCHAIN_COLOR_SPACE_SPEC_VERSION = getVkExtSwapchainColorSpaceSpecVersion();
    private static native long getVkExtSwapchainColorSpaceSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_SWAPCHAIN_COLOR_SPACE_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_SWAPCHAIN_COLOR_SPACE_EXTENSION_NAME = "VK_EXT_swapchain_colorspace";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_hdr_metadata.html">khronos documentation</a>
     **/
    public static final long VK_EXT_hdr_metadata = getVkExtHdrMetadata();
    private static native long getVkExtHdrMetadata();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_HDR_METADATA_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_HDR_METADATA_SPEC_VERSION = getVkExtHdrMetadataSpecVersion();
    private static native long getVkExtHdrMetadataSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_HDR_METADATA_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_HDR_METADATA_EXTENSION_NAME = "VK_EXT_hdr_metadata";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_external_memory_dma_buf.html">khronos documentation</a>
     **/
    public static final long VK_EXT_external_memory_dma_buf = getVkExtExternalMemoryDmaBuf();
    private static native long getVkExtExternalMemoryDmaBuf();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_EXTERNAL_MEMORY_DMA_BUF_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_EXTERNAL_MEMORY_DMA_BUF_SPEC_VERSION = getVkExtExternalMemoryDmaBufSpecVersion();
    private static native long getVkExtExternalMemoryDmaBufSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_EXTERNAL_MEMORY_DMA_BUF_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_EXTERNAL_MEMORY_DMA_BUF_EXTENSION_NAME = "VK_EXT_external_memory_dma_buf";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_queue_family_foreign.html">khronos documentation</a>
     **/
    public static final long VK_EXT_queue_family_foreign = getVkExtQueueFamilyForeign();
    private static native long getVkExtQueueFamilyForeign();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_QUEUE_FAMILY_FOREIGN_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_QUEUE_FAMILY_FOREIGN_SPEC_VERSION = getVkExtQueueFamilyForeignSpecVersion();
    private static native long getVkExtQueueFamilyForeignSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_QUEUE_FAMILY_FOREIGN_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_QUEUE_FAMILY_FOREIGN_EXTENSION_NAME = "VK_EXT_queue_family_foreign";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_QUEUE_FAMILY_FOREIGN_EXT.html">khronos documentation</a>
     **/
    public static final long VK_QUEUE_FAMILY_FOREIGN_EXT = getVkQueueFamilyForeignExt();
    private static native long getVkQueueFamilyForeignExt();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_debug_utils.html">khronos documentation</a>
     **/
    public static final long VK_EXT_debug_utils = getVkExtDebugUtils();
    private static native long getVkExtDebugUtils();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DEBUG_UTILS_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_DEBUG_UTILS_SPEC_VERSION = getVkExtDebugUtilsSpecVersion();
    private static native long getVkExtDebugUtilsSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DEBUG_UTILS_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_DEBUG_UTILS_EXTENSION_NAME = "VK_EXT_debug_utils";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_sampler_filter_minmax.html">khronos documentation</a>
     **/
    public static final long VK_EXT_sampler_filter_minmax = getVkExtSamplerFilterMinmax();
    private static native long getVkExtSamplerFilterMinmax();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_SAMPLER_FILTER_MINMAX_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_SAMPLER_FILTER_MINMAX_SPEC_VERSION = getVkExtSamplerFilterMinmaxSpecVersion();
    private static native long getVkExtSamplerFilterMinmaxSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_SAMPLER_FILTER_MINMAX_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_SAMPLER_FILTER_MINMAX_EXTENSION_NAME = "VK_EXT_sampler_filter_minmax";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_gpu_shader_int16.html">khronos documentation</a>
     **/
    public static final long VK_AMD_gpu_shader_int16 = getVkAmdGpuShaderInt16();
    private static native long getVkAmdGpuShaderInt16();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_GPU_SHADER_INT16_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_GPU_SHADER_INT16_SPEC_VERSION = getVkAmdGpuShaderInt16SpecVersion();
    private static native long getVkAmdGpuShaderInt16SpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_GPU_SHADER_INT16_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_GPU_SHADER_INT16_EXTENSION_NAME = "VK_AMD_gpu_shader_int16";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_mixed_attachment_samples.html">khronos documentation</a>
     **/
    public static final long VK_AMD_mixed_attachment_samples = getVkAmdMixedAttachmentSamples();
    private static native long getVkAmdMixedAttachmentSamples();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_MIXED_ATTACHMENT_SAMPLES_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_MIXED_ATTACHMENT_SAMPLES_SPEC_VERSION = getVkAmdMixedAttachmentSamplesSpecVersion();
    private static native long getVkAmdMixedAttachmentSamplesSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_MIXED_ATTACHMENT_SAMPLES_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_MIXED_ATTACHMENT_SAMPLES_EXTENSION_NAME = "VK_AMD_mixed_attachment_samples";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_shader_fragment_mask.html">khronos documentation</a>
     **/
    public static final long VK_AMD_shader_fragment_mask = getVkAmdShaderFragmentMask();
    private static native long getVkAmdShaderFragmentMask();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_SHADER_FRAGMENT_MASK_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_SHADER_FRAGMENT_MASK_SPEC_VERSION = getVkAmdShaderFragmentMaskSpecVersion();
    private static native long getVkAmdShaderFragmentMaskSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_SHADER_FRAGMENT_MASK_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_SHADER_FRAGMENT_MASK_EXTENSION_NAME = "VK_AMD_shader_fragment_mask";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_shader_stencil_export.html">khronos documentation</a>
     **/
    public static final long VK_EXT_shader_stencil_export = getVkExtShaderStencilExport();
    private static native long getVkExtShaderStencilExport();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_SHADER_STENCIL_EXPORT_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_SHADER_STENCIL_EXPORT_SPEC_VERSION = getVkExtShaderStencilExportSpecVersion();
    private static native long getVkExtShaderStencilExportSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_SHADER_STENCIL_EXPORT_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_SHADER_STENCIL_EXPORT_EXTENSION_NAME = "VK_EXT_shader_stencil_export";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_sample_locations.html">khronos documentation</a>
     **/
    public static final long VK_EXT_sample_locations = getVkExtSampleLocations();
    private static native long getVkExtSampleLocations();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_SAMPLE_LOCATIONS_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_SAMPLE_LOCATIONS_SPEC_VERSION = getVkExtSampleLocationsSpecVersion();
    private static native long getVkExtSampleLocationsSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME = "VK_EXT_sample_locations";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_blend_operation_advanced.html">khronos documentation</a>
     **/
    public static final long VK_EXT_blend_operation_advanced = getVkExtBlendOperationAdvanced();
    private static native long getVkExtBlendOperationAdvanced();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_BLEND_OPERATION_ADVANCED_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_BLEND_OPERATION_ADVANCED_SPEC_VERSION = getVkExtBlendOperationAdvancedSpecVersion();
    private static native long getVkExtBlendOperationAdvancedSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_BLEND_OPERATION_ADVANCED_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_BLEND_OPERATION_ADVANCED_EXTENSION_NAME = "VK_EXT_blend_operation_advanced";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_fragment_coverage_to_color.html">khronos documentation</a>
     **/
    public static final long VK_NV_fragment_coverage_to_color = getVkNvFragmentCoverageToColor();
    private static native long getVkNvFragmentCoverageToColor();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_FRAGMENT_COVERAGE_TO_COLOR_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_NV_FRAGMENT_COVERAGE_TO_COLOR_SPEC_VERSION = getVkNvFragmentCoverageToColorSpecVersion();
    private static native long getVkNvFragmentCoverageToColorSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_FRAGMENT_COVERAGE_TO_COLOR_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_NV_FRAGMENT_COVERAGE_TO_COLOR_EXTENSION_NAME = "VK_NV_fragment_coverage_to_color";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_framebuffer_mixed_samples.html">khronos documentation</a>
     **/
    public static final long VK_NV_framebuffer_mixed_samples = getVkNvFramebufferMixedSamples();
    private static native long getVkNvFramebufferMixedSamples();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_FRAMEBUFFER_MIXED_SAMPLES_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_NV_FRAMEBUFFER_MIXED_SAMPLES_SPEC_VERSION = getVkNvFramebufferMixedSamplesSpecVersion();
    private static native long getVkNvFramebufferMixedSamplesSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_FRAMEBUFFER_MIXED_SAMPLES_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_NV_FRAMEBUFFER_MIXED_SAMPLES_EXTENSION_NAME = "VK_NV_framebuffer_mixed_samples";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_fill_rectangle.html">khronos documentation</a>
     **/
    public static final long VK_NV_fill_rectangle = getVkNvFillRectangle();
    private static native long getVkNvFillRectangle();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_FILL_RECTANGLE_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_NV_FILL_RECTANGLE_SPEC_VERSION = getVkNvFillRectangleSpecVersion();
    private static native long getVkNvFillRectangleSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_FILL_RECTANGLE_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_NV_FILL_RECTANGLE_EXTENSION_NAME = "VK_NV_fill_rectangle";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_post_depth_coverage.html">khronos documentation</a>
     **/
    public static final long VK_EXT_post_depth_coverage = getVkExtPostDepthCoverage();
    private static native long getVkExtPostDepthCoverage();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_POST_DEPTH_COVERAGE_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_POST_DEPTH_COVERAGE_SPEC_VERSION = getVkExtPostDepthCoverageSpecVersion();
    private static native long getVkExtPostDepthCoverageSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_POST_DEPTH_COVERAGE_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_POST_DEPTH_COVERAGE_EXTENSION_NAME = "VK_EXT_post_depth_coverage";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_validation_cache.html">khronos documentation</a>
     **/
    public static final long VK_EXT_validation_cache = getVkExtValidationCache();
    private static native long getVkExtValidationCache();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_VALIDATION_CACHE_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_VALIDATION_CACHE_SPEC_VERSION = getVkExtValidationCacheSpecVersion();
    private static native long getVkExtValidationCacheSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_VALIDATION_CACHE_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_VALIDATION_CACHE_EXTENSION_NAME = "VK_EXT_validation_cache";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT.html">khronos documentation</a>
     **/
    public static final long VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT = getVkDebugReportObjectTypeValidationCacheExt();
    private static native long getVkDebugReportObjectTypeValidationCacheExt();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_descriptor_indexing.html">khronos documentation</a>
     **/
    public static final long VK_EXT_descriptor_indexing = getVkExtDescriptorIndexing();
    private static native long getVkExtDescriptorIndexing();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DESCRIPTOR_INDEXING_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_DESCRIPTOR_INDEXING_SPEC_VERSION = getVkExtDescriptorIndexingSpecVersion();
    private static native long getVkExtDescriptorIndexingSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_DESCRIPTOR_INDEXING_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_DESCRIPTOR_INDEXING_EXTENSION_NAME = "VK_EXT_descriptor_indexing";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_shader_viewport_index_layer.html">khronos documentation</a>
     **/
    public static final long VK_EXT_shader_viewport_index_layer = getVkExtShaderViewportIndexLayer();
    private static native long getVkExtShaderViewportIndexLayer();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_SHADER_VIEWPORT_INDEX_LAYER_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_SHADER_VIEWPORT_INDEX_LAYER_SPEC_VERSION = getVkExtShaderViewportIndexLayerSpecVersion();
    private static native long getVkExtShaderViewportIndexLayerSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_SHADER_VIEWPORT_INDEX_LAYER_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_SHADER_VIEWPORT_INDEX_LAYER_EXTENSION_NAME = "VK_EXT_shader_viewport_index_layer";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_global_priority.html">khronos documentation</a>
     **/
    public static final long VK_EXT_global_priority = getVkExtGlobalPriority();
    private static native long getVkExtGlobalPriority();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_GLOBAL_PRIORITY_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_GLOBAL_PRIORITY_SPEC_VERSION = getVkExtGlobalPrioritySpecVersion();
    private static native long getVkExtGlobalPrioritySpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_GLOBAL_PRIORITY_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_GLOBAL_PRIORITY_EXTENSION_NAME = "VK_EXT_global_priority";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_external_memory_host.html">khronos documentation</a>
     **/
    public static final long VK_EXT_external_memory_host = getVkExtExternalMemoryHost();
    private static native long getVkExtExternalMemoryHost();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_EXTERNAL_MEMORY_HOST_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_EXTERNAL_MEMORY_HOST_SPEC_VERSION = getVkExtExternalMemoryHostSpecVersion();
    private static native long getVkExtExternalMemoryHostSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_EXTERNAL_MEMORY_HOST_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_EXTERNAL_MEMORY_HOST_EXTENSION_NAME = "VK_EXT_external_memory_host";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_buffer_marker.html">khronos documentation</a>
     **/
    public static final long VK_AMD_buffer_marker = getVkAmdBufferMarker();
    private static native long getVkAmdBufferMarker();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_BUFFER_MARKER_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_BUFFER_MARKER_SPEC_VERSION = getVkAmdBufferMarkerSpecVersion();
    private static native long getVkAmdBufferMarkerSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_BUFFER_MARKER_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_BUFFER_MARKER_EXTENSION_NAME = "VK_AMD_buffer_marker";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_shader_core_properties.html">khronos documentation</a>
     **/
    public static final long VK_AMD_shader_core_properties = getVkAmdShaderCoreProperties();
    private static native long getVkAmdShaderCoreProperties();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_SHADER_CORE_PROPERTIES_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_AMD_SHADER_CORE_PROPERTIES_SPEC_VERSION = getVkAmdShaderCorePropertiesSpecVersion();
    private static native long getVkAmdShaderCorePropertiesSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_AMD_SHADER_CORE_PROPERTIES_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_AMD_SHADER_CORE_PROPERTIES_EXTENSION_NAME = "VK_AMD_shader_core_properties";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_vertex_attribute_divisor.html">khronos documentation</a>
     **/
    public static final long VK_EXT_vertex_attribute_divisor = getVkExtVertexAttributeDivisor();
    private static native long getVkExtVertexAttributeDivisor();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_VERTEX_ATTRIBUTE_DIVISOR_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_EXT_VERTEX_ATTRIBUTE_DIVISOR_SPEC_VERSION = getVkExtVertexAttributeDivisorSpecVersion();
    private static native long getVkExtVertexAttributeDivisorSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_EXT_VERTEX_ATTRIBUTE_DIVISOR_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_EXT_VERTEX_ATTRIBUTE_DIVISOR_EXTENSION_NAME = "VK_EXT_vertex_attribute_divisor";

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_shader_subgroup_partitioned.html">khronos documentation</a>
     **/
    public static final long VK_NV_shader_subgroup_partitioned = getVkNvShaderSubgroupPartitioned();
    private static native long getVkNvShaderSubgroupPartitioned();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_SHADER_SUBGROUP_PARTITIONED_SPEC_VERSION.html">khronos documentation</a>
     **/
    public static final long VK_NV_SHADER_SUBGROUP_PARTITIONED_SPEC_VERSION = getVkNvShaderSubgroupPartitionedSpecVersion();
    private static native long getVkNvShaderSubgroupPartitionedSpecVersion();

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_NV_SHADER_SUBGROUP_PARTITIONED_EXTENSION_NAME.html">khronos documentation</a>
     **/
    public static final String VK_NV_SHADER_SUBGROUP_PARTITIONED_EXTENSION_NAME = "VK_NV_shader_subgroup_partitioned";

    private PFNvkVoidFunction PFN_vkVoidFunction_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkVoidFunction.html">khronos documentation</a>
     **/
    public void vkVoidFunction(){
        if(PFN_vkVoidFunction_p == null) PFN_vkVoidFunction_p = new PFNvkVoidFunction(instance);
        PFN_vkVoidFunction_p.call();
    }


    private PFNvkCreateInstance PFN_vkCreateInstance_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateInstance.html">khronos documentation</a>
     **/
    public void vkCreateInstance(VkInstanceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkInstance pInstance, VkResult rval){
        if(PFN_vkCreateInstance_p == null) PFN_vkCreateInstance_p = new PFNvkCreateInstance(instance);
        PFN_vkCreateInstance_p.call(pCreateInfo, pAllocator, pInstance, rval);
    }


    private PFNvkDestroyInstance PFN_vkDestroyInstance_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyInstance.html">khronos documentation</a>
     **/
    public void vkDestroyInstance(VkInstance instance, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyInstance_p == null) PFN_vkDestroyInstance_p = new PFNvkDestroyInstance(instance);
        PFN_vkDestroyInstance_p.call(instance, pAllocator);
    }


    private PFNvkEnumeratePhysicalDevices PFN_vkEnumeratePhysicalDevices_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkEnumeratePhysicalDevices.html">khronos documentation</a>
     **/
    public void vkEnumeratePhysicalDevices(VkInstance instance, VkUInt32 pPhysicalDeviceCount, VkPhysicalDevice pPhysicalDevices, VkResult rval){
        if(PFN_vkEnumeratePhysicalDevices_p == null) PFN_vkEnumeratePhysicalDevices_p = new PFNvkEnumeratePhysicalDevices(instance);
        PFN_vkEnumeratePhysicalDevices_p.call(instance, pPhysicalDeviceCount, pPhysicalDevices, rval);
    }


    private PFNvkGetPhysicalDeviceFeatures PFN_vkGetPhysicalDeviceFeatures_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceFeatures.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures pFeatures){
        if(PFN_vkGetPhysicalDeviceFeatures_p == null) PFN_vkGetPhysicalDeviceFeatures_p = new PFNvkGetPhysicalDeviceFeatures(instance);
        PFN_vkGetPhysicalDeviceFeatures_p.call(physicalDevice, pFeatures);
    }


    private PFNvkGetPhysicalDeviceFormatProperties PFN_vkGetPhysicalDeviceFormatProperties_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceFormatProperties.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties pFormatProperties){
        if(PFN_vkGetPhysicalDeviceFormatProperties_p == null) PFN_vkGetPhysicalDeviceFormatProperties_p = new PFNvkGetPhysicalDeviceFormatProperties(instance);
        PFN_vkGetPhysicalDeviceFormatProperties_p.call(physicalDevice, format, pFormatProperties);
    }


    private PFNvkGetPhysicalDeviceImageFormatProperties PFN_vkGetPhysicalDeviceImageFormatProperties_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceImageFormatProperties.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags, VkImageFormatProperties pImageFormatProperties, VkResult rval){
        if(PFN_vkGetPhysicalDeviceImageFormatProperties_p == null) PFN_vkGetPhysicalDeviceImageFormatProperties_p = new PFNvkGetPhysicalDeviceImageFormatProperties(instance);
        PFN_vkGetPhysicalDeviceImageFormatProperties_p.call(physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties, rval);
    }


    private PFNvkGetPhysicalDeviceProperties PFN_vkGetPhysicalDeviceProperties_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceProperties.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties pProperties){
        if(PFN_vkGetPhysicalDeviceProperties_p == null) PFN_vkGetPhysicalDeviceProperties_p = new PFNvkGetPhysicalDeviceProperties(instance);
        PFN_vkGetPhysicalDeviceProperties_p.call(physicalDevice, pProperties);
    }


    private PFNvkGetPhysicalDeviceQueueFamilyProperties PFN_vkGetPhysicalDeviceQueueFamilyProperties_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceQueueFamilyProperties.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, VkUInt32 pQueueFamilyPropertyCount, VkQueueFamilyProperties pQueueFamilyProperties){
        if(PFN_vkGetPhysicalDeviceQueueFamilyProperties_p == null) PFN_vkGetPhysicalDeviceQueueFamilyProperties_p = new PFNvkGetPhysicalDeviceQueueFamilyProperties(instance);
        PFN_vkGetPhysicalDeviceQueueFamilyProperties_p.call(physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties);
    }


    private PFNvkGetPhysicalDeviceMemoryProperties PFN_vkGetPhysicalDeviceMemoryProperties_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceMemoryProperties.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties pMemoryProperties){
        if(PFN_vkGetPhysicalDeviceMemoryProperties_p == null) PFN_vkGetPhysicalDeviceMemoryProperties_p = new PFNvkGetPhysicalDeviceMemoryProperties(instance);
        PFN_vkGetPhysicalDeviceMemoryProperties_p.call(physicalDevice, pMemoryProperties);
    }


    private PFNvkGetInstanceProcAddr PFN_vkGetInstanceProcAddr_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetInstanceProcAddr.html">khronos documentation</a>
     **/
    public void vkGetInstanceProcAddr(VkInstance instance, VkChar pName, PFNvkVoidFunction rval){
        if(PFN_vkGetInstanceProcAddr_p == null) PFN_vkGetInstanceProcAddr_p = new PFNvkGetInstanceProcAddr(instance);
        PFN_vkGetInstanceProcAddr_p.call(instance, pName, rval);
    }


    private PFNvkGetDeviceProcAddr PFN_vkGetDeviceProcAddr_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDeviceProcAddr.html">khronos documentation</a>
     **/
    public void vkGetDeviceProcAddr(VkDevice device, VkChar pName, PFNvkVoidFunction rval){
        if(PFN_vkGetDeviceProcAddr_p == null) PFN_vkGetDeviceProcAddr_p = new PFNvkGetDeviceProcAddr(instance);
        PFN_vkGetDeviceProcAddr_p.call(device, pName, rval);
    }


    private PFNvkCreateDevice PFN_vkCreateDevice_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateDevice.html">khronos documentation</a>
     **/
    public void vkCreateDevice(VkPhysicalDevice physicalDevice, VkDeviceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDevice pDevice, VkResult rval){
        if(PFN_vkCreateDevice_p == null) PFN_vkCreateDevice_p = new PFNvkCreateDevice(instance);
        PFN_vkCreateDevice_p.call(physicalDevice, pCreateInfo, pAllocator, pDevice, rval);
    }


    private PFNvkDestroyDevice PFN_vkDestroyDevice_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyDevice.html">khronos documentation</a>
     **/
    public void vkDestroyDevice(VkDevice device, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyDevice_p == null) PFN_vkDestroyDevice_p = new PFNvkDestroyDevice(instance);
        PFN_vkDestroyDevice_p.call(device, pAllocator);
    }


    private PFNvkEnumerateInstanceExtensionProperties PFN_vkEnumerateInstanceExtensionProperties_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkEnumerateInstanceExtensionProperties.html">khronos documentation</a>
     **/
    public void vkEnumerateInstanceExtensionProperties(VkChar pLayerName, VkUInt32 pPropertyCount, VkExtensionProperties pProperties, VkResult rval){
        if(PFN_vkEnumerateInstanceExtensionProperties_p == null) PFN_vkEnumerateInstanceExtensionProperties_p = new PFNvkEnumerateInstanceExtensionProperties(instance);
        PFN_vkEnumerateInstanceExtensionProperties_p.call(pLayerName, pPropertyCount, pProperties, rval);
    }


    private PFNvkEnumerateDeviceExtensionProperties PFN_vkEnumerateDeviceExtensionProperties_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkEnumerateDeviceExtensionProperties.html">khronos documentation</a>
     **/
    public void vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, VkChar pLayerName, VkUInt32 pPropertyCount, VkExtensionProperties pProperties, VkResult rval){
        if(PFN_vkEnumerateDeviceExtensionProperties_p == null) PFN_vkEnumerateDeviceExtensionProperties_p = new PFNvkEnumerateDeviceExtensionProperties(instance);
        PFN_vkEnumerateDeviceExtensionProperties_p.call(physicalDevice, pLayerName, pPropertyCount, pProperties, rval);
    }


    private PFNvkEnumerateInstanceLayerProperties PFN_vkEnumerateInstanceLayerProperties_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkEnumerateInstanceLayerProperties.html">khronos documentation</a>
     **/
    public void vkEnumerateInstanceLayerProperties(VkUInt32 pPropertyCount, VkLayerProperties pProperties, VkResult rval){
        if(PFN_vkEnumerateInstanceLayerProperties_p == null) PFN_vkEnumerateInstanceLayerProperties_p = new PFNvkEnumerateInstanceLayerProperties(instance);
        PFN_vkEnumerateInstanceLayerProperties_p.call(pPropertyCount, pProperties, rval);
    }


    private PFNvkEnumerateDeviceLayerProperties PFN_vkEnumerateDeviceLayerProperties_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkEnumerateDeviceLayerProperties.html">khronos documentation</a>
     **/
    public void vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkLayerProperties pProperties, VkResult rval){
        if(PFN_vkEnumerateDeviceLayerProperties_p == null) PFN_vkEnumerateDeviceLayerProperties_p = new PFNvkEnumerateDeviceLayerProperties(instance);
        PFN_vkEnumerateDeviceLayerProperties_p.call(physicalDevice, pPropertyCount, pProperties, rval);
    }


    private PFNvkGetDeviceQueue PFN_vkGetDeviceQueue_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDeviceQueue.html">khronos documentation</a>
     **/
    public void vkGetDeviceQueue(VkDevice device, VkUInt32 queueFamilyIndex, VkUInt32 queueIndex, VkQueue pQueue){
        if(PFN_vkGetDeviceQueue_p == null) PFN_vkGetDeviceQueue_p = new PFNvkGetDeviceQueue(instance);
        PFN_vkGetDeviceQueue_p.call(device, queueFamilyIndex, queueIndex, pQueue);
    }


    private PFNvkQueueSubmit PFN_vkQueueSubmit_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkQueueSubmit.html">khronos documentation</a>
     **/
    public void vkQueueSubmit(VkQueue queue, VkUInt32 submitCount, VkSubmitInfo pSubmits, VkFence fence, VkResult rval){
        if(PFN_vkQueueSubmit_p == null) PFN_vkQueueSubmit_p = new PFNvkQueueSubmit(instance);
        PFN_vkQueueSubmit_p.call(queue, submitCount, pSubmits, fence, rval);
    }


    private PFNvkQueueWaitIdle PFN_vkQueueWaitIdle_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkQueueWaitIdle.html">khronos documentation</a>
     **/
    public void vkQueueWaitIdle(VkQueue queue, VkResult rval){
        if(PFN_vkQueueWaitIdle_p == null) PFN_vkQueueWaitIdle_p = new PFNvkQueueWaitIdle(instance);
        PFN_vkQueueWaitIdle_p.call(queue, rval);
    }


    private PFNvkDeviceWaitIdle PFN_vkDeviceWaitIdle_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDeviceWaitIdle.html">khronos documentation</a>
     **/
    public void vkDeviceWaitIdle(VkDevice device, VkResult rval){
        if(PFN_vkDeviceWaitIdle_p == null) PFN_vkDeviceWaitIdle_p = new PFNvkDeviceWaitIdle(instance);
        PFN_vkDeviceWaitIdle_p.call(device, rval);
    }


    private PFNvkAllocateMemory PFN_vkAllocateMemory_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkAllocateMemory.html">khronos documentation</a>
     **/
    public void vkAllocateMemory(VkDevice device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, VkDeviceMemory pMemory, VkResult rval){
        if(PFN_vkAllocateMemory_p == null) PFN_vkAllocateMemory_p = new PFNvkAllocateMemory(instance);
        PFN_vkAllocateMemory_p.call(device, pAllocateInfo, pAllocator, pMemory, rval);
    }


    private PFNvkFreeMemory PFN_vkFreeMemory_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkFreeMemory.html">khronos documentation</a>
     **/
    public void vkFreeMemory(VkDevice device, VkDeviceMemory memory, VkAllocationCallbacks pAllocator){
        if(PFN_vkFreeMemory_p == null) PFN_vkFreeMemory_p = new PFNvkFreeMemory(instance);
        PFN_vkFreeMemory_p.call(device, memory, pAllocator);
    }


    private PFNvkMapMemory PFN_vkMapMemory_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkMapMemory.html">khronos documentation</a>
     **/
    public void vkMapMemory(VkDevice device, VkDeviceMemory memory, VkDeviceSize offset, VkDeviceSize size, VkMemoryMapFlags flags, VkObject.Pointer ppData, VkResult rval){
        if(PFN_vkMapMemory_p == null) PFN_vkMapMemory_p = new PFNvkMapMemory(instance);
        PFN_vkMapMemory_p.call(device, memory, offset, size, flags, ppData, rval);
    }


    private PFNvkUnmapMemory PFN_vkUnmapMemory_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkUnmapMemory.html">khronos documentation</a>
     **/
    public void vkUnmapMemory(VkDevice device, VkDeviceMemory memory){
        if(PFN_vkUnmapMemory_p == null) PFN_vkUnmapMemory_p = new PFNvkUnmapMemory(instance);
        PFN_vkUnmapMemory_p.call(device, memory);
    }


    private PFNvkFlushMappedMemoryRanges PFN_vkFlushMappedMemoryRanges_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkFlushMappedMemoryRanges.html">khronos documentation</a>
     **/
    public void vkFlushMappedMemoryRanges(VkDevice device, VkUInt32 memoryRangeCount, VkMappedMemoryRange pMemoryRanges, VkResult rval){
        if(PFN_vkFlushMappedMemoryRanges_p == null) PFN_vkFlushMappedMemoryRanges_p = new PFNvkFlushMappedMemoryRanges(instance);
        PFN_vkFlushMappedMemoryRanges_p.call(device, memoryRangeCount, pMemoryRanges, rval);
    }


    private PFNvkInvalidateMappedMemoryRanges PFN_vkInvalidateMappedMemoryRanges_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkInvalidateMappedMemoryRanges.html">khronos documentation</a>
     **/
    public void vkInvalidateMappedMemoryRanges(VkDevice device, VkUInt32 memoryRangeCount, VkMappedMemoryRange pMemoryRanges, VkResult rval){
        if(PFN_vkInvalidateMappedMemoryRanges_p == null) PFN_vkInvalidateMappedMemoryRanges_p = new PFNvkInvalidateMappedMemoryRanges(instance);
        PFN_vkInvalidateMappedMemoryRanges_p.call(device, memoryRangeCount, pMemoryRanges, rval);
    }


    private PFNvkGetDeviceMemoryCommitment PFN_vkGetDeviceMemoryCommitment_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDeviceMemoryCommitment.html">khronos documentation</a>
     **/
    public void vkGetDeviceMemoryCommitment(VkDevice device, VkDeviceMemory memory, VkDeviceSize pCommittedMemoryInBytes){
        if(PFN_vkGetDeviceMemoryCommitment_p == null) PFN_vkGetDeviceMemoryCommitment_p = new PFNvkGetDeviceMemoryCommitment(instance);
        PFN_vkGetDeviceMemoryCommitment_p.call(device, memory, pCommittedMemoryInBytes);
    }


    private PFNvkBindBufferMemory PFN_vkBindBufferMemory_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkBindBufferMemory.html">khronos documentation</a>
     **/
    public void vkBindBufferMemory(VkDevice device, VkBuffer buffer, VkDeviceMemory memory, VkDeviceSize memoryOffset, VkResult rval){
        if(PFN_vkBindBufferMemory_p == null) PFN_vkBindBufferMemory_p = new PFNvkBindBufferMemory(instance);
        PFN_vkBindBufferMemory_p.call(device, buffer, memory, memoryOffset, rval);
    }


    private PFNvkBindImageMemory PFN_vkBindImageMemory_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkBindImageMemory.html">khronos documentation</a>
     **/
    public void vkBindImageMemory(VkDevice device, VkImage image, VkDeviceMemory memory, VkDeviceSize memoryOffset, VkResult rval){
        if(PFN_vkBindImageMemory_p == null) PFN_vkBindImageMemory_p = new PFNvkBindImageMemory(instance);
        PFN_vkBindImageMemory_p.call(device, image, memory, memoryOffset, rval);
    }


    private PFNvkGetBufferMemoryRequirements PFN_vkGetBufferMemoryRequirements_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetBufferMemoryRequirements.html">khronos documentation</a>
     **/
    public void vkGetBufferMemoryRequirements(VkDevice device, VkBuffer buffer, VkMemoryRequirements pMemoryRequirements){
        if(PFN_vkGetBufferMemoryRequirements_p == null) PFN_vkGetBufferMemoryRequirements_p = new PFNvkGetBufferMemoryRequirements(instance);
        PFN_vkGetBufferMemoryRequirements_p.call(device, buffer, pMemoryRequirements);
    }


    private PFNvkGetImageMemoryRequirements PFN_vkGetImageMemoryRequirements_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetImageMemoryRequirements.html">khronos documentation</a>
     **/
    public void vkGetImageMemoryRequirements(VkDevice device, VkImage image, VkMemoryRequirements pMemoryRequirements){
        if(PFN_vkGetImageMemoryRequirements_p == null) PFN_vkGetImageMemoryRequirements_p = new PFNvkGetImageMemoryRequirements(instance);
        PFN_vkGetImageMemoryRequirements_p.call(device, image, pMemoryRequirements);
    }


    private PFNvkGetImageSparseMemoryRequirements PFN_vkGetImageSparseMemoryRequirements_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetImageSparseMemoryRequirements.html">khronos documentation</a>
     **/
    public void vkGetImageSparseMemoryRequirements(VkDevice device, VkImage image, VkUInt32 pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements pSparseMemoryRequirements){
        if(PFN_vkGetImageSparseMemoryRequirements_p == null) PFN_vkGetImageSparseMemoryRequirements_p = new PFNvkGetImageSparseMemoryRequirements(instance);
        PFN_vkGetImageSparseMemoryRequirements_p.call(device, image, pSparseMemoryRequirementCount, pSparseMemoryRequirements);
    }


    private PFNvkGetPhysicalDeviceSparseImageFormatProperties PFN_vkGetPhysicalDeviceSparseImageFormatProperties_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSparseImageFormatProperties.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkSampleCountFlagBits samples, VkImageUsageFlags usage, VkImageTiling tiling, VkUInt32 pPropertyCount, VkSparseImageFormatProperties pProperties){
        if(PFN_vkGetPhysicalDeviceSparseImageFormatProperties_p == null) PFN_vkGetPhysicalDeviceSparseImageFormatProperties_p = new PFNvkGetPhysicalDeviceSparseImageFormatProperties(instance);
        PFN_vkGetPhysicalDeviceSparseImageFormatProperties_p.call(physicalDevice, format, type, samples, usage, tiling, pPropertyCount, pProperties);
    }


    private PFNvkQueueBindSparse PFN_vkQueueBindSparse_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkQueueBindSparse.html">khronos documentation</a>
     **/
    public void vkQueueBindSparse(VkQueue queue, VkUInt32 bindInfoCount, VkBindSparseInfo pBindInfo, VkFence fence, VkResult rval){
        if(PFN_vkQueueBindSparse_p == null) PFN_vkQueueBindSparse_p = new PFNvkQueueBindSparse(instance);
        PFN_vkQueueBindSparse_p.call(queue, bindInfoCount, pBindInfo, fence, rval);
    }


    private PFNvkCreateFence PFN_vkCreateFence_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateFence.html">khronos documentation</a>
     **/
    public void vkCreateFence(VkDevice device, VkFenceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkFence pFence, VkResult rval){
        if(PFN_vkCreateFence_p == null) PFN_vkCreateFence_p = new PFNvkCreateFence(instance);
        PFN_vkCreateFence_p.call(device, pCreateInfo, pAllocator, pFence, rval);
    }


    private PFNvkDestroyFence PFN_vkDestroyFence_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyFence.html">khronos documentation</a>
     **/
    public void vkDestroyFence(VkDevice device, VkFence fence, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyFence_p == null) PFN_vkDestroyFence_p = new PFNvkDestroyFence(instance);
        PFN_vkDestroyFence_p.call(device, fence, pAllocator);
    }


    private PFNvkResetFences PFN_vkResetFences_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkResetFences.html">khronos documentation</a>
     **/
    public void vkResetFences(VkDevice device, VkUInt32 fenceCount, VkFence pFences, VkResult rval){
        if(PFN_vkResetFences_p == null) PFN_vkResetFences_p = new PFNvkResetFences(instance);
        PFN_vkResetFences_p.call(device, fenceCount, pFences, rval);
    }


    private PFNvkGetFenceStatus PFN_vkGetFenceStatus_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetFenceStatus.html">khronos documentation</a>
     **/
    public void vkGetFenceStatus(VkDevice device, VkFence fence, VkResult rval){
        if(PFN_vkGetFenceStatus_p == null) PFN_vkGetFenceStatus_p = new PFNvkGetFenceStatus(instance);
        PFN_vkGetFenceStatus_p.call(device, fence, rval);
    }


    private PFNvkWaitForFences PFN_vkWaitForFences_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkWaitForFences.html">khronos documentation</a>
     **/
    public void vkWaitForFences(VkDevice device, VkUInt32 fenceCount, VkFence pFences, VkBool32 waitAll, VkUInt64 timeout, VkResult rval){
        if(PFN_vkWaitForFences_p == null) PFN_vkWaitForFences_p = new PFNvkWaitForFences(instance);
        PFN_vkWaitForFences_p.call(device, fenceCount, pFences, waitAll, timeout, rval);
    }


    private PFNvkCreateSemaphore PFN_vkCreateSemaphore_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateSemaphore.html">khronos documentation</a>
     **/
    public void vkCreateSemaphore(VkDevice device, VkSemaphoreCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSemaphore pSemaphore, VkResult rval){
        if(PFN_vkCreateSemaphore_p == null) PFN_vkCreateSemaphore_p = new PFNvkCreateSemaphore(instance);
        PFN_vkCreateSemaphore_p.call(device, pCreateInfo, pAllocator, pSemaphore, rval);
    }


    private PFNvkDestroySemaphore PFN_vkDestroySemaphore_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroySemaphore.html">khronos documentation</a>
     **/
    public void vkDestroySemaphore(VkDevice device, VkSemaphore semaphore, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroySemaphore_p == null) PFN_vkDestroySemaphore_p = new PFNvkDestroySemaphore(instance);
        PFN_vkDestroySemaphore_p.call(device, semaphore, pAllocator);
    }


    private PFNvkCreateEvent PFN_vkCreateEvent_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateEvent.html">khronos documentation</a>
     **/
    public void vkCreateEvent(VkDevice device, VkEventCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkEvent pEvent, VkResult rval){
        if(PFN_vkCreateEvent_p == null) PFN_vkCreateEvent_p = new PFNvkCreateEvent(instance);
        PFN_vkCreateEvent_p.call(device, pCreateInfo, pAllocator, pEvent, rval);
    }


    private PFNvkDestroyEvent PFN_vkDestroyEvent_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyEvent.html">khronos documentation</a>
     **/
    public void vkDestroyEvent(VkDevice device, VkEvent event, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyEvent_p == null) PFN_vkDestroyEvent_p = new PFNvkDestroyEvent(instance);
        PFN_vkDestroyEvent_p.call(device, event, pAllocator);
    }


    private PFNvkGetEventStatus PFN_vkGetEventStatus_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetEventStatus.html">khronos documentation</a>
     **/
    public void vkGetEventStatus(VkDevice device, VkEvent event, VkResult rval){
        if(PFN_vkGetEventStatus_p == null) PFN_vkGetEventStatus_p = new PFNvkGetEventStatus(instance);
        PFN_vkGetEventStatus_p.call(device, event, rval);
    }


    private PFNvkSetEvent PFN_vkSetEvent_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkSetEvent.html">khronos documentation</a>
     **/
    public void vkSetEvent(VkDevice device, VkEvent event, VkResult rval){
        if(PFN_vkSetEvent_p == null) PFN_vkSetEvent_p = new PFNvkSetEvent(instance);
        PFN_vkSetEvent_p.call(device, event, rval);
    }


    private PFNvkResetEvent PFN_vkResetEvent_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkResetEvent.html">khronos documentation</a>
     **/
    public void vkResetEvent(VkDevice device, VkEvent event, VkResult rval){
        if(PFN_vkResetEvent_p == null) PFN_vkResetEvent_p = new PFNvkResetEvent(instance);
        PFN_vkResetEvent_p.call(device, event, rval);
    }


    private PFNvkCreateQueryPool PFN_vkCreateQueryPool_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateQueryPool.html">khronos documentation</a>
     **/
    public void vkCreateQueryPool(VkDevice device, VkQueryPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkQueryPool pQueryPool, VkResult rval){
        if(PFN_vkCreateQueryPool_p == null) PFN_vkCreateQueryPool_p = new PFNvkCreateQueryPool(instance);
        PFN_vkCreateQueryPool_p.call(device, pCreateInfo, pAllocator, pQueryPool, rval);
    }


    private PFNvkDestroyQueryPool PFN_vkDestroyQueryPool_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyQueryPool.html">khronos documentation</a>
     **/
    public void vkDestroyQueryPool(VkDevice device, VkQueryPool queryPool, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyQueryPool_p == null) PFN_vkDestroyQueryPool_p = new PFNvkDestroyQueryPool(instance);
        PFN_vkDestroyQueryPool_p.call(device, queryPool, pAllocator);
    }


    private PFNvkGetQueryPoolResults PFN_vkGetQueryPoolResults_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetQueryPoolResults.html">khronos documentation</a>
     **/
    public void vkGetQueryPoolResults(VkDevice device, VkQueryPool queryPool, VkUInt32 firstQuery, VkUInt32 queryCount, VkSize dataSize, VkObject pData, VkDeviceSize stride, VkQueryResultFlags flags, VkResult rval){
        if(PFN_vkGetQueryPoolResults_p == null) PFN_vkGetQueryPoolResults_p = new PFNvkGetQueryPoolResults(instance);
        PFN_vkGetQueryPoolResults_p.call(device, queryPool, firstQuery, queryCount, dataSize, pData, stride, flags, rval);
    }


    private PFNvkCreateBuffer PFN_vkCreateBuffer_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateBuffer.html">khronos documentation</a>
     **/
    public void vkCreateBuffer(VkDevice device, VkBufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkBuffer pBuffer, VkResult rval){
        if(PFN_vkCreateBuffer_p == null) PFN_vkCreateBuffer_p = new PFNvkCreateBuffer(instance);
        PFN_vkCreateBuffer_p.call(device, pCreateInfo, pAllocator, pBuffer, rval);
    }


    private PFNvkDestroyBuffer PFN_vkDestroyBuffer_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyBuffer.html">khronos documentation</a>
     **/
    public void vkDestroyBuffer(VkDevice device, VkBuffer buffer, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyBuffer_p == null) PFN_vkDestroyBuffer_p = new PFNvkDestroyBuffer(instance);
        PFN_vkDestroyBuffer_p.call(device, buffer, pAllocator);
    }


    private PFNvkCreateBufferView PFN_vkCreateBufferView_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateBufferView.html">khronos documentation</a>
     **/
    public void vkCreateBufferView(VkDevice device, VkBufferViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkBufferView pView, VkResult rval){
        if(PFN_vkCreateBufferView_p == null) PFN_vkCreateBufferView_p = new PFNvkCreateBufferView(instance);
        PFN_vkCreateBufferView_p.call(device, pCreateInfo, pAllocator, pView, rval);
    }


    private PFNvkDestroyBufferView PFN_vkDestroyBufferView_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyBufferView.html">khronos documentation</a>
     **/
    public void vkDestroyBufferView(VkDevice device, VkBufferView bufferView, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyBufferView_p == null) PFN_vkDestroyBufferView_p = new PFNvkDestroyBufferView(instance);
        PFN_vkDestroyBufferView_p.call(device, bufferView, pAllocator);
    }


    private PFNvkCreateImage PFN_vkCreateImage_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateImage.html">khronos documentation</a>
     **/
    public void vkCreateImage(VkDevice device, VkImageCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkImage pImage, VkResult rval){
        if(PFN_vkCreateImage_p == null) PFN_vkCreateImage_p = new PFNvkCreateImage(instance);
        PFN_vkCreateImage_p.call(device, pCreateInfo, pAllocator, pImage, rval);
    }


    private PFNvkDestroyImage PFN_vkDestroyImage_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyImage.html">khronos documentation</a>
     **/
    public void vkDestroyImage(VkDevice device, VkImage image, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyImage_p == null) PFN_vkDestroyImage_p = new PFNvkDestroyImage(instance);
        PFN_vkDestroyImage_p.call(device, image, pAllocator);
    }


    private PFNvkGetImageSubresourceLayout PFN_vkGetImageSubresourceLayout_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetImageSubresourceLayout.html">khronos documentation</a>
     **/
    public void vkGetImageSubresourceLayout(VkDevice device, VkImage image, VkImageSubresource pSubresource, VkSubresourceLayout pLayout){
        if(PFN_vkGetImageSubresourceLayout_p == null) PFN_vkGetImageSubresourceLayout_p = new PFNvkGetImageSubresourceLayout(instance);
        PFN_vkGetImageSubresourceLayout_p.call(device, image, pSubresource, pLayout);
    }


    private PFNvkCreateImageView PFN_vkCreateImageView_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateImageView.html">khronos documentation</a>
     **/
    public void vkCreateImageView(VkDevice device, VkImageViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkImageView pView, VkResult rval){
        if(PFN_vkCreateImageView_p == null) PFN_vkCreateImageView_p = new PFNvkCreateImageView(instance);
        PFN_vkCreateImageView_p.call(device, pCreateInfo, pAllocator, pView, rval);
    }


    private PFNvkDestroyImageView PFN_vkDestroyImageView_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyImageView.html">khronos documentation</a>
     **/
    public void vkDestroyImageView(VkDevice device, VkImageView imageView, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyImageView_p == null) PFN_vkDestroyImageView_p = new PFNvkDestroyImageView(instance);
        PFN_vkDestroyImageView_p.call(device, imageView, pAllocator);
    }


    private PFNvkCreateShaderModule PFN_vkCreateShaderModule_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateShaderModule.html">khronos documentation</a>
     **/
    public void vkCreateShaderModule(VkDevice device, VkShaderModuleCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkShaderModule pShaderModule, VkResult rval){
        if(PFN_vkCreateShaderModule_p == null) PFN_vkCreateShaderModule_p = new PFNvkCreateShaderModule(instance);
        PFN_vkCreateShaderModule_p.call(device, pCreateInfo, pAllocator, pShaderModule, rval);
    }


    private PFNvkDestroyShaderModule PFN_vkDestroyShaderModule_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyShaderModule.html">khronos documentation</a>
     **/
    public void vkDestroyShaderModule(VkDevice device, VkShaderModule shaderModule, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyShaderModule_p == null) PFN_vkDestroyShaderModule_p = new PFNvkDestroyShaderModule(instance);
        PFN_vkDestroyShaderModule_p.call(device, shaderModule, pAllocator);
    }


    private PFNvkCreatePipelineCache PFN_vkCreatePipelineCache_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreatePipelineCache.html">khronos documentation</a>
     **/
    public void vkCreatePipelineCache(VkDevice device, VkPipelineCacheCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkPipelineCache pPipelineCache, VkResult rval){
        if(PFN_vkCreatePipelineCache_p == null) PFN_vkCreatePipelineCache_p = new PFNvkCreatePipelineCache(instance);
        PFN_vkCreatePipelineCache_p.call(device, pCreateInfo, pAllocator, pPipelineCache, rval);
    }


    private PFNvkDestroyPipelineCache PFN_vkDestroyPipelineCache_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyPipelineCache.html">khronos documentation</a>
     **/
    public void vkDestroyPipelineCache(VkDevice device, VkPipelineCache pipelineCache, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyPipelineCache_p == null) PFN_vkDestroyPipelineCache_p = new PFNvkDestroyPipelineCache(instance);
        PFN_vkDestroyPipelineCache_p.call(device, pipelineCache, pAllocator);
    }


    private PFNvkGetPipelineCacheData PFN_vkGetPipelineCacheData_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPipelineCacheData.html">khronos documentation</a>
     **/
    public void vkGetPipelineCacheData(VkDevice device, VkPipelineCache pipelineCache, VkSize pDataSize, VkObject pData, VkResult rval){
        if(PFN_vkGetPipelineCacheData_p == null) PFN_vkGetPipelineCacheData_p = new PFNvkGetPipelineCacheData(instance);
        PFN_vkGetPipelineCacheData_p.call(device, pipelineCache, pDataSize, pData, rval);
    }


    private PFNvkMergePipelineCaches PFN_vkMergePipelineCaches_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkMergePipelineCaches.html">khronos documentation</a>
     **/
    public void vkMergePipelineCaches(VkDevice device, VkPipelineCache dstCache, VkUInt32 srcCacheCount, VkPipelineCache pSrcCaches, VkResult rval){
        if(PFN_vkMergePipelineCaches_p == null) PFN_vkMergePipelineCaches_p = new PFNvkMergePipelineCaches(instance);
        PFN_vkMergePipelineCaches_p.call(device, dstCache, srcCacheCount, pSrcCaches, rval);
    }


    private PFNvkCreateGraphicsPipelines PFN_vkCreateGraphicsPipelines_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateGraphicsPipelines.html">khronos documentation</a>
     **/
    public void vkCreateGraphicsPipelines(VkDevice device, VkPipelineCache pipelineCache, VkUInt32 createInfoCount, VkGraphicsPipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, VkPipeline pPipelines, VkResult rval){
        if(PFN_vkCreateGraphicsPipelines_p == null) PFN_vkCreateGraphicsPipelines_p = new PFNvkCreateGraphicsPipelines(instance);
        PFN_vkCreateGraphicsPipelines_p.call(device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, rval);
    }


    private PFNvkCreateComputePipelines PFN_vkCreateComputePipelines_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateComputePipelines.html">khronos documentation</a>
     **/
    public void vkCreateComputePipelines(VkDevice device, VkPipelineCache pipelineCache, VkUInt32 createInfoCount, VkComputePipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, VkPipeline pPipelines, VkResult rval){
        if(PFN_vkCreateComputePipelines_p == null) PFN_vkCreateComputePipelines_p = new PFNvkCreateComputePipelines(instance);
        PFN_vkCreateComputePipelines_p.call(device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, rval);
    }


    private PFNvkDestroyPipeline PFN_vkDestroyPipeline_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyPipeline.html">khronos documentation</a>
     **/
    public void vkDestroyPipeline(VkDevice device, VkPipeline pipeline, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyPipeline_p == null) PFN_vkDestroyPipeline_p = new PFNvkDestroyPipeline(instance);
        PFN_vkDestroyPipeline_p.call(device, pipeline, pAllocator);
    }


    private PFNvkCreatePipelineLayout PFN_vkCreatePipelineLayout_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreatePipelineLayout.html">khronos documentation</a>
     **/
    public void vkCreatePipelineLayout(VkDevice device, VkPipelineLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkPipelineLayout pPipelineLayout, VkResult rval){
        if(PFN_vkCreatePipelineLayout_p == null) PFN_vkCreatePipelineLayout_p = new PFNvkCreatePipelineLayout(instance);
        PFN_vkCreatePipelineLayout_p.call(device, pCreateInfo, pAllocator, pPipelineLayout, rval);
    }


    private PFNvkDestroyPipelineLayout PFN_vkDestroyPipelineLayout_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyPipelineLayout.html">khronos documentation</a>
     **/
    public void vkDestroyPipelineLayout(VkDevice device, VkPipelineLayout pipelineLayout, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyPipelineLayout_p == null) PFN_vkDestroyPipelineLayout_p = new PFNvkDestroyPipelineLayout(instance);
        PFN_vkDestroyPipelineLayout_p.call(device, pipelineLayout, pAllocator);
    }


    private PFNvkCreateSampler PFN_vkCreateSampler_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateSampler.html">khronos documentation</a>
     **/
    public void vkCreateSampler(VkDevice device, VkSamplerCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSampler pSampler, VkResult rval){
        if(PFN_vkCreateSampler_p == null) PFN_vkCreateSampler_p = new PFNvkCreateSampler(instance);
        PFN_vkCreateSampler_p.call(device, pCreateInfo, pAllocator, pSampler, rval);
    }


    private PFNvkDestroySampler PFN_vkDestroySampler_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroySampler.html">khronos documentation</a>
     **/
    public void vkDestroySampler(VkDevice device, VkSampler sampler, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroySampler_p == null) PFN_vkDestroySampler_p = new PFNvkDestroySampler(instance);
        PFN_vkDestroySampler_p.call(device, sampler, pAllocator);
    }


    private PFNvkCreateDescriptorSetLayout PFN_vkCreateDescriptorSetLayout_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateDescriptorSetLayout.html">khronos documentation</a>
     **/
    public void vkCreateDescriptorSetLayout(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorSetLayout pSetLayout, VkResult rval){
        if(PFN_vkCreateDescriptorSetLayout_p == null) PFN_vkCreateDescriptorSetLayout_p = new PFNvkCreateDescriptorSetLayout(instance);
        PFN_vkCreateDescriptorSetLayout_p.call(device, pCreateInfo, pAllocator, pSetLayout, rval);
    }


    private PFNvkDestroyDescriptorSetLayout PFN_vkDestroyDescriptorSetLayout_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyDescriptorSetLayout.html">khronos documentation</a>
     **/
    public void vkDestroyDescriptorSetLayout(VkDevice device, VkDescriptorSetLayout descriptorSetLayout, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyDescriptorSetLayout_p == null) PFN_vkDestroyDescriptorSetLayout_p = new PFNvkDestroyDescriptorSetLayout(instance);
        PFN_vkDestroyDescriptorSetLayout_p.call(device, descriptorSetLayout, pAllocator);
    }


    private PFNvkCreateDescriptorPool PFN_vkCreateDescriptorPool_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateDescriptorPool.html">khronos documentation</a>
     **/
    public void vkCreateDescriptorPool(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorPool pDescriptorPool, VkResult rval){
        if(PFN_vkCreateDescriptorPool_p == null) PFN_vkCreateDescriptorPool_p = new PFNvkCreateDescriptorPool(instance);
        PFN_vkCreateDescriptorPool_p.call(device, pCreateInfo, pAllocator, pDescriptorPool, rval);
    }


    private PFNvkDestroyDescriptorPool PFN_vkDestroyDescriptorPool_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyDescriptorPool.html">khronos documentation</a>
     **/
    public void vkDestroyDescriptorPool(VkDevice device, VkDescriptorPool descriptorPool, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyDescriptorPool_p == null) PFN_vkDestroyDescriptorPool_p = new PFNvkDestroyDescriptorPool(instance);
        PFN_vkDestroyDescriptorPool_p.call(device, descriptorPool, pAllocator);
    }


    private PFNvkResetDescriptorPool PFN_vkResetDescriptorPool_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkResetDescriptorPool.html">khronos documentation</a>
     **/
    public void vkResetDescriptorPool(VkDevice device, VkDescriptorPool descriptorPool, VkDescriptorPoolResetFlags flags, VkResult rval){
        if(PFN_vkResetDescriptorPool_p == null) PFN_vkResetDescriptorPool_p = new PFNvkResetDescriptorPool(instance);
        PFN_vkResetDescriptorPool_p.call(device, descriptorPool, flags, rval);
    }


    private PFNvkAllocateDescriptorSets PFN_vkAllocateDescriptorSets_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkAllocateDescriptorSets.html">khronos documentation</a>
     **/
    public void vkAllocateDescriptorSets(VkDevice device, VkDescriptorSetAllocateInfo pAllocateInfo, VkDescriptorSet pDescriptorSets, VkResult rval){
        if(PFN_vkAllocateDescriptorSets_p == null) PFN_vkAllocateDescriptorSets_p = new PFNvkAllocateDescriptorSets(instance);
        PFN_vkAllocateDescriptorSets_p.call(device, pAllocateInfo, pDescriptorSets, rval);
    }


    private PFNvkFreeDescriptorSets PFN_vkFreeDescriptorSets_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkFreeDescriptorSets.html">khronos documentation</a>
     **/
    public void vkFreeDescriptorSets(VkDevice device, VkDescriptorPool descriptorPool, VkUInt32 descriptorSetCount, VkDescriptorSet pDescriptorSets, VkResult rval){
        if(PFN_vkFreeDescriptorSets_p == null) PFN_vkFreeDescriptorSets_p = new PFNvkFreeDescriptorSets(instance);
        PFN_vkFreeDescriptorSets_p.call(device, descriptorPool, descriptorSetCount, pDescriptorSets, rval);
    }


    private PFNvkUpdateDescriptorSets PFN_vkUpdateDescriptorSets_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkUpdateDescriptorSets.html">khronos documentation</a>
     **/
    public void vkUpdateDescriptorSets(VkDevice device, VkUInt32 descriptorWriteCount, VkWriteDescriptorSet pDescriptorWrites, VkUInt32 descriptorCopyCount, VkCopyDescriptorSet pDescriptorCopies){
        if(PFN_vkUpdateDescriptorSets_p == null) PFN_vkUpdateDescriptorSets_p = new PFNvkUpdateDescriptorSets(instance);
        PFN_vkUpdateDescriptorSets_p.call(device, descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies);
    }


    private PFNvkCreateFramebuffer PFN_vkCreateFramebuffer_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateFramebuffer.html">khronos documentation</a>
     **/
    public void vkCreateFramebuffer(VkDevice device, VkFramebufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkFramebuffer pFramebuffer, VkResult rval){
        if(PFN_vkCreateFramebuffer_p == null) PFN_vkCreateFramebuffer_p = new PFNvkCreateFramebuffer(instance);
        PFN_vkCreateFramebuffer_p.call(device, pCreateInfo, pAllocator, pFramebuffer, rval);
    }


    private PFNvkDestroyFramebuffer PFN_vkDestroyFramebuffer_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyFramebuffer.html">khronos documentation</a>
     **/
    public void vkDestroyFramebuffer(VkDevice device, VkFramebuffer framebuffer, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyFramebuffer_p == null) PFN_vkDestroyFramebuffer_p = new PFNvkDestroyFramebuffer(instance);
        PFN_vkDestroyFramebuffer_p.call(device, framebuffer, pAllocator);
    }


    private PFNvkCreateRenderPass PFN_vkCreateRenderPass_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateRenderPass.html">khronos documentation</a>
     **/
    public void vkCreateRenderPass(VkDevice device, VkRenderPassCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkRenderPass pRenderPass, VkResult rval){
        if(PFN_vkCreateRenderPass_p == null) PFN_vkCreateRenderPass_p = new PFNvkCreateRenderPass(instance);
        PFN_vkCreateRenderPass_p.call(device, pCreateInfo, pAllocator, pRenderPass, rval);
    }


    private PFNvkDestroyRenderPass PFN_vkDestroyRenderPass_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyRenderPass.html">khronos documentation</a>
     **/
    public void vkDestroyRenderPass(VkDevice device, VkRenderPass renderPass, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyRenderPass_p == null) PFN_vkDestroyRenderPass_p = new PFNvkDestroyRenderPass(instance);
        PFN_vkDestroyRenderPass_p.call(device, renderPass, pAllocator);
    }


    private PFNvkGetRenderAreaGranularity PFN_vkGetRenderAreaGranularity_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetRenderAreaGranularity.html">khronos documentation</a>
     **/
    public void vkGetRenderAreaGranularity(VkDevice device, VkRenderPass renderPass, VkExtent2D pGranularity){
        if(PFN_vkGetRenderAreaGranularity_p == null) PFN_vkGetRenderAreaGranularity_p = new PFNvkGetRenderAreaGranularity(instance);
        PFN_vkGetRenderAreaGranularity_p.call(device, renderPass, pGranularity);
    }


    private PFNvkCreateCommandPool PFN_vkCreateCommandPool_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateCommandPool.html">khronos documentation</a>
     **/
    public void vkCreateCommandPool(VkDevice device, VkCommandPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkCommandPool pCommandPool, VkResult rval){
        if(PFN_vkCreateCommandPool_p == null) PFN_vkCreateCommandPool_p = new PFNvkCreateCommandPool(instance);
        PFN_vkCreateCommandPool_p.call(device, pCreateInfo, pAllocator, pCommandPool, rval);
    }


    private PFNvkDestroyCommandPool PFN_vkDestroyCommandPool_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyCommandPool.html">khronos documentation</a>
     **/
    public void vkDestroyCommandPool(VkDevice device, VkCommandPool commandPool, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyCommandPool_p == null) PFN_vkDestroyCommandPool_p = new PFNvkDestroyCommandPool(instance);
        PFN_vkDestroyCommandPool_p.call(device, commandPool, pAllocator);
    }


    private PFNvkResetCommandPool PFN_vkResetCommandPool_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkResetCommandPool.html">khronos documentation</a>
     **/
    public void vkResetCommandPool(VkDevice device, VkCommandPool commandPool, VkCommandPoolResetFlags flags, VkResult rval){
        if(PFN_vkResetCommandPool_p == null) PFN_vkResetCommandPool_p = new PFNvkResetCommandPool(instance);
        PFN_vkResetCommandPool_p.call(device, commandPool, flags, rval);
    }


    private PFNvkAllocateCommandBuffers PFN_vkAllocateCommandBuffers_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkAllocateCommandBuffers.html">khronos documentation</a>
     **/
    public void vkAllocateCommandBuffers(VkDevice device, VkCommandBufferAllocateInfo pAllocateInfo, VkCommandBuffer pCommandBuffers, VkResult rval){
        if(PFN_vkAllocateCommandBuffers_p == null) PFN_vkAllocateCommandBuffers_p = new PFNvkAllocateCommandBuffers(instance);
        PFN_vkAllocateCommandBuffers_p.call(device, pAllocateInfo, pCommandBuffers, rval);
    }


    private PFNvkFreeCommandBuffers PFN_vkFreeCommandBuffers_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkFreeCommandBuffers.html">khronos documentation</a>
     **/
    public void vkFreeCommandBuffers(VkDevice device, VkCommandPool commandPool, VkUInt32 commandBufferCount, VkCommandBuffer pCommandBuffers){
        if(PFN_vkFreeCommandBuffers_p == null) PFN_vkFreeCommandBuffers_p = new PFNvkFreeCommandBuffers(instance);
        PFN_vkFreeCommandBuffers_p.call(device, commandPool, commandBufferCount, pCommandBuffers);
    }


    private PFNvkBeginCommandBuffer PFN_vkBeginCommandBuffer_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkBeginCommandBuffer.html">khronos documentation</a>
     **/
    public void vkBeginCommandBuffer(VkCommandBuffer commandBuffer, VkCommandBufferBeginInfo pBeginInfo, VkResult rval){
        if(PFN_vkBeginCommandBuffer_p == null) PFN_vkBeginCommandBuffer_p = new PFNvkBeginCommandBuffer(instance);
        PFN_vkBeginCommandBuffer_p.call(commandBuffer, pBeginInfo, rval);
    }


    private PFNvkEndCommandBuffer PFN_vkEndCommandBuffer_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkEndCommandBuffer.html">khronos documentation</a>
     **/
    public void vkEndCommandBuffer(VkCommandBuffer commandBuffer, VkResult rval){
        if(PFN_vkEndCommandBuffer_p == null) PFN_vkEndCommandBuffer_p = new PFNvkEndCommandBuffer(instance);
        PFN_vkEndCommandBuffer_p.call(commandBuffer, rval);
    }


    private PFNvkResetCommandBuffer PFN_vkResetCommandBuffer_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkResetCommandBuffer.html">khronos documentation</a>
     **/
    public void vkResetCommandBuffer(VkCommandBuffer commandBuffer, VkCommandBufferResetFlags flags, VkResult rval){
        if(PFN_vkResetCommandBuffer_p == null) PFN_vkResetCommandBuffer_p = new PFNvkResetCommandBuffer(instance);
        PFN_vkResetCommandBuffer_p.call(commandBuffer, flags, rval);
    }


    private PFNvkCmdBindPipeline PFN_vkCmdBindPipeline_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdBindPipeline.html">khronos documentation</a>
     **/
    public void vkCmdBindPipeline(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipeline pipeline){
        if(PFN_vkCmdBindPipeline_p == null) PFN_vkCmdBindPipeline_p = new PFNvkCmdBindPipeline(instance);
        PFN_vkCmdBindPipeline_p.call(commandBuffer, pipelineBindPoint, pipeline);
    }


    private PFNvkCmdSetViewport PFN_vkCmdSetViewport_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetViewport.html">khronos documentation</a>
     **/
    public void vkCmdSetViewport(VkCommandBuffer commandBuffer, VkUInt32 firstViewport, VkUInt32 viewportCount, VkViewport pViewports){
        if(PFN_vkCmdSetViewport_p == null) PFN_vkCmdSetViewport_p = new PFNvkCmdSetViewport(instance);
        PFN_vkCmdSetViewport_p.call(commandBuffer, firstViewport, viewportCount, pViewports);
    }


    private PFNvkCmdSetScissor PFN_vkCmdSetScissor_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetScissor.html">khronos documentation</a>
     **/
    public void vkCmdSetScissor(VkCommandBuffer commandBuffer, VkUInt32 firstScissor, VkUInt32 scissorCount, VkRect2D pScissors){
        if(PFN_vkCmdSetScissor_p == null) PFN_vkCmdSetScissor_p = new PFNvkCmdSetScissor(instance);
        PFN_vkCmdSetScissor_p.call(commandBuffer, firstScissor, scissorCount, pScissors);
    }


    private PFNvkCmdSetLineWidth PFN_vkCmdSetLineWidth_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetLineWidth.html">khronos documentation</a>
     **/
    public void vkCmdSetLineWidth(VkCommandBuffer commandBuffer, VkFloat lineWidth){
        if(PFN_vkCmdSetLineWidth_p == null) PFN_vkCmdSetLineWidth_p = new PFNvkCmdSetLineWidth(instance);
        PFN_vkCmdSetLineWidth_p.call(commandBuffer, lineWidth);
    }


    private PFNvkCmdSetDepthBias PFN_vkCmdSetDepthBias_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetDepthBias.html">khronos documentation</a>
     **/
    public void vkCmdSetDepthBias(VkCommandBuffer commandBuffer, VkFloat depthBiasConstantFactor, VkFloat depthBiasClamp, VkFloat depthBiasSlopeFactor){
        if(PFN_vkCmdSetDepthBias_p == null) PFN_vkCmdSetDepthBias_p = new PFNvkCmdSetDepthBias(instance);
        PFN_vkCmdSetDepthBias_p.call(commandBuffer, depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor);
    }


    private PFNvkCmdSetBlendConstants PFN_vkCmdSetBlendConstants_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetBlendConstants.html">khronos documentation</a>
     **/
    public void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, VkFloat blendConstants){
        if(PFN_vkCmdSetBlendConstants_p == null) PFN_vkCmdSetBlendConstants_p = new PFNvkCmdSetBlendConstants(instance);
        PFN_vkCmdSetBlendConstants_p.call(commandBuffer, blendConstants);
    }


    private PFNvkCmdSetDepthBounds PFN_vkCmdSetDepthBounds_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetDepthBounds.html">khronos documentation</a>
     **/
    public void vkCmdSetDepthBounds(VkCommandBuffer commandBuffer, VkFloat minDepthBounds, VkFloat maxDepthBounds){
        if(PFN_vkCmdSetDepthBounds_p == null) PFN_vkCmdSetDepthBounds_p = new PFNvkCmdSetDepthBounds(instance);
        PFN_vkCmdSetDepthBounds_p.call(commandBuffer, minDepthBounds, maxDepthBounds);
    }


    private PFNvkCmdSetStencilCompareMask PFN_vkCmdSetStencilCompareMask_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetStencilCompareMask.html">khronos documentation</a>
     **/
    public void vkCmdSetStencilCompareMask(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkUInt32 compareMask){
        if(PFN_vkCmdSetStencilCompareMask_p == null) PFN_vkCmdSetStencilCompareMask_p = new PFNvkCmdSetStencilCompareMask(instance);
        PFN_vkCmdSetStencilCompareMask_p.call(commandBuffer, faceMask, compareMask);
    }


    private PFNvkCmdSetStencilWriteMask PFN_vkCmdSetStencilWriteMask_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetStencilWriteMask.html">khronos documentation</a>
     **/
    public void vkCmdSetStencilWriteMask(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkUInt32 writeMask){
        if(PFN_vkCmdSetStencilWriteMask_p == null) PFN_vkCmdSetStencilWriteMask_p = new PFNvkCmdSetStencilWriteMask(instance);
        PFN_vkCmdSetStencilWriteMask_p.call(commandBuffer, faceMask, writeMask);
    }


    private PFNvkCmdSetStencilReference PFN_vkCmdSetStencilReference_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetStencilReference.html">khronos documentation</a>
     **/
    public void vkCmdSetStencilReference(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkUInt32 reference){
        if(PFN_vkCmdSetStencilReference_p == null) PFN_vkCmdSetStencilReference_p = new PFNvkCmdSetStencilReference(instance);
        PFN_vkCmdSetStencilReference_p.call(commandBuffer, faceMask, reference);
    }


    private PFNvkCmdBindDescriptorSets PFN_vkCmdBindDescriptorSets_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdBindDescriptorSets.html">khronos documentation</a>
     **/
    public void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, VkUInt32 firstSet, VkUInt32 descriptorSetCount, VkDescriptorSet pDescriptorSets, VkUInt32 dynamicOffsetCount, VkUInt32 pDynamicOffsets){
        if(PFN_vkCmdBindDescriptorSets_p == null) PFN_vkCmdBindDescriptorSets_p = new PFNvkCmdBindDescriptorSets(instance);
        PFN_vkCmdBindDescriptorSets_p.call(commandBuffer, pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets);
    }


    private PFNvkCmdBindIndexBuffer PFN_vkCmdBindIndexBuffer_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdBindIndexBuffer.html">khronos documentation</a>
     **/
    public void vkCmdBindIndexBuffer(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkIndexType indexType){
        if(PFN_vkCmdBindIndexBuffer_p == null) PFN_vkCmdBindIndexBuffer_p = new PFNvkCmdBindIndexBuffer(instance);
        PFN_vkCmdBindIndexBuffer_p.call(commandBuffer, buffer, offset, indexType);
    }


    private PFNvkCmdBindVertexBuffers PFN_vkCmdBindVertexBuffers_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdBindVertexBuffers.html">khronos documentation</a>
     **/
    public void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, VkUInt32 firstBinding, VkUInt32 bindingCount, VkBuffer pBuffers, VkDeviceSize pOffsets){
        if(PFN_vkCmdBindVertexBuffers_p == null) PFN_vkCmdBindVertexBuffers_p = new PFNvkCmdBindVertexBuffers(instance);
        PFN_vkCmdBindVertexBuffers_p.call(commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets);
    }


    private PFNvkCmdDraw PFN_vkCmdDraw_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDraw.html">khronos documentation</a>
     **/
    public void vkCmdDraw(VkCommandBuffer commandBuffer, VkUInt32 vertexCount, VkUInt32 instanceCount, VkUInt32 firstVertex, VkUInt32 firstInstance){
        if(PFN_vkCmdDraw_p == null) PFN_vkCmdDraw_p = new PFNvkCmdDraw(instance);
        PFN_vkCmdDraw_p.call(commandBuffer, vertexCount, instanceCount, firstVertex, firstInstance);
    }


    private PFNvkCmdDrawIndexed PFN_vkCmdDrawIndexed_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDrawIndexed.html">khronos documentation</a>
     **/
    public void vkCmdDrawIndexed(VkCommandBuffer commandBuffer, VkUInt32 indexCount, VkUInt32 instanceCount, VkUInt32 firstIndex, VkInt32 vertexOffset, VkUInt32 firstInstance){
        if(PFN_vkCmdDrawIndexed_p == null) PFN_vkCmdDrawIndexed_p = new PFNvkCmdDrawIndexed(instance);
        PFN_vkCmdDrawIndexed_p.call(commandBuffer, indexCount, instanceCount, firstIndex, vertexOffset, firstInstance);
    }


    private PFNvkCmdDrawIndirect PFN_vkCmdDrawIndirect_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDrawIndirect.html">khronos documentation</a>
     **/
    public void vkCmdDrawIndirect(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkUInt32 drawCount, VkUInt32 stride){
        if(PFN_vkCmdDrawIndirect_p == null) PFN_vkCmdDrawIndirect_p = new PFNvkCmdDrawIndirect(instance);
        PFN_vkCmdDrawIndirect_p.call(commandBuffer, buffer, offset, drawCount, stride);
    }


    private PFNvkCmdDrawIndexedIndirect PFN_vkCmdDrawIndexedIndirect_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDrawIndexedIndirect.html">khronos documentation</a>
     **/
    public void vkCmdDrawIndexedIndirect(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkUInt32 drawCount, VkUInt32 stride){
        if(PFN_vkCmdDrawIndexedIndirect_p == null) PFN_vkCmdDrawIndexedIndirect_p = new PFNvkCmdDrawIndexedIndirect(instance);
        PFN_vkCmdDrawIndexedIndirect_p.call(commandBuffer, buffer, offset, drawCount, stride);
    }


    private PFNvkCmdDispatch PFN_vkCmdDispatch_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDispatch.html">khronos documentation</a>
     **/
    public void vkCmdDispatch(VkCommandBuffer commandBuffer, VkUInt32 groupCountX, VkUInt32 groupCountY, VkUInt32 groupCountZ){
        if(PFN_vkCmdDispatch_p == null) PFN_vkCmdDispatch_p = new PFNvkCmdDispatch(instance);
        PFN_vkCmdDispatch_p.call(commandBuffer, groupCountX, groupCountY, groupCountZ);
    }


    private PFNvkCmdDispatchIndirect PFN_vkCmdDispatchIndirect_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDispatchIndirect.html">khronos documentation</a>
     **/
    public void vkCmdDispatchIndirect(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset){
        if(PFN_vkCmdDispatchIndirect_p == null) PFN_vkCmdDispatchIndirect_p = new PFNvkCmdDispatchIndirect(instance);
        PFN_vkCmdDispatchIndirect_p.call(commandBuffer, buffer, offset);
    }


    private PFNvkCmdCopyBuffer PFN_vkCmdCopyBuffer_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdCopyBuffer.html">khronos documentation</a>
     **/
    public void vkCmdCopyBuffer(VkCommandBuffer commandBuffer, VkBuffer srcBuffer, VkBuffer dstBuffer, VkUInt32 regionCount, VkBufferCopy pRegions){
        if(PFN_vkCmdCopyBuffer_p == null) PFN_vkCmdCopyBuffer_p = new PFNvkCmdCopyBuffer(instance);
        PFN_vkCmdCopyBuffer_p.call(commandBuffer, srcBuffer, dstBuffer, regionCount, pRegions);
    }


    private PFNvkCmdCopyImage PFN_vkCmdCopyImage_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdCopyImage.html">khronos documentation</a>
     **/
    public void vkCmdCopyImage(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, VkUInt32 regionCount, VkImageCopy pRegions){
        if(PFN_vkCmdCopyImage_p == null) PFN_vkCmdCopyImage_p = new PFNvkCmdCopyImage(instance);
        PFN_vkCmdCopyImage_p.call(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);
    }


    private PFNvkCmdBlitImage PFN_vkCmdBlitImage_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdBlitImage.html">khronos documentation</a>
     **/
    public void vkCmdBlitImage(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, VkUInt32 regionCount, VkImageBlit pRegions, VkFilter filter){
        if(PFN_vkCmdBlitImage_p == null) PFN_vkCmdBlitImage_p = new PFNvkCmdBlitImage(instance);
        PFN_vkCmdBlitImage_p.call(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter);
    }


    private PFNvkCmdCopyBufferToImage PFN_vkCmdCopyBufferToImage_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdCopyBufferToImage.html">khronos documentation</a>
     **/
    public void vkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, VkBuffer srcBuffer, VkImage dstImage, VkImageLayout dstImageLayout, VkUInt32 regionCount, VkBufferImageCopy pRegions){
        if(PFN_vkCmdCopyBufferToImage_p == null) PFN_vkCmdCopyBufferToImage_p = new PFNvkCmdCopyBufferToImage(instance);
        PFN_vkCmdCopyBufferToImage_p.call(commandBuffer, srcBuffer, dstImage, dstImageLayout, regionCount, pRegions);
    }


    private PFNvkCmdCopyImageToBuffer PFN_vkCmdCopyImageToBuffer_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdCopyImageToBuffer.html">khronos documentation</a>
     **/
    public void vkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkBuffer dstBuffer, VkUInt32 regionCount, VkBufferImageCopy pRegions){
        if(PFN_vkCmdCopyImageToBuffer_p == null) PFN_vkCmdCopyImageToBuffer_p = new PFNvkCmdCopyImageToBuffer(instance);
        PFN_vkCmdCopyImageToBuffer_p.call(commandBuffer, srcImage, srcImageLayout, dstBuffer, regionCount, pRegions);
    }


    private PFNvkCmdUpdateBuffer PFN_vkCmdUpdateBuffer_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdUpdateBuffer.html">khronos documentation</a>
     **/
    public void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, VkObject pData){
        if(PFN_vkCmdUpdateBuffer_p == null) PFN_vkCmdUpdateBuffer_p = new PFNvkCmdUpdateBuffer(instance);
        PFN_vkCmdUpdateBuffer_p.call(commandBuffer, dstBuffer, dstOffset, dataSize, pData);
    }


    private PFNvkCmdFillBuffer PFN_vkCmdFillBuffer_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdFillBuffer.html">khronos documentation</a>
     **/
    public void vkCmdFillBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize size, VkUInt32 data){
        if(PFN_vkCmdFillBuffer_p == null) PFN_vkCmdFillBuffer_p = new PFNvkCmdFillBuffer(instance);
        PFN_vkCmdFillBuffer_p.call(commandBuffer, dstBuffer, dstOffset, size, data);
    }


    private PFNvkCmdClearColorImage PFN_vkCmdClearColorImage_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdClearColorImage.html">khronos documentation</a>
     **/
    public void vkCmdClearColorImage(VkCommandBuffer commandBuffer, VkImage image, VkImageLayout imageLayout, VkClearColorValue pColor, VkUInt32 rangeCount, VkImageSubresourceRange pRanges){
        if(PFN_vkCmdClearColorImage_p == null) PFN_vkCmdClearColorImage_p = new PFNvkCmdClearColorImage(instance);
        PFN_vkCmdClearColorImage_p.call(commandBuffer, image, imageLayout, pColor, rangeCount, pRanges);
    }


    private PFNvkCmdClearDepthStencilImage PFN_vkCmdClearDepthStencilImage_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdClearDepthStencilImage.html">khronos documentation</a>
     **/
    public void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, VkImage image, VkImageLayout imageLayout, VkClearDepthStencilValue pDepthStencil, VkUInt32 rangeCount, VkImageSubresourceRange pRanges){
        if(PFN_vkCmdClearDepthStencilImage_p == null) PFN_vkCmdClearDepthStencilImage_p = new PFNvkCmdClearDepthStencilImage(instance);
        PFN_vkCmdClearDepthStencilImage_p.call(commandBuffer, image, imageLayout, pDepthStencil, rangeCount, pRanges);
    }


    private PFNvkCmdClearAttachments PFN_vkCmdClearAttachments_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdClearAttachments.html">khronos documentation</a>
     **/
    public void vkCmdClearAttachments(VkCommandBuffer commandBuffer, VkUInt32 attachmentCount, VkClearAttachment pAttachments, VkUInt32 rectCount, VkClearRect pRects){
        if(PFN_vkCmdClearAttachments_p == null) PFN_vkCmdClearAttachments_p = new PFNvkCmdClearAttachments(instance);
        PFN_vkCmdClearAttachments_p.call(commandBuffer, attachmentCount, pAttachments, rectCount, pRects);
    }


    private PFNvkCmdResolveImage PFN_vkCmdResolveImage_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdResolveImage.html">khronos documentation</a>
     **/
    public void vkCmdResolveImage(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, VkUInt32 regionCount, VkImageResolve pRegions){
        if(PFN_vkCmdResolveImage_p == null) PFN_vkCmdResolveImage_p = new PFNvkCmdResolveImage(instance);
        PFN_vkCmdResolveImage_p.call(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions);
    }


    private PFNvkCmdSetEvent PFN_vkCmdSetEvent_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetEvent.html">khronos documentation</a>
     **/
    public void vkCmdSetEvent(VkCommandBuffer commandBuffer, VkEvent event, VkPipelineStageFlags stageMask){
        if(PFN_vkCmdSetEvent_p == null) PFN_vkCmdSetEvent_p = new PFNvkCmdSetEvent(instance);
        PFN_vkCmdSetEvent_p.call(commandBuffer, event, stageMask);
    }


    private PFNvkCmdResetEvent PFN_vkCmdResetEvent_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdResetEvent.html">khronos documentation</a>
     **/
    public void vkCmdResetEvent(VkCommandBuffer commandBuffer, VkEvent event, VkPipelineStageFlags stageMask){
        if(PFN_vkCmdResetEvent_p == null) PFN_vkCmdResetEvent_p = new PFNvkCmdResetEvent(instance);
        PFN_vkCmdResetEvent_p.call(commandBuffer, event, stageMask);
    }


    private PFNvkCmdWaitEvents PFN_vkCmdWaitEvents_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdWaitEvents.html">khronos documentation</a>
     **/
    public void vkCmdWaitEvents(VkCommandBuffer commandBuffer, VkUInt32 eventCount, VkEvent pEvents, VkPipelineStageFlags srcStageMask, VkPipelineStageFlags dstStageMask, VkUInt32 memoryBarrierCount, VkMemoryBarrier pMemoryBarriers, VkUInt32 bufferMemoryBarrierCount, VkBufferMemoryBarrier pBufferMemoryBarriers, VkUInt32 imageMemoryBarrierCount, VkImageMemoryBarrier pImageMemoryBarriers){
        if(PFN_vkCmdWaitEvents_p == null) PFN_vkCmdWaitEvents_p = new PFNvkCmdWaitEvents(instance);
        PFN_vkCmdWaitEvents_p.call(commandBuffer, eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);
    }


    private PFNvkCmdPipelineBarrier PFN_vkCmdPipelineBarrier_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdPipelineBarrier.html">khronos documentation</a>
     **/
    public void vkCmdPipelineBarrier(VkCommandBuffer commandBuffer, VkPipelineStageFlags srcStageMask, VkPipelineStageFlags dstStageMask, VkDependencyFlags dependencyFlags, VkUInt32 memoryBarrierCount, VkMemoryBarrier pMemoryBarriers, VkUInt32 bufferMemoryBarrierCount, VkBufferMemoryBarrier pBufferMemoryBarriers, VkUInt32 imageMemoryBarrierCount, VkImageMemoryBarrier pImageMemoryBarriers){
        if(PFN_vkCmdPipelineBarrier_p == null) PFN_vkCmdPipelineBarrier_p = new PFNvkCmdPipelineBarrier(instance);
        PFN_vkCmdPipelineBarrier_p.call(commandBuffer, srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers);
    }


    private PFNvkCmdBeginQuery PFN_vkCmdBeginQuery_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdBeginQuery.html">khronos documentation</a>
     **/
    public void vkCmdBeginQuery(VkCommandBuffer commandBuffer, VkQueryPool queryPool, VkUInt32 query, VkQueryControlFlags flags){
        if(PFN_vkCmdBeginQuery_p == null) PFN_vkCmdBeginQuery_p = new PFNvkCmdBeginQuery(instance);
        PFN_vkCmdBeginQuery_p.call(commandBuffer, queryPool, query, flags);
    }


    private PFNvkCmdEndQuery PFN_vkCmdEndQuery_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdEndQuery.html">khronos documentation</a>
     **/
    public void vkCmdEndQuery(VkCommandBuffer commandBuffer, VkQueryPool queryPool, VkUInt32 query){
        if(PFN_vkCmdEndQuery_p == null) PFN_vkCmdEndQuery_p = new PFNvkCmdEndQuery(instance);
        PFN_vkCmdEndQuery_p.call(commandBuffer, queryPool, query);
    }


    private PFNvkCmdResetQueryPool PFN_vkCmdResetQueryPool_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdResetQueryPool.html">khronos documentation</a>
     **/
    public void vkCmdResetQueryPool(VkCommandBuffer commandBuffer, VkQueryPool queryPool, VkUInt32 firstQuery, VkUInt32 queryCount){
        if(PFN_vkCmdResetQueryPool_p == null) PFN_vkCmdResetQueryPool_p = new PFNvkCmdResetQueryPool(instance);
        PFN_vkCmdResetQueryPool_p.call(commandBuffer, queryPool, firstQuery, queryCount);
    }


    private PFNvkCmdWriteTimestamp PFN_vkCmdWriteTimestamp_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdWriteTimestamp.html">khronos documentation</a>
     **/
    public void vkCmdWriteTimestamp(VkCommandBuffer commandBuffer, VkPipelineStageFlagBits pipelineStage, VkQueryPool queryPool, VkUInt32 query){
        if(PFN_vkCmdWriteTimestamp_p == null) PFN_vkCmdWriteTimestamp_p = new PFNvkCmdWriteTimestamp(instance);
        PFN_vkCmdWriteTimestamp_p.call(commandBuffer, pipelineStage, queryPool, query);
    }


    private PFNvkCmdCopyQueryPoolResults PFN_vkCmdCopyQueryPoolResults_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdCopyQueryPoolResults.html">khronos documentation</a>
     **/
    public void vkCmdCopyQueryPoolResults(VkCommandBuffer commandBuffer, VkQueryPool queryPool, VkUInt32 firstQuery, VkUInt32 queryCount, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize stride, VkQueryResultFlags flags){
        if(PFN_vkCmdCopyQueryPoolResults_p == null) PFN_vkCmdCopyQueryPoolResults_p = new PFNvkCmdCopyQueryPoolResults(instance);
        PFN_vkCmdCopyQueryPoolResults_p.call(commandBuffer, queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags);
    }


    private PFNvkCmdPushConstants PFN_vkCmdPushConstants_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdPushConstants.html">khronos documentation</a>
     **/
    public void vkCmdPushConstants(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, VkUInt32 offset, VkUInt32 size, VkObject pValues){
        if(PFN_vkCmdPushConstants_p == null) PFN_vkCmdPushConstants_p = new PFNvkCmdPushConstants(instance);
        PFN_vkCmdPushConstants_p.call(commandBuffer, layout, stageFlags, offset, size, pValues);
    }


    private PFNvkCmdBeginRenderPass PFN_vkCmdBeginRenderPass_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdBeginRenderPass.html">khronos documentation</a>
     **/
    public void vkCmdBeginRenderPass(VkCommandBuffer commandBuffer, VkRenderPassBeginInfo pRenderPassBegin, VkSubpassContents contents){
        if(PFN_vkCmdBeginRenderPass_p == null) PFN_vkCmdBeginRenderPass_p = new PFNvkCmdBeginRenderPass(instance);
        PFN_vkCmdBeginRenderPass_p.call(commandBuffer, pRenderPassBegin, contents);
    }


    private PFNvkCmdNextSubpass PFN_vkCmdNextSubpass_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdNextSubpass.html">khronos documentation</a>
     **/
    public void vkCmdNextSubpass(VkCommandBuffer commandBuffer, VkSubpassContents contents){
        if(PFN_vkCmdNextSubpass_p == null) PFN_vkCmdNextSubpass_p = new PFNvkCmdNextSubpass(instance);
        PFN_vkCmdNextSubpass_p.call(commandBuffer, contents);
    }


    private PFNvkCmdEndRenderPass PFN_vkCmdEndRenderPass_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdEndRenderPass.html">khronos documentation</a>
     **/
    public void vkCmdEndRenderPass(VkCommandBuffer commandBuffer){
        if(PFN_vkCmdEndRenderPass_p == null) PFN_vkCmdEndRenderPass_p = new PFNvkCmdEndRenderPass(instance);
        PFN_vkCmdEndRenderPass_p.call(commandBuffer);
    }


    private PFNvkCmdExecuteCommands PFN_vkCmdExecuteCommands_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdExecuteCommands.html">khronos documentation</a>
     **/
    public void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, VkUInt32 commandBufferCount, VkCommandBuffer pCommandBuffers){
        if(PFN_vkCmdExecuteCommands_p == null) PFN_vkCmdExecuteCommands_p = new PFNvkCmdExecuteCommands(instance);
        PFN_vkCmdExecuteCommands_p.call(commandBuffer, commandBufferCount, pCommandBuffers);
    }


    private PFNvkEnumerateInstanceVersion PFN_vkEnumerateInstanceVersion_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkEnumerateInstanceVersion.html">khronos documentation</a>
     **/
    public void vkEnumerateInstanceVersion(VkUInt32 pApiVersion, VkResult rval){
        if(PFN_vkEnumerateInstanceVersion_p == null) PFN_vkEnumerateInstanceVersion_p = new PFNvkEnumerateInstanceVersion(instance);
        PFN_vkEnumerateInstanceVersion_p.call(pApiVersion, rval);
    }


    private PFNvkBindBufferMemory2 PFN_vkBindBufferMemory2_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkBindBufferMemory2.html">khronos documentation</a>
     **/
    public void vkBindBufferMemory2(VkDevice device, VkUInt32 bindInfoCount, VkBindBufferMemoryInfo pBindInfos, VkResult rval){
        if(PFN_vkBindBufferMemory2_p == null) PFN_vkBindBufferMemory2_p = new PFNvkBindBufferMemory2(instance);
        PFN_vkBindBufferMemory2_p.call(device, bindInfoCount, pBindInfos, rval);
    }


    private PFNvkBindImageMemory2 PFN_vkBindImageMemory2_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkBindImageMemory2.html">khronos documentation</a>
     **/
    public void vkBindImageMemory2(VkDevice device, VkUInt32 bindInfoCount, VkBindImageMemoryInfo pBindInfos, VkResult rval){
        if(PFN_vkBindImageMemory2_p == null) PFN_vkBindImageMemory2_p = new PFNvkBindImageMemory2(instance);
        PFN_vkBindImageMemory2_p.call(device, bindInfoCount, pBindInfos, rval);
    }


    private PFNvkGetDeviceGroupPeerMemoryFeatures PFN_vkGetDeviceGroupPeerMemoryFeatures_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDeviceGroupPeerMemoryFeatures.html">khronos documentation</a>
     **/
    public void vkGetDeviceGroupPeerMemoryFeatures(VkDevice device, VkUInt32 heapIndex, VkUInt32 localDeviceIndex, VkUInt32 remoteDeviceIndex, VkPeerMemoryFeatureFlags pPeerMemoryFeatures){
        if(PFN_vkGetDeviceGroupPeerMemoryFeatures_p == null) PFN_vkGetDeviceGroupPeerMemoryFeatures_p = new PFNvkGetDeviceGroupPeerMemoryFeatures(instance);
        PFN_vkGetDeviceGroupPeerMemoryFeatures_p.call(device, heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures);
    }


    private PFNvkCmdSetDeviceMask PFN_vkCmdSetDeviceMask_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetDeviceMask.html">khronos documentation</a>
     **/
    public void vkCmdSetDeviceMask(VkCommandBuffer commandBuffer, VkUInt32 deviceMask){
        if(PFN_vkCmdSetDeviceMask_p == null) PFN_vkCmdSetDeviceMask_p = new PFNvkCmdSetDeviceMask(instance);
        PFN_vkCmdSetDeviceMask_p.call(commandBuffer, deviceMask);
    }


    private PFNvkCmdDispatchBase PFN_vkCmdDispatchBase_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDispatchBase.html">khronos documentation</a>
     **/
    public void vkCmdDispatchBase(VkCommandBuffer commandBuffer, VkUInt32 baseGroupX, VkUInt32 baseGroupY, VkUInt32 baseGroupZ, VkUInt32 groupCountX, VkUInt32 groupCountY, VkUInt32 groupCountZ){
        if(PFN_vkCmdDispatchBase_p == null) PFN_vkCmdDispatchBase_p = new PFNvkCmdDispatchBase(instance);
        PFN_vkCmdDispatchBase_p.call(commandBuffer, baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ);
    }


    private PFNvkEnumeratePhysicalDeviceGroups PFN_vkEnumeratePhysicalDeviceGroups_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkEnumeratePhysicalDeviceGroups.html">khronos documentation</a>
     **/
    public void vkEnumeratePhysicalDeviceGroups(VkInstance instance, VkUInt32 pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties pPhysicalDeviceGroupProperties, VkResult rval){
        if(PFN_vkEnumeratePhysicalDeviceGroups_p == null) PFN_vkEnumeratePhysicalDeviceGroups_p = new PFNvkEnumeratePhysicalDeviceGroups(instance);
        PFN_vkEnumeratePhysicalDeviceGroups_p.call(instance, pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties, rval);
    }


    private PFNvkGetImageMemoryRequirements2 PFN_vkGetImageMemoryRequirements2_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetImageMemoryRequirements2.html">khronos documentation</a>
     **/
    public void vkGetImageMemoryRequirements2(VkDevice device, VkImageMemoryRequirementsInfo2 pInfo, VkMemoryRequirements2 pMemoryRequirements){
        if(PFN_vkGetImageMemoryRequirements2_p == null) PFN_vkGetImageMemoryRequirements2_p = new PFNvkGetImageMemoryRequirements2(instance);
        PFN_vkGetImageMemoryRequirements2_p.call(device, pInfo, pMemoryRequirements);
    }


    private PFNvkGetBufferMemoryRequirements2 PFN_vkGetBufferMemoryRequirements2_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetBufferMemoryRequirements2.html">khronos documentation</a>
     **/
    public void vkGetBufferMemoryRequirements2(VkDevice device, VkBufferMemoryRequirementsInfo2 pInfo, VkMemoryRequirements2 pMemoryRequirements){
        if(PFN_vkGetBufferMemoryRequirements2_p == null) PFN_vkGetBufferMemoryRequirements2_p = new PFNvkGetBufferMemoryRequirements2(instance);
        PFN_vkGetBufferMemoryRequirements2_p.call(device, pInfo, pMemoryRequirements);
    }


    private PFNvkGetImageSparseMemoryRequirements2 PFN_vkGetImageSparseMemoryRequirements2_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetImageSparseMemoryRequirements2.html">khronos documentation</a>
     **/
    public void vkGetImageSparseMemoryRequirements2(VkDevice device, VkImageSparseMemoryRequirementsInfo2 pInfo, VkUInt32 pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 pSparseMemoryRequirements){
        if(PFN_vkGetImageSparseMemoryRequirements2_p == null) PFN_vkGetImageSparseMemoryRequirements2_p = new PFNvkGetImageSparseMemoryRequirements2(instance);
        PFN_vkGetImageSparseMemoryRequirements2_p.call(device, pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements);
    }


    private PFNvkGetPhysicalDeviceFeatures2 PFN_vkGetPhysicalDeviceFeatures2_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceFeatures2.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceFeatures2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures2 pFeatures){
        if(PFN_vkGetPhysicalDeviceFeatures2_p == null) PFN_vkGetPhysicalDeviceFeatures2_p = new PFNvkGetPhysicalDeviceFeatures2(instance);
        PFN_vkGetPhysicalDeviceFeatures2_p.call(physicalDevice, pFeatures);
    }


    private PFNvkGetPhysicalDeviceProperties2 PFN_vkGetPhysicalDeviceProperties2_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceProperties2.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties2 pProperties){
        if(PFN_vkGetPhysicalDeviceProperties2_p == null) PFN_vkGetPhysicalDeviceProperties2_p = new PFNvkGetPhysicalDeviceProperties2(instance);
        PFN_vkGetPhysicalDeviceProperties2_p.call(physicalDevice, pProperties);
    }


    private PFNvkGetPhysicalDeviceFormatProperties2 PFN_vkGetPhysicalDeviceFormatProperties2_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceFormatProperties2.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceFormatProperties2(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties2 pFormatProperties){
        if(PFN_vkGetPhysicalDeviceFormatProperties2_p == null) PFN_vkGetPhysicalDeviceFormatProperties2_p = new PFNvkGetPhysicalDeviceFormatProperties2(instance);
        PFN_vkGetPhysicalDeviceFormatProperties2_p.call(physicalDevice, format, pFormatProperties);
    }


    private PFNvkGetPhysicalDeviceImageFormatProperties2 PFN_vkGetPhysicalDeviceImageFormatProperties2_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceImageFormatProperties2.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceImageFormatProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties, VkResult rval){
        if(PFN_vkGetPhysicalDeviceImageFormatProperties2_p == null) PFN_vkGetPhysicalDeviceImageFormatProperties2_p = new PFNvkGetPhysicalDeviceImageFormatProperties2(instance);
        PFN_vkGetPhysicalDeviceImageFormatProperties2_p.call(physicalDevice, pImageFormatInfo, pImageFormatProperties, rval);
    }


    private PFNvkGetPhysicalDeviceQueueFamilyProperties2 PFN_vkGetPhysicalDeviceQueueFamilyProperties2_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceQueueFamilyProperties2.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, VkUInt32 pQueueFamilyPropertyCount, VkQueueFamilyProperties2 pQueueFamilyProperties){
        if(PFN_vkGetPhysicalDeviceQueueFamilyProperties2_p == null) PFN_vkGetPhysicalDeviceQueueFamilyProperties2_p = new PFNvkGetPhysicalDeviceQueueFamilyProperties2(instance);
        PFN_vkGetPhysicalDeviceQueueFamilyProperties2_p.call(physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties);
    }


    private PFNvkGetPhysicalDeviceMemoryProperties2 PFN_vkGetPhysicalDeviceMemoryProperties2_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceMemoryProperties2.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceMemoryProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2 pMemoryProperties){
        if(PFN_vkGetPhysicalDeviceMemoryProperties2_p == null) PFN_vkGetPhysicalDeviceMemoryProperties2_p = new PFNvkGetPhysicalDeviceMemoryProperties2(instance);
        PFN_vkGetPhysicalDeviceMemoryProperties2_p.call(physicalDevice, pMemoryProperties);
    }


    private PFNvkGetPhysicalDeviceSparseImageFormatProperties2 PFN_vkGetPhysicalDeviceSparseImageFormatProperties2_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSparseImageFormatProperties2.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, VkUInt32 pPropertyCount, VkSparseImageFormatProperties2 pProperties){
        if(PFN_vkGetPhysicalDeviceSparseImageFormatProperties2_p == null) PFN_vkGetPhysicalDeviceSparseImageFormatProperties2_p = new PFNvkGetPhysicalDeviceSparseImageFormatProperties2(instance);
        PFN_vkGetPhysicalDeviceSparseImageFormatProperties2_p.call(physicalDevice, pFormatInfo, pPropertyCount, pProperties);
    }


    private PFNvkTrimCommandPool PFN_vkTrimCommandPool_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkTrimCommandPool.html">khronos documentation</a>
     **/
    public void vkTrimCommandPool(VkDevice device, VkCommandPool commandPool, VkCommandPoolTrimFlags flags){
        if(PFN_vkTrimCommandPool_p == null) PFN_vkTrimCommandPool_p = new PFNvkTrimCommandPool(instance);
        PFN_vkTrimCommandPool_p.call(device, commandPool, flags);
    }


    private PFNvkGetDeviceQueue2 PFN_vkGetDeviceQueue2_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDeviceQueue2.html">khronos documentation</a>
     **/
    public void vkGetDeviceQueue2(VkDevice device, VkDeviceQueueInfo2 pQueueInfo, VkQueue pQueue){
        if(PFN_vkGetDeviceQueue2_p == null) PFN_vkGetDeviceQueue2_p = new PFNvkGetDeviceQueue2(instance);
        PFN_vkGetDeviceQueue2_p.call(device, pQueueInfo, pQueue);
    }


    private PFNvkCreateSamplerYcbcrConversion PFN_vkCreateSamplerYcbcrConversion_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateSamplerYcbcrConversion.html">khronos documentation</a>
     **/
    public void vkCreateSamplerYcbcrConversion(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSamplerYcbcrConversion pYcbcrConversion, VkResult rval){
        if(PFN_vkCreateSamplerYcbcrConversion_p == null) PFN_vkCreateSamplerYcbcrConversion_p = new PFNvkCreateSamplerYcbcrConversion(instance);
        PFN_vkCreateSamplerYcbcrConversion_p.call(device, pCreateInfo, pAllocator, pYcbcrConversion, rval);
    }


    private PFNvkDestroySamplerYcbcrConversion PFN_vkDestroySamplerYcbcrConversion_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroySamplerYcbcrConversion.html">khronos documentation</a>
     **/
    public void vkDestroySamplerYcbcrConversion(VkDevice device, VkSamplerYcbcrConversion ycbcrConversion, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroySamplerYcbcrConversion_p == null) PFN_vkDestroySamplerYcbcrConversion_p = new PFNvkDestroySamplerYcbcrConversion(instance);
        PFN_vkDestroySamplerYcbcrConversion_p.call(device, ycbcrConversion, pAllocator);
    }


    private PFNvkCreateDescriptorUpdateTemplate PFN_vkCreateDescriptorUpdateTemplate_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateDescriptorUpdateTemplate.html">khronos documentation</a>
     **/
    public void vkCreateDescriptorUpdateTemplate(VkDevice device, VkDescriptorUpdateTemplateCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorUpdateTemplate pDescriptorUpdateTemplate, VkResult rval){
        if(PFN_vkCreateDescriptorUpdateTemplate_p == null) PFN_vkCreateDescriptorUpdateTemplate_p = new PFNvkCreateDescriptorUpdateTemplate(instance);
        PFN_vkCreateDescriptorUpdateTemplate_p.call(device, pCreateInfo, pAllocator, pDescriptorUpdateTemplate, rval);
    }


    private PFNvkDestroyDescriptorUpdateTemplate PFN_vkDestroyDescriptorUpdateTemplate_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyDescriptorUpdateTemplate.html">khronos documentation</a>
     **/
    public void vkDestroyDescriptorUpdateTemplate(VkDevice device, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyDescriptorUpdateTemplate_p == null) PFN_vkDestroyDescriptorUpdateTemplate_p = new PFNvkDestroyDescriptorUpdateTemplate(instance);
        PFN_vkDestroyDescriptorUpdateTemplate_p.call(device, descriptorUpdateTemplate, pAllocator);
    }


    private PFNvkUpdateDescriptorSetWithTemplate PFN_vkUpdateDescriptorSetWithTemplate_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkUpdateDescriptorSetWithTemplate.html">khronos documentation</a>
     **/
    public void vkUpdateDescriptorSetWithTemplate(VkDevice device, VkDescriptorSet descriptorSet, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkObject pData){
        if(PFN_vkUpdateDescriptorSetWithTemplate_p == null) PFN_vkUpdateDescriptorSetWithTemplate_p = new PFNvkUpdateDescriptorSetWithTemplate(instance);
        PFN_vkUpdateDescriptorSetWithTemplate_p.call(device, descriptorSet, descriptorUpdateTemplate, pData);
    }


    private PFNvkGetPhysicalDeviceExternalBufferProperties PFN_vkGetPhysicalDeviceExternalBufferProperties_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceExternalBufferProperties.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceExternalBufferProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo, VkExternalBufferProperties pExternalBufferProperties){
        if(PFN_vkGetPhysicalDeviceExternalBufferProperties_p == null) PFN_vkGetPhysicalDeviceExternalBufferProperties_p = new PFNvkGetPhysicalDeviceExternalBufferProperties(instance);
        PFN_vkGetPhysicalDeviceExternalBufferProperties_p.call(physicalDevice, pExternalBufferInfo, pExternalBufferProperties);
    }


    private PFNvkGetPhysicalDeviceExternalFenceProperties PFN_vkGetPhysicalDeviceExternalFenceProperties_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceExternalFenceProperties.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceExternalFenceProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo, VkExternalFenceProperties pExternalFenceProperties){
        if(PFN_vkGetPhysicalDeviceExternalFenceProperties_p == null) PFN_vkGetPhysicalDeviceExternalFenceProperties_p = new PFNvkGetPhysicalDeviceExternalFenceProperties(instance);
        PFN_vkGetPhysicalDeviceExternalFenceProperties_p.call(physicalDevice, pExternalFenceInfo, pExternalFenceProperties);
    }


    private PFNvkGetPhysicalDeviceExternalSemaphoreProperties PFN_vkGetPhysicalDeviceExternalSemaphoreProperties_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceExternalSemaphoreProperties.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceExternalSemaphoreProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo, VkExternalSemaphoreProperties pExternalSemaphoreProperties){
        if(PFN_vkGetPhysicalDeviceExternalSemaphoreProperties_p == null) PFN_vkGetPhysicalDeviceExternalSemaphoreProperties_p = new PFNvkGetPhysicalDeviceExternalSemaphoreProperties(instance);
        PFN_vkGetPhysicalDeviceExternalSemaphoreProperties_p.call(physicalDevice, pExternalSemaphoreInfo, pExternalSemaphoreProperties);
    }


    private PFNvkGetDescriptorSetLayoutSupport PFN_vkGetDescriptorSetLayoutSupport_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDescriptorSetLayoutSupport.html">khronos documentation</a>
     **/
    public void vkGetDescriptorSetLayoutSupport(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkDescriptorSetLayoutSupport pSupport){
        if(PFN_vkGetDescriptorSetLayoutSupport_p == null) PFN_vkGetDescriptorSetLayoutSupport_p = new PFNvkGetDescriptorSetLayoutSupport(instance);
        PFN_vkGetDescriptorSetLayoutSupport_p.call(device, pCreateInfo, pSupport);
    }


    private PFNvkDestroySurfaceKHR PFN_vkDestroySurfaceKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroySurfaceKHR.html">khronos documentation</a>
     **/
    public void vkDestroySurfaceKHR(VkInstance instance, VkSurfaceKHR surface, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroySurfaceKHR_p == null) PFN_vkDestroySurfaceKHR_p = new PFNvkDestroySurfaceKHR(instance);
        PFN_vkDestroySurfaceKHR_p.call(instance, surface, pAllocator);
    }


    private PFNvkGetPhysicalDeviceSurfaceSupportKHR PFN_vkGetPhysicalDeviceSurfaceSupportKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSurfaceSupportKHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, VkUInt32 queueFamilyIndex, VkSurfaceKHR surface, VkBool32 pSupported, VkResult rval){
        if(PFN_vkGetPhysicalDeviceSurfaceSupportKHR_p == null) PFN_vkGetPhysicalDeviceSurfaceSupportKHR_p = new PFNvkGetPhysicalDeviceSurfaceSupportKHR(instance);
        PFN_vkGetPhysicalDeviceSurfaceSupportKHR_p.call(physicalDevice, queueFamilyIndex, surface, pSupported, rval);
    }


    private PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilitiesKHR pSurfaceCapabilities, VkResult rval){
        if(PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR_p == null) PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR_p = new PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR(instance);
        PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR_p.call(physicalDevice, surface, pSurfaceCapabilities, rval);
    }


    private PFNvkGetPhysicalDeviceSurfaceFormatsKHR PFN_vkGetPhysicalDeviceSurfaceFormatsKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSurfaceFormatsKHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pSurfaceFormatCount, VkSurfaceFormatKHR pSurfaceFormats, VkResult rval){
        if(PFN_vkGetPhysicalDeviceSurfaceFormatsKHR_p == null) PFN_vkGetPhysicalDeviceSurfaceFormatsKHR_p = new PFNvkGetPhysicalDeviceSurfaceFormatsKHR(instance);
        PFN_vkGetPhysicalDeviceSurfaceFormatsKHR_p.call(physicalDevice, surface, pSurfaceFormatCount, pSurfaceFormats, rval);
    }


    private PFNvkGetPhysicalDeviceSurfacePresentModesKHR PFN_vkGetPhysicalDeviceSurfacePresentModesKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSurfacePresentModesKHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pPresentModeCount, VkPresentModeKHR pPresentModes, VkResult rval){
        if(PFN_vkGetPhysicalDeviceSurfacePresentModesKHR_p == null) PFN_vkGetPhysicalDeviceSurfacePresentModesKHR_p = new PFNvkGetPhysicalDeviceSurfacePresentModesKHR(instance);
        PFN_vkGetPhysicalDeviceSurfacePresentModesKHR_p.call(physicalDevice, surface, pPresentModeCount, pPresentModes, rval);
    }


    private PFNvkCreateSwapchainKHR PFN_vkCreateSwapchainKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateSwapchainKHR.html">khronos documentation</a>
     **/
    public void vkCreateSwapchainKHR(VkDevice device, VkSwapchainCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkSwapchainKHR pSwapchain, VkResult rval){
        if(PFN_vkCreateSwapchainKHR_p == null) PFN_vkCreateSwapchainKHR_p = new PFNvkCreateSwapchainKHR(instance);
        PFN_vkCreateSwapchainKHR_p.call(device, pCreateInfo, pAllocator, pSwapchain, rval);
    }


    private PFNvkDestroySwapchainKHR PFN_vkDestroySwapchainKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroySwapchainKHR.html">khronos documentation</a>
     **/
    public void vkDestroySwapchainKHR(VkDevice device, VkSwapchainKHR swapchain, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroySwapchainKHR_p == null) PFN_vkDestroySwapchainKHR_p = new PFNvkDestroySwapchainKHR(instance);
        PFN_vkDestroySwapchainKHR_p.call(device, swapchain, pAllocator);
    }


    private PFNvkGetSwapchainImagesKHR PFN_vkGetSwapchainImagesKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetSwapchainImagesKHR.html">khronos documentation</a>
     **/
    public void vkGetSwapchainImagesKHR(VkDevice device, VkSwapchainKHR swapchain, VkUInt32 pSwapchainImageCount, VkImage pSwapchainImages, VkResult rval){
        if(PFN_vkGetSwapchainImagesKHR_p == null) PFN_vkGetSwapchainImagesKHR_p = new PFNvkGetSwapchainImagesKHR(instance);
        PFN_vkGetSwapchainImagesKHR_p.call(device, swapchain, pSwapchainImageCount, pSwapchainImages, rval);
    }


    private PFNvkAcquireNextImageKHR PFN_vkAcquireNextImageKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkAcquireNextImageKHR.html">khronos documentation</a>
     **/
    public void vkAcquireNextImageKHR(VkDevice device, VkSwapchainKHR swapchain, VkUInt64 timeout, VkSemaphore semaphore, VkFence fence, VkUInt32 pImageIndex, VkResult rval){
        if(PFN_vkAcquireNextImageKHR_p == null) PFN_vkAcquireNextImageKHR_p = new PFNvkAcquireNextImageKHR(instance);
        PFN_vkAcquireNextImageKHR_p.call(device, swapchain, timeout, semaphore, fence, pImageIndex, rval);
    }


    private PFNvkQueuePresentKHR PFN_vkQueuePresentKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkQueuePresentKHR.html">khronos documentation</a>
     **/
    public void vkQueuePresentKHR(VkQueue queue, VkPresentInfoKHR pPresentInfo, VkResult rval){
        if(PFN_vkQueuePresentKHR_p == null) PFN_vkQueuePresentKHR_p = new PFNvkQueuePresentKHR(instance);
        PFN_vkQueuePresentKHR_p.call(queue, pPresentInfo, rval);
    }


    private PFNvkGetDeviceGroupPresentCapabilitiesKHR PFN_vkGetDeviceGroupPresentCapabilitiesKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDeviceGroupPresentCapabilitiesKHR.html">khronos documentation</a>
     **/
    public void vkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities, VkResult rval){
        if(PFN_vkGetDeviceGroupPresentCapabilitiesKHR_p == null) PFN_vkGetDeviceGroupPresentCapabilitiesKHR_p = new PFNvkGetDeviceGroupPresentCapabilitiesKHR(instance);
        PFN_vkGetDeviceGroupPresentCapabilitiesKHR_p.call(device, pDeviceGroupPresentCapabilities, rval);
    }


    private PFNvkGetDeviceGroupSurfacePresentModesKHR PFN_vkGetDeviceGroupSurfacePresentModesKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDeviceGroupSurfacePresentModesKHR.html">khronos documentation</a>
     **/
    public void vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHR pModes, VkResult rval){
        if(PFN_vkGetDeviceGroupSurfacePresentModesKHR_p == null) PFN_vkGetDeviceGroupSurfacePresentModesKHR_p = new PFNvkGetDeviceGroupSurfacePresentModesKHR(instance);
        PFN_vkGetDeviceGroupSurfacePresentModesKHR_p.call(device, surface, pModes, rval);
    }


    private PFNvkGetPhysicalDevicePresentRectanglesKHR PFN_vkGetPhysicalDevicePresentRectanglesKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDevicePresentRectanglesKHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pRectCount, VkRect2D pRects, VkResult rval){
        if(PFN_vkGetPhysicalDevicePresentRectanglesKHR_p == null) PFN_vkGetPhysicalDevicePresentRectanglesKHR_p = new PFNvkGetPhysicalDevicePresentRectanglesKHR(instance);
        PFN_vkGetPhysicalDevicePresentRectanglesKHR_p.call(physicalDevice, surface, pRectCount, pRects, rval);
    }


    private PFNvkAcquireNextImage2KHR PFN_vkAcquireNextImage2KHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkAcquireNextImage2KHR.html">khronos documentation</a>
     **/
    public void vkAcquireNextImage2KHR(VkDevice device, VkAcquireNextImageInfoKHR pAcquireInfo, VkUInt32 pImageIndex, VkResult rval){
        if(PFN_vkAcquireNextImage2KHR_p == null) PFN_vkAcquireNextImage2KHR_p = new PFNvkAcquireNextImage2KHR(instance);
        PFN_vkAcquireNextImage2KHR_p.call(device, pAcquireInfo, pImageIndex, rval);
    }


    private PFNvkGetPhysicalDeviceDisplayPropertiesKHR PFN_vkGetPhysicalDeviceDisplayPropertiesKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceDisplayPropertiesKHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkDisplayPropertiesKHR pProperties, VkResult rval){
        if(PFN_vkGetPhysicalDeviceDisplayPropertiesKHR_p == null) PFN_vkGetPhysicalDeviceDisplayPropertiesKHR_p = new PFNvkGetPhysicalDeviceDisplayPropertiesKHR(instance);
        PFN_vkGetPhysicalDeviceDisplayPropertiesKHR_p.call(physicalDevice, pPropertyCount, pProperties, rval);
    }


    private PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkDisplayPlanePropertiesKHR pProperties, VkResult rval){
        if(PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR_p == null) PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR_p = new PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR(instance);
        PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR_p.call(physicalDevice, pPropertyCount, pProperties, rval);
    }


    private PFNvkGetDisplayPlaneSupportedDisplaysKHR PFN_vkGetDisplayPlaneSupportedDisplaysKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDisplayPlaneSupportedDisplaysKHR.html">khronos documentation</a>
     **/
    public void vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, VkUInt32 planeIndex, VkUInt32 pDisplayCount, VkDisplayKHR pDisplays, VkResult rval){
        if(PFN_vkGetDisplayPlaneSupportedDisplaysKHR_p == null) PFN_vkGetDisplayPlaneSupportedDisplaysKHR_p = new PFNvkGetDisplayPlaneSupportedDisplaysKHR(instance);
        PFN_vkGetDisplayPlaneSupportedDisplaysKHR_p.call(physicalDevice, planeIndex, pDisplayCount, pDisplays, rval);
    }


    private PFNvkGetDisplayModePropertiesKHR PFN_vkGetDisplayModePropertiesKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDisplayModePropertiesKHR.html">khronos documentation</a>
     **/
    public void vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkUInt32 pPropertyCount, VkDisplayModePropertiesKHR pProperties, VkResult rval){
        if(PFN_vkGetDisplayModePropertiesKHR_p == null) PFN_vkGetDisplayModePropertiesKHR_p = new PFNvkGetDisplayModePropertiesKHR(instance);
        PFN_vkGetDisplayModePropertiesKHR_p.call(physicalDevice, display, pPropertyCount, pProperties, rval);
    }


    private PFNvkCreateDisplayModeKHR PFN_vkCreateDisplayModeKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateDisplayModeKHR.html">khronos documentation</a>
     **/
    public void vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkDisplayModeCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkDisplayModeKHR pMode, VkResult rval){
        if(PFN_vkCreateDisplayModeKHR_p == null) PFN_vkCreateDisplayModeKHR_p = new PFNvkCreateDisplayModeKHR(instance);
        PFN_vkCreateDisplayModeKHR_p.call(physicalDevice, display, pCreateInfo, pAllocator, pMode, rval);
    }


    private PFNvkGetDisplayPlaneCapabilitiesKHR PFN_vkGetDisplayPlaneCapabilitiesKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDisplayPlaneCapabilitiesKHR.html">khronos documentation</a>
     **/
    public void vkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkDisplayModeKHR mode, VkUInt32 planeIndex, VkDisplayPlaneCapabilitiesKHR pCapabilities, VkResult rval){
        if(PFN_vkGetDisplayPlaneCapabilitiesKHR_p == null) PFN_vkGetDisplayPlaneCapabilitiesKHR_p = new PFNvkGetDisplayPlaneCapabilitiesKHR(instance);
        PFN_vkGetDisplayPlaneCapabilitiesKHR_p.call(physicalDevice, mode, planeIndex, pCapabilities, rval);
    }


    private PFNvkCreateDisplayPlaneSurfaceKHR PFN_vkCreateDisplayPlaneSurfaceKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateDisplayPlaneSurfaceKHR.html">khronos documentation</a>
     **/
    public void vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, VkDisplaySurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkSurfaceKHR pSurface, VkResult rval){
        if(PFN_vkCreateDisplayPlaneSurfaceKHR_p == null) PFN_vkCreateDisplayPlaneSurfaceKHR_p = new PFNvkCreateDisplayPlaneSurfaceKHR(instance);
        PFN_vkCreateDisplayPlaneSurfaceKHR_p.call(instance, pCreateInfo, pAllocator, pSurface, rval);
    }


    private PFNvkCreateSharedSwapchainsKHR PFN_vkCreateSharedSwapchainsKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateSharedSwapchainsKHR.html">khronos documentation</a>
     **/
    public void vkCreateSharedSwapchainsKHR(VkDevice device, VkUInt32 swapchainCount, VkSwapchainCreateInfoKHR pCreateInfos, VkAllocationCallbacks pAllocator, VkSwapchainKHR pSwapchains, VkResult rval){
        if(PFN_vkCreateSharedSwapchainsKHR_p == null) PFN_vkCreateSharedSwapchainsKHR_p = new PFNvkCreateSharedSwapchainsKHR(instance);
        PFN_vkCreateSharedSwapchainsKHR_p.call(device, swapchainCount, pCreateInfos, pAllocator, pSwapchains, rval);
    }


    private PFNvkGetPhysicalDeviceFeatures2KHR PFN_vkGetPhysicalDeviceFeatures2KHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceFeatures2KHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceFeatures2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures2 pFeatures){
        if(PFN_vkGetPhysicalDeviceFeatures2KHR_p == null) PFN_vkGetPhysicalDeviceFeatures2KHR_p = new PFNvkGetPhysicalDeviceFeatures2KHR(instance);
        PFN_vkGetPhysicalDeviceFeatures2KHR_p.call(physicalDevice, pFeatures);
    }


    private PFNvkGetPhysicalDeviceProperties2KHR PFN_vkGetPhysicalDeviceProperties2KHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceProperties2KHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties2 pProperties){
        if(PFN_vkGetPhysicalDeviceProperties2KHR_p == null) PFN_vkGetPhysicalDeviceProperties2KHR_p = new PFNvkGetPhysicalDeviceProperties2KHR(instance);
        PFN_vkGetPhysicalDeviceProperties2KHR_p.call(physicalDevice, pProperties);
    }


    private PFNvkGetPhysicalDeviceFormatProperties2KHR PFN_vkGetPhysicalDeviceFormatProperties2KHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceFormatProperties2KHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties2 pFormatProperties){
        if(PFN_vkGetPhysicalDeviceFormatProperties2KHR_p == null) PFN_vkGetPhysicalDeviceFormatProperties2KHR_p = new PFNvkGetPhysicalDeviceFormatProperties2KHR(instance);
        PFN_vkGetPhysicalDeviceFormatProperties2KHR_p.call(physicalDevice, format, pFormatProperties);
    }


    private PFNvkGetPhysicalDeviceImageFormatProperties2KHR PFN_vkGetPhysicalDeviceImageFormatProperties2KHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceImageFormatProperties2KHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties, VkResult rval){
        if(PFN_vkGetPhysicalDeviceImageFormatProperties2KHR_p == null) PFN_vkGetPhysicalDeviceImageFormatProperties2KHR_p = new PFNvkGetPhysicalDeviceImageFormatProperties2KHR(instance);
        PFN_vkGetPhysicalDeviceImageFormatProperties2KHR_p.call(physicalDevice, pImageFormatInfo, pImageFormatProperties, rval);
    }


    private PFNvkGetPhysicalDeviceQueueFamilyProperties2KHR PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, VkUInt32 pQueueFamilyPropertyCount, VkQueueFamilyProperties2 pQueueFamilyProperties){
        if(PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR_p == null) PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR_p = new PFNvkGetPhysicalDeviceQueueFamilyProperties2KHR(instance);
        PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR_p.call(physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties);
    }


    private PFNvkGetPhysicalDeviceMemoryProperties2KHR PFN_vkGetPhysicalDeviceMemoryProperties2KHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceMemoryProperties2KHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceMemoryProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2 pMemoryProperties){
        if(PFN_vkGetPhysicalDeviceMemoryProperties2KHR_p == null) PFN_vkGetPhysicalDeviceMemoryProperties2KHR_p = new PFNvkGetPhysicalDeviceMemoryProperties2KHR(instance);
        PFN_vkGetPhysicalDeviceMemoryProperties2KHR_p.call(physicalDevice, pMemoryProperties);
    }


    private PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, VkUInt32 pPropertyCount, VkSparseImageFormatProperties2 pProperties){
        if(PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR_p == null) PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR_p = new PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR(instance);
        PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR_p.call(physicalDevice, pFormatInfo, pPropertyCount, pProperties);
    }


    private PFNvkGetDeviceGroupPeerMemoryFeaturesKHR PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR.html">khronos documentation</a>
     **/
    public void vkGetDeviceGroupPeerMemoryFeaturesKHR(VkDevice device, VkUInt32 heapIndex, VkUInt32 localDeviceIndex, VkUInt32 remoteDeviceIndex, VkPeerMemoryFeatureFlags pPeerMemoryFeatures){
        if(PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR_p == null) PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR_p = new PFNvkGetDeviceGroupPeerMemoryFeaturesKHR(instance);
        PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR_p.call(device, heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures);
    }


    private PFNvkCmdSetDeviceMaskKHR PFN_vkCmdSetDeviceMaskKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetDeviceMaskKHR.html">khronos documentation</a>
     **/
    public void vkCmdSetDeviceMaskKHR(VkCommandBuffer commandBuffer, VkUInt32 deviceMask){
        if(PFN_vkCmdSetDeviceMaskKHR_p == null) PFN_vkCmdSetDeviceMaskKHR_p = new PFNvkCmdSetDeviceMaskKHR(instance);
        PFN_vkCmdSetDeviceMaskKHR_p.call(commandBuffer, deviceMask);
    }


    private PFNvkCmdDispatchBaseKHR PFN_vkCmdDispatchBaseKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDispatchBaseKHR.html">khronos documentation</a>
     **/
    public void vkCmdDispatchBaseKHR(VkCommandBuffer commandBuffer, VkUInt32 baseGroupX, VkUInt32 baseGroupY, VkUInt32 baseGroupZ, VkUInt32 groupCountX, VkUInt32 groupCountY, VkUInt32 groupCountZ){
        if(PFN_vkCmdDispatchBaseKHR_p == null) PFN_vkCmdDispatchBaseKHR_p = new PFNvkCmdDispatchBaseKHR(instance);
        PFN_vkCmdDispatchBaseKHR_p.call(commandBuffer, baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ);
    }


    private PFNvkTrimCommandPoolKHR PFN_vkTrimCommandPoolKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkTrimCommandPoolKHR.html">khronos documentation</a>
     **/
    public void vkTrimCommandPoolKHR(VkDevice device, VkCommandPool commandPool, VkCommandPoolTrimFlags flags){
        if(PFN_vkTrimCommandPoolKHR_p == null) PFN_vkTrimCommandPoolKHR_p = new PFNvkTrimCommandPoolKHR(instance);
        PFN_vkTrimCommandPoolKHR_p.call(device, commandPool, flags);
    }


    private PFNvkEnumeratePhysicalDeviceGroupsKHR PFN_vkEnumeratePhysicalDeviceGroupsKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkEnumeratePhysicalDeviceGroupsKHR.html">khronos documentation</a>
     **/
    public void vkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance, VkUInt32 pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties pPhysicalDeviceGroupProperties, VkResult rval){
        if(PFN_vkEnumeratePhysicalDeviceGroupsKHR_p == null) PFN_vkEnumeratePhysicalDeviceGroupsKHR_p = new PFNvkEnumeratePhysicalDeviceGroupsKHR(instance);
        PFN_vkEnumeratePhysicalDeviceGroupsKHR_p.call(instance, pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties, rval);
    }


    private PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR PFN_vkGetPhysicalDeviceExternalBufferPropertiesKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceExternalBufferPropertiesKHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceExternalBufferPropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo, VkExternalBufferProperties pExternalBufferProperties){
        if(PFN_vkGetPhysicalDeviceExternalBufferPropertiesKHR_p == null) PFN_vkGetPhysicalDeviceExternalBufferPropertiesKHR_p = new PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR(instance);
        PFN_vkGetPhysicalDeviceExternalBufferPropertiesKHR_p.call(physicalDevice, pExternalBufferInfo, pExternalBufferProperties);
    }


    private PFNvkGetMemoryFdKHR PFN_vkGetMemoryFdKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetMemoryFdKHR.html">khronos documentation</a>
     **/
    public void vkGetMemoryFdKHR(VkDevice device, VkMemoryGetFdInfoKHR pGetFdInfo, VkInt pFd, VkResult rval){
        if(PFN_vkGetMemoryFdKHR_p == null) PFN_vkGetMemoryFdKHR_p = new PFNvkGetMemoryFdKHR(instance);
        PFN_vkGetMemoryFdKHR_p.call(device, pGetFdInfo, pFd, rval);
    }


    private PFNvkGetMemoryFdPropertiesKHR PFN_vkGetMemoryFdPropertiesKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetMemoryFdPropertiesKHR.html">khronos documentation</a>
     **/
    public void vkGetMemoryFdPropertiesKHR(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, VkInt fd, VkMemoryFdPropertiesKHR pMemoryFdProperties, VkResult rval){
        if(PFN_vkGetMemoryFdPropertiesKHR_p == null) PFN_vkGetMemoryFdPropertiesKHR_p = new PFNvkGetMemoryFdPropertiesKHR(instance);
        PFN_vkGetMemoryFdPropertiesKHR_p.call(device, handleType, fd, pMemoryFdProperties, rval);
    }


    private PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR PFN_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceExternalSemaphorePropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo, VkExternalSemaphoreProperties pExternalSemaphoreProperties){
        if(PFN_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR_p == null) PFN_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR_p = new PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(instance);
        PFN_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR_p.call(physicalDevice, pExternalSemaphoreInfo, pExternalSemaphoreProperties);
    }


    private PFNvkImportSemaphoreFdKHR PFN_vkImportSemaphoreFdKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkImportSemaphoreFdKHR.html">khronos documentation</a>
     **/
    public void vkImportSemaphoreFdKHR(VkDevice device, VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo, VkResult rval){
        if(PFN_vkImportSemaphoreFdKHR_p == null) PFN_vkImportSemaphoreFdKHR_p = new PFNvkImportSemaphoreFdKHR(instance);
        PFN_vkImportSemaphoreFdKHR_p.call(device, pImportSemaphoreFdInfo, rval);
    }


    private PFNvkGetSemaphoreFdKHR PFN_vkGetSemaphoreFdKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetSemaphoreFdKHR.html">khronos documentation</a>
     **/
    public void vkGetSemaphoreFdKHR(VkDevice device, VkSemaphoreGetFdInfoKHR pGetFdInfo, VkInt pFd, VkResult rval){
        if(PFN_vkGetSemaphoreFdKHR_p == null) PFN_vkGetSemaphoreFdKHR_p = new PFNvkGetSemaphoreFdKHR(instance);
        PFN_vkGetSemaphoreFdKHR_p.call(device, pGetFdInfo, pFd, rval);
    }


    private PFNvkCmdPushDescriptorSetKHR PFN_vkCmdPushDescriptorSetKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdPushDescriptorSetKHR.html">khronos documentation</a>
     **/
    public void vkCmdPushDescriptorSetKHR(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, VkUInt32 set, VkUInt32 descriptorWriteCount, VkWriteDescriptorSet pDescriptorWrites){
        if(PFN_vkCmdPushDescriptorSetKHR_p == null) PFN_vkCmdPushDescriptorSetKHR_p = new PFNvkCmdPushDescriptorSetKHR(instance);
        PFN_vkCmdPushDescriptorSetKHR_p.call(commandBuffer, pipelineBindPoint, layout, set, descriptorWriteCount, pDescriptorWrites);
    }


    private PFNvkCmdPushDescriptorSetWithTemplateKHR PFN_vkCmdPushDescriptorSetWithTemplateKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdPushDescriptorSetWithTemplateKHR.html">khronos documentation</a>
     **/
    public void vkCmdPushDescriptorSetWithTemplateKHR(VkCommandBuffer commandBuffer, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkPipelineLayout layout, VkUInt32 set, VkObject pData){
        if(PFN_vkCmdPushDescriptorSetWithTemplateKHR_p == null) PFN_vkCmdPushDescriptorSetWithTemplateKHR_p = new PFNvkCmdPushDescriptorSetWithTemplateKHR(instance);
        PFN_vkCmdPushDescriptorSetWithTemplateKHR_p.call(commandBuffer, descriptorUpdateTemplate, layout, set, pData);
    }


    private PFNvkCreateDescriptorUpdateTemplateKHR PFN_vkCreateDescriptorUpdateTemplateKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateDescriptorUpdateTemplateKHR.html">khronos documentation</a>
     **/
    public void vkCreateDescriptorUpdateTemplateKHR(VkDevice device, VkDescriptorUpdateTemplateCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorUpdateTemplate pDescriptorUpdateTemplate, VkResult rval){
        if(PFN_vkCreateDescriptorUpdateTemplateKHR_p == null) PFN_vkCreateDescriptorUpdateTemplateKHR_p = new PFNvkCreateDescriptorUpdateTemplateKHR(instance);
        PFN_vkCreateDescriptorUpdateTemplateKHR_p.call(device, pCreateInfo, pAllocator, pDescriptorUpdateTemplate, rval);
    }


    private PFNvkDestroyDescriptorUpdateTemplateKHR PFN_vkDestroyDescriptorUpdateTemplateKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyDescriptorUpdateTemplateKHR.html">khronos documentation</a>
     **/
    public void vkDestroyDescriptorUpdateTemplateKHR(VkDevice device, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyDescriptorUpdateTemplateKHR_p == null) PFN_vkDestroyDescriptorUpdateTemplateKHR_p = new PFNvkDestroyDescriptorUpdateTemplateKHR(instance);
        PFN_vkDestroyDescriptorUpdateTemplateKHR_p.call(device, descriptorUpdateTemplate, pAllocator);
    }


    private PFNvkUpdateDescriptorSetWithTemplateKHR PFN_vkUpdateDescriptorSetWithTemplateKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkUpdateDescriptorSetWithTemplateKHR.html">khronos documentation</a>
     **/
    public void vkUpdateDescriptorSetWithTemplateKHR(VkDevice device, VkDescriptorSet descriptorSet, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkObject pData){
        if(PFN_vkUpdateDescriptorSetWithTemplateKHR_p == null) PFN_vkUpdateDescriptorSetWithTemplateKHR_p = new PFNvkUpdateDescriptorSetWithTemplateKHR(instance);
        PFN_vkUpdateDescriptorSetWithTemplateKHR_p.call(device, descriptorSet, descriptorUpdateTemplate, pData);
    }


    private PFNvkGetSwapchainStatusKHR PFN_vkGetSwapchainStatusKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetSwapchainStatusKHR.html">khronos documentation</a>
     **/
    public void vkGetSwapchainStatusKHR(VkDevice device, VkSwapchainKHR swapchain, VkResult rval){
        if(PFN_vkGetSwapchainStatusKHR_p == null) PFN_vkGetSwapchainStatusKHR_p = new PFNvkGetSwapchainStatusKHR(instance);
        PFN_vkGetSwapchainStatusKHR_p.call(device, swapchain, rval);
    }


    private PFNvkGetPhysicalDeviceExternalFencePropertiesKHR PFN_vkGetPhysicalDeviceExternalFencePropertiesKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceExternalFencePropertiesKHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceExternalFencePropertiesKHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo, VkExternalFenceProperties pExternalFenceProperties){
        if(PFN_vkGetPhysicalDeviceExternalFencePropertiesKHR_p == null) PFN_vkGetPhysicalDeviceExternalFencePropertiesKHR_p = new PFNvkGetPhysicalDeviceExternalFencePropertiesKHR(instance);
        PFN_vkGetPhysicalDeviceExternalFencePropertiesKHR_p.call(physicalDevice, pExternalFenceInfo, pExternalFenceProperties);
    }


    private PFNvkImportFenceFdKHR PFN_vkImportFenceFdKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkImportFenceFdKHR.html">khronos documentation</a>
     **/
    public void vkImportFenceFdKHR(VkDevice device, VkImportFenceFdInfoKHR pImportFenceFdInfo, VkResult rval){
        if(PFN_vkImportFenceFdKHR_p == null) PFN_vkImportFenceFdKHR_p = new PFNvkImportFenceFdKHR(instance);
        PFN_vkImportFenceFdKHR_p.call(device, pImportFenceFdInfo, rval);
    }


    private PFNvkGetFenceFdKHR PFN_vkGetFenceFdKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetFenceFdKHR.html">khronos documentation</a>
     **/
    public void vkGetFenceFdKHR(VkDevice device, VkFenceGetFdInfoKHR pGetFdInfo, VkInt pFd, VkResult rval){
        if(PFN_vkGetFenceFdKHR_p == null) PFN_vkGetFenceFdKHR_p = new PFNvkGetFenceFdKHR(instance);
        PFN_vkGetFenceFdKHR_p.call(device, pGetFdInfo, pFd, rval);
    }


    private PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VkSurfaceCapabilities2KHR pSurfaceCapabilities, VkResult rval){
        if(PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR_p == null) PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR_p = new PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR(instance);
        PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR_p.call(physicalDevice, pSurfaceInfo, pSurfaceCapabilities, rval);
    }


    private PFNvkGetPhysicalDeviceSurfaceFormats2KHR PFN_vkGetPhysicalDeviceSurfaceFormats2KHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSurfaceFormats2KHR.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VkUInt32 pSurfaceFormatCount, VkSurfaceFormat2KHR pSurfaceFormats, VkResult rval){
        if(PFN_vkGetPhysicalDeviceSurfaceFormats2KHR_p == null) PFN_vkGetPhysicalDeviceSurfaceFormats2KHR_p = new PFNvkGetPhysicalDeviceSurfaceFormats2KHR(instance);
        PFN_vkGetPhysicalDeviceSurfaceFormats2KHR_p.call(physicalDevice, pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats, rval);
    }


    private PFNvkGetImageMemoryRequirements2KHR PFN_vkGetImageMemoryRequirements2KHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetImageMemoryRequirements2KHR.html">khronos documentation</a>
     **/
    public void vkGetImageMemoryRequirements2KHR(VkDevice device, VkImageMemoryRequirementsInfo2 pInfo, VkMemoryRequirements2 pMemoryRequirements){
        if(PFN_vkGetImageMemoryRequirements2KHR_p == null) PFN_vkGetImageMemoryRequirements2KHR_p = new PFNvkGetImageMemoryRequirements2KHR(instance);
        PFN_vkGetImageMemoryRequirements2KHR_p.call(device, pInfo, pMemoryRequirements);
    }


    private PFNvkGetBufferMemoryRequirements2KHR PFN_vkGetBufferMemoryRequirements2KHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetBufferMemoryRequirements2KHR.html">khronos documentation</a>
     **/
    public void vkGetBufferMemoryRequirements2KHR(VkDevice device, VkBufferMemoryRequirementsInfo2 pInfo, VkMemoryRequirements2 pMemoryRequirements){
        if(PFN_vkGetBufferMemoryRequirements2KHR_p == null) PFN_vkGetBufferMemoryRequirements2KHR_p = new PFNvkGetBufferMemoryRequirements2KHR(instance);
        PFN_vkGetBufferMemoryRequirements2KHR_p.call(device, pInfo, pMemoryRequirements);
    }


    private PFNvkGetImageSparseMemoryRequirements2KHR PFN_vkGetImageSparseMemoryRequirements2KHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetImageSparseMemoryRequirements2KHR.html">khronos documentation</a>
     **/
    public void vkGetImageSparseMemoryRequirements2KHR(VkDevice device, VkImageSparseMemoryRequirementsInfo2 pInfo, VkUInt32 pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 pSparseMemoryRequirements){
        if(PFN_vkGetImageSparseMemoryRequirements2KHR_p == null) PFN_vkGetImageSparseMemoryRequirements2KHR_p = new PFNvkGetImageSparseMemoryRequirements2KHR(instance);
        PFN_vkGetImageSparseMemoryRequirements2KHR_p.call(device, pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements);
    }


    private PFNvkCreateSamplerYcbcrConversionKHR PFN_vkCreateSamplerYcbcrConversionKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateSamplerYcbcrConversionKHR.html">khronos documentation</a>
     **/
    public void vkCreateSamplerYcbcrConversionKHR(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSamplerYcbcrConversion pYcbcrConversion, VkResult rval){
        if(PFN_vkCreateSamplerYcbcrConversionKHR_p == null) PFN_vkCreateSamplerYcbcrConversionKHR_p = new PFNvkCreateSamplerYcbcrConversionKHR(instance);
        PFN_vkCreateSamplerYcbcrConversionKHR_p.call(device, pCreateInfo, pAllocator, pYcbcrConversion, rval);
    }


    private PFNvkDestroySamplerYcbcrConversionKHR PFN_vkDestroySamplerYcbcrConversionKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroySamplerYcbcrConversionKHR.html">khronos documentation</a>
     **/
    public void vkDestroySamplerYcbcrConversionKHR(VkDevice device, VkSamplerYcbcrConversion ycbcrConversion, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroySamplerYcbcrConversionKHR_p == null) PFN_vkDestroySamplerYcbcrConversionKHR_p = new PFNvkDestroySamplerYcbcrConversionKHR(instance);
        PFN_vkDestroySamplerYcbcrConversionKHR_p.call(device, ycbcrConversion, pAllocator);
    }


    private PFNvkBindBufferMemory2KHR PFN_vkBindBufferMemory2KHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkBindBufferMemory2KHR.html">khronos documentation</a>
     **/
    public void vkBindBufferMemory2KHR(VkDevice device, VkUInt32 bindInfoCount, VkBindBufferMemoryInfo pBindInfos, VkResult rval){
        if(PFN_vkBindBufferMemory2KHR_p == null) PFN_vkBindBufferMemory2KHR_p = new PFNvkBindBufferMemory2KHR(instance);
        PFN_vkBindBufferMemory2KHR_p.call(device, bindInfoCount, pBindInfos, rval);
    }


    private PFNvkBindImageMemory2KHR PFN_vkBindImageMemory2KHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkBindImageMemory2KHR.html">khronos documentation</a>
     **/
    public void vkBindImageMemory2KHR(VkDevice device, VkUInt32 bindInfoCount, VkBindImageMemoryInfo pBindInfos, VkResult rval){
        if(PFN_vkBindImageMemory2KHR_p == null) PFN_vkBindImageMemory2KHR_p = new PFNvkBindImageMemory2KHR(instance);
        PFN_vkBindImageMemory2KHR_p.call(device, bindInfoCount, pBindInfos, rval);
    }


    private PFNvkGetDescriptorSetLayoutSupportKHR PFN_vkGetDescriptorSetLayoutSupportKHR_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDescriptorSetLayoutSupportKHR.html">khronos documentation</a>
     **/
    public void vkGetDescriptorSetLayoutSupportKHR(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkDescriptorSetLayoutSupport pSupport){
        if(PFN_vkGetDescriptorSetLayoutSupportKHR_p == null) PFN_vkGetDescriptorSetLayoutSupportKHR_p = new PFNvkGetDescriptorSetLayoutSupportKHR(instance);
        PFN_vkGetDescriptorSetLayoutSupportKHR_p.call(device, pCreateInfo, pSupport);
    }


    private PFNvkCreateDebugReportCallbackEXT PFN_vkCreateDebugReportCallbackEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateDebugReportCallbackEXT.html">khronos documentation</a>
     **/
    public void vkCreateDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkDebugReportCallbackEXT pCallback, VkResult rval){
        if(PFN_vkCreateDebugReportCallbackEXT_p == null) PFN_vkCreateDebugReportCallbackEXT_p = new PFNvkCreateDebugReportCallbackEXT(instance);
        PFN_vkCreateDebugReportCallbackEXT_p.call(instance, pCreateInfo, pAllocator, pCallback, rval);
    }


    private PFNvkDestroyDebugReportCallbackEXT PFN_vkDestroyDebugReportCallbackEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyDebugReportCallbackEXT.html">khronos documentation</a>
     **/
    public void vkDestroyDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackEXT callback, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyDebugReportCallbackEXT_p == null) PFN_vkDestroyDebugReportCallbackEXT_p = new PFNvkDestroyDebugReportCallbackEXT(instance);
        PFN_vkDestroyDebugReportCallbackEXT_p.call(instance, callback, pAllocator);
    }


    private PFNvkDebugReportMessageEXT PFN_vkDebugReportMessageEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDebugReportMessageEXT.html">khronos documentation</a>
     **/
    public void vkDebugReportMessageEXT(VkInstance instance, VkDebugReportFlagsEXT flags, VkDebugReportObjectTypeEXT objectType, VkUInt64 object, VkSize location, VkInt32 messageCode, VkChar pLayerPrefix, VkChar pMessage){
        if(PFN_vkDebugReportMessageEXT_p == null) PFN_vkDebugReportMessageEXT_p = new PFNvkDebugReportMessageEXT(instance);
        PFN_vkDebugReportMessageEXT_p.call(instance, flags, objectType, object, location, messageCode, pLayerPrefix, pMessage);
    }


    private PFNvkDebugMarkerSetObjectTagEXT PFN_vkDebugMarkerSetObjectTagEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDebugMarkerSetObjectTagEXT.html">khronos documentation</a>
     **/
    public void vkDebugMarkerSetObjectTagEXT(VkDevice device, VkDebugMarkerObjectTagInfoEXT pTagInfo, VkResult rval){
        if(PFN_vkDebugMarkerSetObjectTagEXT_p == null) PFN_vkDebugMarkerSetObjectTagEXT_p = new PFNvkDebugMarkerSetObjectTagEXT(instance);
        PFN_vkDebugMarkerSetObjectTagEXT_p.call(device, pTagInfo, rval);
    }


    private PFNvkDebugMarkerSetObjectNameEXT PFN_vkDebugMarkerSetObjectNameEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDebugMarkerSetObjectNameEXT.html">khronos documentation</a>
     **/
    public void vkDebugMarkerSetObjectNameEXT(VkDevice device, VkDebugMarkerObjectNameInfoEXT pNameInfo, VkResult rval){
        if(PFN_vkDebugMarkerSetObjectNameEXT_p == null) PFN_vkDebugMarkerSetObjectNameEXT_p = new PFNvkDebugMarkerSetObjectNameEXT(instance);
        PFN_vkDebugMarkerSetObjectNameEXT_p.call(device, pNameInfo, rval);
    }


    private PFNvkCmdDebugMarkerBeginEXT PFN_vkCmdDebugMarkerBeginEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDebugMarkerBeginEXT.html">khronos documentation</a>
     **/
    public void vkCmdDebugMarkerBeginEXT(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT pMarkerInfo){
        if(PFN_vkCmdDebugMarkerBeginEXT_p == null) PFN_vkCmdDebugMarkerBeginEXT_p = new PFNvkCmdDebugMarkerBeginEXT(instance);
        PFN_vkCmdDebugMarkerBeginEXT_p.call(commandBuffer, pMarkerInfo);
    }


    private PFNvkCmdDebugMarkerEndEXT PFN_vkCmdDebugMarkerEndEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDebugMarkerEndEXT.html">khronos documentation</a>
     **/
    public void vkCmdDebugMarkerEndEXT(VkCommandBuffer commandBuffer){
        if(PFN_vkCmdDebugMarkerEndEXT_p == null) PFN_vkCmdDebugMarkerEndEXT_p = new PFNvkCmdDebugMarkerEndEXT(instance);
        PFN_vkCmdDebugMarkerEndEXT_p.call(commandBuffer);
    }


    private PFNvkCmdDebugMarkerInsertEXT PFN_vkCmdDebugMarkerInsertEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDebugMarkerInsertEXT.html">khronos documentation</a>
     **/
    public void vkCmdDebugMarkerInsertEXT(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT pMarkerInfo){
        if(PFN_vkCmdDebugMarkerInsertEXT_p == null) PFN_vkCmdDebugMarkerInsertEXT_p = new PFNvkCmdDebugMarkerInsertEXT(instance);
        PFN_vkCmdDebugMarkerInsertEXT_p.call(commandBuffer, pMarkerInfo);
    }


    private PFNvkCmdDrawIndirectCountAMD PFN_vkCmdDrawIndirectCountAMD_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDrawIndirectCountAMD.html">khronos documentation</a>
     **/
    public void vkCmdDrawIndirectCountAMD(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkBuffer countBuffer, VkDeviceSize countBufferOffset, VkUInt32 maxDrawCount, VkUInt32 stride){
        if(PFN_vkCmdDrawIndirectCountAMD_p == null) PFN_vkCmdDrawIndirectCountAMD_p = new PFNvkCmdDrawIndirectCountAMD(instance);
        PFN_vkCmdDrawIndirectCountAMD_p.call(commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);
    }


    private PFNvkCmdDrawIndexedIndirectCountAMD PFN_vkCmdDrawIndexedIndirectCountAMD_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDrawIndexedIndirectCountAMD.html">khronos documentation</a>
     **/
    public void vkCmdDrawIndexedIndirectCountAMD(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkBuffer countBuffer, VkDeviceSize countBufferOffset, VkUInt32 maxDrawCount, VkUInt32 stride){
        if(PFN_vkCmdDrawIndexedIndirectCountAMD_p == null) PFN_vkCmdDrawIndexedIndirectCountAMD_p = new PFNvkCmdDrawIndexedIndirectCountAMD(instance);
        PFN_vkCmdDrawIndexedIndirectCountAMD_p.call(commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);
    }


    private PFNvkGetShaderInfoAMD PFN_vkGetShaderInfoAMD_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetShaderInfoAMD.html">khronos documentation</a>
     **/
    public void vkGetShaderInfoAMD(VkDevice device, VkPipeline pipeline, VkShaderStageFlagBits shaderStage, VkShaderInfoTypeAMD infoType, VkSize pInfoSize, VkObject pInfo, VkResult rval){
        if(PFN_vkGetShaderInfoAMD_p == null) PFN_vkGetShaderInfoAMD_p = new PFNvkGetShaderInfoAMD(instance);
        PFN_vkGetShaderInfoAMD_p.call(device, pipeline, shaderStage, infoType, pInfoSize, pInfo, rval);
    }


    private PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags, VkExternalMemoryHandleTypeFlagsNV externalHandleType, VkExternalImageFormatPropertiesNV pExternalImageFormatProperties, VkResult rval){
        if(PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV_p == null) PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV_p = new PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV(instance);
        PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV_p.call(physicalDevice, format, type, tiling, usage, flags, externalHandleType, pExternalImageFormatProperties, rval);
    }


    private PFNvkCmdProcessCommandsNVX PFN_vkCmdProcessCommandsNVX_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdProcessCommandsNVX.html">khronos documentation</a>
     **/
    public void vkCmdProcessCommandsNVX(VkCommandBuffer commandBuffer, VkCmdProcessCommandsInfoNVX pProcessCommandsInfo){
        if(PFN_vkCmdProcessCommandsNVX_p == null) PFN_vkCmdProcessCommandsNVX_p = new PFNvkCmdProcessCommandsNVX(instance);
        PFN_vkCmdProcessCommandsNVX_p.call(commandBuffer, pProcessCommandsInfo);
    }


    private PFNvkCmdReserveSpaceForCommandsNVX PFN_vkCmdReserveSpaceForCommandsNVX_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdReserveSpaceForCommandsNVX.html">khronos documentation</a>
     **/
    public void vkCmdReserveSpaceForCommandsNVX(VkCommandBuffer commandBuffer, VkCmdReserveSpaceForCommandsInfoNVX pReserveSpaceInfo){
        if(PFN_vkCmdReserveSpaceForCommandsNVX_p == null) PFN_vkCmdReserveSpaceForCommandsNVX_p = new PFNvkCmdReserveSpaceForCommandsNVX(instance);
        PFN_vkCmdReserveSpaceForCommandsNVX_p.call(commandBuffer, pReserveSpaceInfo);
    }


    private PFNvkCreateIndirectCommandsLayoutNVX PFN_vkCreateIndirectCommandsLayoutNVX_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateIndirectCommandsLayoutNVX.html">khronos documentation</a>
     **/
    public void vkCreateIndirectCommandsLayoutNVX(VkDevice device, VkIndirectCommandsLayoutCreateInfoNVX pCreateInfo, VkAllocationCallbacks pAllocator, VkIndirectCommandsLayoutNVX pIndirectCommandsLayout, VkResult rval){
        if(PFN_vkCreateIndirectCommandsLayoutNVX_p == null) PFN_vkCreateIndirectCommandsLayoutNVX_p = new PFNvkCreateIndirectCommandsLayoutNVX(instance);
        PFN_vkCreateIndirectCommandsLayoutNVX_p.call(device, pCreateInfo, pAllocator, pIndirectCommandsLayout, rval);
    }


    private PFNvkDestroyIndirectCommandsLayoutNVX PFN_vkDestroyIndirectCommandsLayoutNVX_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyIndirectCommandsLayoutNVX.html">khronos documentation</a>
     **/
    public void vkDestroyIndirectCommandsLayoutNVX(VkDevice device, VkIndirectCommandsLayoutNVX indirectCommandsLayout, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyIndirectCommandsLayoutNVX_p == null) PFN_vkDestroyIndirectCommandsLayoutNVX_p = new PFNvkDestroyIndirectCommandsLayoutNVX(instance);
        PFN_vkDestroyIndirectCommandsLayoutNVX_p.call(device, indirectCommandsLayout, pAllocator);
    }


    private PFNvkCreateObjectTableNVX PFN_vkCreateObjectTableNVX_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateObjectTableNVX.html">khronos documentation</a>
     **/
    public void vkCreateObjectTableNVX(VkDevice device, VkObjectTableCreateInfoNVX pCreateInfo, VkAllocationCallbacks pAllocator, VkObjectTableNVX pObjectTable, VkResult rval){
        if(PFN_vkCreateObjectTableNVX_p == null) PFN_vkCreateObjectTableNVX_p = new PFNvkCreateObjectTableNVX(instance);
        PFN_vkCreateObjectTableNVX_p.call(device, pCreateInfo, pAllocator, pObjectTable, rval);
    }


    private PFNvkDestroyObjectTableNVX PFN_vkDestroyObjectTableNVX_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyObjectTableNVX.html">khronos documentation</a>
     **/
    public void vkDestroyObjectTableNVX(VkDevice device, VkObjectTableNVX objectTable, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyObjectTableNVX_p == null) PFN_vkDestroyObjectTableNVX_p = new PFNvkDestroyObjectTableNVX(instance);
        PFN_vkDestroyObjectTableNVX_p.call(device, objectTable, pAllocator);
    }


    private PFNvkRegisterObjectsNVX PFN_vkRegisterObjectsNVX_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkRegisterObjectsNVX.html">khronos documentation</a>
     **/
    public void vkRegisterObjectsNVX(VkDevice device, VkObjectTableNVX objectTable, VkUInt32 objectCount, VkObjectTableEntryNVX.Pointer ppObjectTableEntries, VkUInt32 pObjectIndices, VkResult rval){
        if(PFN_vkRegisterObjectsNVX_p == null) PFN_vkRegisterObjectsNVX_p = new PFNvkRegisterObjectsNVX(instance);
        PFN_vkRegisterObjectsNVX_p.call(device, objectTable, objectCount, ppObjectTableEntries, pObjectIndices, rval);
    }


    private PFNvkUnregisterObjectsNVX PFN_vkUnregisterObjectsNVX_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkUnregisterObjectsNVX.html">khronos documentation</a>
     **/
    public void vkUnregisterObjectsNVX(VkDevice device, VkObjectTableNVX objectTable, VkUInt32 objectCount, VkObjectEntryTypeNVX pObjectEntryTypes, VkUInt32 pObjectIndices, VkResult rval){
        if(PFN_vkUnregisterObjectsNVX_p == null) PFN_vkUnregisterObjectsNVX_p = new PFNvkUnregisterObjectsNVX(instance);
        PFN_vkUnregisterObjectsNVX_p.call(device, objectTable, objectCount, pObjectEntryTypes, pObjectIndices, rval);
    }


    private PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX PFN_vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(VkPhysicalDevice physicalDevice, VkDeviceGeneratedCommandsFeaturesNVX pFeatures, VkDeviceGeneratedCommandsLimitsNVX pLimits){
        if(PFN_vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX_p == null) PFN_vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX_p = new PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(instance);
        PFN_vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX_p.call(physicalDevice, pFeatures, pLimits);
    }


    private PFNvkCmdSetViewportWScalingNV PFN_vkCmdSetViewportWScalingNV_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetViewportWScalingNV.html">khronos documentation</a>
     **/
    public void vkCmdSetViewportWScalingNV(VkCommandBuffer commandBuffer, VkUInt32 firstViewport, VkUInt32 viewportCount, VkViewportWScalingNV pViewportWScalings){
        if(PFN_vkCmdSetViewportWScalingNV_p == null) PFN_vkCmdSetViewportWScalingNV_p = new PFNvkCmdSetViewportWScalingNV(instance);
        PFN_vkCmdSetViewportWScalingNV_p.call(commandBuffer, firstViewport, viewportCount, pViewportWScalings);
    }


    private PFNvkReleaseDisplayEXT PFN_vkReleaseDisplayEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkReleaseDisplayEXT.html">khronos documentation</a>
     **/
    public void vkReleaseDisplayEXT(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkResult rval){
        if(PFN_vkReleaseDisplayEXT_p == null) PFN_vkReleaseDisplayEXT_p = new PFNvkReleaseDisplayEXT(instance);
        PFN_vkReleaseDisplayEXT_p.call(physicalDevice, display, rval);
    }


    private PFNvkGetPhysicalDeviceSurfaceCapabilities2EXT PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceSurfaceCapabilities2EXT(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilities2EXT pSurfaceCapabilities, VkResult rval){
        if(PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT_p == null) PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT_p = new PFNvkGetPhysicalDeviceSurfaceCapabilities2EXT(instance);
        PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT_p.call(physicalDevice, surface, pSurfaceCapabilities, rval);
    }


    private PFNvkDisplayPowerControlEXT PFN_vkDisplayPowerControlEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDisplayPowerControlEXT.html">khronos documentation</a>
     **/
    public void vkDisplayPowerControlEXT(VkDevice device, VkDisplayKHR display, VkDisplayPowerInfoEXT pDisplayPowerInfo, VkResult rval){
        if(PFN_vkDisplayPowerControlEXT_p == null) PFN_vkDisplayPowerControlEXT_p = new PFNvkDisplayPowerControlEXT(instance);
        PFN_vkDisplayPowerControlEXT_p.call(device, display, pDisplayPowerInfo, rval);
    }


    private PFNvkRegisterDeviceEventEXT PFN_vkRegisterDeviceEventEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkRegisterDeviceEventEXT.html">khronos documentation</a>
     **/
    public void vkRegisterDeviceEventEXT(VkDevice device, VkDeviceEventInfoEXT pDeviceEventInfo, VkAllocationCallbacks pAllocator, VkFence pFence, VkResult rval){
        if(PFN_vkRegisterDeviceEventEXT_p == null) PFN_vkRegisterDeviceEventEXT_p = new PFNvkRegisterDeviceEventEXT(instance);
        PFN_vkRegisterDeviceEventEXT_p.call(device, pDeviceEventInfo, pAllocator, pFence, rval);
    }


    private PFNvkRegisterDisplayEventEXT PFN_vkRegisterDisplayEventEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkRegisterDisplayEventEXT.html">khronos documentation</a>
     **/
    public void vkRegisterDisplayEventEXT(VkDevice device, VkDisplayKHR display, VkDisplayEventInfoEXT pDisplayEventInfo, VkAllocationCallbacks pAllocator, VkFence pFence, VkResult rval){
        if(PFN_vkRegisterDisplayEventEXT_p == null) PFN_vkRegisterDisplayEventEXT_p = new PFNvkRegisterDisplayEventEXT(instance);
        PFN_vkRegisterDisplayEventEXT_p.call(device, display, pDisplayEventInfo, pAllocator, pFence, rval);
    }


    private PFNvkGetSwapchainCounterEXT PFN_vkGetSwapchainCounterEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetSwapchainCounterEXT.html">khronos documentation</a>
     **/
    public void vkGetSwapchainCounterEXT(VkDevice device, VkSwapchainKHR swapchain, VkSurfaceCounterFlagBitsEXT counter, VkUInt64 pCounterValue, VkResult rval){
        if(PFN_vkGetSwapchainCounterEXT_p == null) PFN_vkGetSwapchainCounterEXT_p = new PFNvkGetSwapchainCounterEXT(instance);
        PFN_vkGetSwapchainCounterEXT_p.call(device, swapchain, counter, pCounterValue, rval);
    }


    private PFNvkGetRefreshCycleDurationGOOGLE PFN_vkGetRefreshCycleDurationGOOGLE_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetRefreshCycleDurationGOOGLE.html">khronos documentation</a>
     **/
    public void vkGetRefreshCycleDurationGOOGLE(VkDevice device, VkSwapchainKHR swapchain, VkRefreshCycleDurationGOOGLE pDisplayTimingProperties, VkResult rval){
        if(PFN_vkGetRefreshCycleDurationGOOGLE_p == null) PFN_vkGetRefreshCycleDurationGOOGLE_p = new PFNvkGetRefreshCycleDurationGOOGLE(instance);
        PFN_vkGetRefreshCycleDurationGOOGLE_p.call(device, swapchain, pDisplayTimingProperties, rval);
    }


    private PFNvkGetPastPresentationTimingGOOGLE PFN_vkGetPastPresentationTimingGOOGLE_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPastPresentationTimingGOOGLE.html">khronos documentation</a>
     **/
    public void vkGetPastPresentationTimingGOOGLE(VkDevice device, VkSwapchainKHR swapchain, VkUInt32 pPresentationTimingCount, VkPastPresentationTimingGOOGLE pPresentationTimings, VkResult rval){
        if(PFN_vkGetPastPresentationTimingGOOGLE_p == null) PFN_vkGetPastPresentationTimingGOOGLE_p = new PFNvkGetPastPresentationTimingGOOGLE(instance);
        PFN_vkGetPastPresentationTimingGOOGLE_p.call(device, swapchain, pPresentationTimingCount, pPresentationTimings, rval);
    }


    private PFNvkCmdSetDiscardRectangleEXT PFN_vkCmdSetDiscardRectangleEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetDiscardRectangleEXT.html">khronos documentation</a>
     **/
    public void vkCmdSetDiscardRectangleEXT(VkCommandBuffer commandBuffer, VkUInt32 firstDiscardRectangle, VkUInt32 discardRectangleCount, VkRect2D pDiscardRectangles){
        if(PFN_vkCmdSetDiscardRectangleEXT_p == null) PFN_vkCmdSetDiscardRectangleEXT_p = new PFNvkCmdSetDiscardRectangleEXT(instance);
        PFN_vkCmdSetDiscardRectangleEXT_p.call(commandBuffer, firstDiscardRectangle, discardRectangleCount, pDiscardRectangles);
    }


    private PFNvkSetHdrMetadataEXT PFN_vkSetHdrMetadataEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkSetHdrMetadataEXT.html">khronos documentation</a>
     **/
    public void vkSetHdrMetadataEXT(VkDevice device, VkUInt32 swapchainCount, VkSwapchainKHR pSwapchains, VkHdrMetadataEXT pMetadata){
        if(PFN_vkSetHdrMetadataEXT_p == null) PFN_vkSetHdrMetadataEXT_p = new PFNvkSetHdrMetadataEXT(instance);
        PFN_vkSetHdrMetadataEXT_p.call(device, swapchainCount, pSwapchains, pMetadata);
    }


    private PFNvkSetDebugUtilsObjectNameEXT PFN_vkSetDebugUtilsObjectNameEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkSetDebugUtilsObjectNameEXT.html">khronos documentation</a>
     **/
    public void vkSetDebugUtilsObjectNameEXT(VkDevice device, VkDebugUtilsObjectNameInfoEXT pNameInfo, VkResult rval){
        if(PFN_vkSetDebugUtilsObjectNameEXT_p == null) PFN_vkSetDebugUtilsObjectNameEXT_p = new PFNvkSetDebugUtilsObjectNameEXT(instance);
        PFN_vkSetDebugUtilsObjectNameEXT_p.call(device, pNameInfo, rval);
    }


    private PFNvkSetDebugUtilsObjectTagEXT PFN_vkSetDebugUtilsObjectTagEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkSetDebugUtilsObjectTagEXT.html">khronos documentation</a>
     **/
    public void vkSetDebugUtilsObjectTagEXT(VkDevice device, VkDebugUtilsObjectTagInfoEXT pTagInfo, VkResult rval){
        if(PFN_vkSetDebugUtilsObjectTagEXT_p == null) PFN_vkSetDebugUtilsObjectTagEXT_p = new PFNvkSetDebugUtilsObjectTagEXT(instance);
        PFN_vkSetDebugUtilsObjectTagEXT_p.call(device, pTagInfo, rval);
    }


    private PFNvkQueueBeginDebugUtilsLabelEXT PFN_vkQueueBeginDebugUtilsLabelEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkQueueBeginDebugUtilsLabelEXT.html">khronos documentation</a>
     **/
    public void vkQueueBeginDebugUtilsLabelEXT(VkQueue queue, VkDebugUtilsLabelEXT pLabelInfo){
        if(PFN_vkQueueBeginDebugUtilsLabelEXT_p == null) PFN_vkQueueBeginDebugUtilsLabelEXT_p = new PFNvkQueueBeginDebugUtilsLabelEXT(instance);
        PFN_vkQueueBeginDebugUtilsLabelEXT_p.call(queue, pLabelInfo);
    }


    private PFNvkQueueEndDebugUtilsLabelEXT PFN_vkQueueEndDebugUtilsLabelEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkQueueEndDebugUtilsLabelEXT.html">khronos documentation</a>
     **/
    public void vkQueueEndDebugUtilsLabelEXT(VkQueue queue){
        if(PFN_vkQueueEndDebugUtilsLabelEXT_p == null) PFN_vkQueueEndDebugUtilsLabelEXT_p = new PFNvkQueueEndDebugUtilsLabelEXT(instance);
        PFN_vkQueueEndDebugUtilsLabelEXT_p.call(queue);
    }


    private PFNvkQueueInsertDebugUtilsLabelEXT PFN_vkQueueInsertDebugUtilsLabelEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkQueueInsertDebugUtilsLabelEXT.html">khronos documentation</a>
     **/
    public void vkQueueInsertDebugUtilsLabelEXT(VkQueue queue, VkDebugUtilsLabelEXT pLabelInfo){
        if(PFN_vkQueueInsertDebugUtilsLabelEXT_p == null) PFN_vkQueueInsertDebugUtilsLabelEXT_p = new PFNvkQueueInsertDebugUtilsLabelEXT(instance);
        PFN_vkQueueInsertDebugUtilsLabelEXT_p.call(queue, pLabelInfo);
    }


    private PFNvkCmdBeginDebugUtilsLabelEXT PFN_vkCmdBeginDebugUtilsLabelEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdBeginDebugUtilsLabelEXT.html">khronos documentation</a>
     **/
    public void vkCmdBeginDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, VkDebugUtilsLabelEXT pLabelInfo){
        if(PFN_vkCmdBeginDebugUtilsLabelEXT_p == null) PFN_vkCmdBeginDebugUtilsLabelEXT_p = new PFNvkCmdBeginDebugUtilsLabelEXT(instance);
        PFN_vkCmdBeginDebugUtilsLabelEXT_p.call(commandBuffer, pLabelInfo);
    }


    private PFNvkCmdEndDebugUtilsLabelEXT PFN_vkCmdEndDebugUtilsLabelEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdEndDebugUtilsLabelEXT.html">khronos documentation</a>
     **/
    public void vkCmdEndDebugUtilsLabelEXT(VkCommandBuffer commandBuffer){
        if(PFN_vkCmdEndDebugUtilsLabelEXT_p == null) PFN_vkCmdEndDebugUtilsLabelEXT_p = new PFNvkCmdEndDebugUtilsLabelEXT(instance);
        PFN_vkCmdEndDebugUtilsLabelEXT_p.call(commandBuffer);
    }


    private PFNvkCmdInsertDebugUtilsLabelEXT PFN_vkCmdInsertDebugUtilsLabelEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdInsertDebugUtilsLabelEXT.html">khronos documentation</a>
     **/
    public void vkCmdInsertDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, VkDebugUtilsLabelEXT pLabelInfo){
        if(PFN_vkCmdInsertDebugUtilsLabelEXT_p == null) PFN_vkCmdInsertDebugUtilsLabelEXT_p = new PFNvkCmdInsertDebugUtilsLabelEXT(instance);
        PFN_vkCmdInsertDebugUtilsLabelEXT_p.call(commandBuffer, pLabelInfo);
    }


    private PFNvkCreateDebugUtilsMessengerEXT PFN_vkCreateDebugUtilsMessengerEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateDebugUtilsMessengerEXT.html">khronos documentation</a>
     **/
    public void vkCreateDebugUtilsMessengerEXT(VkInstance instance, VkDebugUtilsMessengerCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkDebugUtilsMessengerEXT pMessenger, VkResult rval){
        if(PFN_vkCreateDebugUtilsMessengerEXT_p == null) PFN_vkCreateDebugUtilsMessengerEXT_p = new PFNvkCreateDebugUtilsMessengerEXT(instance);
        PFN_vkCreateDebugUtilsMessengerEXT_p.call(instance, pCreateInfo, pAllocator, pMessenger, rval);
    }


    private PFNvkDestroyDebugUtilsMessengerEXT PFN_vkDestroyDebugUtilsMessengerEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyDebugUtilsMessengerEXT.html">khronos documentation</a>
     **/
    public void vkDestroyDebugUtilsMessengerEXT(VkInstance instance, VkDebugUtilsMessengerEXT messenger, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyDebugUtilsMessengerEXT_p == null) PFN_vkDestroyDebugUtilsMessengerEXT_p = new PFNvkDestroyDebugUtilsMessengerEXT(instance);
        PFN_vkDestroyDebugUtilsMessengerEXT_p.call(instance, messenger, pAllocator);
    }


    private PFNvkSubmitDebugUtilsMessageEXT PFN_vkSubmitDebugUtilsMessageEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkSubmitDebugUtilsMessageEXT.html">khronos documentation</a>
     **/
    public void vkSubmitDebugUtilsMessageEXT(VkInstance instance, VkDebugUtilsMessageSeverityFlagBitsEXT messageSeverity, VkDebugUtilsMessageTypeFlagsEXT messageTypes, VkDebugUtilsMessengerCallbackDataEXT pCallbackData){
        if(PFN_vkSubmitDebugUtilsMessageEXT_p == null) PFN_vkSubmitDebugUtilsMessageEXT_p = new PFNvkSubmitDebugUtilsMessageEXT(instance);
        PFN_vkSubmitDebugUtilsMessageEXT_p.call(instance, messageSeverity, messageTypes, pCallbackData);
    }


    private PFNvkCmdSetSampleLocationsEXT PFN_vkCmdSetSampleLocationsEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetSampleLocationsEXT.html">khronos documentation</a>
     **/
    public void vkCmdSetSampleLocationsEXT(VkCommandBuffer commandBuffer, VkSampleLocationsInfoEXT pSampleLocationsInfo){
        if(PFN_vkCmdSetSampleLocationsEXT_p == null) PFN_vkCmdSetSampleLocationsEXT_p = new PFNvkCmdSetSampleLocationsEXT(instance);
        PFN_vkCmdSetSampleLocationsEXT_p.call(commandBuffer, pSampleLocationsInfo);
    }


    private PFNvkGetPhysicalDeviceMultisamplePropertiesEXT PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceMultisamplePropertiesEXT(VkPhysicalDevice physicalDevice, VkSampleCountFlagBits samples, VkMultisamplePropertiesEXT pMultisampleProperties){
        if(PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT_p == null) PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT_p = new PFNvkGetPhysicalDeviceMultisamplePropertiesEXT(instance);
        PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT_p.call(physicalDevice, samples, pMultisampleProperties);
    }


    private PFNvkCreateValidationCacheEXT PFN_vkCreateValidationCacheEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateValidationCacheEXT.html">khronos documentation</a>
     **/
    public void vkCreateValidationCacheEXT(VkDevice device, VkValidationCacheCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkValidationCacheEXT pValidationCache, VkResult rval){
        if(PFN_vkCreateValidationCacheEXT_p == null) PFN_vkCreateValidationCacheEXT_p = new PFNvkCreateValidationCacheEXT(instance);
        PFN_vkCreateValidationCacheEXT_p.call(device, pCreateInfo, pAllocator, pValidationCache, rval);
    }


    private PFNvkDestroyValidationCacheEXT PFN_vkDestroyValidationCacheEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyValidationCacheEXT.html">khronos documentation</a>
     **/
    public void vkDestroyValidationCacheEXT(VkDevice device, VkValidationCacheEXT validationCache, VkAllocationCallbacks pAllocator){
        if(PFN_vkDestroyValidationCacheEXT_p == null) PFN_vkDestroyValidationCacheEXT_p = new PFNvkDestroyValidationCacheEXT(instance);
        PFN_vkDestroyValidationCacheEXT_p.call(device, validationCache, pAllocator);
    }


    private PFNvkMergeValidationCachesEXT PFN_vkMergeValidationCachesEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkMergeValidationCachesEXT.html">khronos documentation</a>
     **/
    public void vkMergeValidationCachesEXT(VkDevice device, VkValidationCacheEXT dstCache, VkUInt32 srcCacheCount, VkValidationCacheEXT pSrcCaches, VkResult rval){
        if(PFN_vkMergeValidationCachesEXT_p == null) PFN_vkMergeValidationCachesEXT_p = new PFNvkMergeValidationCachesEXT(instance);
        PFN_vkMergeValidationCachesEXT_p.call(device, dstCache, srcCacheCount, pSrcCaches, rval);
    }


    private PFNvkGetValidationCacheDataEXT PFN_vkGetValidationCacheDataEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetValidationCacheDataEXT.html">khronos documentation</a>
     **/
    public void vkGetValidationCacheDataEXT(VkDevice device, VkValidationCacheEXT validationCache, VkSize pDataSize, VkObject pData, VkResult rval){
        if(PFN_vkGetValidationCacheDataEXT_p == null) PFN_vkGetValidationCacheDataEXT_p = new PFNvkGetValidationCacheDataEXT(instance);
        PFN_vkGetValidationCacheDataEXT_p.call(device, validationCache, pDataSize, pData, rval);
    }


    private PFNvkGetMemoryHostPointerPropertiesEXT PFN_vkGetMemoryHostPointerPropertiesEXT_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetMemoryHostPointerPropertiesEXT.html">khronos documentation</a>
     **/
    public void vkGetMemoryHostPointerPropertiesEXT(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, VkObject pHostPointer, VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties, VkResult rval){
        if(PFN_vkGetMemoryHostPointerPropertiesEXT_p == null) PFN_vkGetMemoryHostPointerPropertiesEXT_p = new PFNvkGetMemoryHostPointerPropertiesEXT(instance);
        PFN_vkGetMemoryHostPointerPropertiesEXT_p.call(device, handleType, pHostPointer, pMemoryHostPointerProperties, rval);
    }


    private PFNvkCmdWriteBufferMarkerAMD PFN_vkCmdWriteBufferMarkerAMD_p = null;

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdWriteBufferMarkerAMD.html">khronos documentation</a>
     **/
    public void vkCmdWriteBufferMarkerAMD(VkCommandBuffer commandBuffer, VkPipelineStageFlagBits pipelineStage, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkUInt32 marker){
        if(PFN_vkCmdWriteBufferMarkerAMD_p == null) PFN_vkCmdWriteBufferMarkerAMD_p = new PFNvkCmdWriteBufferMarkerAMD(instance);
        PFN_vkCmdWriteBufferMarkerAMD_p.call(commandBuffer, pipelineStage, dstBuffer, dstOffset, marker);
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
}
