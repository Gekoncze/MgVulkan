package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/">khronos documentation</a>
 **/
public class Vulkan {
    private final Vk vk;

    public Vulkan(){
        this.vk = new Vk();
    }

    public Vulkan(Vk vk){
        this.vk = vk;
    }

    public Vk getVk(){
        return vk;
    }

    public static final long VERSION_1_0 = Vk.VK_VERSION_1_0;
    public static final long HEADER_VERSION = Vk.VK_HEADER_VERSION;
    public static final long NULL_HANDLE = Vk.VK_NULL_HANDLE;
    public static final long LOD_CLAMP_NONE = Vk.VK_LOD_CLAMP_NONE;
    public static final long REMAINING_MIP_LEVELS = Vk.VK_REMAINING_MIP_LEVELS;
    public static final long REMAINING_ARRAY_LAYERS = Vk.VK_REMAINING_ARRAY_LAYERS;
    public static final long WHOLE_SIZE = Vk.VK_WHOLE_SIZE;
    public static final long ATTACHMENT_UNUSED = Vk.VK_ATTACHMENT_UNUSED;
    public static final long TRUE = Vk.VK_TRUE;
    public static final long FALSE = Vk.VK_FALSE;
    public static final long QUEUE_FAMILY_IGNORED = Vk.VK_QUEUE_FAMILY_IGNORED;
    public static final long SUBPASS_EXTERNAL = Vk.VK_SUBPASS_EXTERNAL;
    public static final long MAX_PHYSICAL_DEVICE_NAME_SIZE = Vk.VK_MAX_PHYSICAL_DEVICE_NAME_SIZE;
    public static final long UUID_SIZE = Vk.VK_UUID_SIZE;
    public static final long MAX_MEMORY_TYPES = Vk.VK_MAX_MEMORY_TYPES;
    public static final long MAX_MEMORY_HEAPS = Vk.VK_MAX_MEMORY_HEAPS;
    public static final long MAX_EXTENSION_NAME_SIZE = Vk.VK_MAX_EXTENSION_NAME_SIZE;
    public static final long MAX_DESCRIPTION_SIZE = Vk.VK_MAX_DESCRIPTION_SIZE;
    public static final long VERSION_1_1 = Vk.VK_VERSION_1_1;
    public static final long MAX_DEVICE_GROUP_SIZE = Vk.VK_MAX_DEVICE_GROUP_SIZE;
    public static final long LUID_SIZE = Vk.VK_LUID_SIZE;
    public static final long QUEUE_FAMILY_EXTERNAL = Vk.VK_QUEUE_FAMILY_EXTERNAL;
    public static final long KHR_surface = Vk.VK_KHR_surface;
    public static final long KHR_SURFACE_SPEC_VERSION = Vk.VK_KHR_SURFACE_SPEC_VERSION;
    public static final String KHR_SURFACE_EXTENSION_NAME = Vk.VK_KHR_SURFACE_EXTENSION_NAME;
    public static final long COLORSPACE_SRGB_NONLINEAR_KHR = Vk.VK_COLORSPACE_SRGB_NONLINEAR_KHR;
    public static final long KHR_swapchain = Vk.VK_KHR_swapchain;
    public static final long KHR_SWAPCHAIN_SPEC_VERSION = Vk.VK_KHR_SWAPCHAIN_SPEC_VERSION;
    public static final String KHR_SWAPCHAIN_EXTENSION_NAME = Vk.VK_KHR_SWAPCHAIN_EXTENSION_NAME;
    public static final long KHR_display = Vk.VK_KHR_display;
    public static final long KHR_DISPLAY_SPEC_VERSION = Vk.VK_KHR_DISPLAY_SPEC_VERSION;
    public static final String KHR_DISPLAY_EXTENSION_NAME = Vk.VK_KHR_DISPLAY_EXTENSION_NAME;
    public static final long KHR_display_swapchain = Vk.VK_KHR_display_swapchain;
    public static final long KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION = Vk.VK_KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION;
    public static final String KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME = Vk.VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME;
    public static final long KHR_sampler_mirror_clamp_to_edge = Vk.VK_KHR_sampler_mirror_clamp_to_edge;
    public static final long KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_SPEC_VERSION = Vk.VK_KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_SPEC_VERSION;
    public static final String KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_EXTENSION_NAME = Vk.VK_KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_EXTENSION_NAME;
    public static final long KHR_multiview = Vk.VK_KHR_multiview;
    public static final long KHR_MULTIVIEW_SPEC_VERSION = Vk.VK_KHR_MULTIVIEW_SPEC_VERSION;
    public static final String KHR_MULTIVIEW_EXTENSION_NAME = Vk.VK_KHR_MULTIVIEW_EXTENSION_NAME;
    public static final long KHR_get_physical_device_properties2 = Vk.VK_KHR_get_physical_device_properties2;
    public static final long KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION = Vk.VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION;
    public static final String KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME = Vk.VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME;
    public static final long KHR_device_group = Vk.VK_KHR_device_group;
    public static final long KHR_DEVICE_GROUP_SPEC_VERSION = Vk.VK_KHR_DEVICE_GROUP_SPEC_VERSION;
    public static final String KHR_DEVICE_GROUP_EXTENSION_NAME = Vk.VK_KHR_DEVICE_GROUP_EXTENSION_NAME;
    public static final long KHR_shader_draw_parameters = Vk.VK_KHR_shader_draw_parameters;
    public static final long KHR_SHADER_DRAW_PARAMETERS_SPEC_VERSION = Vk.VK_KHR_SHADER_DRAW_PARAMETERS_SPEC_VERSION;
    public static final String KHR_SHADER_DRAW_PARAMETERS_EXTENSION_NAME = Vk.VK_KHR_SHADER_DRAW_PARAMETERS_EXTENSION_NAME;
    public static final long KHR_maintenance1 = Vk.VK_KHR_maintenance1;
    public static final long KHR_MAINTENANCE1_SPEC_VERSION = Vk.VK_KHR_MAINTENANCE1_SPEC_VERSION;
    public static final String KHR_MAINTENANCE1_EXTENSION_NAME = Vk.VK_KHR_MAINTENANCE1_EXTENSION_NAME;
    public static final long KHR_device_group_creation = Vk.VK_KHR_device_group_creation;
    public static final long KHR_DEVICE_GROUP_CREATION_SPEC_VERSION = Vk.VK_KHR_DEVICE_GROUP_CREATION_SPEC_VERSION;
    public static final String KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME = Vk.VK_KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME;
    public static final long MAX_DEVICE_GROUP_SIZE_KHR = Vk.VK_MAX_DEVICE_GROUP_SIZE_KHR;
    public static final long KHR_external_memory_capabilities = Vk.VK_KHR_external_memory_capabilities;
    public static final long KHR_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION = Vk.VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION;
    public static final String KHR_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME = Vk.VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME;
    public static final long LUID_SIZE_KHR = Vk.VK_LUID_SIZE_KHR;
    public static final long KHR_external_memory = Vk.VK_KHR_external_memory;
    public static final long KHR_EXTERNAL_MEMORY_SPEC_VERSION = Vk.VK_KHR_EXTERNAL_MEMORY_SPEC_VERSION;
    public static final String KHR_EXTERNAL_MEMORY_EXTENSION_NAME = Vk.VK_KHR_EXTERNAL_MEMORY_EXTENSION_NAME;
    public static final long QUEUE_FAMILY_EXTERNAL_KHR = Vk.VK_QUEUE_FAMILY_EXTERNAL_KHR;
    public static final long KHR_external_memory_fd = Vk.VK_KHR_external_memory_fd;
    public static final long KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION = Vk.VK_KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION;
    public static final String KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME = Vk.VK_KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME;
    public static final long KHR_external_semaphore_capabilities = Vk.VK_KHR_external_semaphore_capabilities;
    public static final long KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_SPEC_VERSION = Vk.VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_SPEC_VERSION;
    public static final String KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_EXTENSION_NAME = Vk.VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_EXTENSION_NAME;
    public static final long KHR_external_semaphore = Vk.VK_KHR_external_semaphore;
    public static final long KHR_EXTERNAL_SEMAPHORE_SPEC_VERSION = Vk.VK_KHR_EXTERNAL_SEMAPHORE_SPEC_VERSION;
    public static final String KHR_EXTERNAL_SEMAPHORE_EXTENSION_NAME = Vk.VK_KHR_EXTERNAL_SEMAPHORE_EXTENSION_NAME;
    public static final long KHR_external_semaphore_fd = Vk.VK_KHR_external_semaphore_fd;
    public static final long KHR_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION = Vk.VK_KHR_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION;
    public static final String KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME = Vk.VK_KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME;
    public static final long KHR_push_descriptor = Vk.VK_KHR_push_descriptor;
    public static final long KHR_PUSH_DESCRIPTOR_SPEC_VERSION = Vk.VK_KHR_PUSH_DESCRIPTOR_SPEC_VERSION;
    public static final String KHR_PUSH_DESCRIPTOR_EXTENSION_NAME = Vk.VK_KHR_PUSH_DESCRIPTOR_EXTENSION_NAME;
    public static final long KHR_16bit_storage = Vk.VK_KHR_16bit_storage;
    public static final long KHR_16BIT_STORAGE_SPEC_VERSION = Vk.VK_KHR_16BIT_STORAGE_SPEC_VERSION;
    public static final String KHR_16BIT_STORAGE_EXTENSION_NAME = Vk.VK_KHR_16BIT_STORAGE_EXTENSION_NAME;
    public static final long KHR_incremental_present = Vk.VK_KHR_incremental_present;
    public static final long KHR_INCREMENTAL_PRESENT_SPEC_VERSION = Vk.VK_KHR_INCREMENTAL_PRESENT_SPEC_VERSION;
    public static final String KHR_INCREMENTAL_PRESENT_EXTENSION_NAME = Vk.VK_KHR_INCREMENTAL_PRESENT_EXTENSION_NAME;
    public static final long KHR_descriptor_update_template = Vk.VK_KHR_descriptor_update_template;
    public static final long KHR_DESCRIPTOR_UPDATE_TEMPLATE_SPEC_VERSION = Vk.VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_SPEC_VERSION;
    public static final String KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME = Vk.VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME;
    public static final long KHR_shared_presentable_image = Vk.VK_KHR_shared_presentable_image;
    public static final long KHR_SHARED_PRESENTABLE_IMAGE_SPEC_VERSION = Vk.VK_KHR_SHARED_PRESENTABLE_IMAGE_SPEC_VERSION;
    public static final String KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME = Vk.VK_KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME;
    public static final long KHR_external_fence_capabilities = Vk.VK_KHR_external_fence_capabilities;
    public static final long KHR_EXTERNAL_FENCE_CAPABILITIES_SPEC_VERSION = Vk.VK_KHR_EXTERNAL_FENCE_CAPABILITIES_SPEC_VERSION;
    public static final String KHR_EXTERNAL_FENCE_CAPABILITIES_EXTENSION_NAME = Vk.VK_KHR_EXTERNAL_FENCE_CAPABILITIES_EXTENSION_NAME;
    public static final long KHR_external_fence = Vk.VK_KHR_external_fence;
    public static final long KHR_EXTERNAL_FENCE_SPEC_VERSION = Vk.VK_KHR_EXTERNAL_FENCE_SPEC_VERSION;
    public static final String KHR_EXTERNAL_FENCE_EXTENSION_NAME = Vk.VK_KHR_EXTERNAL_FENCE_EXTENSION_NAME;
    public static final long KHR_external_fence_fd = Vk.VK_KHR_external_fence_fd;
    public static final long KHR_EXTERNAL_FENCE_FD_SPEC_VERSION = Vk.VK_KHR_EXTERNAL_FENCE_FD_SPEC_VERSION;
    public static final String KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME = Vk.VK_KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME;
    public static final long KHR_maintenance2 = Vk.VK_KHR_maintenance2;
    public static final long KHR_MAINTENANCE2_SPEC_VERSION = Vk.VK_KHR_MAINTENANCE2_SPEC_VERSION;
    public static final String KHR_MAINTENANCE2_EXTENSION_NAME = Vk.VK_KHR_MAINTENANCE2_EXTENSION_NAME;
    public static final long KHR_get_surface_capabilities2 = Vk.VK_KHR_get_surface_capabilities2;
    public static final long KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION = Vk.VK_KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION;
    public static final String KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME = Vk.VK_KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME;
    public static final long KHR_variable_pointers = Vk.VK_KHR_variable_pointers;
    public static final long KHR_VARIABLE_POINTERS_SPEC_VERSION = Vk.VK_KHR_VARIABLE_POINTERS_SPEC_VERSION;
    public static final String KHR_VARIABLE_POINTERS_EXTENSION_NAME = Vk.VK_KHR_VARIABLE_POINTERS_EXTENSION_NAME;
    public static final long KHR_dedicated_allocation = Vk.VK_KHR_dedicated_allocation;
    public static final long KHR_DEDICATED_ALLOCATION_SPEC_VERSION = Vk.VK_KHR_DEDICATED_ALLOCATION_SPEC_VERSION;
    public static final String KHR_DEDICATED_ALLOCATION_EXTENSION_NAME = Vk.VK_KHR_DEDICATED_ALLOCATION_EXTENSION_NAME;
    public static final long KHR_storage_buffer_storage_class = Vk.VK_KHR_storage_buffer_storage_class;
    public static final long KHR_STORAGE_BUFFER_STORAGE_CLASS_SPEC_VERSION = Vk.VK_KHR_STORAGE_BUFFER_STORAGE_CLASS_SPEC_VERSION;
    public static final String KHR_STORAGE_BUFFER_STORAGE_CLASS_EXTENSION_NAME = Vk.VK_KHR_STORAGE_BUFFER_STORAGE_CLASS_EXTENSION_NAME;
    public static final long KHR_relaxed_block_layout = Vk.VK_KHR_relaxed_block_layout;
    public static final long KHR_RELAXED_BLOCK_LAYOUT_SPEC_VERSION = Vk.VK_KHR_RELAXED_BLOCK_LAYOUT_SPEC_VERSION;
    public static final String KHR_RELAXED_BLOCK_LAYOUT_EXTENSION_NAME = Vk.VK_KHR_RELAXED_BLOCK_LAYOUT_EXTENSION_NAME;
    public static final long KHR_get_memory_requirements2 = Vk.VK_KHR_get_memory_requirements2;
    public static final long KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION = Vk.VK_KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION;
    public static final String KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME = Vk.VK_KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME;
    public static final long KHR_image_format_list = Vk.VK_KHR_image_format_list;
    public static final long KHR_IMAGE_FORMAT_LIST_SPEC_VERSION = Vk.VK_KHR_IMAGE_FORMAT_LIST_SPEC_VERSION;
    public static final String KHR_IMAGE_FORMAT_LIST_EXTENSION_NAME = Vk.VK_KHR_IMAGE_FORMAT_LIST_EXTENSION_NAME;
    public static final long KHR_sampler_ycbcr_conversion = Vk.VK_KHR_sampler_ycbcr_conversion;
    public static final long KHR_SAMPLER_YCBCR_CONVERSION_SPEC_VERSION = Vk.VK_KHR_SAMPLER_YCBCR_CONVERSION_SPEC_VERSION;
    public static final String KHR_SAMPLER_YCBCR_CONVERSION_EXTENSION_NAME = Vk.VK_KHR_SAMPLER_YCBCR_CONVERSION_EXTENSION_NAME;
    public static final long KHR_bind_memory2 = Vk.VK_KHR_bind_memory2;
    public static final long KHR_BIND_MEMORY_2_SPEC_VERSION = Vk.VK_KHR_BIND_MEMORY_2_SPEC_VERSION;
    public static final String KHR_BIND_MEMORY_2_EXTENSION_NAME = Vk.VK_KHR_BIND_MEMORY_2_EXTENSION_NAME;
    public static final long KHR_maintenance3 = Vk.VK_KHR_maintenance3;
    public static final long KHR_MAINTENANCE3_SPEC_VERSION = Vk.VK_KHR_MAINTENANCE3_SPEC_VERSION;
    public static final String KHR_MAINTENANCE3_EXTENSION_NAME = Vk.VK_KHR_MAINTENANCE3_EXTENSION_NAME;
    public static final long EXT_debug_report = Vk.VK_EXT_debug_report;
    public static final long EXT_DEBUG_REPORT_SPEC_VERSION = Vk.VK_EXT_DEBUG_REPORT_SPEC_VERSION;
    public static final String EXT_DEBUG_REPORT_EXTENSION_NAME = Vk.VK_EXT_DEBUG_REPORT_EXTENSION_NAME;
    public static final long STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT = Vk.VK_STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT;
    public static final long DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = Vk.VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT;
    public static final long NV_glsl_shader = Vk.VK_NV_glsl_shader;
    public static final long NV_GLSL_SHADER_SPEC_VERSION = Vk.VK_NV_GLSL_SHADER_SPEC_VERSION;
    public static final String NV_GLSL_SHADER_EXTENSION_NAME = Vk.VK_NV_GLSL_SHADER_EXTENSION_NAME;
    public static final long EXT_depth_range_unrestricted = Vk.VK_EXT_depth_range_unrestricted;
    public static final long EXT_DEPTH_RANGE_UNRESTRICTED_SPEC_VERSION = Vk.VK_EXT_DEPTH_RANGE_UNRESTRICTED_SPEC_VERSION;
    public static final String EXT_DEPTH_RANGE_UNRESTRICTED_EXTENSION_NAME = Vk.VK_EXT_DEPTH_RANGE_UNRESTRICTED_EXTENSION_NAME;
    public static final long IMG_filter_cubic = Vk.VK_IMG_filter_cubic;
    public static final long IMG_FILTER_CUBIC_SPEC_VERSION = Vk.VK_IMG_FILTER_CUBIC_SPEC_VERSION;
    public static final String IMG_FILTER_CUBIC_EXTENSION_NAME = Vk.VK_IMG_FILTER_CUBIC_EXTENSION_NAME;
    public static final long AMD_rasterization_order = Vk.VK_AMD_rasterization_order;
    public static final long AMD_RASTERIZATION_ORDER_SPEC_VERSION = Vk.VK_AMD_RASTERIZATION_ORDER_SPEC_VERSION;
    public static final String AMD_RASTERIZATION_ORDER_EXTENSION_NAME = Vk.VK_AMD_RASTERIZATION_ORDER_EXTENSION_NAME;
    public static final long AMD_shader_trinary_minmax = Vk.VK_AMD_shader_trinary_minmax;
    public static final long AMD_SHADER_TRINARY_MINMAX_SPEC_VERSION = Vk.VK_AMD_SHADER_TRINARY_MINMAX_SPEC_VERSION;
    public static final String AMD_SHADER_TRINARY_MINMAX_EXTENSION_NAME = Vk.VK_AMD_SHADER_TRINARY_MINMAX_EXTENSION_NAME;
    public static final long AMD_shader_explicit_vertex_parameter = Vk.VK_AMD_shader_explicit_vertex_parameter;
    public static final long AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_SPEC_VERSION = Vk.VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_SPEC_VERSION;
    public static final String AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_EXTENSION_NAME = Vk.VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_EXTENSION_NAME;
    public static final long EXT_debug_marker = Vk.VK_EXT_debug_marker;
    public static final long EXT_DEBUG_MARKER_SPEC_VERSION = Vk.VK_EXT_DEBUG_MARKER_SPEC_VERSION;
    public static final String EXT_DEBUG_MARKER_EXTENSION_NAME = Vk.VK_EXT_DEBUG_MARKER_EXTENSION_NAME;
    public static final long AMD_gcn_shader = Vk.VK_AMD_gcn_shader;
    public static final long AMD_GCN_SHADER_SPEC_VERSION = Vk.VK_AMD_GCN_SHADER_SPEC_VERSION;
    public static final String AMD_GCN_SHADER_EXTENSION_NAME = Vk.VK_AMD_GCN_SHADER_EXTENSION_NAME;
    public static final long NV_dedicated_allocation = Vk.VK_NV_dedicated_allocation;
    public static final long NV_DEDICATED_ALLOCATION_SPEC_VERSION = Vk.VK_NV_DEDICATED_ALLOCATION_SPEC_VERSION;
    public static final String NV_DEDICATED_ALLOCATION_EXTENSION_NAME = Vk.VK_NV_DEDICATED_ALLOCATION_EXTENSION_NAME;
    public static final long AMD_draw_indirect_count = Vk.VK_AMD_draw_indirect_count;
    public static final long AMD_DRAW_INDIRECT_COUNT_SPEC_VERSION = Vk.VK_AMD_DRAW_INDIRECT_COUNT_SPEC_VERSION;
    public static final String AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME = Vk.VK_AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME;
    public static final long AMD_negative_viewport_height = Vk.VK_AMD_negative_viewport_height;
    public static final long AMD_NEGATIVE_VIEWPORT_HEIGHT_SPEC_VERSION = Vk.VK_AMD_NEGATIVE_VIEWPORT_HEIGHT_SPEC_VERSION;
    public static final String AMD_NEGATIVE_VIEWPORT_HEIGHT_EXTENSION_NAME = Vk.VK_AMD_NEGATIVE_VIEWPORT_HEIGHT_EXTENSION_NAME;
    public static final long AMD_gpu_shader_half_float = Vk.VK_AMD_gpu_shader_half_float;
    public static final long AMD_GPU_SHADER_HALF_FLOAT_SPEC_VERSION = Vk.VK_AMD_GPU_SHADER_HALF_FLOAT_SPEC_VERSION;
    public static final String AMD_GPU_SHADER_HALF_FLOAT_EXTENSION_NAME = Vk.VK_AMD_GPU_SHADER_HALF_FLOAT_EXTENSION_NAME;
    public static final long AMD_shader_ballot = Vk.VK_AMD_shader_ballot;
    public static final long AMD_SHADER_BALLOT_SPEC_VERSION = Vk.VK_AMD_SHADER_BALLOT_SPEC_VERSION;
    public static final String AMD_SHADER_BALLOT_EXTENSION_NAME = Vk.VK_AMD_SHADER_BALLOT_EXTENSION_NAME;
    public static final long AMD_texture_gather_bias_lod = Vk.VK_AMD_texture_gather_bias_lod;
    public static final long AMD_TEXTURE_GATHER_BIAS_LOD_SPEC_VERSION = Vk.VK_AMD_TEXTURE_GATHER_BIAS_LOD_SPEC_VERSION;
    public static final String AMD_TEXTURE_GATHER_BIAS_LOD_EXTENSION_NAME = Vk.VK_AMD_TEXTURE_GATHER_BIAS_LOD_EXTENSION_NAME;
    public static final long AMD_shader_info = Vk.VK_AMD_shader_info;
    public static final long AMD_SHADER_INFO_SPEC_VERSION = Vk.VK_AMD_SHADER_INFO_SPEC_VERSION;
    public static final String AMD_SHADER_INFO_EXTENSION_NAME = Vk.VK_AMD_SHADER_INFO_EXTENSION_NAME;
    public static final long AMD_shader_image_load_store_lod = Vk.VK_AMD_shader_image_load_store_lod;
    public static final long AMD_SHADER_IMAGE_LOAD_STORE_LOD_SPEC_VERSION = Vk.VK_AMD_SHADER_IMAGE_LOAD_STORE_LOD_SPEC_VERSION;
    public static final String AMD_SHADER_IMAGE_LOAD_STORE_LOD_EXTENSION_NAME = Vk.VK_AMD_SHADER_IMAGE_LOAD_STORE_LOD_EXTENSION_NAME;
    public static final long IMG_format_pvrtc = Vk.VK_IMG_format_pvrtc;
    public static final long IMG_FORMAT_PVRTC_SPEC_VERSION = Vk.VK_IMG_FORMAT_PVRTC_SPEC_VERSION;
    public static final String IMG_FORMAT_PVRTC_EXTENSION_NAME = Vk.VK_IMG_FORMAT_PVRTC_EXTENSION_NAME;
    public static final long NV_external_memory_capabilities = Vk.VK_NV_external_memory_capabilities;
    public static final long NV_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION = Vk.VK_NV_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION;
    public static final String NV_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME = Vk.VK_NV_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME;
    public static final long NV_external_memory = Vk.VK_NV_external_memory;
    public static final long NV_EXTERNAL_MEMORY_SPEC_VERSION = Vk.VK_NV_EXTERNAL_MEMORY_SPEC_VERSION;
    public static final String NV_EXTERNAL_MEMORY_EXTENSION_NAME = Vk.VK_NV_EXTERNAL_MEMORY_EXTENSION_NAME;
    public static final long EXT_validation_flags = Vk.VK_EXT_validation_flags;
    public static final long EXT_VALIDATION_FLAGS_SPEC_VERSION = Vk.VK_EXT_VALIDATION_FLAGS_SPEC_VERSION;
    public static final String EXT_VALIDATION_FLAGS_EXTENSION_NAME = Vk.VK_EXT_VALIDATION_FLAGS_EXTENSION_NAME;
    public static final long EXT_shader_subgroup_ballot = Vk.VK_EXT_shader_subgroup_ballot;
    public static final long EXT_SHADER_SUBGROUP_BALLOT_SPEC_VERSION = Vk.VK_EXT_SHADER_SUBGROUP_BALLOT_SPEC_VERSION;
    public static final String EXT_SHADER_SUBGROUP_BALLOT_EXTENSION_NAME = Vk.VK_EXT_SHADER_SUBGROUP_BALLOT_EXTENSION_NAME;
    public static final long EXT_shader_subgroup_vote = Vk.VK_EXT_shader_subgroup_vote;
    public static final long EXT_SHADER_SUBGROUP_VOTE_SPEC_VERSION = Vk.VK_EXT_SHADER_SUBGROUP_VOTE_SPEC_VERSION;
    public static final String EXT_SHADER_SUBGROUP_VOTE_EXTENSION_NAME = Vk.VK_EXT_SHADER_SUBGROUP_VOTE_EXTENSION_NAME;
    public static final long NVX_device_generated_commands = Vk.VK_NVX_device_generated_commands;
    public static final long NVX_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = Vk.VK_NVX_DEVICE_GENERATED_COMMANDS_SPEC_VERSION;
    public static final String NVX_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = Vk.VK_NVX_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME;
    public static final long NV_clip_space_w_scaling = Vk.VK_NV_clip_space_w_scaling;
    public static final long NV_CLIP_SPACE_W_SCALING_SPEC_VERSION = Vk.VK_NV_CLIP_SPACE_W_SCALING_SPEC_VERSION;
    public static final String NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME = Vk.VK_NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME;
    public static final long EXT_direct_mode_display = Vk.VK_EXT_direct_mode_display;
    public static final long EXT_DIRECT_MODE_DISPLAY_SPEC_VERSION = Vk.VK_EXT_DIRECT_MODE_DISPLAY_SPEC_VERSION;
    public static final String EXT_DIRECT_MODE_DISPLAY_EXTENSION_NAME = Vk.VK_EXT_DIRECT_MODE_DISPLAY_EXTENSION_NAME;
    public static final long EXT_display_surface_counter = Vk.VK_EXT_display_surface_counter;
    public static final long EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION = Vk.VK_EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION;
    public static final String EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME = Vk.VK_EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME;
    public static final long STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT = Vk.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT;
    public static final long EXT_display_control = Vk.VK_EXT_display_control;
    public static final long EXT_DISPLAY_CONTROL_SPEC_VERSION = Vk.VK_EXT_DISPLAY_CONTROL_SPEC_VERSION;
    public static final String EXT_DISPLAY_CONTROL_EXTENSION_NAME = Vk.VK_EXT_DISPLAY_CONTROL_EXTENSION_NAME;
    public static final long GOOGLE_display_timing = Vk.VK_GOOGLE_display_timing;
    public static final long GOOGLE_DISPLAY_TIMING_SPEC_VERSION = Vk.VK_GOOGLE_DISPLAY_TIMING_SPEC_VERSION;
    public static final String GOOGLE_DISPLAY_TIMING_EXTENSION_NAME = Vk.VK_GOOGLE_DISPLAY_TIMING_EXTENSION_NAME;
    public static final long NV_sample_mask_override_coverage = Vk.VK_NV_sample_mask_override_coverage;
    public static final long NV_SAMPLE_MASK_OVERRIDE_COVERAGE_SPEC_VERSION = Vk.VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_SPEC_VERSION;
    public static final String NV_SAMPLE_MASK_OVERRIDE_COVERAGE_EXTENSION_NAME = Vk.VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_EXTENSION_NAME;
    public static final long NV_geometry_shader_passthrough = Vk.VK_NV_geometry_shader_passthrough;
    public static final long NV_GEOMETRY_SHADER_PASSTHROUGH_SPEC_VERSION = Vk.VK_NV_GEOMETRY_SHADER_PASSTHROUGH_SPEC_VERSION;
    public static final String NV_GEOMETRY_SHADER_PASSTHROUGH_EXTENSION_NAME = Vk.VK_NV_GEOMETRY_SHADER_PASSTHROUGH_EXTENSION_NAME;
    public static final long NV_viewport_array2 = Vk.VK_NV_viewport_array2;
    public static final long NV_VIEWPORT_ARRAY2_SPEC_VERSION = Vk.VK_NV_VIEWPORT_ARRAY2_SPEC_VERSION;
    public static final String NV_VIEWPORT_ARRAY2_EXTENSION_NAME = Vk.VK_NV_VIEWPORT_ARRAY2_EXTENSION_NAME;
    public static final long NVX_multiview_per_view_attributes = Vk.VK_NVX_multiview_per_view_attributes;
    public static final long NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_SPEC_VERSION = Vk.VK_NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_SPEC_VERSION;
    public static final String NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_EXTENSION_NAME = Vk.VK_NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_EXTENSION_NAME;
    public static final long NV_viewport_swizzle = Vk.VK_NV_viewport_swizzle;
    public static final long NV_VIEWPORT_SWIZZLE_SPEC_VERSION = Vk.VK_NV_VIEWPORT_SWIZZLE_SPEC_VERSION;
    public static final String NV_VIEWPORT_SWIZZLE_EXTENSION_NAME = Vk.VK_NV_VIEWPORT_SWIZZLE_EXTENSION_NAME;
    public static final long EXT_discard_rectangles = Vk.VK_EXT_discard_rectangles;
    public static final long EXT_DISCARD_RECTANGLES_SPEC_VERSION = Vk.VK_EXT_DISCARD_RECTANGLES_SPEC_VERSION;
    public static final String EXT_DISCARD_RECTANGLES_EXTENSION_NAME = Vk.VK_EXT_DISCARD_RECTANGLES_EXTENSION_NAME;
    public static final long EXT_conservative_rasterization = Vk.VK_EXT_conservative_rasterization;
    public static final long EXT_CONSERVATIVE_RASTERIZATION_SPEC_VERSION = Vk.VK_EXT_CONSERVATIVE_RASTERIZATION_SPEC_VERSION;
    public static final String EXT_CONSERVATIVE_RASTERIZATION_EXTENSION_NAME = Vk.VK_EXT_CONSERVATIVE_RASTERIZATION_EXTENSION_NAME;
    public static final long EXT_swapchain_colorspace = Vk.VK_EXT_swapchain_colorspace;
    public static final long EXT_SWAPCHAIN_COLOR_SPACE_SPEC_VERSION = Vk.VK_EXT_SWAPCHAIN_COLOR_SPACE_SPEC_VERSION;
    public static final String EXT_SWAPCHAIN_COLOR_SPACE_EXTENSION_NAME = Vk.VK_EXT_SWAPCHAIN_COLOR_SPACE_EXTENSION_NAME;
    public static final long EXT_hdr_metadata = Vk.VK_EXT_hdr_metadata;
    public static final long EXT_HDR_METADATA_SPEC_VERSION = Vk.VK_EXT_HDR_METADATA_SPEC_VERSION;
    public static final String EXT_HDR_METADATA_EXTENSION_NAME = Vk.VK_EXT_HDR_METADATA_EXTENSION_NAME;
    public static final long EXT_external_memory_dma_buf = Vk.VK_EXT_external_memory_dma_buf;
    public static final long EXT_EXTERNAL_MEMORY_DMA_BUF_SPEC_VERSION = Vk.VK_EXT_EXTERNAL_MEMORY_DMA_BUF_SPEC_VERSION;
    public static final String EXT_EXTERNAL_MEMORY_DMA_BUF_EXTENSION_NAME = Vk.VK_EXT_EXTERNAL_MEMORY_DMA_BUF_EXTENSION_NAME;
    public static final long EXT_queue_family_foreign = Vk.VK_EXT_queue_family_foreign;
    public static final long EXT_QUEUE_FAMILY_FOREIGN_SPEC_VERSION = Vk.VK_EXT_QUEUE_FAMILY_FOREIGN_SPEC_VERSION;
    public static final String EXT_QUEUE_FAMILY_FOREIGN_EXTENSION_NAME = Vk.VK_EXT_QUEUE_FAMILY_FOREIGN_EXTENSION_NAME;
    public static final long QUEUE_FAMILY_FOREIGN_EXT = Vk.VK_QUEUE_FAMILY_FOREIGN_EXT;
    public static final long EXT_debug_utils = Vk.VK_EXT_debug_utils;
    public static final long EXT_DEBUG_UTILS_SPEC_VERSION = Vk.VK_EXT_DEBUG_UTILS_SPEC_VERSION;
    public static final String EXT_DEBUG_UTILS_EXTENSION_NAME = Vk.VK_EXT_DEBUG_UTILS_EXTENSION_NAME;
    public static final long EXT_sampler_filter_minmax = Vk.VK_EXT_sampler_filter_minmax;
    public static final long EXT_SAMPLER_FILTER_MINMAX_SPEC_VERSION = Vk.VK_EXT_SAMPLER_FILTER_MINMAX_SPEC_VERSION;
    public static final String EXT_SAMPLER_FILTER_MINMAX_EXTENSION_NAME = Vk.VK_EXT_SAMPLER_FILTER_MINMAX_EXTENSION_NAME;
    public static final long AMD_gpu_shader_int16 = Vk.VK_AMD_gpu_shader_int16;
    public static final long AMD_GPU_SHADER_INT16_SPEC_VERSION = Vk.VK_AMD_GPU_SHADER_INT16_SPEC_VERSION;
    public static final String AMD_GPU_SHADER_INT16_EXTENSION_NAME = Vk.VK_AMD_GPU_SHADER_INT16_EXTENSION_NAME;
    public static final long AMD_mixed_attachment_samples = Vk.VK_AMD_mixed_attachment_samples;
    public static final long AMD_MIXED_ATTACHMENT_SAMPLES_SPEC_VERSION = Vk.VK_AMD_MIXED_ATTACHMENT_SAMPLES_SPEC_VERSION;
    public static final String AMD_MIXED_ATTACHMENT_SAMPLES_EXTENSION_NAME = Vk.VK_AMD_MIXED_ATTACHMENT_SAMPLES_EXTENSION_NAME;
    public static final long AMD_shader_fragment_mask = Vk.VK_AMD_shader_fragment_mask;
    public static final long AMD_SHADER_FRAGMENT_MASK_SPEC_VERSION = Vk.VK_AMD_SHADER_FRAGMENT_MASK_SPEC_VERSION;
    public static final String AMD_SHADER_FRAGMENT_MASK_EXTENSION_NAME = Vk.VK_AMD_SHADER_FRAGMENT_MASK_EXTENSION_NAME;
    public static final long EXT_shader_stencil_export = Vk.VK_EXT_shader_stencil_export;
    public static final long EXT_SHADER_STENCIL_EXPORT_SPEC_VERSION = Vk.VK_EXT_SHADER_STENCIL_EXPORT_SPEC_VERSION;
    public static final String EXT_SHADER_STENCIL_EXPORT_EXTENSION_NAME = Vk.VK_EXT_SHADER_STENCIL_EXPORT_EXTENSION_NAME;
    public static final long EXT_sample_locations = Vk.VK_EXT_sample_locations;
    public static final long EXT_SAMPLE_LOCATIONS_SPEC_VERSION = Vk.VK_EXT_SAMPLE_LOCATIONS_SPEC_VERSION;
    public static final String EXT_SAMPLE_LOCATIONS_EXTENSION_NAME = Vk.VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME;
    public static final long EXT_blend_operation_advanced = Vk.VK_EXT_blend_operation_advanced;
    public static final long EXT_BLEND_OPERATION_ADVANCED_SPEC_VERSION = Vk.VK_EXT_BLEND_OPERATION_ADVANCED_SPEC_VERSION;
    public static final String EXT_BLEND_OPERATION_ADVANCED_EXTENSION_NAME = Vk.VK_EXT_BLEND_OPERATION_ADVANCED_EXTENSION_NAME;
    public static final long NV_fragment_coverage_to_color = Vk.VK_NV_fragment_coverage_to_color;
    public static final long NV_FRAGMENT_COVERAGE_TO_COLOR_SPEC_VERSION = Vk.VK_NV_FRAGMENT_COVERAGE_TO_COLOR_SPEC_VERSION;
    public static final String NV_FRAGMENT_COVERAGE_TO_COLOR_EXTENSION_NAME = Vk.VK_NV_FRAGMENT_COVERAGE_TO_COLOR_EXTENSION_NAME;
    public static final long NV_framebuffer_mixed_samples = Vk.VK_NV_framebuffer_mixed_samples;
    public static final long NV_FRAMEBUFFER_MIXED_SAMPLES_SPEC_VERSION = Vk.VK_NV_FRAMEBUFFER_MIXED_SAMPLES_SPEC_VERSION;
    public static final String NV_FRAMEBUFFER_MIXED_SAMPLES_EXTENSION_NAME = Vk.VK_NV_FRAMEBUFFER_MIXED_SAMPLES_EXTENSION_NAME;
    public static final long NV_fill_rectangle = Vk.VK_NV_fill_rectangle;
    public static final long NV_FILL_RECTANGLE_SPEC_VERSION = Vk.VK_NV_FILL_RECTANGLE_SPEC_VERSION;
    public static final String NV_FILL_RECTANGLE_EXTENSION_NAME = Vk.VK_NV_FILL_RECTANGLE_EXTENSION_NAME;
    public static final long EXT_post_depth_coverage = Vk.VK_EXT_post_depth_coverage;
    public static final long EXT_POST_DEPTH_COVERAGE_SPEC_VERSION = Vk.VK_EXT_POST_DEPTH_COVERAGE_SPEC_VERSION;
    public static final String EXT_POST_DEPTH_COVERAGE_EXTENSION_NAME = Vk.VK_EXT_POST_DEPTH_COVERAGE_EXTENSION_NAME;
    public static final long EXT_validation_cache = Vk.VK_EXT_validation_cache;
    public static final long EXT_VALIDATION_CACHE_SPEC_VERSION = Vk.VK_EXT_VALIDATION_CACHE_SPEC_VERSION;
    public static final String EXT_VALIDATION_CACHE_EXTENSION_NAME = Vk.VK_EXT_VALIDATION_CACHE_EXTENSION_NAME;
    public static final long DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT = Vk.VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT;
    public static final long EXT_descriptor_indexing = Vk.VK_EXT_descriptor_indexing;
    public static final long EXT_DESCRIPTOR_INDEXING_SPEC_VERSION = Vk.VK_EXT_DESCRIPTOR_INDEXING_SPEC_VERSION;
    public static final String EXT_DESCRIPTOR_INDEXING_EXTENSION_NAME = Vk.VK_EXT_DESCRIPTOR_INDEXING_EXTENSION_NAME;
    public static final long EXT_shader_viewport_index_layer = Vk.VK_EXT_shader_viewport_index_layer;
    public static final long EXT_SHADER_VIEWPORT_INDEX_LAYER_SPEC_VERSION = Vk.VK_EXT_SHADER_VIEWPORT_INDEX_LAYER_SPEC_VERSION;
    public static final String EXT_SHADER_VIEWPORT_INDEX_LAYER_EXTENSION_NAME = Vk.VK_EXT_SHADER_VIEWPORT_INDEX_LAYER_EXTENSION_NAME;
    public static final long EXT_global_priority = Vk.VK_EXT_global_priority;
    public static final long EXT_GLOBAL_PRIORITY_SPEC_VERSION = Vk.VK_EXT_GLOBAL_PRIORITY_SPEC_VERSION;
    public static final String EXT_GLOBAL_PRIORITY_EXTENSION_NAME = Vk.VK_EXT_GLOBAL_PRIORITY_EXTENSION_NAME;
    public static final long EXT_external_memory_host = Vk.VK_EXT_external_memory_host;
    public static final long EXT_EXTERNAL_MEMORY_HOST_SPEC_VERSION = Vk.VK_EXT_EXTERNAL_MEMORY_HOST_SPEC_VERSION;
    public static final String EXT_EXTERNAL_MEMORY_HOST_EXTENSION_NAME = Vk.VK_EXT_EXTERNAL_MEMORY_HOST_EXTENSION_NAME;
    public static final long AMD_buffer_marker = Vk.VK_AMD_buffer_marker;
    public static final long AMD_BUFFER_MARKER_SPEC_VERSION = Vk.VK_AMD_BUFFER_MARKER_SPEC_VERSION;
    public static final String AMD_BUFFER_MARKER_EXTENSION_NAME = Vk.VK_AMD_BUFFER_MARKER_EXTENSION_NAME;
    public static final long AMD_shader_core_properties = Vk.VK_AMD_shader_core_properties;
    public static final long AMD_SHADER_CORE_PROPERTIES_SPEC_VERSION = Vk.VK_AMD_SHADER_CORE_PROPERTIES_SPEC_VERSION;
    public static final String AMD_SHADER_CORE_PROPERTIES_EXTENSION_NAME = Vk.VK_AMD_SHADER_CORE_PROPERTIES_EXTENSION_NAME;
    public static final long EXT_vertex_attribute_divisor = Vk.VK_EXT_vertex_attribute_divisor;
    public static final long EXT_VERTEX_ATTRIBUTE_DIVISOR_SPEC_VERSION = Vk.VK_EXT_VERTEX_ATTRIBUTE_DIVISOR_SPEC_VERSION;
    public static final String EXT_VERTEX_ATTRIBUTE_DIVISOR_EXTENSION_NAME = Vk.VK_EXT_VERTEX_ATTRIBUTE_DIVISOR_EXTENSION_NAME;
    public static final long NV_shader_subgroup_partitioned = Vk.VK_NV_shader_subgroup_partitioned;
    public static final long NV_SHADER_SUBGROUP_PARTITIONED_SPEC_VERSION = Vk.VK_NV_SHADER_SUBGROUP_PARTITIONED_SPEC_VERSION;
    public static final String NV_SHADER_SUBGROUP_PARTITIONED_EXTENSION_NAME = Vk.VK_NV_SHADER_SUBGROUP_PARTITIONED_EXTENSION_NAME;

