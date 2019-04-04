package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndirectCommandsLayoutNVX.html">khronos documentation</a>
 **/
public class VulkanIndirectCommandsLayoutNVX extends VulkanHandle {
    public VulkanIndirectCommandsLayoutNVX(){
        super(new VkIndirectCommandsLayoutNVX());
    }

    public VulkanIndirectCommandsLayoutNVX(VkIndirectCommandsLayoutNVX vk){
        super(vk);
    }

    @Override
    public VkIndirectCommandsLayoutNVX getVk(){
        return (VkIndirectCommandsLayoutNVX) super.getVk();
    }

    public VulkanIndirectCommandsLayoutNVX(int value){
        super(new VkIndirectCommandsLayoutNVX(value));
    }

    public static class Array extends VulkanIndirectCommandsLayoutNVX implements cz.mg.collections.array.ReadonlyArray<VulkanIndirectCommandsLayoutNVX> {
        public Array(VkIndirectCommandsLayoutNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkIndirectCommandsLayoutNVX.Array(count));
        }

        public Array(int count, VulkanIndirectCommandsLayoutNVX o){
            this(new VkIndirectCommandsLayoutNVX.Array(count, o.getVk()));
        }

        @Override
        public VkIndirectCommandsLayoutNVX.Array getVk(){
            return (VkIndirectCommandsLayoutNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanIndirectCommandsLayoutNVX get(int i){
            return new VulkanIndirectCommandsLayoutNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkIndirectCommandsLayoutNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkIndirectCommandsLayoutNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkIndirectCommandsLayoutNVX.Pointer(value));
        }

        @Override
        public VkIndirectCommandsLayoutNVX.Pointer getVk(){
            return (VkIndirectCommandsLayoutNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanIndirectCommandsLayoutNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanIndirectCommandsLayoutNVX.Pointer> {
            public Array(int count) {
                super(new VkIndirectCommandsLayoutNVX.Pointer.Array(count));
            }

            public Array(VulkanIndirectCommandsLayoutNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkIndirectCommandsLayoutNVX.Pointer.Array getVk(){
                return (VkIndirectCommandsLayoutNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanIndirectCommandsLayoutNVX.Pointer get(int i){
                return new VulkanIndirectCommandsLayoutNVX.Pointer(getVk().get(i));
            }
        }
    }
}
