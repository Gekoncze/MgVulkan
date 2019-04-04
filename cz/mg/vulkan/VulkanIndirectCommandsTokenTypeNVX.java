package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndirectCommandsTokenTypeNVX.html">khronos documentation</a>
 **/
public class VulkanIndirectCommandsTokenTypeNVX extends VulkanEnum {
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX;
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX;
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX;
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX;
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX;
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX;
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX;
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX;

    public VulkanIndirectCommandsTokenTypeNVX(){
        super(new VkIndirectCommandsTokenTypeNVX());
    }

    public VulkanIndirectCommandsTokenTypeNVX(VkIndirectCommandsTokenTypeNVX vk){
        super(vk);
    }

    @Override
    public VkIndirectCommandsTokenTypeNVX getVk(){
        return (VkIndirectCommandsTokenTypeNVX) super.getVk();
    }

    public VulkanIndirectCommandsTokenTypeNVX(int value){
        super(new VkIndirectCommandsTokenTypeNVX(value));
    }

    @Override
    public String toString() {
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX";
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX";
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX";
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX";
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX";
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX";
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX";
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX";
        return "UNKNOWN";
    }

    public static class Array extends VulkanIndirectCommandsTokenTypeNVX implements cz.mg.collections.array.ReadonlyArray<VulkanIndirectCommandsTokenTypeNVX> {
        public Array(VkIndirectCommandsTokenTypeNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkIndirectCommandsTokenTypeNVX.Array(count));
        }

        public Array(int count, VulkanIndirectCommandsTokenTypeNVX o){
            this(new VkIndirectCommandsTokenTypeNVX.Array(count, o.getVk()));
        }

        @Override
        public VkIndirectCommandsTokenTypeNVX.Array getVk(){
            return (VkIndirectCommandsTokenTypeNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanIndirectCommandsTokenTypeNVX get(int i){
            return new VulkanIndirectCommandsTokenTypeNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkIndirectCommandsTokenTypeNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkIndirectCommandsTokenTypeNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkIndirectCommandsTokenTypeNVX.Pointer(value));
        }

        @Override
        public VkIndirectCommandsTokenTypeNVX.Pointer getVk(){
            return (VkIndirectCommandsTokenTypeNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanIndirectCommandsTokenTypeNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanIndirectCommandsTokenTypeNVX.Pointer> {
            public Array(int count) {
                super(new VkIndirectCommandsTokenTypeNVX.Pointer.Array(count));
            }

            public Array(VulkanIndirectCommandsTokenTypeNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkIndirectCommandsTokenTypeNVX.Pointer.Array getVk(){
                return (VkIndirectCommandsTokenTypeNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanIndirectCommandsTokenTypeNVX.Pointer get(int i){
                return new VulkanIndirectCommandsTokenTypeNVX.Pointer(getVk().get(i));
            }
        }
    }
}
