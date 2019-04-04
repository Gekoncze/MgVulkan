package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndirectCommandsLayoutUsageFlagsNVX.html">khronos documentation</a>
 **/
public class VulkanIndirectCommandsLayoutUsageFlagsNVX extends VulkanFlags {
    public VulkanIndirectCommandsLayoutUsageFlagsNVX(){
        super(new VkIndirectCommandsLayoutUsageFlagsNVX());
    }

    public VulkanIndirectCommandsLayoutUsageFlagsNVX(VkIndirectCommandsLayoutUsageFlagsNVX vk){
        super(vk);
    }

    @Override
    public VkIndirectCommandsLayoutUsageFlagsNVX getVk(){
        return (VkIndirectCommandsLayoutUsageFlagsNVX) super.getVk();
    }

    public VulkanIndirectCommandsLayoutUsageFlagsNVX(int value){
        super(new VkIndirectCommandsLayoutUsageFlagsNVX(value));
    }

    public static class Array extends VulkanIndirectCommandsLayoutUsageFlagsNVX implements cz.mg.collections.array.ReadonlyArray<VulkanIndirectCommandsLayoutUsageFlagsNVX> {
        public Array(VkIndirectCommandsLayoutUsageFlagsNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkIndirectCommandsLayoutUsageFlagsNVX.Array(count));
        }

        public Array(int count, VulkanIndirectCommandsLayoutUsageFlagsNVX o){
            this(new VkIndirectCommandsLayoutUsageFlagsNVX.Array(count, o.getVk()));
        }

        @Override
        public VkIndirectCommandsLayoutUsageFlagsNVX.Array getVk(){
            return (VkIndirectCommandsLayoutUsageFlagsNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanIndirectCommandsLayoutUsageFlagsNVX get(int i){
            return new VulkanIndirectCommandsLayoutUsageFlagsNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkIndirectCommandsLayoutUsageFlagsNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkIndirectCommandsLayoutUsageFlagsNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkIndirectCommandsLayoutUsageFlagsNVX.Pointer(value));
        }

        @Override
        public VkIndirectCommandsLayoutUsageFlagsNVX.Pointer getVk(){
            return (VkIndirectCommandsLayoutUsageFlagsNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanIndirectCommandsLayoutUsageFlagsNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanIndirectCommandsLayoutUsageFlagsNVX.Pointer> {
            public Array(int count) {
                super(new VkIndirectCommandsLayoutUsageFlagsNVX.Pointer.Array(count));
            }

            public Array(VulkanIndirectCommandsLayoutUsageFlagsNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkIndirectCommandsLayoutUsageFlagsNVX.Pointer.Array getVk(){
                return (VkIndirectCommandsLayoutUsageFlagsNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanIndirectCommandsLayoutUsageFlagsNVX.Pointer get(int i){
                return new VulkanIndirectCommandsLayoutUsageFlagsNVX.Pointer(getVk().get(i));
            }
        }
    }
}
