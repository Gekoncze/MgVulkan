package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndirectCommandsLayoutUsageFlagBitsNVX.html">khronos documentation</a>
 **/
public class VulkanIndirectCommandsLayoutUsageFlagBitsNVX extends VulkanFlagBits {
    public static final int INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_NVX = VkIndirectCommandsLayoutUsageFlagBitsNVX.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX;
    public static final int INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_NVX = VkIndirectCommandsLayoutUsageFlagBitsNVX.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_BIT_NVX;
    public static final int INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_NVX = VkIndirectCommandsLayoutUsageFlagBitsNVX.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_BIT_NVX;
    public static final int INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_NVX = VkIndirectCommandsLayoutUsageFlagBitsNVX.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX;

    public VulkanIndirectCommandsLayoutUsageFlagBitsNVX(){
        super(new VkIndirectCommandsLayoutUsageFlagBitsNVX());
    }

    public VulkanIndirectCommandsLayoutUsageFlagBitsNVX(VkIndirectCommandsLayoutUsageFlagBitsNVX vk){
        super(vk);
    }

    @Override
    public VkIndirectCommandsLayoutUsageFlagBitsNVX getVk(){
        return (VkIndirectCommandsLayoutUsageFlagBitsNVX) super.getVk();
    }

    public VulkanIndirectCommandsLayoutUsageFlagBitsNVX(int value){
        super(new VkIndirectCommandsLayoutUsageFlagBitsNVX(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_NVX) s += "INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_NVX";
        if(getValue() == INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_NVX) s += "INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_NVX";
        if(getValue() == INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_NVX) s += "INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_NVX";
        if(getValue() == INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_NVX) s += "INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_NVX";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanIndirectCommandsLayoutUsageFlagBitsNVX implements cz.mg.collections.array.ReadonlyArray<VulkanIndirectCommandsLayoutUsageFlagBitsNVX> {
        public Array(VkIndirectCommandsLayoutUsageFlagBitsNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkIndirectCommandsLayoutUsageFlagBitsNVX.Array(count));
        }

        public Array(int count, VulkanIndirectCommandsLayoutUsageFlagBitsNVX o){
            this(new VkIndirectCommandsLayoutUsageFlagBitsNVX.Array(count, o.getVk()));
        }

        @Override
        public VkIndirectCommandsLayoutUsageFlagBitsNVX.Array getVk(){
            return (VkIndirectCommandsLayoutUsageFlagBitsNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanIndirectCommandsLayoutUsageFlagBitsNVX get(int i){
            return new VulkanIndirectCommandsLayoutUsageFlagBitsNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkIndirectCommandsLayoutUsageFlagBitsNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkIndirectCommandsLayoutUsageFlagBitsNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkIndirectCommandsLayoutUsageFlagBitsNVX.Pointer(value));
        }

        @Override
        public VkIndirectCommandsLayoutUsageFlagBitsNVX.Pointer getVk(){
            return (VkIndirectCommandsLayoutUsageFlagBitsNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanIndirectCommandsLayoutUsageFlagBitsNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanIndirectCommandsLayoutUsageFlagBitsNVX.Pointer> {
            public Array(int count) {
                super(new VkIndirectCommandsLayoutUsageFlagBitsNVX.Pointer.Array(count));
            }

            public Array(VulkanIndirectCommandsLayoutUsageFlagBitsNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkIndirectCommandsLayoutUsageFlagBitsNVX.Pointer.Array getVk(){
                return (VkIndirectCommandsLayoutUsageFlagBitsNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanIndirectCommandsLayoutUsageFlagBitsNVX.Pointer get(int i){
                return new VulkanIndirectCommandsLayoutUsageFlagBitsNVX.Pointer(getVk().get(i));
            }
        }
    }
}