    public VulkanInstance createInstance(VulkanInstanceCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanInstance o = new VulkanInstance();
        vk.vkCreateInstance(pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateInstance");
        return o;
    }


    public void destroyInstance(VulkanInstance instance, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyInstance(instance != null ? instance.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public VulkanPhysicalDevice.Array enumeratePhysicalDevices(VulkanInstance instance){
        VulkanResult rval = new VulkanResult();
        VulkanUInt32 count = new VulkanUInt32();

        vk.vkEnumeratePhysicalDevices(instance != null ? instance.getVk() : null, count.getVk(), null, rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEnumeratePhysicalDevices");

        VulkanPhysicalDevice.Array o = new VulkanPhysicalDevice.Array(count.getValue());

        vk.vkEnumeratePhysicalDevices(instance != null ? instance.getVk() : null, count.getVk(), o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEnumeratePhysicalDevices");

        return o;
    }


    public void getPhysicalDeviceFeatures(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceFeatures pFeatures){
        vk.vkGetPhysicalDeviceFeatures(physicalDevice != null ? physicalDevice.getVk() : null, pFeatures != null ? pFeatures.getVk() : null);
    }


    public void getPhysicalDeviceFormatProperties(VulkanPhysicalDevice physicalDevice, VulkanFormat format, VulkanFormatProperties pFormatProperties){
        vk.vkGetPhysicalDeviceFormatProperties(physicalDevice != null ? physicalDevice.getVk() : null, format != null ? format.getVk() : null, pFormatProperties != null ? pFormatProperties.getVk() : null);
    }


    public void getPhysicalDeviceImageFormatProperties(VulkanPhysicalDevice physicalDevice, VulkanFormat format, VulkanImageType type, VulkanImageTiling tiling, VulkanImageUsageFlags usage, VulkanImageCreateFlags flags, VulkanImageFormatProperties pImageFormatProperties, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPhysicalDeviceImageFormatProperties(physicalDevice != null ? physicalDevice.getVk() : null, format != null ? format.getVk() : null, type != null ? type.getVk() : null, tiling != null ? tiling.getVk() : null, usage != null ? usage.getVk() : null, flags != null ? flags.getVk() : null, pImageFormatProperties != null ? pImageFormatProperties.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPhysicalDeviceImageFormatProperties");
    }


    public void getPhysicalDeviceProperties(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceProperties pProperties){
        vk.vkGetPhysicalDeviceProperties(physicalDevice != null ? physicalDevice.getVk() : null, pProperties != null ? pProperties.getVk() : null);
    }


    public void getPhysicalDeviceQueueFamilyProperties(VulkanPhysicalDevice physicalDevice, VulkanUInt32 pQueueFamilyPropertyCount, VulkanQueueFamilyProperties pQueueFamilyProperties){
        vk.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice != null ? physicalDevice.getVk() : null, pQueueFamilyPropertyCount != null ? pQueueFamilyPropertyCount.getVk() : null, pQueueFamilyProperties != null ? pQueueFamilyProperties.getVk() : null);
    }


    public void getPhysicalDeviceMemoryProperties(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceMemoryProperties pMemoryProperties){
        vk.vkGetPhysicalDeviceMemoryProperties(physicalDevice != null ? physicalDevice.getVk() : null, pMemoryProperties != null ? pMemoryProperties.getVk() : null);
    }


    public void getInstanceProcAddr(VulkanInstance instance, VulkanChar pName, PFNVoidFunction rval){
        vk.vkGetInstanceProcAddr(instance != null ? instance.getVk() : null, pName != null ? pName.getVk() : null, rval != null ? rval.getVk() : null);
    }


    public void getDeviceProcAddr(VulkanDevice device, VulkanChar pName, PFNVoidFunction rval){
        vk.vkGetDeviceProcAddr(device != null ? device.getVk() : null, pName != null ? pName.getVk() : null, rval != null ? rval.getVk() : null);
    }


    public VulkanDevice createDevice(VulkanPhysicalDevice physicalDevice, VulkanDeviceCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanDevice o = new VulkanDevice();
        vk.vkCreateDevice(physicalDevice != null ? physicalDevice.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateDevice");
        return o;
    }


    public void destroyDevice(VulkanDevice device, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyDevice(device != null ? device.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public VulkanExtensionProperties.Array enumerateInstanceExtensionProperties(VulkanChar pLayerName){
        VulkanResult rval = new VulkanResult();
        VulkanUInt32 count = new VulkanUInt32();

        vk.vkEnumerateInstanceExtensionProperties(pLayerName != null ? pLayerName.getVk() : null, count.getVk(), null, rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEnumerateInstanceExtensionProperties");

        VulkanExtensionProperties.Array o = new VulkanExtensionProperties.Array(count.getValue());

        vk.vkEnumerateInstanceExtensionProperties(pLayerName != null ? pLayerName.getVk() : null, count.getVk(), o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEnumerateInstanceExtensionProperties");

        return o;
    }


    public VulkanExtensionProperties.Array enumerateDeviceExtensionProperties(VulkanPhysicalDevice physicalDevice, VulkanChar pLayerName){
        VulkanResult rval = new VulkanResult();
        VulkanUInt32 count = new VulkanUInt32();

        vk.vkEnumerateDeviceExtensionProperties(physicalDevice != null ? physicalDevice.getVk() : null, pLayerName != null ? pLayerName.getVk() : null, count.getVk(), null, rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEnumerateDeviceExtensionProperties");

        VulkanExtensionProperties.Array o = new VulkanExtensionProperties.Array(count.getValue());

        vk.vkEnumerateDeviceExtensionProperties(physicalDevice != null ? physicalDevice.getVk() : null, pLayerName != null ? pLayerName.getVk() : null, count.getVk(), o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEnumerateDeviceExtensionProperties");

        return o;
    }


    public VulkanLayerProperties.Array enumerateInstanceLayerProperties(){
        VulkanResult rval = new VulkanResult();
        VulkanUInt32 count = new VulkanUInt32();

        vk.vkEnumerateInstanceLayerProperties(count.getVk(), null, rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEnumerateInstanceLayerProperties");

        VulkanLayerProperties.Array o = new VulkanLayerProperties.Array(count.getValue());

        vk.vkEnumerateInstanceLayerProperties(count.getVk(), o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEnumerateInstanceLayerProperties");

        return o;
    }


    public VulkanLayerProperties.Array enumerateDeviceLayerProperties(VulkanPhysicalDevice physicalDevice){
        VulkanResult rval = new VulkanResult();
        VulkanUInt32 count = new VulkanUInt32();

        vk.vkEnumerateDeviceLayerProperties(physicalDevice != null ? physicalDevice.getVk() : null, count.getVk(), null, rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEnumerateDeviceLayerProperties");

        VulkanLayerProperties.Array o = new VulkanLayerProperties.Array(count.getValue());

        vk.vkEnumerateDeviceLayerProperties(physicalDevice != null ? physicalDevice.getVk() : null, count.getVk(), o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEnumerateDeviceLayerProperties");

        return o;
    }


    public void getDeviceQueue(VulkanDevice device, VulkanUInt32 queueFamilyIndex, VulkanUInt32 queueIndex, VulkanQueue pQueue){
        vk.vkGetDeviceQueue(device != null ? device.getVk() : null, queueFamilyIndex != null ? queueFamilyIndex.getVk() : null, queueIndex != null ? queueIndex.getVk() : null, pQueue != null ? pQueue.getVk() : null);
    }


    public void queueSubmit(VulkanQueue queue, VulkanUInt32 submitCount, VulkanSubmitInfo pSubmits, VulkanFence fence, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkQueueSubmit(queue != null ? queue.getVk() : null, submitCount != null ? submitCount.getVk() : null, pSubmits != null ? pSubmits.getVk() : null, fence != null ? fence.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkQueueSubmit");
    }


    public void queueWaitIdle(VulkanQueue queue, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkQueueWaitIdle(queue != null ? queue.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkQueueWaitIdle");
    }


    public void deviceWaitIdle(VulkanDevice device, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkDeviceWaitIdle(device != null ? device.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkDeviceWaitIdle");
    }


    public void allocateMemory(VulkanDevice device, VulkanMemoryAllocateInfo pAllocateInfo, VulkanAllocationCallbacks pAllocator, VulkanDeviceMemory pMemory, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkAllocateMemory(device != null ? device.getVk() : null, pAllocateInfo != null ? pAllocateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, pMemory != null ? pMemory.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkAllocateMemory");
    }


    public void freeMemory(VulkanDevice device, VulkanDeviceMemory memory, VulkanAllocationCallbacks pAllocator){
        vk.vkFreeMemory(device != null ? device.getVk() : null, memory != null ? memory.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void mapMemory(VulkanDevice device, VulkanDeviceMemory memory, VulkanDeviceSize offset, VulkanDeviceSize size, VulkanMemoryMapFlags flags, VulkanObject.Pointer ppData, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkMapMemory(device != null ? device.getVk() : null, memory != null ? memory.getVk() : null, offset != null ? offset.getVk() : null, size != null ? size.getVk() : null, flags != null ? flags.getVk() : null, ppData != null ? ppData.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkMapMemory");
    }


    public void unmapMemory(VulkanDevice device, VulkanDeviceMemory memory){
        vk.vkUnmapMemory(device != null ? device.getVk() : null, memory != null ? memory.getVk() : null);
    }


    public void flushMappedMemoryRanges(VulkanDevice device, VulkanUInt32 memoryRangeCount, VulkanMappedMemoryRange pMemoryRanges, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkFlushMappedMemoryRanges(device != null ? device.getVk() : null, memoryRangeCount != null ? memoryRangeCount.getVk() : null, pMemoryRanges != null ? pMemoryRanges.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkFlushMappedMemoryRanges");
    }


    public void invalidateMappedMemoryRanges(VulkanDevice device, VulkanUInt32 memoryRangeCount, VulkanMappedMemoryRange pMemoryRanges, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkInvalidateMappedMemoryRanges(device != null ? device.getVk() : null, memoryRangeCount != null ? memoryRangeCount.getVk() : null, pMemoryRanges != null ? pMemoryRanges.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkInvalidateMappedMemoryRanges");
    }


    public void getDeviceMemoryCommitment(VulkanDevice device, VulkanDeviceMemory memory, VulkanDeviceSize pCommittedMemoryInBytes){
        vk.vkGetDeviceMemoryCommitment(device != null ? device.getVk() : null, memory != null ? memory.getVk() : null, pCommittedMemoryInBytes != null ? pCommittedMemoryInBytes.getVk() : null);
    }


    public void bindBufferMemory(VulkanDevice device, VulkanBuffer buffer, VulkanDeviceMemory memory, VulkanDeviceSize memoryOffset, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkBindBufferMemory(device != null ? device.getVk() : null, buffer != null ? buffer.getVk() : null, memory != null ? memory.getVk() : null, memoryOffset != null ? memoryOffset.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkBindBufferMemory");
    }


    public void bindImageMemory(VulkanDevice device, VulkanImage image, VulkanDeviceMemory memory, VulkanDeviceSize memoryOffset, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkBindImageMemory(device != null ? device.getVk() : null, image != null ? image.getVk() : null, memory != null ? memory.getVk() : null, memoryOffset != null ? memoryOffset.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkBindImageMemory");
    }


    public void getBufferMemoryRequirements(VulkanDevice device, VulkanBuffer buffer, VulkanMemoryRequirements pMemoryRequirements){
        vk.vkGetBufferMemoryRequirements(device != null ? device.getVk() : null, buffer != null ? buffer.getVk() : null, pMemoryRequirements != null ? pMemoryRequirements.getVk() : null);
    }


    public void getImageMemoryRequirements(VulkanDevice device, VulkanImage image, VulkanMemoryRequirements pMemoryRequirements){
        vk.vkGetImageMemoryRequirements(device != null ? device.getVk() : null, image != null ? image.getVk() : null, pMemoryRequirements != null ? pMemoryRequirements.getVk() : null);
    }


    public void getImageSparseMemoryRequirements(VulkanDevice device, VulkanImage image, VulkanUInt32 pSparseMemoryRequirementCount, VulkanSparseImageMemoryRequirements pSparseMemoryRequirements){
        vk.vkGetImageSparseMemoryRequirements(device != null ? device.getVk() : null, image != null ? image.getVk() : null, pSparseMemoryRequirementCount != null ? pSparseMemoryRequirementCount.getVk() : null, pSparseMemoryRequirements != null ? pSparseMemoryRequirements.getVk() : null);
    }


    public void getPhysicalDeviceSparseImageFormatProperties(VulkanPhysicalDevice physicalDevice, VulkanFormat format, VulkanImageType type, VulkanSampleCountFlagBits samples, VulkanImageUsageFlags usage, VulkanImageTiling tiling, VulkanUInt32 pPropertyCount, VulkanSparseImageFormatProperties pProperties){
        vk.vkGetPhysicalDeviceSparseImageFormatProperties(physicalDevice != null ? physicalDevice.getVk() : null, format != null ? format.getVk() : null, type != null ? type.getVk() : null, samples != null ? samples.getVk() : null, usage != null ? usage.getVk() : null, tiling != null ? tiling.getVk() : null, pPropertyCount != null ? pPropertyCount.getVk() : null, pProperties != null ? pProperties.getVk() : null);
    }


    public void queueBindSparse(VulkanQueue queue, VulkanUInt32 bindInfoCount, VulkanBindSparseInfo pBindInfo, VulkanFence fence, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkQueueBindSparse(queue != null ? queue.getVk() : null, bindInfoCount != null ? bindInfoCount.getVk() : null, pBindInfo != null ? pBindInfo.getVk() : null, fence != null ? fence.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkQueueBindSparse");
    }


    public VulkanFence createFence(VulkanDevice device, VulkanFenceCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanFence o = new VulkanFence();
        vk.vkCreateFence(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateFence");
        return o;
    }


    public void destroyFence(VulkanDevice device, VulkanFence fence, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyFence(device != null ? device.getVk() : null, fence != null ? fence.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void resetFences(VulkanDevice device, VulkanUInt32 fenceCount, VulkanFence pFences, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkResetFences(device != null ? device.getVk() : null, fenceCount != null ? fenceCount.getVk() : null, pFences != null ? pFences.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkResetFences");
    }


    public void getFenceStatus(VulkanDevice device, VulkanFence fence, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetFenceStatus(device != null ? device.getVk() : null, fence != null ? fence.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetFenceStatus");
    }


    public void waitForFences(VulkanDevice device, VulkanUInt32 fenceCount, VulkanFence pFences, VulkanBool32 waitAll, VulkanUInt64 timeout, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkWaitForFences(device != null ? device.getVk() : null, fenceCount != null ? fenceCount.getVk() : null, pFences != null ? pFences.getVk() : null, waitAll != null ? waitAll.getVk() : null, timeout != null ? timeout.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkWaitForFences");
    }


    public VulkanSemaphore createSemaphore(VulkanDevice device, VulkanSemaphoreCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanSemaphore o = new VulkanSemaphore();
        vk.vkCreateSemaphore(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateSemaphore");
        return o;
    }


    public void destroySemaphore(VulkanDevice device, VulkanSemaphore semaphore, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroySemaphore(device != null ? device.getVk() : null, semaphore != null ? semaphore.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public VulkanEvent createEvent(VulkanDevice device, VulkanEventCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanEvent o = new VulkanEvent();
        vk.vkCreateEvent(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateEvent");
        return o;
    }


    public void destroyEvent(VulkanDevice device, VulkanEvent event, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyEvent(device != null ? device.getVk() : null, event != null ? event.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void getEventStatus(VulkanDevice device, VulkanEvent event, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetEventStatus(device != null ? device.getVk() : null, event != null ? event.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetEventStatus");
    }


    public void setEvent(VulkanDevice device, VulkanEvent event, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkSetEvent(device != null ? device.getVk() : null, event != null ? event.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkSetEvent");
    }


    public void resetEvent(VulkanDevice device, VulkanEvent event, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkResetEvent(device != null ? device.getVk() : null, event != null ? event.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkResetEvent");
    }


    public VulkanQueryPool createQueryPool(VulkanDevice device, VulkanQueryPoolCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanQueryPool o = new VulkanQueryPool();
        vk.vkCreateQueryPool(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateQueryPool");
        return o;
    }


    public void destroyQueryPool(VulkanDevice device, VulkanQueryPool queryPool, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyQueryPool(device != null ? device.getVk() : null, queryPool != null ? queryPool.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void getQueryPoolResults(VulkanDevice device, VulkanQueryPool queryPool, VulkanUInt32 firstQuery, VulkanUInt32 queryCount, VulkanSize dataSize, VulkanObject pData, VulkanDeviceSize stride, VulkanQueryResultFlags flags, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetQueryPoolResults(device != null ? device.getVk() : null, queryPool != null ? queryPool.getVk() : null, firstQuery != null ? firstQuery.getVk() : null, queryCount != null ? queryCount.getVk() : null, dataSize != null ? dataSize.getVk() : null, pData != null ? pData.getVk() : null, stride != null ? stride.getVk() : null, flags != null ? flags.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetQueryPoolResults");
    }


    public VulkanBuffer createBuffer(VulkanDevice device, VulkanBufferCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanBuffer o = new VulkanBuffer();
        vk.vkCreateBuffer(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateBuffer");
        return o;
    }


    public void destroyBuffer(VulkanDevice device, VulkanBuffer buffer, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyBuffer(device != null ? device.getVk() : null, buffer != null ? buffer.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public VulkanBufferView createBufferView(VulkanDevice device, VulkanBufferViewCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanBufferView o = new VulkanBufferView();
        vk.vkCreateBufferView(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateBufferView");
        return o;
    }


    public void destroyBufferView(VulkanDevice device, VulkanBufferView bufferView, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyBufferView(device != null ? device.getVk() : null, bufferView != null ? bufferView.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public VulkanImage createImage(VulkanDevice device, VulkanImageCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanImage o = new VulkanImage();
        vk.vkCreateImage(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateImage");
        return o;
    }


    public void destroyImage(VulkanDevice device, VulkanImage image, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyImage(device != null ? device.getVk() : null, image != null ? image.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void getImageSubresourceLayout(VulkanDevice device, VulkanImage image, VulkanImageSubresource pSubresource, VulkanSubresourceLayout pLayout){
        vk.vkGetImageSubresourceLayout(device != null ? device.getVk() : null, image != null ? image.getVk() : null, pSubresource != null ? pSubresource.getVk() : null, pLayout != null ? pLayout.getVk() : null);
    }


    public VulkanImageView createImageView(VulkanDevice device, VulkanImageViewCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanImageView o = new VulkanImageView();
        vk.vkCreateImageView(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateImageView");
        return o;
    }


    public void destroyImageView(VulkanDevice device, VulkanImageView imageView, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyImageView(device != null ? device.getVk() : null, imageView != null ? imageView.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public VulkanShaderModule createShaderModule(VulkanDevice device, VulkanShaderModuleCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanShaderModule o = new VulkanShaderModule();
        vk.vkCreateShaderModule(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateShaderModule");
        return o;
    }


    public void destroyShaderModule(VulkanDevice device, VulkanShaderModule shaderModule, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyShaderModule(device != null ? device.getVk() : null, shaderModule != null ? shaderModule.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public VulkanPipelineCache createPipelineCache(VulkanDevice device, VulkanPipelineCacheCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanPipelineCache o = new VulkanPipelineCache();
        vk.vkCreatePipelineCache(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreatePipelineCache");
        return o;
    }


    public void destroyPipelineCache(VulkanDevice device, VulkanPipelineCache pipelineCache, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyPipelineCache(device != null ? device.getVk() : null, pipelineCache != null ? pipelineCache.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void getPipelineCacheData(VulkanDevice device, VulkanPipelineCache pipelineCache, VulkanSize pDataSize, VulkanObject pData, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPipelineCacheData(device != null ? device.getVk() : null, pipelineCache != null ? pipelineCache.getVk() : null, pDataSize != null ? pDataSize.getVk() : null, pData != null ? pData.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPipelineCacheData");
    }


    public void mergePipelineCaches(VulkanDevice device, VulkanPipelineCache dstCache, VulkanUInt32 srcCacheCount, VulkanPipelineCache pSrcCaches, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkMergePipelineCaches(device != null ? device.getVk() : null, dstCache != null ? dstCache.getVk() : null, srcCacheCount != null ? srcCacheCount.getVk() : null, pSrcCaches != null ? pSrcCaches.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkMergePipelineCaches");
    }


    public VulkanPipeline createGraphicsPipelines(VulkanDevice device, VulkanPipelineCache pipelineCache, VulkanUInt32 createInfoCount, VulkanGraphicsPipelineCreateInfo pCreateInfos, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanPipeline o = new VulkanPipeline();
        vk.vkCreateGraphicsPipelines(device != null ? device.getVk() : null, pipelineCache != null ? pipelineCache.getVk() : null, createInfoCount != null ? createInfoCount.getVk() : null, pCreateInfos != null ? pCreateInfos.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateGraphicsPipelines");
        return o;
    }


    public VulkanPipeline createComputePipelines(VulkanDevice device, VulkanPipelineCache pipelineCache, VulkanUInt32 createInfoCount, VulkanComputePipelineCreateInfo pCreateInfos, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanPipeline o = new VulkanPipeline();
        vk.vkCreateComputePipelines(device != null ? device.getVk() : null, pipelineCache != null ? pipelineCache.getVk() : null, createInfoCount != null ? createInfoCount.getVk() : null, pCreateInfos != null ? pCreateInfos.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateComputePipelines");
        return o;
    }


    public void destroyPipeline(VulkanDevice device, VulkanPipeline pipeline, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyPipeline(device != null ? device.getVk() : null, pipeline != null ? pipeline.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public VulkanPipelineLayout createPipelineLayout(VulkanDevice device, VulkanPipelineLayoutCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanPipelineLayout o = new VulkanPipelineLayout();
        vk.vkCreatePipelineLayout(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreatePipelineLayout");
        return o;
    }


    public void destroyPipelineLayout(VulkanDevice device, VulkanPipelineLayout pipelineLayout, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyPipelineLayout(device != null ? device.getVk() : null, pipelineLayout != null ? pipelineLayout.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public VulkanSampler createSampler(VulkanDevice device, VulkanSamplerCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanSampler o = new VulkanSampler();
        vk.vkCreateSampler(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateSampler");
        return o;
    }


    public void destroySampler(VulkanDevice device, VulkanSampler sampler, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroySampler(device != null ? device.getVk() : null, sampler != null ? sampler.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public VulkanDescriptorSetLayout createDescriptorSetLayout(VulkanDevice device, VulkanDescriptorSetLayoutCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanDescriptorSetLayout o = new VulkanDescriptorSetLayout();
        vk.vkCreateDescriptorSetLayout(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateDescriptorSetLayout");
        return o;
    }


    public void destroyDescriptorSetLayout(VulkanDevice device, VulkanDescriptorSetLayout descriptorSetLayout, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyDescriptorSetLayout(device != null ? device.getVk() : null, descriptorSetLayout != null ? descriptorSetLayout.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public VulkanDescriptorPool createDescriptorPool(VulkanDevice device, VulkanDescriptorPoolCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanDescriptorPool o = new VulkanDescriptorPool();
        vk.vkCreateDescriptorPool(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateDescriptorPool");
        return o;
    }


    public void destroyDescriptorPool(VulkanDevice device, VulkanDescriptorPool descriptorPool, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyDescriptorPool(device != null ? device.getVk() : null, descriptorPool != null ? descriptorPool.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void resetDescriptorPool(VulkanDevice device, VulkanDescriptorPool descriptorPool, VulkanDescriptorPoolResetFlags flags, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkResetDescriptorPool(device != null ? device.getVk() : null, descriptorPool != null ? descriptorPool.getVk() : null, flags != null ? flags.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkResetDescriptorPool");
    }


    public void allocateDescriptorSets(VulkanDevice device, VulkanDescriptorSetAllocateInfo pAllocateInfo, VulkanDescriptorSet pDescriptorSets, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkAllocateDescriptorSets(device != null ? device.getVk() : null, pAllocateInfo != null ? pAllocateInfo.getVk() : null, pDescriptorSets != null ? pDescriptorSets.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkAllocateDescriptorSets");
    }


    public void freeDescriptorSets(VulkanDevice device, VulkanDescriptorPool descriptorPool, VulkanUInt32 descriptorSetCount, VulkanDescriptorSet pDescriptorSets, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkFreeDescriptorSets(device != null ? device.getVk() : null, descriptorPool != null ? descriptorPool.getVk() : null, descriptorSetCount != null ? descriptorSetCount.getVk() : null, pDescriptorSets != null ? pDescriptorSets.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkFreeDescriptorSets");
    }


    public void updateDescriptorSets(VulkanDevice device, VulkanUInt32 descriptorWriteCount, VulkanWriteDescriptorSet pDescriptorWrites, VulkanUInt32 descriptorCopyCount, VulkanCopyDescriptorSet pDescriptorCopies){
        vk.vkUpdateDescriptorSets(device != null ? device.getVk() : null, descriptorWriteCount != null ? descriptorWriteCount.getVk() : null, pDescriptorWrites != null ? pDescriptorWrites.getVk() : null, descriptorCopyCount != null ? descriptorCopyCount.getVk() : null, pDescriptorCopies != null ? pDescriptorCopies.getVk() : null);
    }


    public VulkanFramebuffer createFramebuffer(VulkanDevice device, VulkanFramebufferCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanFramebuffer o = new VulkanFramebuffer();
        vk.vkCreateFramebuffer(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateFramebuffer");
        return o;
    }


    public void destroyFramebuffer(VulkanDevice device, VulkanFramebuffer framebuffer, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyFramebuffer(device != null ? device.getVk() : null, framebuffer != null ? framebuffer.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public VulkanRenderPass createRenderPass(VulkanDevice device, VulkanRenderPassCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanRenderPass o = new VulkanRenderPass();
        vk.vkCreateRenderPass(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateRenderPass");
        return o;
    }


    public void destroyRenderPass(VulkanDevice device, VulkanRenderPass renderPass, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyRenderPass(device != null ? device.getVk() : null, renderPass != null ? renderPass.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void getRenderAreaGranularity(VulkanDevice device, VulkanRenderPass renderPass, VulkanExtent2D pGranularity){
        vk.vkGetRenderAreaGranularity(device != null ? device.getVk() : null, renderPass != null ? renderPass.getVk() : null, pGranularity != null ? pGranularity.getVk() : null);
    }


    public VulkanCommandPool createCommandPool(VulkanDevice device, VulkanCommandPoolCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanCommandPool o = new VulkanCommandPool();
        vk.vkCreateCommandPool(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateCommandPool");
        return o;
    }


    public void destroyCommandPool(VulkanDevice device, VulkanCommandPool commandPool, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyCommandPool(device != null ? device.getVk() : null, commandPool != null ? commandPool.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void resetCommandPool(VulkanDevice device, VulkanCommandPool commandPool, VulkanCommandPoolResetFlags flags, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkResetCommandPool(device != null ? device.getVk() : null, commandPool != null ? commandPool.getVk() : null, flags != null ? flags.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkResetCommandPool");
    }


    public void allocateCommandBuffers(VulkanDevice device, VulkanCommandBufferAllocateInfo pAllocateInfo, VulkanCommandBuffer pCommandBuffers, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkAllocateCommandBuffers(device != null ? device.getVk() : null, pAllocateInfo != null ? pAllocateInfo.getVk() : null, pCommandBuffers != null ? pCommandBuffers.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkAllocateCommandBuffers");
    }


    public void freeCommandBuffers(VulkanDevice device, VulkanCommandPool commandPool, VulkanUInt32 commandBufferCount, VulkanCommandBuffer pCommandBuffers){
        vk.vkFreeCommandBuffers(device != null ? device.getVk() : null, commandPool != null ? commandPool.getVk() : null, commandBufferCount != null ? commandBufferCount.getVk() : null, pCommandBuffers != null ? pCommandBuffers.getVk() : null);
    }


    public void beginCommandBuffer(VulkanCommandBuffer commandBuffer, VulkanCommandBufferBeginInfo pBeginInfo, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkBeginCommandBuffer(commandBuffer != null ? commandBuffer.getVk() : null, pBeginInfo != null ? pBeginInfo.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkBeginCommandBuffer");
    }


    public void endCommandBuffer(VulkanCommandBuffer commandBuffer, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkEndCommandBuffer(commandBuffer != null ? commandBuffer.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEndCommandBuffer");
    }


    public void resetCommandBuffer(VulkanCommandBuffer commandBuffer, VulkanCommandBufferResetFlags flags, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkResetCommandBuffer(commandBuffer != null ? commandBuffer.getVk() : null, flags != null ? flags.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkResetCommandBuffer");
    }


    public void cmdBindPipeline(VulkanCommandBuffer commandBuffer, VulkanPipelineBindPoint pipelineBindPoint, VulkanPipeline pipeline){
        vk.vkCmdBindPipeline(commandBuffer != null ? commandBuffer.getVk() : null, pipelineBindPoint != null ? pipelineBindPoint.getVk() : null, pipeline != null ? pipeline.getVk() : null);
    }


    public void cmdSetViewport(VulkanCommandBuffer commandBuffer, VulkanUInt32 firstViewport, VulkanUInt32 viewportCount, VulkanViewport pViewports){
        vk.vkCmdSetViewport(commandBuffer != null ? commandBuffer.getVk() : null, firstViewport != null ? firstViewport.getVk() : null, viewportCount != null ? viewportCount.getVk() : null, pViewports != null ? pViewports.getVk() : null);
    }


    public void cmdSetScissor(VulkanCommandBuffer commandBuffer, VulkanUInt32 firstScissor, VulkanUInt32 scissorCount, VulkanRect2D pScissors){
        vk.vkCmdSetScissor(commandBuffer != null ? commandBuffer.getVk() : null, firstScissor != null ? firstScissor.getVk() : null, scissorCount != null ? scissorCount.getVk() : null, pScissors != null ? pScissors.getVk() : null);
    }


    public void cmdSetLineWidth(VulkanCommandBuffer commandBuffer, VulkanFloat lineWidth){
        vk.vkCmdSetLineWidth(commandBuffer != null ? commandBuffer.getVk() : null, lineWidth != null ? lineWidth.getVk() : null);
    }


    public void cmdSetDepthBias(VulkanCommandBuffer commandBuffer, VulkanFloat depthBiasConstantFactor, VulkanFloat depthBiasClamp, VulkanFloat depthBiasSlopeFactor){
        vk.vkCmdSetDepthBias(commandBuffer != null ? commandBuffer.getVk() : null, depthBiasConstantFactor != null ? depthBiasConstantFactor.getVk() : null, depthBiasClamp != null ? depthBiasClamp.getVk() : null, depthBiasSlopeFactor != null ? depthBiasSlopeFactor.getVk() : null);
    }


    public void cmdSetBlendConstants(VulkanCommandBuffer commandBuffer, VulkanFloat blendConstants){
        vk.vkCmdSetBlendConstants(commandBuffer != null ? commandBuffer.getVk() : null, blendConstants != null ? blendConstants.getVk() : null);
    }


    public void cmdSetDepthBounds(VulkanCommandBuffer commandBuffer, VulkanFloat minDepthBounds, VulkanFloat maxDepthBounds){
        vk.vkCmdSetDepthBounds(commandBuffer != null ? commandBuffer.getVk() : null, minDepthBounds != null ? minDepthBounds.getVk() : null, maxDepthBounds != null ? maxDepthBounds.getVk() : null);
    }


    public void cmdSetStencilCompareMask(VulkanCommandBuffer commandBuffer, VulkanStencilFaceFlags faceMask, VulkanUInt32 compareMask){
        vk.vkCmdSetStencilCompareMask(commandBuffer != null ? commandBuffer.getVk() : null, faceMask != null ? faceMask.getVk() : null, compareMask != null ? compareMask.getVk() : null);
    }


    public void cmdSetStencilWriteMask(VulkanCommandBuffer commandBuffer, VulkanStencilFaceFlags faceMask, VulkanUInt32 writeMask){
        vk.vkCmdSetStencilWriteMask(commandBuffer != null ? commandBuffer.getVk() : null, faceMask != null ? faceMask.getVk() : null, writeMask != null ? writeMask.getVk() : null);
    }


    public void cmdSetStencilReference(VulkanCommandBuffer commandBuffer, VulkanStencilFaceFlags faceMask, VulkanUInt32 reference){
        vk.vkCmdSetStencilReference(commandBuffer != null ? commandBuffer.getVk() : null, faceMask != null ? faceMask.getVk() : null, reference != null ? reference.getVk() : null);
    }


    public void cmdBindDescriptorSets(VulkanCommandBuffer commandBuffer, VulkanPipelineBindPoint pipelineBindPoint, VulkanPipelineLayout layout, VulkanUInt32 firstSet, VulkanUInt32 descriptorSetCount, VulkanDescriptorSet pDescriptorSets, VulkanUInt32 dynamicOffsetCount, VulkanUInt32 pDynamicOffsets){
        vk.vkCmdBindDescriptorSets(commandBuffer != null ? commandBuffer.getVk() : null, pipelineBindPoint != null ? pipelineBindPoint.getVk() : null, layout != null ? layout.getVk() : null, firstSet != null ? firstSet.getVk() : null, descriptorSetCount != null ? descriptorSetCount.getVk() : null, pDescriptorSets != null ? pDescriptorSets.getVk() : null, dynamicOffsetCount != null ? dynamicOffsetCount.getVk() : null, pDynamicOffsets != null ? pDynamicOffsets.getVk() : null);
    }


    public void cmdBindIndexBuffer(VulkanCommandBuffer commandBuffer, VulkanBuffer buffer, VulkanDeviceSize offset, VulkanIndexType indexType){
        vk.vkCmdBindIndexBuffer(commandBuffer != null ? commandBuffer.getVk() : null, buffer != null ? buffer.getVk() : null, offset != null ? offset.getVk() : null, indexType != null ? indexType.getVk() : null);
    }


    public void cmdBindVertexBuffers(VulkanCommandBuffer commandBuffer, VulkanUInt32 firstBinding, VulkanUInt32 bindingCount, VulkanBuffer pBuffers, VulkanDeviceSize pOffsets){
        vk.vkCmdBindVertexBuffers(commandBuffer != null ? commandBuffer.getVk() : null, firstBinding != null ? firstBinding.getVk() : null, bindingCount != null ? bindingCount.getVk() : null, pBuffers != null ? pBuffers.getVk() : null, pOffsets != null ? pOffsets.getVk() : null);
    }


    public void cmdDraw(VulkanCommandBuffer commandBuffer, VulkanUInt32 vertexCount, VulkanUInt32 instanceCount, VulkanUInt32 firstVertex, VulkanUInt32 firstInstance){
        vk.vkCmdDraw(commandBuffer != null ? commandBuffer.getVk() : null, vertexCount != null ? vertexCount.getVk() : null, instanceCount != null ? instanceCount.getVk() : null, firstVertex != null ? firstVertex.getVk() : null, firstInstance != null ? firstInstance.getVk() : null);
    }


    public void cmdDrawIndexed(VulkanCommandBuffer commandBuffer, VulkanUInt32 indexCount, VulkanUInt32 instanceCount, VulkanUInt32 firstIndex, VulkanInt32 vertexOffset, VulkanUInt32 firstInstance){
        vk.vkCmdDrawIndexed(commandBuffer != null ? commandBuffer.getVk() : null, indexCount != null ? indexCount.getVk() : null, instanceCount != null ? instanceCount.getVk() : null, firstIndex != null ? firstIndex.getVk() : null, vertexOffset != null ? vertexOffset.getVk() : null, firstInstance != null ? firstInstance.getVk() : null);
    }


    public void cmdDrawIndirect(VulkanCommandBuffer commandBuffer, VulkanBuffer buffer, VulkanDeviceSize offset, VulkanUInt32 drawCount, VulkanUInt32 stride){
        vk.vkCmdDrawIndirect(commandBuffer != null ? commandBuffer.getVk() : null, buffer != null ? buffer.getVk() : null, offset != null ? offset.getVk() : null, drawCount != null ? drawCount.getVk() : null, stride != null ? stride.getVk() : null);
    }


    public void cmdDrawIndexedIndirect(VulkanCommandBuffer commandBuffer, VulkanBuffer buffer, VulkanDeviceSize offset, VulkanUInt32 drawCount, VulkanUInt32 stride){
        vk.vkCmdDrawIndexedIndirect(commandBuffer != null ? commandBuffer.getVk() : null, buffer != null ? buffer.getVk() : null, offset != null ? offset.getVk() : null, drawCount != null ? drawCount.getVk() : null, stride != null ? stride.getVk() : null);
    }


    public void cmdDispatch(VulkanCommandBuffer commandBuffer, VulkanUInt32 groupCountX, VulkanUInt32 groupCountY, VulkanUInt32 groupCountZ){
        vk.vkCmdDispatch(commandBuffer != null ? commandBuffer.getVk() : null, groupCountX != null ? groupCountX.getVk() : null, groupCountY != null ? groupCountY.getVk() : null, groupCountZ != null ? groupCountZ.getVk() : null);
    }


    public void cmdDispatchIndirect(VulkanCommandBuffer commandBuffer, VulkanBuffer buffer, VulkanDeviceSize offset){
        vk.vkCmdDispatchIndirect(commandBuffer != null ? commandBuffer.getVk() : null, buffer != null ? buffer.getVk() : null, offset != null ? offset.getVk() : null);
    }


    public void cmdCopyBuffer(VulkanCommandBuffer commandBuffer, VulkanBuffer srcBuffer, VulkanBuffer dstBuffer, VulkanUInt32 regionCount, VulkanBufferCopy pRegions){
        vk.vkCmdCopyBuffer(commandBuffer != null ? commandBuffer.getVk() : null, srcBuffer != null ? srcBuffer.getVk() : null, dstBuffer != null ? dstBuffer.getVk() : null, regionCount != null ? regionCount.getVk() : null, pRegions != null ? pRegions.getVk() : null);
    }


    public void cmdCopyImage(VulkanCommandBuffer commandBuffer, VulkanImage srcImage, VulkanImageLayout srcImageLayout, VulkanImage dstImage, VulkanImageLayout dstImageLayout, VulkanUInt32 regionCount, VulkanImageCopy pRegions){
        vk.vkCmdCopyImage(commandBuffer != null ? commandBuffer.getVk() : null, srcImage != null ? srcImage.getVk() : null, srcImageLayout != null ? srcImageLayout.getVk() : null, dstImage != null ? dstImage.getVk() : null, dstImageLayout != null ? dstImageLayout.getVk() : null, regionCount != null ? regionCount.getVk() : null, pRegions != null ? pRegions.getVk() : null);
    }


    public void cmdBlitImage(VulkanCommandBuffer commandBuffer, VulkanImage srcImage, VulkanImageLayout srcImageLayout, VulkanImage dstImage, VulkanImageLayout dstImageLayout, VulkanUInt32 regionCount, VulkanImageBlit pRegions, VulkanFilter filter){
        vk.vkCmdBlitImage(commandBuffer != null ? commandBuffer.getVk() : null, srcImage != null ? srcImage.getVk() : null, srcImageLayout != null ? srcImageLayout.getVk() : null, dstImage != null ? dstImage.getVk() : null, dstImageLayout != null ? dstImageLayout.getVk() : null, regionCount != null ? regionCount.getVk() : null, pRegions != null ? pRegions.getVk() : null, filter != null ? filter.getVk() : null);
    }


    public void cmdCopyBufferToImage(VulkanCommandBuffer commandBuffer, VulkanBuffer srcBuffer, VulkanImage dstImage, VulkanImageLayout dstImageLayout, VulkanUInt32 regionCount, VulkanBufferImageCopy pRegions){
        vk.vkCmdCopyBufferToImage(commandBuffer != null ? commandBuffer.getVk() : null, srcBuffer != null ? srcBuffer.getVk() : null, dstImage != null ? dstImage.getVk() : null, dstImageLayout != null ? dstImageLayout.getVk() : null, regionCount != null ? regionCount.getVk() : null, pRegions != null ? pRegions.getVk() : null);
    }


    public void cmdCopyImageToBuffer(VulkanCommandBuffer commandBuffer, VulkanImage srcImage, VulkanImageLayout srcImageLayout, VulkanBuffer dstBuffer, VulkanUInt32 regionCount, VulkanBufferImageCopy pRegions){
        vk.vkCmdCopyImageToBuffer(commandBuffer != null ? commandBuffer.getVk() : null, srcImage != null ? srcImage.getVk() : null, srcImageLayout != null ? srcImageLayout.getVk() : null, dstBuffer != null ? dstBuffer.getVk() : null, regionCount != null ? regionCount.getVk() : null, pRegions != null ? pRegions.getVk() : null);
    }


    public void cmdUpdateBuffer(VulkanCommandBuffer commandBuffer, VulkanBuffer dstBuffer, VulkanDeviceSize dstOffset, VulkanDeviceSize dataSize, VulkanObject pData){
        vk.vkCmdUpdateBuffer(commandBuffer != null ? commandBuffer.getVk() : null, dstBuffer != null ? dstBuffer.getVk() : null, dstOffset != null ? dstOffset.getVk() : null, dataSize != null ? dataSize.getVk() : null, pData != null ? pData.getVk() : null);
    }


    public void cmdFillBuffer(VulkanCommandBuffer commandBuffer, VulkanBuffer dstBuffer, VulkanDeviceSize dstOffset, VulkanDeviceSize size, VulkanUInt32 data){
        vk.vkCmdFillBuffer(commandBuffer != null ? commandBuffer.getVk() : null, dstBuffer != null ? dstBuffer.getVk() : null, dstOffset != null ? dstOffset.getVk() : null, size != null ? size.getVk() : null, data != null ? data.getVk() : null);
    }


    public void cmdClearColorImage(VulkanCommandBuffer commandBuffer, VulkanImage image, VulkanImageLayout imageLayout, VulkanClearColorValue pColor, VulkanUInt32 rangeCount, VulkanImageSubresourceRange pRanges){
        vk.vkCmdClearColorImage(commandBuffer != null ? commandBuffer.getVk() : null, image != null ? image.getVk() : null, imageLayout != null ? imageLayout.getVk() : null, pColor != null ? pColor.getVk() : null, rangeCount != null ? rangeCount.getVk() : null, pRanges != null ? pRanges.getVk() : null);
    }


    public void cmdClearDepthStencilImage(VulkanCommandBuffer commandBuffer, VulkanImage image, VulkanImageLayout imageLayout, VulkanClearDepthStencilValue pDepthStencil, VulkanUInt32 rangeCount, VulkanImageSubresourceRange pRanges){
        vk.vkCmdClearDepthStencilImage(commandBuffer != null ? commandBuffer.getVk() : null, image != null ? image.getVk() : null, imageLayout != null ? imageLayout.getVk() : null, pDepthStencil != null ? pDepthStencil.getVk() : null, rangeCount != null ? rangeCount.getVk() : null, pRanges != null ? pRanges.getVk() : null);
    }


    public void cmdClearAttachments(VulkanCommandBuffer commandBuffer, VulkanUInt32 attachmentCount, VulkanClearAttachment pAttachments, VulkanUInt32 rectCount, VulkanClearRect pRects){
        vk.vkCmdClearAttachments(commandBuffer != null ? commandBuffer.getVk() : null, attachmentCount != null ? attachmentCount.getVk() : null, pAttachments != null ? pAttachments.getVk() : null, rectCount != null ? rectCount.getVk() : null, pRects != null ? pRects.getVk() : null);
    }


    public void cmdResolveImage(VulkanCommandBuffer commandBuffer, VulkanImage srcImage, VulkanImageLayout srcImageLayout, VulkanImage dstImage, VulkanImageLayout dstImageLayout, VulkanUInt32 regionCount, VulkanImageResolve pRegions){
        vk.vkCmdResolveImage(commandBuffer != null ? commandBuffer.getVk() : null, srcImage != null ? srcImage.getVk() : null, srcImageLayout != null ? srcImageLayout.getVk() : null, dstImage != null ? dstImage.getVk() : null, dstImageLayout != null ? dstImageLayout.getVk() : null, regionCount != null ? regionCount.getVk() : null, pRegions != null ? pRegions.getVk() : null);
    }


    public void cmdSetEvent(VulkanCommandBuffer commandBuffer, VulkanEvent event, VulkanPipelineStageFlags stageMask){
        vk.vkCmdSetEvent(commandBuffer != null ? commandBuffer.getVk() : null, event != null ? event.getVk() : null, stageMask != null ? stageMask.getVk() : null);
    }


    public void cmdResetEvent(VulkanCommandBuffer commandBuffer, VulkanEvent event, VulkanPipelineStageFlags stageMask){
        vk.vkCmdResetEvent(commandBuffer != null ? commandBuffer.getVk() : null, event != null ? event.getVk() : null, stageMask != null ? stageMask.getVk() : null);
    }


    public void cmdWaitEvents(VulkanCommandBuffer commandBuffer, VulkanUInt32 eventCount, VulkanEvent pEvents, VulkanPipelineStageFlags srcStageMask, VulkanPipelineStageFlags dstStageMask, VulkanUInt32 memoryBarrierCount, VulkanMemoryBarrier pMemoryBarriers, VulkanUInt32 bufferMemoryBarrierCount, VulkanBufferMemoryBarrier pBufferMemoryBarriers, VulkanUInt32 imageMemoryBarrierCount, VulkanImageMemoryBarrier pImageMemoryBarriers){
        vk.vkCmdWaitEvents(commandBuffer != null ? commandBuffer.getVk() : null, eventCount != null ? eventCount.getVk() : null, pEvents != null ? pEvents.getVk() : null, srcStageMask != null ? srcStageMask.getVk() : null, dstStageMask != null ? dstStageMask.getVk() : null, memoryBarrierCount != null ? memoryBarrierCount.getVk() : null, pMemoryBarriers != null ? pMemoryBarriers.getVk() : null, bufferMemoryBarrierCount != null ? bufferMemoryBarrierCount.getVk() : null, pBufferMemoryBarriers != null ? pBufferMemoryBarriers.getVk() : null, imageMemoryBarrierCount != null ? imageMemoryBarrierCount.getVk() : null, pImageMemoryBarriers != null ? pImageMemoryBarriers.getVk() : null);
    }


    public void cmdPipelineBarrier(VulkanCommandBuffer commandBuffer, VulkanPipelineStageFlags srcStageMask, VulkanPipelineStageFlags dstStageMask, VulkanDependencyFlags dependencyFlags, VulkanUInt32 memoryBarrierCount, VulkanMemoryBarrier pMemoryBarriers, VulkanUInt32 bufferMemoryBarrierCount, VulkanBufferMemoryBarrier pBufferMemoryBarriers, VulkanUInt32 imageMemoryBarrierCount, VulkanImageMemoryBarrier pImageMemoryBarriers){
        vk.vkCmdPipelineBarrier(commandBuffer != null ? commandBuffer.getVk() : null, srcStageMask != null ? srcStageMask.getVk() : null, dstStageMask != null ? dstStageMask.getVk() : null, dependencyFlags != null ? dependencyFlags.getVk() : null, memoryBarrierCount != null ? memoryBarrierCount.getVk() : null, pMemoryBarriers != null ? pMemoryBarriers.getVk() : null, bufferMemoryBarrierCount != null ? bufferMemoryBarrierCount.getVk() : null, pBufferMemoryBarriers != null ? pBufferMemoryBarriers.getVk() : null, imageMemoryBarrierCount != null ? imageMemoryBarrierCount.getVk() : null, pImageMemoryBarriers != null ? pImageMemoryBarriers.getVk() : null);
    }


    public void cmdBeginQuery(VulkanCommandBuffer commandBuffer, VulkanQueryPool queryPool, VulkanUInt32 query, VulkanQueryControlFlags flags){
        vk.vkCmdBeginQuery(commandBuffer != null ? commandBuffer.getVk() : null, queryPool != null ? queryPool.getVk() : null, query != null ? query.getVk() : null, flags != null ? flags.getVk() : null);
    }


    public void cmdEndQuery(VulkanCommandBuffer commandBuffer, VulkanQueryPool queryPool, VulkanUInt32 query){
        vk.vkCmdEndQuery(commandBuffer != null ? commandBuffer.getVk() : null, queryPool != null ? queryPool.getVk() : null, query != null ? query.getVk() : null);
    }


    public void cmdResetQueryPool(VulkanCommandBuffer commandBuffer, VulkanQueryPool queryPool, VulkanUInt32 firstQuery, VulkanUInt32 queryCount){
        vk.vkCmdResetQueryPool(commandBuffer != null ? commandBuffer.getVk() : null, queryPool != null ? queryPool.getVk() : null, firstQuery != null ? firstQuery.getVk() : null, queryCount != null ? queryCount.getVk() : null);
    }


    public void cmdWriteTimestamp(VulkanCommandBuffer commandBuffer, VulkanPipelineStageFlagBits pipelineStage, VulkanQueryPool queryPool, VulkanUInt32 query){
        vk.vkCmdWriteTimestamp(commandBuffer != null ? commandBuffer.getVk() : null, pipelineStage != null ? pipelineStage.getVk() : null, queryPool != null ? queryPool.getVk() : null, query != null ? query.getVk() : null);
    }


    public void cmdCopyQueryPoolResults(VulkanCommandBuffer commandBuffer, VulkanQueryPool queryPool, VulkanUInt32 firstQuery, VulkanUInt32 queryCount, VulkanBuffer dstBuffer, VulkanDeviceSize dstOffset, VulkanDeviceSize stride, VulkanQueryResultFlags flags){
        vk.vkCmdCopyQueryPoolResults(commandBuffer != null ? commandBuffer.getVk() : null, queryPool != null ? queryPool.getVk() : null, firstQuery != null ? firstQuery.getVk() : null, queryCount != null ? queryCount.getVk() : null, dstBuffer != null ? dstBuffer.getVk() : null, dstOffset != null ? dstOffset.getVk() : null, stride != null ? stride.getVk() : null, flags != null ? flags.getVk() : null);
    }


    public void cmdPushConstants(VulkanCommandBuffer commandBuffer, VulkanPipelineLayout layout, VulkanShaderStageFlags stageFlags, VulkanUInt32 offset, VulkanUInt32 size, VulkanObject pValues){
        vk.vkCmdPushConstants(commandBuffer != null ? commandBuffer.getVk() : null, layout != null ? layout.getVk() : null, stageFlags != null ? stageFlags.getVk() : null, offset != null ? offset.getVk() : null, size != null ? size.getVk() : null, pValues != null ? pValues.getVk() : null);
    }


    public void cmdBeginRenderPass(VulkanCommandBuffer commandBuffer, VulkanRenderPassBeginInfo pRenderPassBegin, VulkanSubpassContents contents){
        vk.vkCmdBeginRenderPass(commandBuffer != null ? commandBuffer.getVk() : null, pRenderPassBegin != null ? pRenderPassBegin.getVk() : null, contents != null ? contents.getVk() : null);
    }


    public void cmdNextSubpass(VulkanCommandBuffer commandBuffer, VulkanSubpassContents contents){
        vk.vkCmdNextSubpass(commandBuffer != null ? commandBuffer.getVk() : null, contents != null ? contents.getVk() : null);
    }


    public void cmdEndRenderPass(VulkanCommandBuffer commandBuffer){
        vk.vkCmdEndRenderPass(commandBuffer != null ? commandBuffer.getVk() : null);
    }


    public void cmdExecuteCommands(VulkanCommandBuffer commandBuffer, VulkanUInt32 commandBufferCount, VulkanCommandBuffer pCommandBuffers){
        vk.vkCmdExecuteCommands(commandBuffer != null ? commandBuffer.getVk() : null, commandBufferCount != null ? commandBufferCount.getVk() : null, pCommandBuffers != null ? pCommandBuffers.getVk() : null);
    }


    public void enumerateInstanceVersion(VulkanUInt32 pApiVersion, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkEnumerateInstanceVersion(pApiVersion != null ? pApiVersion.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEnumerateInstanceVersion");
    }


    public void bindBufferMemory2(VulkanDevice device, VulkanUInt32 bindInfoCount, VulkanBindBufferMemoryInfo pBindInfos, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkBindBufferMemory2(device != null ? device.getVk() : null, bindInfoCount != null ? bindInfoCount.getVk() : null, pBindInfos != null ? pBindInfos.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkBindBufferMemory2");
    }


    public void bindImageMemory2(VulkanDevice device, VulkanUInt32 bindInfoCount, VulkanBindImageMemoryInfo pBindInfos, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkBindImageMemory2(device != null ? device.getVk() : null, bindInfoCount != null ? bindInfoCount.getVk() : null, pBindInfos != null ? pBindInfos.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkBindImageMemory2");
    }


    public void getDeviceGroupPeerMemoryFeatures(VulkanDevice device, VulkanUInt32 heapIndex, VulkanUInt32 localDeviceIndex, VulkanUInt32 remoteDeviceIndex, VulkanPeerMemoryFeatureFlags pPeerMemoryFeatures){
        vk.vkGetDeviceGroupPeerMemoryFeatures(device != null ? device.getVk() : null, heapIndex != null ? heapIndex.getVk() : null, localDeviceIndex != null ? localDeviceIndex.getVk() : null, remoteDeviceIndex != null ? remoteDeviceIndex.getVk() : null, pPeerMemoryFeatures != null ? pPeerMemoryFeatures.getVk() : null);
    }


    public void cmdSetDeviceMask(VulkanCommandBuffer commandBuffer, VulkanUInt32 deviceMask){
        vk.vkCmdSetDeviceMask(commandBuffer != null ? commandBuffer.getVk() : null, deviceMask != null ? deviceMask.getVk() : null);
    }


    public void cmdDispatchBase(VulkanCommandBuffer commandBuffer, VulkanUInt32 baseGroupX, VulkanUInt32 baseGroupY, VulkanUInt32 baseGroupZ, VulkanUInt32 groupCountX, VulkanUInt32 groupCountY, VulkanUInt32 groupCountZ){
        vk.vkCmdDispatchBase(commandBuffer != null ? commandBuffer.getVk() : null, baseGroupX != null ? baseGroupX.getVk() : null, baseGroupY != null ? baseGroupY.getVk() : null, baseGroupZ != null ? baseGroupZ.getVk() : null, groupCountX != null ? groupCountX.getVk() : null, groupCountY != null ? groupCountY.getVk() : null, groupCountZ != null ? groupCountZ.getVk() : null);
    }


    public VulkanPhysicalDeviceGroupProperties.Array enumeratePhysicalDeviceGroups(VulkanInstance instance){
        VulkanResult rval = new VulkanResult();
        VulkanUInt32 count = new VulkanUInt32();

        vk.vkEnumeratePhysicalDeviceGroups(instance != null ? instance.getVk() : null, count.getVk(), null, rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEnumeratePhysicalDeviceGroups");

        VulkanPhysicalDeviceGroupProperties.Array o = new VulkanPhysicalDeviceGroupProperties.Array(count.getValue());

        vk.vkEnumeratePhysicalDeviceGroups(instance != null ? instance.getVk() : null, count.getVk(), o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEnumeratePhysicalDeviceGroups");

        return o;
    }


    public void getImageMemoryRequirements2(VulkanDevice device, VulkanImageMemoryRequirementsInfo2 pInfo, VulkanMemoryRequirements2 pMemoryRequirements){
        vk.vkGetImageMemoryRequirements2(device != null ? device.getVk() : null, pInfo != null ? pInfo.getVk() : null, pMemoryRequirements != null ? pMemoryRequirements.getVk() : null);
    }


    public void getBufferMemoryRequirements2(VulkanDevice device, VulkanBufferMemoryRequirementsInfo2 pInfo, VulkanMemoryRequirements2 pMemoryRequirements){
        vk.vkGetBufferMemoryRequirements2(device != null ? device.getVk() : null, pInfo != null ? pInfo.getVk() : null, pMemoryRequirements != null ? pMemoryRequirements.getVk() : null);
    }


    public void getImageSparseMemoryRequirements2(VulkanDevice device, VulkanImageSparseMemoryRequirementsInfo2 pInfo, VulkanUInt32 pSparseMemoryRequirementCount, VulkanSparseImageMemoryRequirements2 pSparseMemoryRequirements){
        vk.vkGetImageSparseMemoryRequirements2(device != null ? device.getVk() : null, pInfo != null ? pInfo.getVk() : null, pSparseMemoryRequirementCount != null ? pSparseMemoryRequirementCount.getVk() : null, pSparseMemoryRequirements != null ? pSparseMemoryRequirements.getVk() : null);
    }


    public void getPhysicalDeviceFeatures2(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceFeatures2 pFeatures){
        vk.vkGetPhysicalDeviceFeatures2(physicalDevice != null ? physicalDevice.getVk() : null, pFeatures != null ? pFeatures.getVk() : null);
    }


    public void getPhysicalDeviceProperties2(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceProperties2 pProperties){
        vk.vkGetPhysicalDeviceProperties2(physicalDevice != null ? physicalDevice.getVk() : null, pProperties != null ? pProperties.getVk() : null);
    }


    public void getPhysicalDeviceFormatProperties2(VulkanPhysicalDevice physicalDevice, VulkanFormat format, VulkanFormatProperties2 pFormatProperties){
        vk.vkGetPhysicalDeviceFormatProperties2(physicalDevice != null ? physicalDevice.getVk() : null, format != null ? format.getVk() : null, pFormatProperties != null ? pFormatProperties.getVk() : null);
    }


    public void getPhysicalDeviceImageFormatProperties2(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VulkanImageFormatProperties2 pImageFormatProperties, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPhysicalDeviceImageFormatProperties2(physicalDevice != null ? physicalDevice.getVk() : null, pImageFormatInfo != null ? pImageFormatInfo.getVk() : null, pImageFormatProperties != null ? pImageFormatProperties.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPhysicalDeviceImageFormatProperties2");
    }


    public void getPhysicalDeviceQueueFamilyProperties2(VulkanPhysicalDevice physicalDevice, VulkanUInt32 pQueueFamilyPropertyCount, VulkanQueueFamilyProperties2 pQueueFamilyProperties){
        vk.vkGetPhysicalDeviceQueueFamilyProperties2(physicalDevice != null ? physicalDevice.getVk() : null, pQueueFamilyPropertyCount != null ? pQueueFamilyPropertyCount.getVk() : null, pQueueFamilyProperties != null ? pQueueFamilyProperties.getVk() : null);
    }


    public void getPhysicalDeviceMemoryProperties2(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceMemoryProperties2 pMemoryProperties){
        vk.vkGetPhysicalDeviceMemoryProperties2(physicalDevice != null ? physicalDevice.getVk() : null, pMemoryProperties != null ? pMemoryProperties.getVk() : null);
    }


    public void getPhysicalDeviceSparseImageFormatProperties2(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, VulkanUInt32 pPropertyCount, VulkanSparseImageFormatProperties2 pProperties){
        vk.vkGetPhysicalDeviceSparseImageFormatProperties2(physicalDevice != null ? physicalDevice.getVk() : null, pFormatInfo != null ? pFormatInfo.getVk() : null, pPropertyCount != null ? pPropertyCount.getVk() : null, pProperties != null ? pProperties.getVk() : null);
    }


    public void trimCommandPool(VulkanDevice device, VulkanCommandPool commandPool, VulkanCommandPoolTrimFlags flags){
        vk.vkTrimCommandPool(device != null ? device.getVk() : null, commandPool != null ? commandPool.getVk() : null, flags != null ? flags.getVk() : null);
    }


    public void getDeviceQueue2(VulkanDevice device, VulkanDeviceQueueInfo2 pQueueInfo, VulkanQueue pQueue){
        vk.vkGetDeviceQueue2(device != null ? device.getVk() : null, pQueueInfo != null ? pQueueInfo.getVk() : null, pQueue != null ? pQueue.getVk() : null);
    }


    public VulkanSamplerYcbcrConversion createSamplerYcbcrConversion(VulkanDevice device, VulkanSamplerYcbcrConversionCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanSamplerYcbcrConversion o = new VulkanSamplerYcbcrConversion();
        vk.vkCreateSamplerYcbcrConversion(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateSamplerYcbcrConversion");
        return o;
    }


    public void destroySamplerYcbcrConversion(VulkanDevice device, VulkanSamplerYcbcrConversion ycbcrConversion, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroySamplerYcbcrConversion(device != null ? device.getVk() : null, ycbcrConversion != null ? ycbcrConversion.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public VulkanDescriptorUpdateTemplate createDescriptorUpdateTemplate(VulkanDevice device, VulkanDescriptorUpdateTemplateCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanDescriptorUpdateTemplate o = new VulkanDescriptorUpdateTemplate();
        vk.vkCreateDescriptorUpdateTemplate(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateDescriptorUpdateTemplate");
        return o;
    }


    public void destroyDescriptorUpdateTemplate(VulkanDevice device, VulkanDescriptorUpdateTemplate descriptorUpdateTemplate, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyDescriptorUpdateTemplate(device != null ? device.getVk() : null, descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void updateDescriptorSetWithTemplate(VulkanDevice device, VulkanDescriptorSet descriptorSet, VulkanDescriptorUpdateTemplate descriptorUpdateTemplate, VulkanObject pData){
        vk.vkUpdateDescriptorSetWithTemplate(device != null ? device.getVk() : null, descriptorSet != null ? descriptorSet.getVk() : null, descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVk() : null, pData != null ? pData.getVk() : null);
    }


    public void getPhysicalDeviceExternalBufferProperties(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceExternalBufferInfo pExternalBufferInfo, VulkanExternalBufferProperties pExternalBufferProperties){
        vk.vkGetPhysicalDeviceExternalBufferProperties(physicalDevice != null ? physicalDevice.getVk() : null, pExternalBufferInfo != null ? pExternalBufferInfo.getVk() : null, pExternalBufferProperties != null ? pExternalBufferProperties.getVk() : null);
    }


    public void getPhysicalDeviceExternalFenceProperties(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceExternalFenceInfo pExternalFenceInfo, VulkanExternalFenceProperties pExternalFenceProperties){
        vk.vkGetPhysicalDeviceExternalFenceProperties(physicalDevice != null ? physicalDevice.getVk() : null, pExternalFenceInfo != null ? pExternalFenceInfo.getVk() : null, pExternalFenceProperties != null ? pExternalFenceProperties.getVk() : null);
    }


    public void getPhysicalDeviceExternalSemaphoreProperties(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo, VulkanExternalSemaphoreProperties pExternalSemaphoreProperties){
        vk.vkGetPhysicalDeviceExternalSemaphoreProperties(physicalDevice != null ? physicalDevice.getVk() : null, pExternalSemaphoreInfo != null ? pExternalSemaphoreInfo.getVk() : null, pExternalSemaphoreProperties != null ? pExternalSemaphoreProperties.getVk() : null);
    }


    public void getDescriptorSetLayoutSupport(VulkanDevice device, VulkanDescriptorSetLayoutCreateInfo pCreateInfo, VulkanDescriptorSetLayoutSupport pSupport){
        vk.vkGetDescriptorSetLayoutSupport(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pSupport != null ? pSupport.getVk() : null);
    }


    public void destroySurfaceKHR(VulkanInstance instance, VulkanSurfaceKHR surface, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroySurfaceKHR(instance != null ? instance.getVk() : null, surface != null ? surface.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void getPhysicalDeviceSurfaceSupportKHR(VulkanPhysicalDevice physicalDevice, VulkanUInt32 queueFamilyIndex, VulkanSurfaceKHR surface, VulkanBool32 pSupported, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice != null ? physicalDevice.getVk() : null, queueFamilyIndex != null ? queueFamilyIndex.getVk() : null, surface != null ? surface.getVk() : null, pSupported != null ? pSupported.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPhysicalDeviceSurfaceSupportKHR");
    }


    public void getPhysicalDeviceSurfaceCapabilitiesKHR(VulkanPhysicalDevice physicalDevice, VulkanSurfaceKHR surface, VulkanSurfaceCapabilitiesKHR pSurfaceCapabilities, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPhysicalDeviceSurfaceCapabilitiesKHR(physicalDevice != null ? physicalDevice.getVk() : null, surface != null ? surface.getVk() : null, pSurfaceCapabilities != null ? pSurfaceCapabilities.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPhysicalDeviceSurfaceCapabilitiesKHR");
    }


    public void getPhysicalDeviceSurfaceFormatsKHR(VulkanPhysicalDevice physicalDevice, VulkanSurfaceKHR surface, VulkanUInt32 pSurfaceFormatCount, VulkanSurfaceFormatKHR pSurfaceFormats, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice != null ? physicalDevice.getVk() : null, surface != null ? surface.getVk() : null, pSurfaceFormatCount != null ? pSurfaceFormatCount.getVk() : null, pSurfaceFormats != null ? pSurfaceFormats.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPhysicalDeviceSurfaceFormatsKHR");
    }


    public void getPhysicalDeviceSurfacePresentModesKHR(VulkanPhysicalDevice physicalDevice, VulkanSurfaceKHR surface, VulkanUInt32 pPresentModeCount, VulkanPresentModeKHR pPresentModes, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPhysicalDeviceSurfacePresentModesKHR(physicalDevice != null ? physicalDevice.getVk() : null, surface != null ? surface.getVk() : null, pPresentModeCount != null ? pPresentModeCount.getVk() : null, pPresentModes != null ? pPresentModes.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPhysicalDeviceSurfacePresentModesKHR");
    }


    public VulkanSwapchainKHR createSwapchainKHR(VulkanDevice device, VulkanSwapchainCreateInfoKHR pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanSwapchainKHR o = new VulkanSwapchainKHR();
        vk.vkCreateSwapchainKHR(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateSwapchainKHR");
        return o;
    }


    public void destroySwapchainKHR(VulkanDevice device, VulkanSwapchainKHR swapchain, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroySwapchainKHR(device != null ? device.getVk() : null, swapchain != null ? swapchain.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void getSwapchainImagesKHR(VulkanDevice device, VulkanSwapchainKHR swapchain, VulkanUInt32 pSwapchainImageCount, VulkanImage pSwapchainImages, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetSwapchainImagesKHR(device != null ? device.getVk() : null, swapchain != null ? swapchain.getVk() : null, pSwapchainImageCount != null ? pSwapchainImageCount.getVk() : null, pSwapchainImages != null ? pSwapchainImages.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetSwapchainImagesKHR");
    }


    public void acquireNextImageKHR(VulkanDevice device, VulkanSwapchainKHR swapchain, VulkanUInt64 timeout, VulkanSemaphore semaphore, VulkanFence fence, VulkanUInt32 pImageIndex, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkAcquireNextImageKHR(device != null ? device.getVk() : null, swapchain != null ? swapchain.getVk() : null, timeout != null ? timeout.getVk() : null, semaphore != null ? semaphore.getVk() : null, fence != null ? fence.getVk() : null, pImageIndex != null ? pImageIndex.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkAcquireNextImageKHR");
    }


    public void queuePresentKHR(VulkanQueue queue, VulkanPresentInfoKHR pPresentInfo, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkQueuePresentKHR(queue != null ? queue.getVk() : null, pPresentInfo != null ? pPresentInfo.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkQueuePresentKHR");
    }


    public void getDeviceGroupPresentCapabilitiesKHR(VulkanDevice device, VulkanDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetDeviceGroupPresentCapabilitiesKHR(device != null ? device.getVk() : null, pDeviceGroupPresentCapabilities != null ? pDeviceGroupPresentCapabilities.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetDeviceGroupPresentCapabilitiesKHR");
    }


    public void getDeviceGroupSurfacePresentModesKHR(VulkanDevice device, VulkanSurfaceKHR surface, VulkanDeviceGroupPresentModeFlagsKHR pModes, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetDeviceGroupSurfacePresentModesKHR(device != null ? device.getVk() : null, surface != null ? surface.getVk() : null, pModes != null ? pModes.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetDeviceGroupSurfacePresentModesKHR");
    }


    public void getPhysicalDevicePresentRectanglesKHR(VulkanPhysicalDevice physicalDevice, VulkanSurfaceKHR surface, VulkanUInt32 pRectCount, VulkanRect2D pRects, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPhysicalDevicePresentRectanglesKHR(physicalDevice != null ? physicalDevice.getVk() : null, surface != null ? surface.getVk() : null, pRectCount != null ? pRectCount.getVk() : null, pRects != null ? pRects.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPhysicalDevicePresentRectanglesKHR");
    }


    public void acquireNextImage2KHR(VulkanDevice device, VulkanAcquireNextImageInfoKHR pAcquireInfo, VulkanUInt32 pImageIndex, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkAcquireNextImage2KHR(device != null ? device.getVk() : null, pAcquireInfo != null ? pAcquireInfo.getVk() : null, pImageIndex != null ? pImageIndex.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkAcquireNextImage2KHR");
    }


    public void getPhysicalDeviceDisplayPropertiesKHR(VulkanPhysicalDevice physicalDevice, VulkanUInt32 pPropertyCount, VulkanDisplayPropertiesKHR pProperties, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPhysicalDeviceDisplayPropertiesKHR(physicalDevice != null ? physicalDevice.getVk() : null, pPropertyCount != null ? pPropertyCount.getVk() : null, pProperties != null ? pProperties.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPhysicalDeviceDisplayPropertiesKHR");
    }


    public void getPhysicalDeviceDisplayPlanePropertiesKHR(VulkanPhysicalDevice physicalDevice, VulkanUInt32 pPropertyCount, VulkanDisplayPlanePropertiesKHR pProperties, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPhysicalDeviceDisplayPlanePropertiesKHR(physicalDevice != null ? physicalDevice.getVk() : null, pPropertyCount != null ? pPropertyCount.getVk() : null, pProperties != null ? pProperties.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPhysicalDeviceDisplayPlanePropertiesKHR");
    }


    public void getDisplayPlaneSupportedDisplaysKHR(VulkanPhysicalDevice physicalDevice, VulkanUInt32 planeIndex, VulkanUInt32 pDisplayCount, VulkanDisplayKHR pDisplays, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetDisplayPlaneSupportedDisplaysKHR(physicalDevice != null ? physicalDevice.getVk() : null, planeIndex != null ? planeIndex.getVk() : null, pDisplayCount != null ? pDisplayCount.getVk() : null, pDisplays != null ? pDisplays.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetDisplayPlaneSupportedDisplaysKHR");
    }


    public void getDisplayModePropertiesKHR(VulkanPhysicalDevice physicalDevice, VulkanDisplayKHR display, VulkanUInt32 pPropertyCount, VulkanDisplayModePropertiesKHR pProperties, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetDisplayModePropertiesKHR(physicalDevice != null ? physicalDevice.getVk() : null, display != null ? display.getVk() : null, pPropertyCount != null ? pPropertyCount.getVk() : null, pProperties != null ? pProperties.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetDisplayModePropertiesKHR");
    }


    public VulkanDisplayModeKHR createDisplayModeKHR(VulkanPhysicalDevice physicalDevice, VulkanDisplayKHR display, VulkanDisplayModeCreateInfoKHR pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanDisplayModeKHR o = new VulkanDisplayModeKHR();
        vk.vkCreateDisplayModeKHR(physicalDevice != null ? physicalDevice.getVk() : null, display != null ? display.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateDisplayModeKHR");
        return o;
    }


    public void getDisplayPlaneCapabilitiesKHR(VulkanPhysicalDevice physicalDevice, VulkanDisplayModeKHR mode, VulkanUInt32 planeIndex, VulkanDisplayPlaneCapabilitiesKHR pCapabilities, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetDisplayPlaneCapabilitiesKHR(physicalDevice != null ? physicalDevice.getVk() : null, mode != null ? mode.getVk() : null, planeIndex != null ? planeIndex.getVk() : null, pCapabilities != null ? pCapabilities.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetDisplayPlaneCapabilitiesKHR");
    }


    public VulkanSurfaceKHR createDisplayPlaneSurfaceKHR(VulkanInstance instance, VulkanDisplaySurfaceCreateInfoKHR pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanSurfaceKHR o = new VulkanSurfaceKHR();
        vk.vkCreateDisplayPlaneSurfaceKHR(instance != null ? instance.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateDisplayPlaneSurfaceKHR");
        return o;
    }


    public VulkanSwapchainKHR createSharedSwapchainsKHR(VulkanDevice device, VulkanUInt32 swapchainCount, VulkanSwapchainCreateInfoKHR pCreateInfos, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanSwapchainKHR o = new VulkanSwapchainKHR();
        vk.vkCreateSharedSwapchainsKHR(device != null ? device.getVk() : null, swapchainCount != null ? swapchainCount.getVk() : null, pCreateInfos != null ? pCreateInfos.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateSharedSwapchainsKHR");
        return o;
    }


    public void getPhysicalDeviceFeatures2KHR(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceFeatures2 pFeatures){
        vk.vkGetPhysicalDeviceFeatures2KHR(physicalDevice != null ? physicalDevice.getVk() : null, pFeatures != null ? pFeatures.getVk() : null);
    }


    public void getPhysicalDeviceProperties2KHR(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceProperties2 pProperties){
        vk.vkGetPhysicalDeviceProperties2KHR(physicalDevice != null ? physicalDevice.getVk() : null, pProperties != null ? pProperties.getVk() : null);
    }


    public void getPhysicalDeviceFormatProperties2KHR(VulkanPhysicalDevice physicalDevice, VulkanFormat format, VulkanFormatProperties2 pFormatProperties){
        vk.vkGetPhysicalDeviceFormatProperties2KHR(physicalDevice != null ? physicalDevice.getVk() : null, format != null ? format.getVk() : null, pFormatProperties != null ? pFormatProperties.getVk() : null);
    }


    public void getPhysicalDeviceImageFormatProperties2KHR(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VulkanImageFormatProperties2 pImageFormatProperties, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPhysicalDeviceImageFormatProperties2KHR(physicalDevice != null ? physicalDevice.getVk() : null, pImageFormatInfo != null ? pImageFormatInfo.getVk() : null, pImageFormatProperties != null ? pImageFormatProperties.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPhysicalDeviceImageFormatProperties2KHR");
    }


    public void getPhysicalDeviceQueueFamilyProperties2KHR(VulkanPhysicalDevice physicalDevice, VulkanUInt32 pQueueFamilyPropertyCount, VulkanQueueFamilyProperties2 pQueueFamilyProperties){
        vk.vkGetPhysicalDeviceQueueFamilyProperties2KHR(physicalDevice != null ? physicalDevice.getVk() : null, pQueueFamilyPropertyCount != null ? pQueueFamilyPropertyCount.getVk() : null, pQueueFamilyProperties != null ? pQueueFamilyProperties.getVk() : null);
    }


    public void getPhysicalDeviceMemoryProperties2KHR(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceMemoryProperties2 pMemoryProperties){
        vk.vkGetPhysicalDeviceMemoryProperties2KHR(physicalDevice != null ? physicalDevice.getVk() : null, pMemoryProperties != null ? pMemoryProperties.getVk() : null);
    }


    public void getPhysicalDeviceSparseImageFormatProperties2KHR(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, VulkanUInt32 pPropertyCount, VulkanSparseImageFormatProperties2 pProperties){
        vk.vkGetPhysicalDeviceSparseImageFormatProperties2KHR(physicalDevice != null ? physicalDevice.getVk() : null, pFormatInfo != null ? pFormatInfo.getVk() : null, pPropertyCount != null ? pPropertyCount.getVk() : null, pProperties != null ? pProperties.getVk() : null);
    }


    public void getDeviceGroupPeerMemoryFeaturesKHR(VulkanDevice device, VulkanUInt32 heapIndex, VulkanUInt32 localDeviceIndex, VulkanUInt32 remoteDeviceIndex, VulkanPeerMemoryFeatureFlags pPeerMemoryFeatures){
        vk.vkGetDeviceGroupPeerMemoryFeaturesKHR(device != null ? device.getVk() : null, heapIndex != null ? heapIndex.getVk() : null, localDeviceIndex != null ? localDeviceIndex.getVk() : null, remoteDeviceIndex != null ? remoteDeviceIndex.getVk() : null, pPeerMemoryFeatures != null ? pPeerMemoryFeatures.getVk() : null);
    }


    public void cmdSetDeviceMaskKHR(VulkanCommandBuffer commandBuffer, VulkanUInt32 deviceMask){
        vk.vkCmdSetDeviceMaskKHR(commandBuffer != null ? commandBuffer.getVk() : null, deviceMask != null ? deviceMask.getVk() : null);
    }


    public void cmdDispatchBaseKHR(VulkanCommandBuffer commandBuffer, VulkanUInt32 baseGroupX, VulkanUInt32 baseGroupY, VulkanUInt32 baseGroupZ, VulkanUInt32 groupCountX, VulkanUInt32 groupCountY, VulkanUInt32 groupCountZ){
        vk.vkCmdDispatchBaseKHR(commandBuffer != null ? commandBuffer.getVk() : null, baseGroupX != null ? baseGroupX.getVk() : null, baseGroupY != null ? baseGroupY.getVk() : null, baseGroupZ != null ? baseGroupZ.getVk() : null, groupCountX != null ? groupCountX.getVk() : null, groupCountY != null ? groupCountY.getVk() : null, groupCountZ != null ? groupCountZ.getVk() : null);
    }


    public void trimCommandPoolKHR(VulkanDevice device, VulkanCommandPool commandPool, VulkanCommandPoolTrimFlags flags){
        vk.vkTrimCommandPoolKHR(device != null ? device.getVk() : null, commandPool != null ? commandPool.getVk() : null, flags != null ? flags.getVk() : null);
    }


    public VulkanPhysicalDeviceGroupProperties.Array enumeratePhysicalDeviceGroupsKHR(VulkanInstance instance){
        VulkanResult rval = new VulkanResult();
        VulkanUInt32 count = new VulkanUInt32();

        vk.vkEnumeratePhysicalDeviceGroupsKHR(instance != null ? instance.getVk() : null, count.getVk(), null, rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEnumeratePhysicalDeviceGroupsKHR");

        VulkanPhysicalDeviceGroupProperties.Array o = new VulkanPhysicalDeviceGroupProperties.Array(count.getValue());

        vk.vkEnumeratePhysicalDeviceGroupsKHR(instance != null ? instance.getVk() : null, count.getVk(), o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkEnumeratePhysicalDeviceGroupsKHR");

        return o;
    }


    public void getPhysicalDeviceExternalBufferPropertiesKHR(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceExternalBufferInfo pExternalBufferInfo, VulkanExternalBufferProperties pExternalBufferProperties){
        vk.vkGetPhysicalDeviceExternalBufferPropertiesKHR(physicalDevice != null ? physicalDevice.getVk() : null, pExternalBufferInfo != null ? pExternalBufferInfo.getVk() : null, pExternalBufferProperties != null ? pExternalBufferProperties.getVk() : null);
    }


    public void getMemoryFdKHR(VulkanDevice device, VulkanMemoryGetFdInfoKHR pGetFdInfo, VulkanInt pFd, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetMemoryFdKHR(device != null ? device.getVk() : null, pGetFdInfo != null ? pGetFdInfo.getVk() : null, pFd != null ? pFd.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetMemoryFdKHR");
    }


    public void getMemoryFdPropertiesKHR(VulkanDevice device, VulkanExternalMemoryHandleTypeFlagBits handleType, VulkanInt fd, VulkanMemoryFdPropertiesKHR pMemoryFdProperties, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetMemoryFdPropertiesKHR(device != null ? device.getVk() : null, handleType != null ? handleType.getVk() : null, fd != null ? fd.getVk() : null, pMemoryFdProperties != null ? pMemoryFdProperties.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetMemoryFdPropertiesKHR");
    }


    public void getPhysicalDeviceExternalSemaphorePropertiesKHR(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo, VulkanExternalSemaphoreProperties pExternalSemaphoreProperties){
        vk.vkGetPhysicalDeviceExternalSemaphorePropertiesKHR(physicalDevice != null ? physicalDevice.getVk() : null, pExternalSemaphoreInfo != null ? pExternalSemaphoreInfo.getVk() : null, pExternalSemaphoreProperties != null ? pExternalSemaphoreProperties.getVk() : null);
    }


    public void importSemaphoreFdKHR(VulkanDevice device, VulkanImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkImportSemaphoreFdKHR(device != null ? device.getVk() : null, pImportSemaphoreFdInfo != null ? pImportSemaphoreFdInfo.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkImportSemaphoreFdKHR");
    }


    public void getSemaphoreFdKHR(VulkanDevice device, VulkanSemaphoreGetFdInfoKHR pGetFdInfo, VulkanInt pFd, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetSemaphoreFdKHR(device != null ? device.getVk() : null, pGetFdInfo != null ? pGetFdInfo.getVk() : null, pFd != null ? pFd.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetSemaphoreFdKHR");
    }


    public void cmdPushDescriptorSetKHR(VulkanCommandBuffer commandBuffer, VulkanPipelineBindPoint pipelineBindPoint, VulkanPipelineLayout layout, VulkanUInt32 set, VulkanUInt32 descriptorWriteCount, VulkanWriteDescriptorSet pDescriptorWrites){
        vk.vkCmdPushDescriptorSetKHR(commandBuffer != null ? commandBuffer.getVk() : null, pipelineBindPoint != null ? pipelineBindPoint.getVk() : null, layout != null ? layout.getVk() : null, set != null ? set.getVk() : null, descriptorWriteCount != null ? descriptorWriteCount.getVk() : null, pDescriptorWrites != null ? pDescriptorWrites.getVk() : null);
    }


    public void cmdPushDescriptorSetWithTemplateKHR(VulkanCommandBuffer commandBuffer, VulkanDescriptorUpdateTemplate descriptorUpdateTemplate, VulkanPipelineLayout layout, VulkanUInt32 set, VulkanObject pData){
        vk.vkCmdPushDescriptorSetWithTemplateKHR(commandBuffer != null ? commandBuffer.getVk() : null, descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVk() : null, layout != null ? layout.getVk() : null, set != null ? set.getVk() : null, pData != null ? pData.getVk() : null);
    }


    public VulkanDescriptorUpdateTemplate createDescriptorUpdateTemplateKHR(VulkanDevice device, VulkanDescriptorUpdateTemplateCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanDescriptorUpdateTemplate o = new VulkanDescriptorUpdateTemplate();
        vk.vkCreateDescriptorUpdateTemplateKHR(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateDescriptorUpdateTemplateKHR");
        return o;
    }


    public void destroyDescriptorUpdateTemplateKHR(VulkanDevice device, VulkanDescriptorUpdateTemplate descriptorUpdateTemplate, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyDescriptorUpdateTemplateKHR(device != null ? device.getVk() : null, descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void updateDescriptorSetWithTemplateKHR(VulkanDevice device, VulkanDescriptorSet descriptorSet, VulkanDescriptorUpdateTemplate descriptorUpdateTemplate, VulkanObject pData){
        vk.vkUpdateDescriptorSetWithTemplateKHR(device != null ? device.getVk() : null, descriptorSet != null ? descriptorSet.getVk() : null, descriptorUpdateTemplate != null ? descriptorUpdateTemplate.getVk() : null, pData != null ? pData.getVk() : null);
    }


    public void getSwapchainStatusKHR(VulkanDevice device, VulkanSwapchainKHR swapchain, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetSwapchainStatusKHR(device != null ? device.getVk() : null, swapchain != null ? swapchain.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetSwapchainStatusKHR");
    }


    public void getPhysicalDeviceExternalFencePropertiesKHR(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceExternalFenceInfo pExternalFenceInfo, VulkanExternalFenceProperties pExternalFenceProperties){
        vk.vkGetPhysicalDeviceExternalFencePropertiesKHR(physicalDevice != null ? physicalDevice.getVk() : null, pExternalFenceInfo != null ? pExternalFenceInfo.getVk() : null, pExternalFenceProperties != null ? pExternalFenceProperties.getVk() : null);
    }


    public void importFenceFdKHR(VulkanDevice device, VulkanImportFenceFdInfoKHR pImportFenceFdInfo, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkImportFenceFdKHR(device != null ? device.getVk() : null, pImportFenceFdInfo != null ? pImportFenceFdInfo.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkImportFenceFdKHR");
    }


    public void getFenceFdKHR(VulkanDevice device, VulkanFenceGetFdInfoKHR pGetFdInfo, VulkanInt pFd, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetFenceFdKHR(device != null ? device.getVk() : null, pGetFdInfo != null ? pGetFdInfo.getVk() : null, pFd != null ? pFd.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetFenceFdKHR");
    }


    public void getPhysicalDeviceSurfaceCapabilities2KHR(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VulkanSurfaceCapabilities2KHR pSurfaceCapabilities, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPhysicalDeviceSurfaceCapabilities2KHR(physicalDevice != null ? physicalDevice.getVk() : null, pSurfaceInfo != null ? pSurfaceInfo.getVk() : null, pSurfaceCapabilities != null ? pSurfaceCapabilities.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPhysicalDeviceSurfaceCapabilities2KHR");
    }


    public void getPhysicalDeviceSurfaceFormats2KHR(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VulkanUInt32 pSurfaceFormatCount, VulkanSurfaceFormat2KHR pSurfaceFormats, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPhysicalDeviceSurfaceFormats2KHR(physicalDevice != null ? physicalDevice.getVk() : null, pSurfaceInfo != null ? pSurfaceInfo.getVk() : null, pSurfaceFormatCount != null ? pSurfaceFormatCount.getVk() : null, pSurfaceFormats != null ? pSurfaceFormats.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPhysicalDeviceSurfaceFormats2KHR");
    }


    public void getImageMemoryRequirements2KHR(VulkanDevice device, VulkanImageMemoryRequirementsInfo2 pInfo, VulkanMemoryRequirements2 pMemoryRequirements){
        vk.vkGetImageMemoryRequirements2KHR(device != null ? device.getVk() : null, pInfo != null ? pInfo.getVk() : null, pMemoryRequirements != null ? pMemoryRequirements.getVk() : null);
    }


    public void getBufferMemoryRequirements2KHR(VulkanDevice device, VulkanBufferMemoryRequirementsInfo2 pInfo, VulkanMemoryRequirements2 pMemoryRequirements){
        vk.vkGetBufferMemoryRequirements2KHR(device != null ? device.getVk() : null, pInfo != null ? pInfo.getVk() : null, pMemoryRequirements != null ? pMemoryRequirements.getVk() : null);
    }


    public void getImageSparseMemoryRequirements2KHR(VulkanDevice device, VulkanImageSparseMemoryRequirementsInfo2 pInfo, VulkanUInt32 pSparseMemoryRequirementCount, VulkanSparseImageMemoryRequirements2 pSparseMemoryRequirements){
        vk.vkGetImageSparseMemoryRequirements2KHR(device != null ? device.getVk() : null, pInfo != null ? pInfo.getVk() : null, pSparseMemoryRequirementCount != null ? pSparseMemoryRequirementCount.getVk() : null, pSparseMemoryRequirements != null ? pSparseMemoryRequirements.getVk() : null);
    }


    public VulkanSamplerYcbcrConversion createSamplerYcbcrConversionKHR(VulkanDevice device, VulkanSamplerYcbcrConversionCreateInfo pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanSamplerYcbcrConversion o = new VulkanSamplerYcbcrConversion();
        vk.vkCreateSamplerYcbcrConversionKHR(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateSamplerYcbcrConversionKHR");
        return o;
    }


    public void destroySamplerYcbcrConversionKHR(VulkanDevice device, VulkanSamplerYcbcrConversion ycbcrConversion, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroySamplerYcbcrConversionKHR(device != null ? device.getVk() : null, ycbcrConversion != null ? ycbcrConversion.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void bindBufferMemory2KHR(VulkanDevice device, VulkanUInt32 bindInfoCount, VulkanBindBufferMemoryInfo pBindInfos, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkBindBufferMemory2KHR(device != null ? device.getVk() : null, bindInfoCount != null ? bindInfoCount.getVk() : null, pBindInfos != null ? pBindInfos.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkBindBufferMemory2KHR");
    }


    public void bindImageMemory2KHR(VulkanDevice device, VulkanUInt32 bindInfoCount, VulkanBindImageMemoryInfo pBindInfos, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkBindImageMemory2KHR(device != null ? device.getVk() : null, bindInfoCount != null ? bindInfoCount.getVk() : null, pBindInfos != null ? pBindInfos.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkBindImageMemory2KHR");
    }


    public void getDescriptorSetLayoutSupportKHR(VulkanDevice device, VulkanDescriptorSetLayoutCreateInfo pCreateInfo, VulkanDescriptorSetLayoutSupport pSupport){
        vk.vkGetDescriptorSetLayoutSupportKHR(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pSupport != null ? pSupport.getVk() : null);
    }


    public VulkanDebugReportCallbackEXT createDebugReportCallbackEXT(VulkanInstance instance, VulkanDebugReportCallbackCreateInfoEXT pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanDebugReportCallbackEXT o = new VulkanDebugReportCallbackEXT();
        vk.vkCreateDebugReportCallbackEXT(instance != null ? instance.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateDebugReportCallbackEXT");
        return o;
    }


    public void destroyDebugReportCallbackEXT(VulkanInstance instance, VulkanDebugReportCallbackEXT callback, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyDebugReportCallbackEXT(instance != null ? instance.getVk() : null, callback != null ? callback.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void debugReportMessageEXT(VulkanInstance instance, VulkanDebugReportFlagsEXT flags, VulkanDebugReportObjectTypeEXT objectType, VulkanUInt64 object, VulkanSize location, VulkanInt32 messageCode, VulkanChar pLayerPrefix, VulkanChar pMessage){
        vk.vkDebugReportMessageEXT(instance != null ? instance.getVk() : null, flags != null ? flags.getVk() : null, objectType != null ? objectType.getVk() : null, object != null ? object.getVk() : null, location != null ? location.getVk() : null, messageCode != null ? messageCode.getVk() : null, pLayerPrefix != null ? pLayerPrefix.getVk() : null, pMessage != null ? pMessage.getVk() : null);
    }


    public void debugMarkerSetObjectTagEXT(VulkanDevice device, VulkanDebugMarkerObjectTagInfoEXT pTagInfo, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkDebugMarkerSetObjectTagEXT(device != null ? device.getVk() : null, pTagInfo != null ? pTagInfo.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkDebugMarkerSetObjectTagEXT");
    }


    public void debugMarkerSetObjectNameEXT(VulkanDevice device, VulkanDebugMarkerObjectNameInfoEXT pNameInfo, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkDebugMarkerSetObjectNameEXT(device != null ? device.getVk() : null, pNameInfo != null ? pNameInfo.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkDebugMarkerSetObjectNameEXT");
    }


    public void cmdDebugMarkerBeginEXT(VulkanCommandBuffer commandBuffer, VulkanDebugMarkerMarkerInfoEXT pMarkerInfo){
        vk.vkCmdDebugMarkerBeginEXT(commandBuffer != null ? commandBuffer.getVk() : null, pMarkerInfo != null ? pMarkerInfo.getVk() : null);
    }


    public void cmdDebugMarkerEndEXT(VulkanCommandBuffer commandBuffer){
        vk.vkCmdDebugMarkerEndEXT(commandBuffer != null ? commandBuffer.getVk() : null);
    }


    public void cmdDebugMarkerInsertEXT(VulkanCommandBuffer commandBuffer, VulkanDebugMarkerMarkerInfoEXT pMarkerInfo){
        vk.vkCmdDebugMarkerInsertEXT(commandBuffer != null ? commandBuffer.getVk() : null, pMarkerInfo != null ? pMarkerInfo.getVk() : null);
    }


    public void cmdDrawIndirectCountAMD(VulkanCommandBuffer commandBuffer, VulkanBuffer buffer, VulkanDeviceSize offset, VulkanBuffer countBuffer, VulkanDeviceSize countBufferOffset, VulkanUInt32 maxDrawCount, VulkanUInt32 stride){
        vk.vkCmdDrawIndirectCountAMD(commandBuffer != null ? commandBuffer.getVk() : null, buffer != null ? buffer.getVk() : null, offset != null ? offset.getVk() : null, countBuffer != null ? countBuffer.getVk() : null, countBufferOffset != null ? countBufferOffset.getVk() : null, maxDrawCount != null ? maxDrawCount.getVk() : null, stride != null ? stride.getVk() : null);
    }


    public void cmdDrawIndexedIndirectCountAMD(VulkanCommandBuffer commandBuffer, VulkanBuffer buffer, VulkanDeviceSize offset, VulkanBuffer countBuffer, VulkanDeviceSize countBufferOffset, VulkanUInt32 maxDrawCount, VulkanUInt32 stride){
        vk.vkCmdDrawIndexedIndirectCountAMD(commandBuffer != null ? commandBuffer.getVk() : null, buffer != null ? buffer.getVk() : null, offset != null ? offset.getVk() : null, countBuffer != null ? countBuffer.getVk() : null, countBufferOffset != null ? countBufferOffset.getVk() : null, maxDrawCount != null ? maxDrawCount.getVk() : null, stride != null ? stride.getVk() : null);
    }


    public void getShaderInfoAMD(VulkanDevice device, VulkanPipeline pipeline, VulkanShaderStageFlagBits shaderStage, VulkanShaderInfoTypeAMD infoType, VulkanSize pInfoSize, VulkanObject pInfo, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetShaderInfoAMD(device != null ? device.getVk() : null, pipeline != null ? pipeline.getVk() : null, shaderStage != null ? shaderStage.getVk() : null, infoType != null ? infoType.getVk() : null, pInfoSize != null ? pInfoSize.getVk() : null, pInfo != null ? pInfo.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetShaderInfoAMD");
    }


    public void getPhysicalDeviceExternalImageFormatPropertiesNV(VulkanPhysicalDevice physicalDevice, VulkanFormat format, VulkanImageType type, VulkanImageTiling tiling, VulkanImageUsageFlags usage, VulkanImageCreateFlags flags, VulkanExternalMemoryHandleTypeFlagsNV externalHandleType, VulkanExternalImageFormatPropertiesNV pExternalImageFormatProperties, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPhysicalDeviceExternalImageFormatPropertiesNV(physicalDevice != null ? physicalDevice.getVk() : null, format != null ? format.getVk() : null, type != null ? type.getVk() : null, tiling != null ? tiling.getVk() : null, usage != null ? usage.getVk() : null, flags != null ? flags.getVk() : null, externalHandleType != null ? externalHandleType.getVk() : null, pExternalImageFormatProperties != null ? pExternalImageFormatProperties.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPhysicalDeviceExternalImageFormatPropertiesNV");
    }


    public void cmdProcessCommandsNVX(VulkanCommandBuffer commandBuffer, VulkanCmdProcessCommandsInfoNVX pProcessCommandsInfo){
        vk.vkCmdProcessCommandsNVX(commandBuffer != null ? commandBuffer.getVk() : null, pProcessCommandsInfo != null ? pProcessCommandsInfo.getVk() : null);
    }


    public void cmdReserveSpaceForCommandsNVX(VulkanCommandBuffer commandBuffer, VulkanCmdReserveSpaceForCommandsInfoNVX pReserveSpaceInfo){
        vk.vkCmdReserveSpaceForCommandsNVX(commandBuffer != null ? commandBuffer.getVk() : null, pReserveSpaceInfo != null ? pReserveSpaceInfo.getVk() : null);
    }


    public VulkanIndirectCommandsLayoutNVX createIndirectCommandsLayoutNVX(VulkanDevice device, VulkanIndirectCommandsLayoutCreateInfoNVX pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanIndirectCommandsLayoutNVX o = new VulkanIndirectCommandsLayoutNVX();
        vk.vkCreateIndirectCommandsLayoutNVX(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateIndirectCommandsLayoutNVX");
        return o;
    }


    public void destroyIndirectCommandsLayoutNVX(VulkanDevice device, VulkanIndirectCommandsLayoutNVX indirectCommandsLayout, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyIndirectCommandsLayoutNVX(device != null ? device.getVk() : null, indirectCommandsLayout != null ? indirectCommandsLayout.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public VulkanObjectTableNVX createObjectTableNVX(VulkanDevice device, VulkanObjectTableCreateInfoNVX pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanObjectTableNVX o = new VulkanObjectTableNVX();
        vk.vkCreateObjectTableNVX(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateObjectTableNVX");
        return o;
    }


    public void destroyObjectTableNVX(VulkanDevice device, VulkanObjectTableNVX objectTable, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyObjectTableNVX(device != null ? device.getVk() : null, objectTable != null ? objectTable.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void registerObjectsNVX(VulkanDevice device, VulkanObjectTableNVX objectTable, VulkanUInt32 objectCount, VulkanObjectTableEntryNVX.Pointer ppObjectTableEntries, VulkanUInt32 pObjectIndices, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkRegisterObjectsNVX(device != null ? device.getVk() : null, objectTable != null ? objectTable.getVk() : null, objectCount != null ? objectCount.getVk() : null, ppObjectTableEntries != null ? ppObjectTableEntries.getVk() : null, pObjectIndices != null ? pObjectIndices.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkRegisterObjectsNVX");
    }


    public void unregisterObjectsNVX(VulkanDevice device, VulkanObjectTableNVX objectTable, VulkanUInt32 objectCount, VulkanObjectEntryTypeNVX pObjectEntryTypes, VulkanUInt32 pObjectIndices, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkUnregisterObjectsNVX(device != null ? device.getVk() : null, objectTable != null ? objectTable.getVk() : null, objectCount != null ? objectCount.getVk() : null, pObjectEntryTypes != null ? pObjectEntryTypes.getVk() : null, pObjectIndices != null ? pObjectIndices.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkUnregisterObjectsNVX");
    }


    public void getPhysicalDeviceGeneratedCommandsPropertiesNVX(VulkanPhysicalDevice physicalDevice, VulkanDeviceGeneratedCommandsFeaturesNVX pFeatures, VulkanDeviceGeneratedCommandsLimitsNVX pLimits){
        vk.vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(physicalDevice != null ? physicalDevice.getVk() : null, pFeatures != null ? pFeatures.getVk() : null, pLimits != null ? pLimits.getVk() : null);
    }


    public void cmdSetViewportWScalingNV(VulkanCommandBuffer commandBuffer, VulkanUInt32 firstViewport, VulkanUInt32 viewportCount, VulkanViewportWScalingNV pViewportWScalings){
        vk.vkCmdSetViewportWScalingNV(commandBuffer != null ? commandBuffer.getVk() : null, firstViewport != null ? firstViewport.getVk() : null, viewportCount != null ? viewportCount.getVk() : null, pViewportWScalings != null ? pViewportWScalings.getVk() : null);
    }


    public void releaseDisplayEXT(VulkanPhysicalDevice physicalDevice, VulkanDisplayKHR display, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkReleaseDisplayEXT(physicalDevice != null ? physicalDevice.getVk() : null, display != null ? display.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkReleaseDisplayEXT");
    }


    public void getPhysicalDeviceSurfaceCapabilities2EXT(VulkanPhysicalDevice physicalDevice, VulkanSurfaceKHR surface, VulkanSurfaceCapabilities2EXT pSurfaceCapabilities, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPhysicalDeviceSurfaceCapabilities2EXT(physicalDevice != null ? physicalDevice.getVk() : null, surface != null ? surface.getVk() : null, pSurfaceCapabilities != null ? pSurfaceCapabilities.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPhysicalDeviceSurfaceCapabilities2EXT");
    }


    public void displayPowerControlEXT(VulkanDevice device, VulkanDisplayKHR display, VulkanDisplayPowerInfoEXT pDisplayPowerInfo, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkDisplayPowerControlEXT(device != null ? device.getVk() : null, display != null ? display.getVk() : null, pDisplayPowerInfo != null ? pDisplayPowerInfo.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkDisplayPowerControlEXT");
    }


    public void registerDeviceEventEXT(VulkanDevice device, VulkanDeviceEventInfoEXT pDeviceEventInfo, VulkanAllocationCallbacks pAllocator, VulkanFence pFence, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkRegisterDeviceEventEXT(device != null ? device.getVk() : null, pDeviceEventInfo != null ? pDeviceEventInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, pFence != null ? pFence.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkRegisterDeviceEventEXT");
    }


    public void registerDisplayEventEXT(VulkanDevice device, VulkanDisplayKHR display, VulkanDisplayEventInfoEXT pDisplayEventInfo, VulkanAllocationCallbacks pAllocator, VulkanFence pFence, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkRegisterDisplayEventEXT(device != null ? device.getVk() : null, display != null ? display.getVk() : null, pDisplayEventInfo != null ? pDisplayEventInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, pFence != null ? pFence.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkRegisterDisplayEventEXT");
    }


    public void getSwapchainCounterEXT(VulkanDevice device, VulkanSwapchainKHR swapchain, VulkanSurfaceCounterFlagBitsEXT counter, VulkanUInt64 pCounterValue, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetSwapchainCounterEXT(device != null ? device.getVk() : null, swapchain != null ? swapchain.getVk() : null, counter != null ? counter.getVk() : null, pCounterValue != null ? pCounterValue.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetSwapchainCounterEXT");
    }


    public void getRefreshCycleDurationGOOGLE(VulkanDevice device, VulkanSwapchainKHR swapchain, VulkanRefreshCycleDurationGOOGLE pDisplayTimingProperties, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetRefreshCycleDurationGOOGLE(device != null ? device.getVk() : null, swapchain != null ? swapchain.getVk() : null, pDisplayTimingProperties != null ? pDisplayTimingProperties.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetRefreshCycleDurationGOOGLE");
    }


    public void getPastPresentationTimingGOOGLE(VulkanDevice device, VulkanSwapchainKHR swapchain, VulkanUInt32 pPresentationTimingCount, VulkanPastPresentationTimingGOOGLE pPresentationTimings, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetPastPresentationTimingGOOGLE(device != null ? device.getVk() : null, swapchain != null ? swapchain.getVk() : null, pPresentationTimingCount != null ? pPresentationTimingCount.getVk() : null, pPresentationTimings != null ? pPresentationTimings.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetPastPresentationTimingGOOGLE");
    }


    public void cmdSetDiscardRectangleEXT(VulkanCommandBuffer commandBuffer, VulkanUInt32 firstDiscardRectangle, VulkanUInt32 discardRectangleCount, VulkanRect2D pDiscardRectangles){
        vk.vkCmdSetDiscardRectangleEXT(commandBuffer != null ? commandBuffer.getVk() : null, firstDiscardRectangle != null ? firstDiscardRectangle.getVk() : null, discardRectangleCount != null ? discardRectangleCount.getVk() : null, pDiscardRectangles != null ? pDiscardRectangles.getVk() : null);
    }


    public void setHdrMetadataEXT(VulkanDevice device, VulkanUInt32 swapchainCount, VulkanSwapchainKHR pSwapchains, VulkanHdrMetadataEXT pMetadata){
        vk.vkSetHdrMetadataEXT(device != null ? device.getVk() : null, swapchainCount != null ? swapchainCount.getVk() : null, pSwapchains != null ? pSwapchains.getVk() : null, pMetadata != null ? pMetadata.getVk() : null);
    }


    public void setDebugUtilsObjectNameEXT(VulkanDevice device, VulkanDebugUtilsObjectNameInfoEXT pNameInfo, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkSetDebugUtilsObjectNameEXT(device != null ? device.getVk() : null, pNameInfo != null ? pNameInfo.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkSetDebugUtilsObjectNameEXT");
    }


    public void setDebugUtilsObjectTagEXT(VulkanDevice device, VulkanDebugUtilsObjectTagInfoEXT pTagInfo, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkSetDebugUtilsObjectTagEXT(device != null ? device.getVk() : null, pTagInfo != null ? pTagInfo.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkSetDebugUtilsObjectTagEXT");
    }


    public void queueBeginDebugUtilsLabelEXT(VulkanQueue queue, VulkanDebugUtilsLabelEXT pLabelInfo){
        vk.vkQueueBeginDebugUtilsLabelEXT(queue != null ? queue.getVk() : null, pLabelInfo != null ? pLabelInfo.getVk() : null);
    }


    public void queueEndDebugUtilsLabelEXT(VulkanQueue queue){
        vk.vkQueueEndDebugUtilsLabelEXT(queue != null ? queue.getVk() : null);
    }


    public void queueInsertDebugUtilsLabelEXT(VulkanQueue queue, VulkanDebugUtilsLabelEXT pLabelInfo){
        vk.vkQueueInsertDebugUtilsLabelEXT(queue != null ? queue.getVk() : null, pLabelInfo != null ? pLabelInfo.getVk() : null);
    }


    public void cmdBeginDebugUtilsLabelEXT(VulkanCommandBuffer commandBuffer, VulkanDebugUtilsLabelEXT pLabelInfo){
        vk.vkCmdBeginDebugUtilsLabelEXT(commandBuffer != null ? commandBuffer.getVk() : null, pLabelInfo != null ? pLabelInfo.getVk() : null);
    }


    public void cmdEndDebugUtilsLabelEXT(VulkanCommandBuffer commandBuffer){
        vk.vkCmdEndDebugUtilsLabelEXT(commandBuffer != null ? commandBuffer.getVk() : null);
    }


    public void cmdInsertDebugUtilsLabelEXT(VulkanCommandBuffer commandBuffer, VulkanDebugUtilsLabelEXT pLabelInfo){
        vk.vkCmdInsertDebugUtilsLabelEXT(commandBuffer != null ? commandBuffer.getVk() : null, pLabelInfo != null ? pLabelInfo.getVk() : null);
    }


    public VulkanDebugUtilsMessengerEXT createDebugUtilsMessengerEXT(VulkanInstance instance, VulkanDebugUtilsMessengerCreateInfoEXT pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanDebugUtilsMessengerEXT o = new VulkanDebugUtilsMessengerEXT();
        vk.vkCreateDebugUtilsMessengerEXT(instance != null ? instance.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateDebugUtilsMessengerEXT");
        return o;
    }


    public void destroyDebugUtilsMessengerEXT(VulkanInstance instance, VulkanDebugUtilsMessengerEXT messenger, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyDebugUtilsMessengerEXT(instance != null ? instance.getVk() : null, messenger != null ? messenger.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void submitDebugUtilsMessageEXT(VulkanInstance instance, VulkanDebugUtilsMessageSeverityFlagBitsEXT messageSeverity, VulkanDebugUtilsMessageTypeFlagsEXT messageTypes, VulkanDebugUtilsMessengerCallbackDataEXT pCallbackData){
        vk.vkSubmitDebugUtilsMessageEXT(instance != null ? instance.getVk() : null, messageSeverity != null ? messageSeverity.getVk() : null, messageTypes != null ? messageTypes.getVk() : null, pCallbackData != null ? pCallbackData.getVk() : null);
    }


    public void cmdSetSampleLocationsEXT(VulkanCommandBuffer commandBuffer, VulkanSampleLocationsInfoEXT pSampleLocationsInfo){
        vk.vkCmdSetSampleLocationsEXT(commandBuffer != null ? commandBuffer.getVk() : null, pSampleLocationsInfo != null ? pSampleLocationsInfo.getVk() : null);
    }


    public void getPhysicalDeviceMultisamplePropertiesEXT(VulkanPhysicalDevice physicalDevice, VulkanSampleCountFlagBits samples, VulkanMultisamplePropertiesEXT pMultisampleProperties){
        vk.vkGetPhysicalDeviceMultisamplePropertiesEXT(physicalDevice != null ? physicalDevice.getVk() : null, samples != null ? samples.getVk() : null, pMultisampleProperties != null ? pMultisampleProperties.getVk() : null);
    }


    public VulkanValidationCacheEXT createValidationCacheEXT(VulkanDevice device, VulkanValidationCacheCreateInfoEXT pCreateInfo, VulkanAllocationCallbacks pAllocator){
        VulkanResult rval = new VulkanResult();
        VulkanValidationCacheEXT o = new VulkanValidationCacheEXT();
        vk.vkCreateValidationCacheEXT(device != null ? device.getVk() : null, pCreateInfo != null ? pCreateInfo.getVk() : null, pAllocator != null ? pAllocator.getVk() : null, o.getVk(), rval.getVk());
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkCreateValidationCacheEXT");
        return o;
    }


    public void destroyValidationCacheEXT(VulkanDevice device, VulkanValidationCacheEXT validationCache, VulkanAllocationCallbacks pAllocator){
        vk.vkDestroyValidationCacheEXT(device != null ? device.getVk() : null, validationCache != null ? validationCache.getVk() : null, pAllocator != null ? pAllocator.getVk() : null);
    }


    public void mergeValidationCachesEXT(VulkanDevice device, VulkanValidationCacheEXT dstCache, VulkanUInt32 srcCacheCount, VulkanValidationCacheEXT pSrcCaches, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkMergeValidationCachesEXT(device != null ? device.getVk() : null, dstCache != null ? dstCache.getVk() : null, srcCacheCount != null ? srcCacheCount.getVk() : null, pSrcCaches != null ? pSrcCaches.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkMergeValidationCachesEXT");
    }


    public void getValidationCacheDataEXT(VulkanDevice device, VulkanValidationCacheEXT validationCache, VulkanSize pDataSize, VulkanObject pData, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetValidationCacheDataEXT(device != null ? device.getVk() : null, validationCache != null ? validationCache.getVk() : null, pDataSize != null ? pDataSize.getVk() : null, pData != null ? pData.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetValidationCacheDataEXT");
    }


    public void getMemoryHostPointerPropertiesEXT(VulkanDevice device, VulkanExternalMemoryHandleTypeFlagBits handleType, VulkanObject pHostPointer, VulkanMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties, VulkanResult rval){
        if(rval == null) rval = new VulkanResult();
        vk.vkGetMemoryHostPointerPropertiesEXT(device != null ? device.getVk() : null, handleType != null ? handleType.getVk() : null, pHostPointer != null ? pHostPointer.getVk() : null, pMemoryHostPointerProperties != null ? pMemoryHostPointerProperties.getVk() : null, rval != null ? rval.getVk() : null);
        if(rval.getValue() != VulkanResult.SUCCESS) throw new VulkanException(rval, "vkGetMemoryHostPointerPropertiesEXT");
    }


    public void cmdWriteBufferMarkerAMD(VulkanCommandBuffer commandBuffer, VulkanPipelineStageFlagBits pipelineStage, VulkanBuffer dstBuffer, VulkanDeviceSize dstOffset, VulkanUInt32 marker){
        vk.vkCmdWriteBufferMarkerAMD(commandBuffer != null ? commandBuffer.getVk() : null, pipelineStage != null ? pipelineStage.getVk() : null, dstBuffer != null ? dstBuffer.getVk() : null, dstOffset != null ? dstOffset.getVk() : null, marker != null ? marker.getVk() : null);
    }

}
